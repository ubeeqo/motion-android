package activities.parkinginfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ParkingInfoActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.tv_parking_name)
    TextView mTvParkingName;
    @BindView(R.id.tv_parking_address)
    TextView mTvAddress;
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

        mTvParkingName.setText("Parking BSM de la France");
        mTvAddress.setText("Ronda Sant Pere");
    }

    @OnClick(R.id.layout_content)
    public void showAddress(View view) {

        if (mTvAddress.getVisibility() == View.GONE) {

            mTvAddress.setVisibility(View.VISIBLE);
        } else {

            mTvAddress.setVisibility(View.GONE);
        }
    }
}
