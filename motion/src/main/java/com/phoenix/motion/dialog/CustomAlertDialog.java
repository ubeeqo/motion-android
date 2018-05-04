package com.phoenix.motion.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.example.motion.R;

/**
 * Created by fran on 13/2/18.
 */

public class CustomAlertDialog extends Dialog {

    private TextView mTvTitle;
    private TextView mTvMessage;
    private TextView mBtPositive;
    private TextView mBtNeutral;
    private TextView mBtNegative;

    public CustomAlertDialog(@NonNull Context context) {

        super(context);
        initDialog();
    }

    public CustomAlertDialog(@NonNull Context context, int themeResId) {

        super(context, themeResId);
        initDialog();
    }

    protected CustomAlertDialog(@NonNull Context context, boolean cancelable,
                                @Nullable OnCancelListener cancelListener) {

        super(context, cancelable, cancelListener);
        initDialog();
    }

    private void initDialog() {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_alert_dialog_layout);
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        mTvTitle = findViewById(R.id.tv_title);
        mTvMessage = findViewById(R.id.tv_message);
        mBtPositive = findViewById(R.id.bt_positive);
        mBtNeutral = findViewById(R.id.bt_neutral);
        mBtNegative = findViewById(R.id.bt_negative);
    }

    public void setTitle(String title) {

        mTvTitle.setText(title);
        mTvTitle.setVisibility(View.VISIBLE);
    }

    public void setMessage(String message) {

        mTvMessage.setText(message);
        mTvMessage.setVisibility(View.VISIBLE);
    }

    public void setPositiveButton(String text, final PositiveButtonClickListener listener) {

        mBtPositive.setText(text);
        mBtPositive.setVisibility(View.VISIBLE);
        mBtPositive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (listener != null) {

                    listener.onPositiveButtonClickListener();
                }
                dismiss();
            }
        });
    }

    public void setNeutralButton(String text, final NeutralButtonClickListener listener) {

        mBtNeutral.setText(text);
        mBtNeutral.setVisibility(View.VISIBLE);
        mBtNeutral.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (listener != null) {

                    listener.onNeutralButtonClickListener();
                }
                dismiss();
            }
        });
    }

    public void setNegativeButton(String text, final NegativeButtonClickListener listener) {

        mBtNegative.setText(text);
        mBtNegative.setVisibility(View.VISIBLE);
        mBtNegative.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (listener != null) {

                    listener.onNegativeButtonClickListener();
                }
                dismiss();
            }
        });
    }
}
