package com.phoenix.motion.parking;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;

public class ParkingInfoLayout extends LinearLayout {

    private TextView mTvParkingName;
    private TextView mTvParkingAddress;
    private RelativeLayout mRlParkingInfoLayout;

    private ParkingInfoClickListener mListener;

    public ParkingInfoLayout(Context context) {

        super(context);
        initLayout();
    }

    public ParkingInfoLayout(Context context,
                             @Nullable AttributeSet attrs) {

        super(context, attrs);
        initLayout();
    }

    public ParkingInfoLayout(Context context,
                             @Nullable AttributeSet attrs,
                             int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        initLayout();
    }

    private void initLayout() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.parking_info_layout, this, true);

        bindViews();
    }

    public void init(ParkingInfoClickListener listener,
                     String parkingUuid,
                     String name,
                     String displayAddress,
                     String address) {

        mListener = listener;
        setClickListeners(parkingUuid);
        setParkingAddress(name, displayAddress, address);
    }

    private void bindViews() {

        mTvParkingName = findViewById(R.id.tv_parking_name);
        mTvParkingAddress = findViewById(R.id.tv_parking_address);
        mRlParkingInfoLayout = findViewById(R.id.rl_parking_info_layout);
    }

    private void setClickListeners(final String parkingUuid) {

        mRlParkingInfoLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                mListener.onParkingInfoClick(parkingUuid);
            }
        });
    }

    private void setParkingAddress(String name, String displayAddress, String address) {

        StringBuilder builder = new StringBuilder();

        if (name != null && name.length() > 0) {

            builder.append(name);
        }

        if (displayAddress != null && displayAddress.length() > 0) {

            builder.append(" | ");
            builder.append(displayAddress);
        }

        mTvParkingName.setText(builder.toString());

        if (!TextUtils.isEmpty(address)) {

            mTvParkingAddress.setText(address);
            mTvParkingAddress.setVisibility(View.VISIBLE);
        } else {

            mTvParkingAddress.setText("-");
            mTvParkingAddress.setVisibility(View.GONE);
        }
    }
}
