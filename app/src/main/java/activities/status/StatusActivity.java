package activities.status;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.zonestatus.ZoneStatusView;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StatusActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.zone_status_view_component)
    ZoneStatusView mZoneStatusView;

    @BindView(R.id.zone_status_view_component_more_info)
    ZoneStatusView mZoneStatusViewMoreInfo;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        initZoneStatusView();
        initZoneStatusViewMoreInfo();
    }

    public void initZoneStatusView() {

        mZoneStatusView.setStatusIcon(getResources().getDrawable(R.drawable.ic_alert));
        mZoneStatusView.setStatus("Delayed vehicle");
    }

    public void initZoneStatusViewMoreInfo() {

        mZoneStatusViewMoreInfo.setStatusIcon(getResources().getDrawable(R.drawable.ic_alert));
        mZoneStatusViewMoreInfo.setStatus("Delayed vehicle");
        mZoneStatusViewMoreInfo.setStatusInfo("Our prior user is being delayed. Please call us for help");
    }
}
