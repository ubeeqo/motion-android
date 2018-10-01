package activities.waiting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.waiting.WaitingView;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class WaitingActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.waiting_view_component)
    WaitingView mWaitingView;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mWaitingView.setImage(R.drawable.ic_alert);
        mWaitingView.setTitle("We're still validiting your license");
        mWaitingView.setSubtitle(R.string.waiting_view_component_subtitle);
    }
}
