package activities.styles;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.phoenix.R;

import activities.base.BaseActivity;

import butterknife.ButterKnife;

public class TextStylesActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_styles);
        ButterKnife.bind(this);
    }
}
