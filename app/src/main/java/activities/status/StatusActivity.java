package activities.status;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StatusActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.tv_status)
    TextView mTvStatus;
    @BindView(R.id.tv_status_info)
    TextView mTvInfo;
    @BindView(R.id.iv_status_icon)
    ImageView mIvStatusIcon;
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

        mTvStatus.setText("Delayed vehicle");
        mTvInfo.setText("Our prior user is being delayed. Please call us for help");
        mIvStatusIcon.setBackgroundResource(R.drawable.ic_alert);
    }

    //region OnClick
    @OnClick(R.id.status_content)
    public void showMessage(View view) {

        if (mTvInfo.getVisibility() == View.GONE) {

            mTvInfo.setVisibility(View.VISIBLE);
        } else {

            mTvInfo.setVisibility(View.GONE);
        }
    }
    //endregion
}
