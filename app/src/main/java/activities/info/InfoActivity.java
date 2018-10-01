package activities.info;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.info.InfoView;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.info_view_component)
    InfoView mInfoView;
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

        mInfoView.setTitle("Oops! It looks like it is rush hour");
        mInfoView.setSubtitle(R.string.info_view_component_subtitle);
    }
}
