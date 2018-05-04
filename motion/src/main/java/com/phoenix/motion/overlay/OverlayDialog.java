package com.phoenix.motion.overlay;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.motion.R;
import com.phoenix.motion.callus.CallUsView;
import com.phoenix.motion.callus.CallUsViewClickListener;

/**
 * Created by fran on 13/2/18.
 */

public class OverlayDialog extends Dialog {

    private TextView mTvTitle;
    private TextView mTvMessage;
    private TextView mBtAction;
    private CallUsView mCallUsView;
    private ImageView mIvClose;

    public OverlayDialog(@NonNull Context context) {

        super(context, R.style.DialogFullScreen);
        initDialog();
    }

    public OverlayDialog(@NonNull Context context,
                         int themeResId) {

        super(context, themeResId);
        initDialog();
    }

    protected OverlayDialog(@NonNull Context context,
                            boolean cancelable,
                            @Nullable OnCancelListener cancelListener) {

        super(context, cancelable, cancelListener);
        initDialog();
    }

    private void initDialog() {

        setCancelable(false);
        setContentView(R.layout.overlay_layout);
        bindViews();
        initClickListeners();
    }

    private void bindViews() {

        mTvTitle = findViewById(R.id.tv_title);
        mTvMessage = findViewById(R.id.tv_message);
        mBtAction = findViewById(R.id.bt_action);
        mCallUsView = findViewById(R.id.call_us_view);
        mIvClose = findViewById(R.id.iv_close);
    }

    private void initClickListeners() {

        mIvClose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                dismiss();
            }
        });
    }

    public void setTitle(String title) {

        mTvTitle.setText(title);
        mTvTitle.setVisibility(View.VISIBLE);
    }

    public void setMessage(String message) {

        mTvMessage.setText(message);
        mTvMessage.setVisibility(View.VISIBLE);
    }

    public void setAction(String text, final OnOverlayActionClickListener listener) {

        mBtAction.setText(text);
        mBtAction.setVisibility(View.VISIBLE);
        mBtAction.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                listener.onActionClick();
                dismiss();
            }
        });
    }

    public void setCallUsView(String title,
                              String workingHours,
                              String phoneNumber) {

        mCallUsView.initTexts(title, workingHours);
        mCallUsView.setPhoneNumber(phoneNumber);
        mCallUsView.setVisibility(View.VISIBLE);
        mCallUsView.setDialog(this);
    }

    public void setCallUsView(String title,
                              String action,
                              CallUsViewClickListener listener) {

        mCallUsView.initTexts(title, null);
        mCallUsView.setButtonAction(action, listener);
        mCallUsView.setVisibility(View.VISIBLE);
        mCallUsView.setDialog(this);
    }

    public void hideCloseIcon() {

        mIvClose.setVisibility(View.INVISIBLE);
    }
}
