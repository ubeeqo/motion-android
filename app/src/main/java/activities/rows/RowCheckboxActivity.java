package activities.rows;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenix.R;
import com.phoenix.motion.rows.ViewRowCheckboxLayout;

public class RowCheckboxActivity extends AppCompatActivity {

    //region BindViews
    private ViewRowCheckboxLayout mRowCheckbox;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_checkbox);
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mRowCheckbox.setTitle("I wish to receive news and partner's special offers from Ubeeqo International SAS");
    }

    private void bindViews() {

        mRowCheckbox = findViewById(R.id.row_checkbox);
    }
}
