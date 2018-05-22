package activities.waiting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

public class WaitingActivity extends AppCompatActivity {

    private TextView mTvTitle;
    private TextView mTvSubtitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText("We're still validiting your license");
        mTvSubtitle.setText("One of our customer care members is validating your driver license " +
                "manually. This process normally requires 30min to 2 hours.");
        mTvSubtitle.setVisibility(View.VISIBLE);
    }

    private void bindViews() {

        mTvTitle = findViewById(R.id.tv_waiting_title);
        mTvSubtitle = findViewById(R.id.tv_wating_subtitle);
    }
}
