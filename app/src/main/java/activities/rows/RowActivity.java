package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.rows.RowLayout;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RowActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.row_layout_component)
    RowLayout mRowLayout;

    @BindView(R.id.row_layout_component_header)
    RowLayout mRowLayoutOneElement;

    @BindView(R.id.row_layout_component_header_and_title)
    RowLayout mRowLayoutTwoElement;

    @BindView(R.id.row_layout_component_action_row)
    RowLayout mRowLayoutActionRow;

    @BindView(R.id.row_layout_component_check_box)
    RowLayout mRowLayoutCheckBox;
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

        mRowLayout.configureView(R.string.row_layout_component_header, "Federico Perez", "fede@test.com");

        mRowLayoutOneElement.configureView(R.string.row_layout_component_header);

        mRowLayoutTwoElement.configureView(R.string.row_layout_component_header, "Federico Perez");

        mRowLayoutActionRow.configureView(R.string.row_layout_component_header, true);

        mRowLayoutCheckBox.configureCheckView(R.string.row_layout_component_header, true);
    }

}
