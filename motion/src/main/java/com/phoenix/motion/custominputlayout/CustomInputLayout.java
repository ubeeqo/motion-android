package com.phoenix.motion.custominputlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class CustomInputLayout extends LinearLayout {

    //region View Binding
    private TextView mTvHeader;
    private EditText mEtInput;
    private TextView mTvError;
    private View mViewUnderline;

    private String mHeader;
    private String mInput;
    private String mInputHint;
    private Integer mInputType;
    private String mErrorMessage;
    private String mHelpMessage;
    //endregion

    //region Constructors and initialization
    public CustomInputLayout(Context context) {

        super(context);
    }

    public CustomInputLayout(Context context,
                             AttributeSet attrs) {

        super(context, attrs);
        setAttrs(context, attrs);
        inflateView();
    }

    public CustomInputLayout(Context context,
                             AttributeSet attrs,
                             int defStyleAttr) {

        super(context, attrs, defStyleAttr);
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomInputLayout,
                0,
                0);
        try {

            mHeader = a.getString(R.styleable.CustomInputLayout_header_text);
            mInput = a.getString(R.styleable.CustomInputLayout_input_text);
            mInputHint = a.getString(R.styleable.CustomInputLayout_input_hint);
            mInputType = a.getInt(R.styleable.CustomInputLayout_android_inputType, EditorInfo.TYPE_TEXT_VARIATION_NORMAL);

        } finally {
            a.recycle();
        }
    }

    private void inflateView() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.custom_input_layout, this, true);
        bindViews();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        bindViews();
        populate();
    }

    private void bindViews() {

        mTvHeader = findViewById(R.id.tv_header);
        mEtInput = findViewById(R.id.et_input);

        mTvError = findViewById(R.id.tv_error);
        mViewUnderline = findViewById(R.id.v_underline);
    }

    private void populate() {

        mTvHeader.setText(mHeader);
        mEtInput.setText(mInput);
        mEtInput.setHint(mInputHint);

        if (mInputType != 0) {
            mEtInput.setInputType(mInputType);
        }
    }
    //endregion

    public void configureView(String header,
                              String hint) {

        mTvHeader.setText(header);
        mEtInput.setHint(hint);
    }

    public void configureView(int header,
                              int hint) {

        mTvHeader.setText(header);
        mEtInput.setHint(hint);
    }

    public void setHeader(String header) {

        mTvHeader.setText(header);
    }

    public void setHeader(int header) {

        mTvHeader.setText(header);
    }

    public void setHintEvInput(String hint) {

        mEtInput.setHint(hint);
    }

    public void setHintEvInput(int hint) {

        mEtInput.setHint(hint);
    }

    public EditText getInputText() {

        return mEtInput;
    }

    public void setHelpMessage(String message) {

        mHelpMessage = message;

        mTvError.setText(mHelpMessage);
        changeTextAndUnderlineColor(R.color.ink_light);

        mTvError.setVisibility(VISIBLE);
    }

    public void setError(String error) {

        mErrorMessage = error;

        mTvError.setText(mErrorMessage);
        changeTextAndUnderlineColor(R.color.danger);

        mTvError.setVisibility(VISIBLE);
    }

    public void hideError() {

        if (!TextUtils.isEmpty(mHelpMessage)) {

            mTvError.setText(mHelpMessage);
        } else {

            mTvError.setVisibility(GONE);
        }
        changeTextAndUnderlineColor(R.color.ink_light);
    }

    public void hideTexViewError() {

        mTvError.setVisibility(GONE);
        changeTextAndUnderlineColor(R.color.ink_light);
    }

    public void changeTextAndUnderlineColor(int newColor) {

        mTvHeader.setTextColor(getResources().getColor(newColor));
        mTvError.setTextColor(getResources().getColor(newColor));
        mViewUnderline.setBackgroundResource(newColor);
    }
}
