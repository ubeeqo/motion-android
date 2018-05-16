package activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.phoenix.R;
import com.phoenix.motion.alertbox.AlertBoxView;
import com.phoenix.motion.paymentbutton.PaymentButtonClickListener;
import com.phoenix.motion.paymentbutton.PaymentButtonView;
import com.phoenix.motion.rows.RowValueLayout;
import com.phoenix.motion.selectorbutton.SelectorButtonClickListener;
import com.phoenix.motion.selectorbutton.SelectorButtonView;

import java.util.zip.Inflater;

import activities.alertbox.AlertBoxActivity;
import activities.callus.CallUsActivity;
import activities.dialog.CustomAlertDialogActivity;
import model.ComponentModel;
import utils.ComponentsUtils;


public class DemoActivity extends AppCompatActivity implements View.OnClickListener{

    private ComponentsUtils mComponentsUtils;
    private LinearLayout mContentViews;
    RowValueLayout mRowValueLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_app);
        mContentViews = findViewById(R.id.layout_content_views);
        mComponentsUtils = new ComponentsUtils();
        fillActivity();
    }

    public void fillActivity(){

        if (mComponentsUtils.getComponentsList().size()!=0) {

            int i = 0;
            for (ComponentModel componentModel:mComponentsUtils.getComponentsList()) {
                mRowValueLayout  = new RowValueLayout(this);
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
        switch (v.getId()){
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
        }
    }
}
