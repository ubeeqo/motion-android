package activities.status;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

public class StatusActivity extends AppCompatActivity {

    private TextView mTvStatus;
    private TextView mTvInfo;
    private ImageView mIvStatusIcon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvStatus.setText("Delayed vehicle");
        mTvInfo.setText("Our prior user is being delayed. Please call us for help");
        mIvStatusIcon.setBackgroundResource(R.drawable.ic_alert);
    }

    private void bindViews() {

        mTvStatus = findViewById(R.id.tv_status);
        mTvInfo = findViewById(R.id.tv_status_info);
        mIvStatusIcon = findViewById(R.id.iv_status_icon);
    }

    public void showMessage(View view) {

        if (mTvInfo.getVisibility()==View.GONE) {

            mTvInfo.setVisibility(View.VISIBLE);
        } else {

            mTvInfo.setVisibility(View.GONE);
        }
    }
}
