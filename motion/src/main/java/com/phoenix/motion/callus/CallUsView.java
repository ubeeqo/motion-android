package com.phoenix.motion.callus;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class CallUsView extends LinearLayout {

    private View mContent;
    private TextView mTvTitle;
    private TextView mTvSubtitle;
    private TextView mBtAction;

    private String mPhoneNumber;
    private Dialog mDialog;
    private CallUsViewClickListener mListener;

    public CallUsView(Context context) {

        super(context);
        init();
    }

    public CallUsView(Context context,
                      @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.call_us_layout, this, true);
        bindViews();
        setOnClickListener();
    }

    private void bindViews() {

        mContent = findViewById(R.id.call_us_content);
        mTvTitle = findViewById(R.id.tv_call_us_title);
        mTvSubtitle = findViewById(R.id.tv_call_us_subtitle);
        mBtAction = findViewById(R.id.bt_call_us_now);
    }

    public void initTexts(String title,
                          String subtitle) {

        mTvTitle.setText(title);

        if (!TextUtils.isEmpty(subtitle)) {

            setWorkingHours(subtitle);
        }
    }

    public void setPhoneNumber(String phoneNumber) {

        mPhoneNumber = phoneNumber;
    }

    public void setWorkingHours(String workingHours) {

        if (!TextUtils.isEmpty(workingHours)) {

            mTvSubtitle.setText(Html.fromHtml(workingHours));
        } else {

            mTvSubtitle.setVisibility(View.GONE);
        }
    }

    public void setButtonAction(String message, CallUsViewClickListener callUsViewClickListener) {

        mBtAction.setText(message);
        mListener = callUsViewClickListener;
    }

    private void setOnClickListener() {

        mBtAction.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                if (!TextUtils.isEmpty(mPhoneNumber)) {

                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(
                            "tel:" + mPhoneNumber.replace(" ", "")));
                    getContext().startActivity(intent);

                    if (mDialog != null) {

                        mDialog.dismiss();
                    }
                } else {

                    if (mListener != null){
                        mListener.onActionClick();
                    }
                }
            }
        });
    }

    public void setDialog(Dialog dialog) {

        mDialog = dialog;
    }
}
