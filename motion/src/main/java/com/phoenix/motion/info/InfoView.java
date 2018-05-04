package com.phoenix.motion.info;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;

public class InfoView extends RelativeLayout {

    private TextView mTvTitle;
    private TextView mTvSubtitle;

    public InfoView(Context context) {

        super(context);
    }

    public InfoView(Context context,
                    AttributeSet attrs) {

        super(context, attrs);
        inflateView();
    }

    public InfoView(Context context,
                    AttributeSet attrs,
                    int defStyleAttr) {

        super(context, attrs, defStyleAttr);
    }

    private void inflateView() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.view_info_layout, this, true);
        bindViews();
    }

    private void bindViews() {

        mTvTitle = findViewById(R.id.tv_info_title);
        mTvSubtitle = findViewById(R.id.tv_info_subtitle);
    }

    public void setTitle(int resourceId) {

        mTvTitle.setText(getContext().getString(resourceId));
    }

    public void setTitle(String message) {

        mTvTitle.setText(message);
    }

    public void setSubtitle(int resourceId) {

        mTvSubtitle.setText(getContext().getString(resourceId));
        mTvSubtitle.setVisibility(VISIBLE);
    }

    public void show() {

        setVisibility(VISIBLE);
    }

    public void hide() {

        setVisibility(GONE);
    }
}
