package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

public class RowValueActivity extends AppCompatActivity {

    TextView mTvRowHeader;
    TextView mTvRowTitle;
    ImageView mTvRowChevron;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_value);
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvRowChevron.setVisibility(View.VISIBLE);
        mTvRowHeader.setText("Personal information");
        mTvRowTitle.setText("Federico Perez");
    }

    private void bindViews() {

        mTvRowHeader = findViewById(R.id.tv_row_header);
        mTvRowTitle = findViewById(R.id.tv_row_title);
        mTvRowChevron = findViewById(R.id.iv_row_chevron);
    }
}
