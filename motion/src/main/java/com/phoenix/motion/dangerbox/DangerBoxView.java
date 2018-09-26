package com.phoenix.motion.dangerbox;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class DangerBoxView extends LinearLayout {

    private TextView mTvMessage;
    private TextView mTvAction;
    private View mVSeparator;
    private OnDangerBoxClickListener mListener;

    public DangerBoxView(Context context) {

        super(context);
        init();
    }

    public DangerBoxView(Context context,
                         @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.danger_box_layout, this, true);
        bindViews();
    }

    private void bindViews() {

        mTvMessage = findViewById(R.id.tv_message);
        mTvAction = findViewById(R.id.bt_action);
        mVSeparator = findViewById(R.id.v_separator);

        mTvAction.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                mListener.onActionClick();
            }
        });
    }

    public void setListener(OnDangerBoxClickListener listener) {

        mListener = listener;
    }

    public void setMessage(String message) {

        mTvMessage.setText(message);
    }

    public void setAction(String action) {

        mTvAction.setText(action);
        mTvAction.setVisibility(View.VISIBLE);
        mVSeparator.setVisibility(View.VISIBLE);
    }

    public void show() {

        setVisibility(VISIBLE);
        bringToFront();
    }

    public void hide() {

        setVisibility(GONE);
    }
}
