package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.rows.RowValueLayout;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RowValueActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.row_value_component)
    RowValueLayout mRowValueLayout;

    @BindView(R.id.row_value_component_with_chevron)
    RowValueLayout mRowValueLayoutWithChevron;
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

        initRowValue();
        initRowValueWithChevron();
    }

    public void initRowValue() {

        mRowValueLayout.setHeader("Personal information");
        mRowValueLayout.setTitle("Federico Perez");
    }

    public void initRowValueWithChevron() {

        mRowValueLayoutWithChevron.setChevron();
        mRowValueLayoutWithChevron.setHeader("Personal information");
        mRowValueLayoutWithChevron.setTitle("Federico Perez");
    }
}
