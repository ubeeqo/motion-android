package com.phoenix.motion.disclaimer;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class DisclaimerView extends LinearLayout {

    private TextView mTvDisclaimer;

    public DisclaimerView(Context context) {

        super(context);
        init();
    }

    public DisclaimerView(Context context,
                          @Nullable AttributeSet attrs) {

        super(context, attrs);
        init();
    }

    private void init() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_disclaimer_layout, this, true);
        bindViews();
    }

    private void bindViews() {

        mTvDisclaimer = findViewById(R.id.tv_disclaime_text);
    }

    public void setDisclaimer(String disclaimer) {

        mTvDisclaimer.setText(Html.fromHtml(disclaimer));
    }

    public void show() {

        setVisibility(VISIBLE);
    }

    public void hide() {

        setVisibility(GONE);
    }
}
