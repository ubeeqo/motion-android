package activities.succes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SuccesActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.tv_success_title)
    TextView mTvTitle;
    @BindView(R.id.tv_success_subtitle)
    TextView mTvSubtitle;
    @BindView(R.id.iv_zone)
    ImageView mIvZone;
    @BindView(R.id.bt_got_it)
    TextView mTvButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes);
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText("Great! Your booking is completed!");
        mTvSubtitle.setText("Connecting with car");
        mTvSubtitle.setVisibility(View.VISIBLE);
        mIvZone.setImageResource(R.drawable.selector_info_button);
        mIvZone.setVisibility(View.VISIBLE);
        mTvButton.setText("OK, GOT IT");
        mTvButton.setVisibility(View.VISIBLE);
    }
}
