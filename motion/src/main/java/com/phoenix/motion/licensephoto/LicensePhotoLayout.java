package com.phoenix.motion.licensephoto;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class LicensePhotoLayout extends LinearLayout {

    //region BindingViews
    private FrameLayout mFlContent;
    private ImageView mIvPicture;
    private ImageView mIvIcon;
    private TextView mTvTag;
    private LinearLayout mLlCheck;
    //endregion

    //region Constructors and Initialization
    public LicensePhotoLayout(Context context) {

        super(context);
        initUI();
    }

    public LicensePhotoLayout(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
        initUI();
    }

    private void initUI() {

        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.license_photo_layout, this, true);
        bindViews();
    }
    //endregion

    private void bindViews() {

        mFlContent = findViewById(R.id.fl_content);
        mIvPicture = findViewById(R.id.iv_picture);
        mIvIcon = findViewById(R.id.iv_icon);
        mTvTag = findViewById(R.id.tv_tag);
        mLlCheck = findViewById(R.id.ll_check);
    }

    //region Components Manipulation
    public void hideImageCheck() {

        mLlCheck.setVisibility(GONE);
    }

    public void showImageCheck() {

        mLlCheck.setVisibility(VISIBLE);
    }

    public int getImageCheckVisibility() {

        return mLlCheck.getVisibility();
    }

    public void hideTag() {

        mTvTag.setVisibility(GONE);
    }

    public void showTag() {

        mTvTag.setVisibility(VISIBLE);
    }

    public void setTag(String tag) {

        mTvTag.setText(tag);
    }

    public void setTag(int tag) {

        mTvTag.setText(tag);
    }

    public void hideIcon() {

        mIvIcon.setVisibility(GONE);
    }

    public void showIcon() {

        mIvIcon.setVisibility(VISIBLE);
    }

    public void setIcon(int imagePicture) {

        mIvIcon.setImageResource(imagePicture);
    }

    public void hidePicture() {

        mIvPicture.setVisibility(GONE);
    }

    public void showPicture() {

        mIvPicture.setVisibility(VISIBLE);
    }

    public void setPicture(int drawable) {

        mIvPicture.setImageResource(drawable);
    }

    public void setPicture(Bitmap bitmap) {

        mIvPicture.setImageBitmap(bitmap);
    }

    public void changeBorderToGreenLine() {

        mFlContent.setBackgroundResource(R.drawable.green_line);
    }

    public void changeBorderToDashLine() {

        mFlContent.setBackgroundResource(R.drawable.green_line);
    }
    //endregion
}
