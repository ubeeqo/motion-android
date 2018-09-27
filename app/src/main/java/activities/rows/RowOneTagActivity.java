package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.rows.RowOneTagLayout;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RowOneTagActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.row_one_tag_component)
    RowOneTagLayout mRowOneTagLayout;

    @BindView(R.id.row_one_tag_component_with_chevron)
    RowOneTagLayout mRowOneTagLayoutWithChevron;
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

        mRowOneTagLayout.setTitle("Federico Perez");

        mRowOneTagLayoutWithChevron.setTitle("Federico Perez");
        mRowOneTagLayoutWithChevron.setChevron();
    }


}
