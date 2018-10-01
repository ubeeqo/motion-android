package activities.succes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.phoenix.R;
import com.phoenix.motion.success.SuccessView;

import activities.DemoActivity;
import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SuccessActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.success_component)
    SuccessView mSuccessView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes);
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mSuccessView.setTitle("Great! Your booking is completed!");
        mSuccessView.setSubtitle(R.string.success_view_subtitle);
        mSuccessView.setGotItButton(this, new Intent(this, DemoActivity.class),"OK, GOT IT");
    }
}
