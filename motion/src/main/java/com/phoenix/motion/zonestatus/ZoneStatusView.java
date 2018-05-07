package com.phoenix.motion.zonestatus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;

public class ZoneStatusView extends LinearLayout {

    private TextView mTvStatus;
    private TextView mTvStatusInfo;
    private ImageView mIvStatusIcon;
    private RelativeLayout mRlZoneContainer;

    public ZoneStatusView(Context context) {

        super(context);
        init();
    }

    public ZoneStatusView(Context context,
                          @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.zone_status_layout, this, true);
        bindViews();
    }

    private void bindViews() {

        mTvStatus = findViewById(R.id.tv_status);
        mTvStatusInfo = findViewById(R.id.tv_status_info);
        mIvStatusIcon = findViewById(R.id.iv_status_icon);
        mRlZoneContainer = findViewById(R.id.rl_zone_status_container);
    }

    public void setStatus(String status) {

        mTvStatus.setText(status);
    }

    public void setStatusInfo(String statusInfo) {

        mTvStatusInfo.setText(statusInfo);
        mTvStatusInfo.setVisibility(View.VISIBLE);
    }

    public void setStatusIcon(Drawable statusIcon) {

        mIvStatusIcon.setImageDrawable(statusIcon);
    }

    public void setBackground(int backgroundId) {

        mRlZoneContainer.setBackgroundResource(backgroundId);
    }
}
