package com.phoenix.motion.alertbox;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class AlertBoxView extends LinearLayout {

    private TextView mTvMessage;
    private TextView mTvAction;
    private OnAlertBoxClickListener mListener;

    public AlertBoxView(Context context) {

        super(context);
        init();
    }

    public AlertBoxView(Context context,
                        @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.alert_box_layout, this, true);
        bindViews();
    }

    private void bindViews() {

        mTvMessage = findViewById(R.id.tv_message);
        mTvAction = findViewById(R.id.bt_action);

        mTvAction.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                mListener.onActionClick();
            }
        });
    }

    public void setListener(OnAlertBoxClickListener listener) {

        mListener = listener;
    }

    public void setMessage(String message) {

        mTvMessage.setText(message);
    }

    public void setAction(String action) {

        mTvAction.setText(action);
    }

    public void show() {

        setVisibility(VISIBLE);
        bringToFront();
    }

    public void hide() {

        setVisibility(GONE);
    }
}
