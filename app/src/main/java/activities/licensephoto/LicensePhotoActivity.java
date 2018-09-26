package activities.licensephoto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.phoenix.R;
import com.phoenix.motion.licensephoto.LicensePhotoLayout;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LicensePhotoActivity extends BaseActivity {

    //region BindingViews
    @BindView(R.id.license_photo_back)
    LicensePhotoLayout mLPBack;
    @BindView(R.id.license_photo_front)
    LicensePhotoLayout mLPFront;
    @BindView(R.id.license_photo_selfie)
    LicensePhotoLayout mLPSelfie;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_photo);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mLPBack.setTag("Driving license Back");
        mLPBack.setIcon(R.drawable.ic_dl_back);
        mLPFront.setTag("Driving license front");
        mLPFront.setIcon(R.drawable.ic_dl_front);
        mLPSelfie.setTag("Selfie + Driving license");
        mLPSelfie.setIcon(R.drawable.ic_selfie);
    }

    //region Onclick
    @OnClick(R.id.license_photo_back)
    public void onClickPhotobBack() {
        if (mLPBack.getImageCheckVisibility() == View.GONE) {
            mLPBack.showImageCheck();
            mLPBack.hideIcon();
            mLPBack.hideTag();
            mLPBack.showPicture();
            mLPBack.setPicture(R.drawable.img_dni);
            mLPBack.changeBorderToGreenLine();
        } else {

            mLPBack.hideImageCheck();
            mLPBack.showIcon();
            mLPBack.showTag();
            mLPBack.hidePicture();
            mLPBack.changeBorderToDashLine();
        }
    }

    @OnClick(R.id.license_photo_front)
    public void onClickPhotoFront() {
        if (mLPFront.getImageCheckVisibility() == View.GONE) {

            mLPFront.showImageCheck();
            mLPFront.hideIcon();
            mLPFront.hideTag();
            mLPFront.showPicture();
            mLPFront.setPicture(R.drawable.img_dni);
            mLPFront.changeBorderToGreenLine();
        } else {

            mLPFront.hideImageCheck();
            mLPFront.showIcon();
            mLPFront.showTag();
            mLPFront.hidePicture();
            mLPFront.changeBorderToDashLine();
        }
    }

    @OnClick(R.id.license_photo_selfie)
    public void onClickPhotoSelfie() {

        if (mLPSelfie.getImageCheckVisibility() == View.GONE) {
            mLPSelfie.showImageCheck();
            mLPSelfie.hideIcon();
            mLPSelfie.hideTag();
            mLPSelfie.showPicture();
            mLPSelfie.setPicture(R.drawable.img_dni);
            mLPSelfie.changeBorderToGreenLine();
        } else {

            mLPSelfie.hideImageCheck();
            mLPSelfie.showIcon();
            mLPSelfie.showTag();
            mLPSelfie.hidePicture();
            mLPSelfie.changeBorderToDashLine();
        }
    }
    //endregion
}
