package com.phoenix.motion.roundlabel;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class ViewRoundLabelLayout extends LinearLayout {

    private TextView mTvTitle;
    private String title;

    public ViewRoundLabelLayout(Context context) {

        super(context);
        initLayout();
    }

    public ViewRoundLabelLayout(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);

        TypedArray arrayResurce = context.getTheme()
                .obtainStyledAttributes(attrs, R.styleable.ViewRoundLabelLayout, 0, 0);

        try {

            title = arrayResurce.getString(R.styleable.ViewRoundLabelLayout_titleLabel);
        } finally {

            arrayResurce.recycle();
        }
        initLayout();
    }

    private void initLayout() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_round_label, this, true);

        bindViews();
    }

    private void bindViews() {

        mTvTitle = findViewById(R.id.tv_round_label);
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText(title);
    }

    public void setTitle(int title) {

        mTvTitle.setText(title);
    }

    public void setTitle(String title) {

        mTvTitle.setText(title);
    }
}
