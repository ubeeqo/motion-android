package activities.divider;

import android.os.Bundle;
import android.support.annotation.Nullable;


import com.phoenix.R;

import activities.base.BaseActivity;

public class DividerActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
    }
}
