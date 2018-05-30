package activities.unsuccess;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UnSuccessActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.tv_unsuccess_subtitle)
    TextView mTvSubtitle;
    @BindView(R.id.tv_try_again)
    TextView mTvTryAgain;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsuccess);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvSubtitle.setText("Extra info about the error and about how can the user proceed to solve it");
        mTvSubtitle.setVisibility(View.VISIBLE);
        mTvTryAgain.setVisibility(View.VISIBLE);
    }
}
