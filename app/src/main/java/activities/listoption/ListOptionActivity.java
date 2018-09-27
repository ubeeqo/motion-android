package activities.listoption;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.listoption.ListOption;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ListOptionActivity extends BaseActivity {

    //region Binding
    @BindView(R.id.list_option_component_enable)
    ListOption mListOption;

    @BindView(R.id.list_option_component_disable)
    ListOption mListOptionDisable;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_option);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mListOption.configureView(R.string.list_option_component_text, R.drawable.ic_extend_time);

        mListOptionDisable.configureView(R.string.list_option_component_text, R.drawable.ic_extend_time);
        mListOptionDisable.setEnabled(false);
    }
}
