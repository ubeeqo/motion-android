package activities.parkinginfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

public class ParkingInfoActivity extends AppCompatActivity {

    private TextView mTvParkingName;
    private TextView mTvAddres;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_info);
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvParkingName.setText("Parking BSM de la France");
        mTvAddres.setText("Ronda Sant Pere");
    }

    private void bindViews() {

        mTvParkingName = findViewById(R.id.tv_parking_name);
        mTvAddres = findViewById(R.id.tv_parking_address);
    }

    public void showAddres(View view) {

        if(mTvAddres.getVisibility()==View.GONE) {

            mTvAddres.setVisibility(View.VISIBLE);
        }else{

            mTvAddres.setVisibility(View.GONE);
        }
    }
}
