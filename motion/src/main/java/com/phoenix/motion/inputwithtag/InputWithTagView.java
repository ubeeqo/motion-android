package com.phoenix.motion.inputwithtag;

import android.content.Context;
import android.support.annotation.Nullable;
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
                            @Nullable AttributeSet attrs) {

        super(context, attrs);
        initUI();
    }

    private void initUI() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        mEtInput.setText(hint);
    }

    public void setHintEvInput(int hint) {

        mEtInput.setText(hint);
    }

    public EditText getInputText() {

        return mEtInput;
    }
}
