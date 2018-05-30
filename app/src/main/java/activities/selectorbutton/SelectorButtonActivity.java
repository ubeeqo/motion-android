package activities.selectorbutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectorButtonActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.tv_text)
    TextView mTvText;
    @BindView(R.id.tv_error)
    TextView mTvError;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvText.setText("**** 1234");
        mTvError.setText("Psst! You need to fill this up!");
    }

    //region OnClick
    @OnClick(R.id.selector_content)
    public void showError(View view) {

        if (mTvError.getVisibility() == View.GONE) {

            mTvError.setVisibility(View.VISIBLE);
        } else {

            mTvError.setVisibility(View.GONE);
        }
    }
    //endregion
}
