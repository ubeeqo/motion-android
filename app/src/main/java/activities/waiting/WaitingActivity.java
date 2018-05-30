package activities.waiting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WaitingActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.tv_waiting_title)
    TextView mTvTitle;
    @BindView(R.id.tv_wating_subtitle)
    TextView mTvSubtitle;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText("We're still validiting your license");
        mTvSubtitle.setText("One of our customer care members is validating your driver license " +
                "manually. This process normally requires 30min to 2 hours.");
        mTvSubtitle.setVisibility(View.VISIBLE);
    }
}
