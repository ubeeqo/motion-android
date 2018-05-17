package activities.succes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

public class SuccesActivity extends AppCompatActivity {

        private TextView mTvTitle;
        private TextView mTvSubtitle;
        private ImageView mIvZone;
        private TextView mTvButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText("Great! Your booking is completed!");
        mTvSubtitle.setText("Connecting with car");
        mTvSubtitle.setVisibility(View.VISIBLE);
        mIvZone.setBackgroundResource(R.drawable.selector_info_button);
        mIvZone.setVisibility(View.VISIBLE);
        mTvButton.setText("OK, GOT IT");
        mTvButton.setVisibility(View.VISIBLE);

    }

    private void bindViews() {

        mTvTitle = findViewById(R.id.tv_success_title);
        mTvSubtitle = findViewById(R.id.tv_success_subtitle);
        mIvZone = findViewById(R.id.iv_zone);
        mTvButton = findViewById(R.id.bt_got_it);
    }
}
