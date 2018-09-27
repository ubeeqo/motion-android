package activities.parkinginfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.parking.ParkingInfoClickListener;
import com.phoenix.motion.parking.ParkingInfoLayout;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ParkingInfoActivity extends BaseActivity implements ParkingInfoClickListener {

    //region BindViews
    @BindView(R.id.parking_info_component)
    ParkingInfoLayout mParkingInfoLayout;

    @BindView(R.id.parking_info_component_with_address)
    ParkingInfoLayout mParkingInfoLayoutWithAddress;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_info);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {



        mParkingInfoLayout.init(this,"sdasd","Parking BSM de la France","","",true);
        mParkingInfoLayoutWithAddress.init(this,"sdasd","Parking BSM","Ronda Sant Pere","Ronda Sant Pere 54",true);
    }

    @Override
    public void onParkingInfoClick(String parkingUuid, boolean geofence) {

    }
}
