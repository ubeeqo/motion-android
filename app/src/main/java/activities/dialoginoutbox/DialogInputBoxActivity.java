package activities.dialoginoutbox;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenix.R;

import activities.base.BaseActivity;

public class DialogInputBoxActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_input_box);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
    }
}
