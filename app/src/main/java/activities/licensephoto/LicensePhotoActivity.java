package activities.licensephoto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        mLPBack.setOnClickListener(this);
        mLPFront.setTag("Driving license front");
        mLPFront.setImagePicture(R.drawable.ic_dl_front);
        mLPFront.setOnClickListener(this);
        mLPSelfie.setTag("Selfie + Driving license");
        mLPSelfie.setImagePicture(R.drawable.ic_selfie);
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
                    mLPBack.hideImagePicture();
                    mLPBack.hideTag();
                    mLPBack.showIvDl();
                    mLPBack.setIvDl(R.drawable.img_dni);
                } else {

                    mLPBack.hideImageCheck();
                    mLPBack.showImagePicture();
                    mLPBack.showTag();
                    mLPBack.hideIvDl();
                }
                break;

            case R.id.license_photo_front:

                if (mLPFront.getImageCheckVisibility() == View.GONE) {

                    mLPFront.showImageCheck();
                    mLPFront.hideImagePicture();
                    mLPFront.hideTag();
                    mLPFront.showIvDl();
                    mLPFront.setIvDl(R.drawable.img_dni);
                } else {

                    mLPFront.hideImageCheck();
                    mLPFront.showImagePicture();
                    mLPFront.showTag();
                    mLPFront.hideIvDl();
                }
                break;

            case R.id.license_photo_selfie:

                if (mLPSelfie.getImageCheckVisibility() == View.GONE) {
                    mLPSelfie.showImageCheck();
                    mLPSelfie.hideImagePicture();
                    mLPSelfie.hideTag();
                    mLPSelfie.showIvDl();
                    mLPSelfie.setIvDl(R.drawable.img_dni);
                } else {

                    mLPSelfie.hideImageCheck();
                    mLPSelfie.showImagePicture();
                    mLPSelfie.showTag();
                    mLPSelfie.hideIvDl();
                }
                break;
        }
    }
}
