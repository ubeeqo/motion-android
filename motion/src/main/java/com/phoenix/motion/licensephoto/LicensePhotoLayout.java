package com.phoenix.motion.licensephoto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
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
    private ImageView mIvDl;
    private ImageView mIvDlIcCamera;
    private TextView mTvDlTag;
    private LinearLayout mLlCheckDl;
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

        mIvDl = findViewById(R.id.iv_dl);
        mIvDlIcCamera = findViewById(R.id.iv_dl_ic_camera);
        mTvDlTag = findViewById(R.id.tv_dl_tag);
        mLlCheckDl = findViewById(R.id.ll_check_dl);
    }

    //region Components Manipulation
    public void hideImageCheck() {

        mLlCheckDl.setVisibility(GONE);
    }

    public void showImageCheck() {

        mLlCheckDl.setVisibility(VISIBLE);
    }

    public int getImageCheckVisibility() {

        return mLlCheckDl.getVisibility();
    }

    public void hideTag() {

        mTvDlTag.setVisibility(GONE);
    }

    public void showTag() {

        mTvDlTag.setVisibility(VISIBLE);
    }

    public void setTag(String tag) {

        mTvDlTag.setText(tag);
    }

    public void setTag(int tag) {

        mTvDlTag.setText(tag);
    }

    public void hideImagePicture() {

        mIvDlIcCamera.setVisibility(GONE);
    }

    public void showImagePicture() {

        mIvDlIcCamera.setVisibility(VISIBLE);
    }

    public void setImagePicture(int imagePicture) {

        mIvDlIcCamera.setImageResource(imagePicture);
    }

    public void hideIvDl() {

        mIvDl.setVisibility(GONE);
    }

    public void showIvDl() {

        mIvDl.setVisibility(VISIBLE);
    }

    public void setIvDl(int drawable) {

        mIvDl.setImageResource(drawable);
    }

    public void setIvDl(Bitmap bitmap) {

        mIvDl.setImageBitmap(bitmap);
    }
    //endregion
}
