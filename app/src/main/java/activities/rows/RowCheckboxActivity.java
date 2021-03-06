package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenix.R;
import com.phoenix.motion.rows.ViewRowCheckboxLayout;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RowCheckboxActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.row_cb_marketing)
    ViewRowCheckboxLayout mRowCbMarketing;
    @BindView(R.id.row_cb_allow)
    ViewRowCheckboxLayout mRowCbAllow;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_checkbox);
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mRowCbMarketing.setTitle("I wish to receive news and partner's special offers from Ubeeqo International SAS");
        mRowCbAllow.setTitle("Allow to record my activity");
    }
}
