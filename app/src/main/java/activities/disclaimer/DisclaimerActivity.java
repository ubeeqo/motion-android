package activities.disclaimer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;

public class DisclaimerActivity extends AppCompatActivity {

    private TextView mTvDisclamerText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillViews();
    }

    private void fillViews() {

        mTvDisclamerText.setText("This parking will be closed. Find the open parking option on the Drive screen.");
    }

    private void bindViews() {

        mTvDisclamerText = findViewById(R.id.tv_disclaime_text);
    }
}
