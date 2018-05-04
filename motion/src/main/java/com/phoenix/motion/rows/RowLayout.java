package com.phoenix.motion.rows;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class RowLayout extends LinearLayout {

    //region View Binding
    private View mContent;
    private TextView mTvHeader;
    private TextView mTvTitle;
    private TextView mTvSubtitle;
    private CheckBox mCbRow;
    private ImageView mIvRowChevron;
    //endregion

    //region Constructors and initialization
    public RowLayout(Context context) {

        super(context);
        initUI();
    }

    public RowLayout(Context context,
                     @Nullable AttributeSet attrs) {

        super(context, attrs);
        initUI();
    }

    private void initUI() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_row_layout, this, true);
        bindViews();
    }
    //endregion

    public void configureView(int header,
                              String title,
                              String subtitle) {

        mTvHeader.setText(header);
        mTvTitle.setText(title);
        mTvSubtitle.setText(subtitle);
    }

    public void configureView(int header,
                              String title) {

        mTvHeader.setText(header);
        mTvTitle.setText(title);
        mTvSubtitle.setVisibility(GONE);
    }

    public void configureView(int title) {

        configureView(title, false);
    }

    public void configureView(int title,
                              boolean isActionRow) {

        mTvTitle.setText(title);
        mTvHeader.setVisibility(GONE);
        mTvSubtitle.setVisibility(GONE);

        if (isActionRow) {

            mTvTitle.setTextColor(ContextCompat.getColor(getContext(), R.color.main));
            mTvTitle.setAllCaps(true);
        }
    }

    private void bindViews() {

        mContent = findViewById(R.id.content_layout);
        mTvHeader = findViewById(R.id.tv_row_header);
        mTvTitle = findViewById(R.id.tv_row_title);
        mTvSubtitle = findViewById(R.id.tv_row_subtitle);
        mCbRow = findViewById(R.id.cb_row);
        mIvRowChevron = findViewById(R.id.iv_row_chevron);
    }

    @Override
    public void setOnClickListener(OnClickListener onClickListener) {

        mContent.setOnClickListener(onClickListener);
    }

    public void configureButtonView(int title) {

        mTvTitle.setText(title);
        mTvTitle.setGravity(Gravity.CENTER_HORIZONTAL);
        mTvHeader.setVisibility(GONE);
        mTvSubtitle.setVisibility(GONE);
        mIvRowChevron.setVisibility(GONE);
    }

    public void configureCheckView(int title, boolean checked) {

        mTvTitle.setText(title);
        mTvHeader.setVisibility(GONE);
        mTvSubtitle.setVisibility(GONE);
        mIvRowChevron.setVisibility(GONE);
        mCbRow.setVisibility(View.VISIBLE);
        mCbRow.setChecked(checked);
    }

    public CheckBox getCheckBox() {

        return mCbRow;
    }
}
