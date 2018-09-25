package activities.callus;

import android.os.Bundle;
import android.support.annotation.Nullable;


import com.phoenix.R;

import activities.base.BaseActivity;

public class CallUsActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_us);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
    }
}
