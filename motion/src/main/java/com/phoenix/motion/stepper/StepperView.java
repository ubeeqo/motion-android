package com.phoenix.motion.stepper;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class StepperView extends LinearLayout {

    private TextView mTvSeats;
    private ImageView mIvMinus;
    private ImageView mIvAdd;

    private int NUM_SEATS;
    private int MIN_SEATS = 1;

    public StepperView(Context context) {

        super(context);
        initLayout();
    }

    public StepperView(Context context,
                       @Nullable AttributeSet attrs) {

        super(context, attrs);
        initLayout();
    }

    public StepperView(Context context,
                       @Nullable AttributeSet attrs,
                       int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        initLayout();
    }

    private void initLayout() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_stepper_layout, this, true);

        bindViews();
        setClickListeners();
    }

    public void init(int seats) {

        NUM_SEATS = seats - MIN_SEATS;
        mTvSeats.setText(Integer.toString(MIN_SEATS));
    }

    private void bindViews() {

        mTvSeats = findViewById(R.id.tv_seats);
        mIvMinus = findViewById(R.id.iv_minus);
        mIvAdd = findViewById(R.id.iv_add);
    }

    private void setClickListeners() {

        mIvAdd.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                if (getPickedSeats() < NUM_SEATS) {

                    mTvSeats.setText(Integer.toString(getPickedSeats() + 1));
                }
            }
        });

        mIvMinus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getPickedSeats() > MIN_SEATS) {

                    mTvSeats.setText(Integer.toString(getPickedSeats() - 1));
                }
            }
        });
    }

    public int getPickedSeats() {

        return Integer.parseInt(mTvSeats.getText().toString());
    }
}
