package activities.emptystate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

public class EmptyStateActivity extends AppCompatActivity {

    TextView mTvMessage;
    TextView mBtAction;
    ImageView mIvIcon;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_state);
        bindViews();
        fillFields();
    }

    public void bindViews() {

        mTvMessage = findViewById(R.id.tv_message);
        mIvIcon = findViewById(R.id.iv_icon);
        mBtAction = findViewById(R.id.bt_action);
    }

    public void fillFields(){

        mTvMessage.setText("You don't have any booking right now");
        mBtAction.setText("Book now");
        mBtAction.setVisibility(View.VISIBLE);
        mIvIcon.setBackgroundResource(R.drawable.ic_alert);
        mIvIcon.setVisibility(View.VISIBLE);
    }

}
