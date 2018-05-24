package activities.licensephoto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.phoenix.R;
import com.phoenix.motion.licensephoto.LicensePhotoLayout;

public class LicensePhotoActivity extends AppCompatActivity implements View.OnClickListener{

    //region BindingViews
    private LicensePhotoLayout mLPBack;
    private LicensePhotoLayout mLPFront;
    private LicensePhotoLayout mLPSelfie;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_photo);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mLPBack.setTag("Driving license Back");
        mLPBack.setIcon(R.drawable.ic_dl_back);
        mLPBack.setOnClickListener(this);
        mLPFront.setTag("Driving license front");
        mLPFront.setIcon(R.drawable.ic_dl_front);
        mLPFront.setOnClickListener(this);
        mLPSelfie.setTag("Selfie + Driving license");
        mLPSelfie.setIcon(R.drawable.ic_selfie);
        mLPSelfie.setOnClickListener(this);
    }

    private void bindViews() {

        mLPBack = findViewById(R.id.license_photo_back);
        mLPFront = findViewById(R.id.license_photo_front);
        mLPSelfie = findViewById(R.id.license_photo_selfie);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.license_photo_back:

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
                break;

            case R.id.license_photo_front:

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
                break;

            case R.id.license_photo_selfie:

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
                break;
        }
    }
}
