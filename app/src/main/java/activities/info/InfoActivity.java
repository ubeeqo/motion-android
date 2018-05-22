package activities.info;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;

public class InfoActivity extends AppCompatActivity {

    private TextView mTvInfoTitle;
    private TextView mTvSubtitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvInfoTitle.setText("Oops! It looks like it is rush hour");
        mTvSubtitle.setText("This is taking longer than expected. Thanks for your patience.");
    }

    private void bindViews() {

        mTvInfoTitle = findViewById(R.id.tv_info_title);
        mTvSubtitle = findViewById(R.id.tv_info_subtitle);
    }
}
