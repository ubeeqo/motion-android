package activities.inputwithtag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InputWithTagActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.tv_header)
    TextView mTvHeader;
    @BindView(R.id.et_input)
    EditText mEtInput;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_with_tag);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mTvHeader.setText("Date of birth");
        mEtInput.setHint("DD/MM/YYYY");
    }
}
