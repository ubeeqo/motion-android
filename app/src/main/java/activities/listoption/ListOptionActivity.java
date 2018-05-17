package activities.listoption;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;

public class ListOptionActivity extends AppCompatActivity {

    TextView mTvOptionText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_option);
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvOptionText.setText("Extend booking");
    }

    private void bindViews() {

        mTvOptionText = findViewById(R.id.tv_option_text);
    }
}
