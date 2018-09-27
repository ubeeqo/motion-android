package activities.unsuccess;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.unsuccess.UnsuccessView;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class UnSuccessActivity extends BaseActivity {

    //region BindViews
    @BindView(R.id.unsuccess_view_component)
    UnsuccessView mUnsuccessView;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unsuccess);
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mUnsuccessView.setTitle(getString(R.string.unsuccess_title));
        mUnsuccessView.setSubtitle("Extra info about the error and about how can the user proceed to solve it");
        mUnsuccessView.setActivity(this);
    }
}
