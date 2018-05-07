package com.phoenix.motion.rows;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class RowValueLayout extends LinearLayout {

    //region View Binding
    private TextView mTvHeader;
    private TextView mTvTitle;
    private ImageView mIvChevron;
    //endregion

    //region Constructors and initialization
    public RowValueLayout(Context context) {

        super(context);
        initUI();
    }

    public RowValueLayout(Context context,
                          @Nullable AttributeSet attrs) {

        super(context, attrs);
        initUI();
    }

    private void initUI() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_row_value_layout, this, true);
        bindViews();
    }
    //endregion

    private void bindViews() {

        mTvHeader = findViewById(R.id.tv_row_header);
        mTvTitle = findViewById(R.id.tv_row_title);
        mIvChevron = findViewById(R.id.iv_row_chevron);
    }

    public void configureView(int header,
                              String title) {

        mTvHeader.setText(header);
        mTvTitle.setText(title);
    }

    public void setHeader(String header) {

        mTvHeader.setText(header);
    }

    public void setTitle(String title) {

        mTvTitle.setText(title);
    }

    public void setChevron() {

        mIvChevron.setVisibility(View.VISIBLE);
    }
}
