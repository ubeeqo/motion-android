package com.phoenix.motion.selectorbutton;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;

public class SelectorButtonView extends LinearLayout {

    private RelativeLayout mRlSelector;
    private TextView mTvText;
    private TextView mTvError;
    private SelectorButtonClickListener mListener;

    public SelectorButtonView(Context context) {

        super(context);
        init();
    }

    public SelectorButtonView(Context context,
                              @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.view_selector_button, this, true);
        bindViews();
        setOnClickListener();
    }

    private void bindViews() {

        mRlSelector = findViewById(R.id.rl_selector_container);
        mTvText = findViewById(R.id.tv_text);
        mTvError = findViewById(R.id.tv_error);
    }

    private void setOnClickListener() {

        mRlSelector.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                mListener.onSelectorClick();
            }
        });
    }

    public void showError(String error) {

        mRlSelector.setBackgroundResource(R.drawable.background_payment_method_error);
        mTvText.setTextAppearance(getContext(), R.style.MSemiboldDanger);
        mTvError.setText(error);
        mTvError.setVisibility(View.VISIBLE);
    }

    public void hideError() {

        mTvText.setTextAppearance(getContext(), R.style.MSemibold);
        mRlSelector.setBackgroundResource(R.drawable.selector_payment_button);
        mTvError.setVisibility(View.GONE);
    }

    public void initSelectorText(String selectorText) {

        mTvText.setText(selectorText);
    }

    public void setClickListener(SelectorButtonClickListener listener) {

        mListener = listener;
    }
}
