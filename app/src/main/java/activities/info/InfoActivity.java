package activities.info;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.widget.TextView;

import com.phoenix.R;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.tv_info_title)
    TextView mTvInfoTitle;
    @BindView(R.id.tv_info_subtitle)
    TextView mTvSubtitle;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvInfoTitle.setText("Oops! It looks like it is rush hour");
        mTvSubtitle.setText("This is taking longer than expected. Thanks for your patience.");
    }
}
