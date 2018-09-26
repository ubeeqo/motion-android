package activities.alertbox;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenix.R;
import com.phoenix.motion.alertbox.AlertBoxView;
import com.phoenix.motion.alertbox.OnAlertBoxClickListener;
import com.phoenix.motion.dangerbox.DangerBoxView;
import com.phoenix.motion.dangerbox.OnDangerBoxClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlertBoxActivity extends AppCompatActivity
        implements OnAlertBoxClickListener,
        OnDangerBoxClickListener {

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
        mAlertBoxView.setListener(this);
        mDangerBoxView.setMessage("We are still validating your license");
        mDangerBoxView.setAction("Complete it now");
        mDangerBoxView.setListener(this);
    }

    @Override
    public void onActionClick() {

    }
}
