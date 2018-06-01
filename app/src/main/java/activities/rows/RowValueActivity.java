package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RowValueActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.tv_row_header)
    TextView mTvRowHeader;
    @BindView(R.id.tv_row_title)
    TextView mTvRowTitle;
    @BindView(R.id.iv_row_chevron)
    ImageView mTvRowChevron;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_value);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvRowChevron.setVisibility(View.VISIBLE);
        mTvRowHeader.setText("Personal information");
        mTvRowTitle.setText("Federico Perez");
    }
}
