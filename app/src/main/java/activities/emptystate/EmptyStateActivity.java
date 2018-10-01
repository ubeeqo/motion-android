package activities.emptystate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.emptystate.EmptyStateView;
import com.phoenix.motion.emptystate.OnEmptyStateActionClickListener;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EmptyStateActivity extends BaseActivity implements OnEmptyStateActionClickListener {

    //region BindViews
    @BindView(R.id.empty_state_component)
    EmptyStateView mEmptyStateView;
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

        mEmptyStateView.setIcon(R.drawable.ic_alert);
        mEmptyStateView.setMessage("You don't have any booking right now");
        mEmptyStateView.setAction("Book now",this);
    }

    @Override
    public void onActionClick() {

    }
}
