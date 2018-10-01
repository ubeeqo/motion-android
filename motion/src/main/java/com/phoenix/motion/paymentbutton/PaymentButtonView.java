package com.phoenix.motion.paymentbutton;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;
import com.phoenix.motion.MotionUtils;

public class PaymentButtonView extends LinearLayout {

    private RelativeLayout mRlPaymentMethod;
    private ImageView mIvIcon;
    private TextView mTvPaymentMethod;
    private TextView mTvError;
    private PaymentButtonClickListener mListener;

    public PaymentButtonView(Context context) {

        super(context);
        init();
    }

    public PaymentButtonView(Context context,
                             @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.view_payment_button, this, true);
        bindViews();
        setOnClickListener();
    }

    private void bindViews() {

        mRlPaymentMethod = findViewById(R.id.rl_payment_method_container);
        mIvIcon = findViewById(R.id.iv_icon);
        mTvPaymentMethod = findViewById(R.id.tv_payment_method);
        mTvError = findViewById(R.id.tv_error);
    }

    private void setOnClickListener() {

        mRlPaymentMethod.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                mListener.onPaymentClick();
            }
        });
    }

    public void showError(String error) {

        mRlPaymentMethod.setBackgroundResource(R.drawable.background_payment_method_error);
        mTvPaymentMethod.setTextColor(getResources().getColor(R.color.danger));
        mTvError.setText(error);
        mTvError.setVisibility(View.VISIBLE);
    }

    public void hideError() {

        mTvPaymentMethod.setTextColor(getResources().getColor(R.color.ink));
        mRlPaymentMethod.setBackgroundResource(R.drawable.selector_payment_button);
        mTvError.setVisibility(View.GONE);
    }

    public void initPaymentMethod(String paymentMethod) {

        mTvPaymentMethod.setText(paymentMethod);
    }

    public void setPaymentMethod(String paymentMethod, String type) {

        mIvIcon.setImageResource(MotionUtils.getCardCompanyIcon(type));
        mIvIcon.setVisibility(View.VISIBLE);
        mTvPaymentMethod.setText(MotionUtils.hidePaymentMethodNumber(paymentMethod));
    }

    public void setClickListener(PaymentButtonClickListener listener) {

        mListener = listener;
    }
}
