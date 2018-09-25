package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RowOneTagActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.tv_row_title)
    TextView mTvTitle;
    @BindView(R.id.iv_row_chevron)
    ImageView mIvChevron;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_one_tag);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText("Federico Perez");
        mIvChevron.setVisibility(View.VISIBLE);
    }
}
