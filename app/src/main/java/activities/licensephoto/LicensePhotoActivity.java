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

    // region HelpUI
    private void fillFields() {

        initLicensePhotoBack();
        initLicensePhotoFront();
        initLicensePhotoSelfie();
    }

    private void initLicensePhotoBack() {

        mLPBack.setTag("Driving license Back");
        mLPBack.setIcon(R.drawable.ic_dl_back);
    }

    private void initLicensePhotoFront() {

        mLPFront.setTag("Driving license front");
        mLPFront.hideIcon();
        mLPFront.showImageCheck();
        mLPFront.showPicture();
        mLPFront.setPicture(R.drawable.img_dni);
        mLPFront.changeBorderToGreenLine();
    }

    private void initLicensePhotoSelfie() {

        mLPSelfie.setTag("Selfie + Driving license");
        mLPSelfie.setIcon(R.drawable.ic_selfie);
    }
    //endregion

    //region Onclick
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
