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
    CustomInputLayout mCustomInput;

    @BindView(R.id.iwt_input_with_suggestion)
    CustomInputLayout mCustomInputWithSuggestion;

    @BindView(R.id.iwt_input_error)
    CustomInputLayout mCustomInputError;

    @BindView(R.id.iwt_input_place_holder)
    CustomInputLayout mCustomInputPlaceHOlder;

    @BindView(R.id.iwt_input_without_tag)
    CustomInputLayout mCustomInputWithoutTag;
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

        mCustomInput.setHeader("Date");
        mCustomInput.getInputText().setText("I'm over 18");

        mCustomInputWithSuggestion.setHeader("Date");
        mCustomInputWithSuggestion.getInputText().setText("I'm over 18");
        mCustomInputWithSuggestion.setHelpMessage("you have to be over 18");

        mCustomInputError.setHeader("Date");
        mCustomInputError.getInputText().setText("16");
        mCustomInputError.setError("you have to be over 18");

        mCustomInputPlaceHOlder.setHeader("Date");
        mCustomInputPlaceHOlder.setHintEvInput("Introduce your age");

        mCustomInputWithoutTag.getInputText().setText("I'm over 18");
    }
}
