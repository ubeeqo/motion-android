package activities.custominputlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenix.R;
import com.phoenix.motion.custominputlayout.CustomInputLayout;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomInputLayoutActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.iwt_input)
    CustomInputLayout mInputWithTag;
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

        mInputWithTag.setHeader("Input's tag");
    }

    @OnClick(R.id.ll_container)
    public void onClick() {

        if (mInputWithTag.getInputText().getText().toString().toLowerCase().contains("e")) {

            mInputWithTag.setError("You must fill this field");
        } else if (mInputWithTag.getInputText().getText().toString().toLowerCase().contains("a")) {

            mInputWithTag.setHelpMessage("Remember you can't use a in this field");
        } else if (mInputWithTag.getInputText().getText().toString().toLowerCase().contains("i")) {

            mInputWithTag.hideError();
        } else {

            mInputWithTag.hideTexViewError();
        }
    }
}
