package activities.alertbox;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.annotation.Nullable;


import com.phoenix.R;
import com.phoenix.motion.alertbox.AlertBoxView;
import com.phoenix.motion.dangerbox.DangerBoxView;

import java.util.Locale;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AlertBoxActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.alert_box_view_demo)
    AlertBoxView mAlertBoxView;
    @BindView(R.id.danger_box_view_demo)
    DangerBoxView mDangerBoxView;

    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFieldsBox();
    }

    private void fillFieldsBox() {

        mAlertBoxView.setMessage("You have to complete missing documentation");
        mAlertBoxView.setAction("Let\'s do it now");
        mDangerBoxView.setMessage("We are still validating your license");
        mDangerBoxView.setAction("Complete it now");
    }
}
