package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;

public class RowActivity extends AppCompatActivity {

    TextView mTvRowHeader;
    TextView mTvRowTitle;
    TextView mTvRowSubtitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row);
        bidnViews();
        fillFields();
    }

    private void fillFields() {

        mTvRowHeader.setText("Personal information");
        mTvRowTitle.setText("Federico Perez");
        mTvRowSubtitle.setText("fede@maicrosof.com");
    }

    private void bidnViews() {

        mTvRowHeader = findViewById(R.id.tv_row_header);
        mTvRowTitle = findViewById(R.id.tv_row_title);
        mTvRowSubtitle = findViewById(R.id.tv_row_subtitle);
    }
}
