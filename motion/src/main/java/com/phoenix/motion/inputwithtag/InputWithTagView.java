package com.phoenix.motion.inputwithtag;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class InputWithTagView extends LinearLayout {

    //region View Binding
    private TextView mTvHeader;
    private EditText mEtInput;

    private String mHeader;
    private String mInput;
    private String mInputHint;
    private Integer mInputType;
    //endregion

    //region Constructors and initialization
    public InputWithTagView(Context context) {

        super(context);
    }

    public InputWithTagView(Context context,
                            AttributeSet attrs) {

        super(context, attrs);
        setAttrs(context, attrs);
        inflateView();
    }

    public InputWithTagView(Context context,
                            AttributeSet attrs,
                            int defStyleAttr) {

        super(context, attrs, defStyleAttr);
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.InputWithTagView,
                0,
                0);
        try {

            mHeader = a.getString(R.styleable.InputWithTagView_header_text);
            mInput = a.getString(R.styleable.InputWithTagView_input_text);
            mInputHint = a.getString(R.styleable.InputWithTagView_input_hint);
            mInputType = a.getInt(R.styleable.InputWithTagView_android_inputType, EditorInfo.TYPE_TEXT_VARIATION_NORMAL);

        } finally {
            a.recycle();
        }
    }

    private void inflateView() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.view_input_with_tag, this, true);
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
}
