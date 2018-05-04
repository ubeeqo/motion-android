package com.phoenix.motion.emptystate;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class EmptyStateView extends LinearLayout {

    private ImageView mIvIcon;
    private TextView mTvMessage;
    private TextView mBtAction;
    private OnEmptyStateActionClickListener mListener;

    public EmptyStateView(Context context) {

        super(context);
        init();
    }

    public EmptyStateView(Context context,
                          @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.empty_state_layout, this, true);
        bindViews();
        setOnClickListener();
    }

    private void bindViews() {

        mIvIcon = findViewById(R.id.iv_icon);
        mTvMessage = findViewById(R.id.tv_message);
        mBtAction = findViewById(R.id.bt_action);
    }

    public void setIcon(int resourceId) {

        mIvIcon.setImageResource(resourceId);
    }

    public void setMessage(String message) {

        mTvMessage.setText(message);
    }

    public void setAction(String action,
                          OnEmptyStateActionClickListener listener) {

        mBtAction.setVisibility(View.VISIBLE);
        mBtAction.setText(action);
        mListener = listener;
    }

    private void setOnClickListener() {

        mBtAction.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                mListener.onActionClick();
            }
        });
    }
}
