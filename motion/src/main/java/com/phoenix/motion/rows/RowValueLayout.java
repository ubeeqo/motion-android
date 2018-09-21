package com.phoenix.motion.rows;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class RowValueLayout extends LinearLayout {

    private Context mContext;
    private String mHeaderString;
    private String mTitleString;
    private Integer mHeaderStyle;
    private Integer mTitleStyle;

    //region View Binding
    private TextView mTvHeader;
    private TextView mTvTitle;
    private ImageView mIvChevron;
    //endregion

    //region Constructors and initialization
    public RowValueLayout(Context context) {

        super(context);
        mContext = context;
        initUI();
    }

    public RowValueLayout(Context context,
                          @Nullable AttributeSet attrs) {

        super(context, attrs);
        mContext = context;
        setAttrs(context, attrs);
        initUI();
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.RowValueLayout,
                0,
                0);
        try {

            mHeaderString = a.getString(R.styleable.RowValueLayout_header_text);
            mTitleString = a.getString(R.styleable.RowValueLayout_title_text);
            mHeaderStyle = a.getResourceId(R.styleable.RowValueLayout_header_style, 0);
            mTitleStyle = a.getResourceId(R.styleable.RowValueLayout_title_style, 0);

        } finally {
            a.recycle();
        }
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

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        setHeader(mHeaderString);
        setTitle(mTitleString);

       /* if (Build.VERSION.SDK_INT < 23) {
            mTvHeader.setTextAppearance(mContext, mHeaderStyle);
            mTvTitle.setTextAppearance(mContext, mTitleStyle);
        } else {
            mTvHeader.setTextAppearance(mHeaderStyle);
            mTvTitle.setTextAppearance(mTitleStyle);
        }*/
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
