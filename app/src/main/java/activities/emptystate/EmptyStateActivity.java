package activities.emptystate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EmptyStateActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.tv_message)
    TextView mTvMessage;
    @BindView(R.id.bt_action)
    TextView mBtAction;
    @BindView(R.id.iv_icon)
    ImageView mIvIcon;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_state);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    public void fillFields() {

        mTvMessage.setText("You don't have any booking right now");
        mBtAction.setText("Book now");
        mBtAction.setVisibility(View.VISIBLE);
        mIvIcon.setBackgroundResource(R.drawable.ic_alert);
        mIvIcon.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.bt_action)
    public void onClick() {

    }
}
