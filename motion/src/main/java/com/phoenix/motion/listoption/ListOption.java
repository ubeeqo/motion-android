package com.phoenix.motion.listoption;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;

public class ListOption extends LinearLayout {

    //region View Binding
    private TextView mTvOptionText;
    private ImageView mIvOptionIcon;
    private RelativeLayout mRlContent;
    //endregion

    //region Constructors and initialization
    public ListOption(Context context) {

        super(context);
        initUI();
    }

    public ListOption(Context context,
                      @Nullable AttributeSet attrs) {

        super(context, attrs);
        initUI();
    }

    private void initUI() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_list_option_layout, this, true);
        bindViews();
    }
    //endregion

    public void configureView(int text,
                              int icon) {

        mTvOptionText.setText(text);
        mIvOptionIcon.setImageResource(icon);
    }

    private void bindViews() {

        mIvOptionIcon = findViewById(R.id.iv_option_icon);
        mTvOptionText = findViewById(R.id.tv_option_text);
        mRlContent = findViewById(R.id.content_layout);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);

        if (enabled) {

            mRlContent.setBackgroundResource(R.drawable.background_white_feedback);
        } else {

            mRlContent.setBackgroundResource(R.drawable.background_disabled);
        }
    }
}
