package com.phoenix.motion.roundtogglebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;

public class ViewRoundToggleButtonLayout extends RelativeLayout {

    private TextView mTvTitle;
    private ImageView mIvToggleButton;

    private int image;
    private String title;

    public ViewRoundToggleButtonLayout(Context context) {

        super(context);
        initLayout();
    }

    public ViewRoundToggleButtonLayout(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);

        TypedArray arrayResurce = context.getTheme()
                .obtainStyledAttributes(attrs, R.styleable.ViewRoundToggleButtonLayout, 0, 0);

        try {

            image = arrayResurce.getInteger(R.styleable.ViewRoundToggleButtonLayout_image, R.drawable.ic_add);
            title = arrayResurce.getString(R.styleable.ViewRoundToggleButtonLayout_title);
        } finally {

            arrayResurce.recycle();
        }
        initLayout();
    }

    private void initLayout() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_round_toggle_button, this, true);

        bindViews();
    }

    private void bindViews() {

        mTvTitle = findViewById(R.id.tv_toggle_button);
        mIvToggleButton = findViewById(R.id.iv_toggle_button);
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText(title);
        mIvToggleButton.setImageResource(image);
    }

    public void setTitle(int title) {

        mTvTitle.setText(title);
    }

    public void setTitle(String title) {

        mTvTitle.setText(title);
    }

    public void setImage(int image) {

        mIvToggleButton.setImageResource(image);
    }
}
