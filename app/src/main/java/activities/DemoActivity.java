package activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.View;
import android.widget.LinearLayout;

import com.phoenix.R;
import com.phoenix.motion.rows.RowValueLayout;

import activities.alertbox.AlertBoxActivity;
import activities.base.BaseActivity;
import activities.callus.CallUsActivity;
import activities.dialog.CustomAlertDialogActivity;
import activities.dialoginoutbox.DialogInputBoxActivity;
import activities.disclaimer.DisclaimerActivity;
import activities.divider.DividerActivity;
import activities.emptystate.EmptyStateActivity;
import activities.info.InfoActivity;
import activities.custominputlayout.CustomInputLayoutActivity;
import activities.licensephoto.LicensePhotoActivity;
import activities.listoption.ListOptionActivity;
import activities.overlay.OverlayActivity;
import activities.parkinginfo.ParkingInfoActivity;
import activities.paymentbutton.PaymentButtonActivity;
import activities.roundlabel.RoundLabelActivity;
import activities.roundtogglebutton.RoundToggleButtonActivity;
import activities.rows.RowActivity;
import activities.rows.RowCheckboxActivity;
import activities.rows.RowOneTagActivity;
import activities.rows.RowValueActivity;
import activities.selectorbutton.SelectorButtonActivity;
import activities.status.StatusActivity;
import activities.stepper.StepperActivity;
import activities.succes.SuccesActivity;
import activities.unsuccess.UnSuccessActivity;
import activities.waiting.WaitingActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import model.ComponentModel;
import utils.ComponentsUtils;


public class DemoActivity extends BaseActivity implements View.OnClickListener {


    private ComponentsUtils mComponentsUtils;
    private RowValueLayout mRowValueLayout;

    //region BindViews
    @BindView(R.id.layout_content_views)
    LinearLayout mContentViews;

    //endregion
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_app);
        ButterKnife.bind(this);
        mComponentsUtils = new ComponentsUtils();
        fillActivity();
    }

    public void fillActivity() {

        if (mComponentsUtils.getComponentsList().size() != 0) {
            int i = 0;
            for (ComponentModel componentModel : mComponentsUtils.getComponentsList()) {
                mRowValueLayout = new RowValueLayout(this);
                mRowValueLayout.setOnClickListener(this);
                mRowValueLayout.setChevron();
                mRowValueLayout.setId(i);
                mRowValueLayout.setHeader("");
                mRowValueLayout.setTitle(componentModel.getName());
                mRowValueLayout.getResources().getDrawable(R.drawable.selector_payment_button);
                mContentViews.addView(mRowValueLayout);
                i++;
            }
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case 0:

                Intent intentAlertBox = new Intent(this, AlertBoxActivity.class);
                startActivity(intentAlertBox);
                break;
            case 1:

                Intent intentCallUs = new Intent(this, CallUsActivity.class);
                startActivity(intentCallUs);
                break;
            case 2:

                Intent intentCustomDialog = new Intent(this, CustomAlertDialogActivity.class);
                startActivity(intentCustomDialog);
                break;
            case 3:

                Intent intentDialogInputBox = new Intent(this, DialogInputBoxActivity.class);
                startActivity(intentDialogInputBox);
                break;
            case 4:

                Intent intentDivider = new Intent(this, DividerActivity.class);
                startActivity(intentDivider);
                break;
            case 5:

                Intent intentEmptyState = new Intent(this, EmptyStateActivity.class);
                startActivity(intentEmptyState);
                break;
            case 6:

                Intent intentOverlay = new Intent(this, OverlayActivity.class);
                startActivity(intentOverlay);
                break;
            case 7:

                Intent intentParkingInfo = new Intent(this, ParkingInfoActivity.class);
                startActivity(intentParkingInfo);
                break;
            case 8:

                Intent intentDisclamer = new Intent(this, DisclaimerActivity.class);
                startActivity(intentDisclamer);
                break;
            case 9:

                Intent intentInfo = new Intent(this, InfoActivity.class);
                startActivity(intentInfo);
                break;
            case 10:

                Intent intentInputWithTag = new Intent(this, CustomInputLayoutActivity.class);
                startActivity(intentInputWithTag);
                break;
            case 11:

                Intent intentListOption = new Intent(this, ListOptionActivity.class);
                startActivity(intentListOption);
                break;
            case 12:

                Intent intentPaymentButton = new Intent(this, PaymentButtonActivity.class);
                startActivity(intentPaymentButton);
                break;
            case 13:

                Intent intentRow = new Intent(this, RowActivity.class);
                startActivity(intentRow);
                break;
            case 14:

                Intent intentRowValue = new Intent(this, RowValueActivity.class);
                startActivity(intentRowValue);
                break;
            case 15:

                Intent intentSelector = new Intent(this, SelectorButtonActivity.class);
                startActivity(intentSelector);
                break;
            case 16:

                Intent intentStepper = new Intent(this, StepperActivity.class);
                startActivity(intentStepper);
                break;
            case 17:

                Intent intentSucces = new Intent(this, SuccesActivity.class);
                startActivity(intentSucces);
                break;
            case 18:

                Intent intentUnSucces = new Intent(this, UnSuccessActivity.class);
                startActivity(intentUnSucces);
                break;
            case 19:

                Intent intentWaiting = new Intent(this, WaitingActivity.class);
                startActivity(intentWaiting);
                break;
            case 20:

                Intent intentStatus = new Intent(this, StatusActivity.class);
                startActivity(intentStatus);
                break;
            case 21:

                Intent intentRowOneTag = new Intent(this, RowOneTagActivity.class);
                startActivity(intentRowOneTag);
                break;
            case 22:

                Intent intentLicensePhoto = new Intent(this, LicensePhotoActivity.class);
                startActivity(intentLicensePhoto);
                break;
            case 23:

                Intent intentLicenseRowCheckbox = new Intent(this, RowCheckboxActivity.class);
                startActivity(intentLicenseRowCheckbox);
                break;
            case 24:

                Intent intentRoundToggleButton = new Intent(this, RoundToggleButtonActivity.class);
                startActivity(intentRoundToggleButton);
                break;
            case 25:

                Intent intentRoundLabel = new Intent(this, RoundLabelActivity.class);
                startActivity(intentRoundLabel);
                break;
        }
    }
}
