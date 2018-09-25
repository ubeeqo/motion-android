package activities.stepper;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.widget.TextView;

import com.phoenix.R;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class StepperActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.tv_seats)
    TextView mTvSeats;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepper);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillField();
    }

    private void fillField() {

        mTvSeats.setText("4");
    }
}
