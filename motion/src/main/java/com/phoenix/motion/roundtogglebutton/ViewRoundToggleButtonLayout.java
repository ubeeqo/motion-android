package com.phoenix.motion.roundtogglebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;

public class ViewRoundToggleButtonLayout extends RelativeLayout {

    private TextView mTvTitle;
    private ImageView mIvToggleButton;

    public ViewRoundToggleButtonLayout(Context context) {

        super(context);
        initLayout();
    }

    public ViewRoundToggleButtonLayout(Context context, AttributeSet attrs) {

        super(context, attrs);
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
