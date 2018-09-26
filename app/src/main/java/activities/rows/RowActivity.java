package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RowActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.tv_row_header)
    TextView mTvRowHeader;
    @BindView(R.id.tv_row_title)
    TextView mTvRowTitle;
    @BindView(R.id.tv_row_subtitle)
    TextView mTvRowSubtitle;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvRowHeader.setText("Personal information");
        mTvRowTitle.setText("Federico Perez");
        mTvRowSubtitle.setText("fede@maicrosof.com");
    }

}
