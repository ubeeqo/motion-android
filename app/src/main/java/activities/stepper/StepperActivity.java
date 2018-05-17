package activities.stepper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;

public class StepperActivity extends AppCompatActivity {

    private TextView mTvSeats;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepper);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindView();
        fillField();
    }

    private void fillField() {

        mTvSeats.setText("4");
    }

    private void bindView() {

        mTvSeats = findViewById(R.id.tv_seats);
    }
}
