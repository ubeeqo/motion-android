package activities.unsuccess;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

public class UnSuccessActivity extends AppCompatActivity {

    private TextView mTvSubtitle;
    private TextView mTvTryAgain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsuccess);
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvSubtitle.setText("Extra info about the error and about how can the user proceed to solve it");
        mTvSubtitle.setVisibility(View.VISIBLE);
        mTvTryAgain.setVisibility(View.VISIBLE);
    }

    private void bindViews() {

        mTvSubtitle = findViewById(R.id.tv_unsuccess_subtitle);
        mTvTryAgain = findViewById(R.id.tv_try_again);
    }
}
