package com.phoenix.motion.inputwithtag;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class InputWithTagView extends LinearLayout{

    //region View Binding
   private TextView mTvHeader;
   private EditText mEvInput;
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

        mTvHeader = findViewById(R.id.date_pof_birth_header);
        mEvInput = findViewById(R.id.date_of_birth_input);
    }

    public void configureView(int header,
                              String hintInputEvInput) {

        mTvHeader.setText(header);
        mEvInput.setHint(hintInputEvInput);

    }
    public void setHeader(String header) {

        mTvHeader.setText(header);
    }

    public void setHintEvInput(String hintInputEvInput) {

        mEvInput.setText(hintInputEvInput);
    }



}
