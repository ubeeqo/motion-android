package activities.alertbox;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;

import com.phoenix.R;
import com.phoenix.motion.alertbox.AlertBoxView;
import com.phoenix.motion.dangerbox.DangerBoxView;

public class AlertBoxActivity extends AppCompatActivity{

    private AlertBoxView mAlertBoxView;
    private DangerBoxView mDangerBoxView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFieldsBox();
    }

    private void fillFieldsBox() {

        mAlertBoxView.setMessage("You have to complete missing documentation");
        mAlertBoxView.setAction("Let\'s do it now");
        mDangerBoxView.setMessage("We are still validating your license");
        mDangerBoxView.setAction("Complete it now");
    }

    public void bindViews() {

        mAlertBoxView = findViewById(R.id.alert_box_view_demo);
        mDangerBoxView = findViewById(R.id.danger_box_view_demo);
    }


}
