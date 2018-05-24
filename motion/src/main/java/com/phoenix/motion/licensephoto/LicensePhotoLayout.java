package com.phoenix.motion.licensephoto;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.motion.R;

public class LicensePhotoLayout extends LinearLayout {

    //region BindingViews
    private ImageView mIvIcon;
    private ImageView mIvIconCamera;
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

        mIvIcon = findViewById(R.id.iv_icon);
        mIvIconCamera = findViewById(R.id.iv_icon_camera);
        mTvTag = findViewById(R.id.tv_dl_tag);
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

    public void hideImagePicture() {

        mIvIconCamera.setVisibility(GONE);
    }

    public void showImagePicture() {

        mIvIconCamera.setVisibility(VISIBLE);
    }

    public void setImagePicture(int imagePicture) {

        mIvIconCamera.setImageResource(imagePicture);
    }

    public void hideIvDl() {

        mIvIcon.setVisibility(GONE);
    }

    public void showIvDl() {

        mIvIcon.setVisibility(VISIBLE);
    }

    public void setIvDl(int drawable) {

        mIvIcon.setImageResource(drawable);
    }

    public void setIvDl(Bitmap bitmap) {

        mIvIcon.setImageBitmap(bitmap);
    }
    //endregion
}
