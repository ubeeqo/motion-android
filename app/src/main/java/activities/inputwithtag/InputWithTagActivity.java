package activities.inputwithtag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.phoenix.R;

public class InputWithTagActivity extends AppCompatActivity {

    private TextView mTvHeader;
    private EditText mEtInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_with_tag);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvHeader.setText("Date of birth");
        mEtInput.setHint("DD/MM/YYYY");
    }

    private void bindViews() {

        mTvHeader = findViewById(R.id.tv_header);
        mEtInput = findViewById(R.id.et_input);
    }
}
