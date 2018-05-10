package com.phoenix.motion.inputwithtag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class InputWithTagView extends LinearLayout {

    //region View Binding
    private TextView mTvHeader;
    private EditText mEtInput;
    //endregion

    //region Constructors and initialization
    public InputWithTagView(Context context) {

        super(context);
    }

    public InputWithTagView(Context context,
                            AttributeSet attrs) {

        super(context, attrs);
        inflateView();
    }

    public InputWithTagView(Context context,
                            AttributeSet attrs,
                            int defStyleAttr) {

        super(context, attrs, defStyleAttr);
    }

    private void inflateView() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.view_input_with_tag, this, true);
        bindViews();
    }
    //endregion

    private void bindViews() {

        mTvHeader = findViewById(R.id.tv_date_of_birth_header);
        mEtInput = findViewById(R.id.et_date_of_birth);
    }

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
