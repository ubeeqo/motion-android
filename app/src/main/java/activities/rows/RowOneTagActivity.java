package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

public class RowOneTagActivity  extends AppCompatActivity{

    private TextView mTvTitle;
    private ImageView mIvChevron;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_one_tag);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvTitle.setText("Federico Perez");
        mIvChevron.setVisibility(View.VISIBLE);
    }

    private void bindViews() {

        mTvTitle = findViewById(R.id.tv_row_title);
        mIvChevron = findViewById(R.id.iv_row_chevron);
    }
}
