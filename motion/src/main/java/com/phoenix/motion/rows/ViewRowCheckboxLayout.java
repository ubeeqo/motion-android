package com.phoenix.motion.rows;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class ViewRowCheckboxLayout extends LinearLayout {

    //region View Binding
    private TextView mTvTitle;
    private SwitchCompat mSwCheck;
    //endregion

    //region Constructor And Initialization
    public ViewRowCheckboxLayout(Context context) {
        super(context);
        initUI();
    }

    public ViewRowCheckboxLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initUI();
    }

    private void initUI() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_row_checkbox_layout, this, true);
        bindViews();
    }
    //endregion

    public void bindViews() {

        mTvTitle = findViewById(R.id.tv_title);
        mSwCheck = findViewById(R.id.sw_check);
    }

    public void setTitle(int title) {

        mTvTitle.setText(title);
    }

    public void setTitle(String title) {

        mTvTitle.setText(title);
    }

    public boolean isChecked() {

        return mSwCheck.isChecked();
    }

    public void setCheckBox(boolean check) {

        mSwCheck.setChecked(check);
    }

    public SwitchCompat getCheckBox() {

        return mSwCheck;
    }


}
