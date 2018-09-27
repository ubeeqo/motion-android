package activities.selectorbutton;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.phoenix.R;
import com.phoenix.motion.selectorbutton.SelectorButtonClickListener;
import com.phoenix.motion.selectorbutton.SelectorButtonView;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectorButtonActivity extends BaseActivity implements SelectorButtonClickListener {

    //region BindViews
    @BindView(R.id.selector_button)
    SelectorButtonView mSelectorButtonView;

    @BindView(R.id.selector_button_error)
    SelectorButtonView mSelectorButtonViewError;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mSelectorButtonView.initSelectorText("**** 1234");
        mSelectorButtonView.setClickListener(this);

        mSelectorButtonViewError.initSelectorText("**** 1234");
        mSelectorButtonViewError.setClickListener(this);
        mSelectorButtonViewError.showError("Psst! You need to fill this up!");
    }

    @Override
    public void onSelectorClick() {

    }
}
