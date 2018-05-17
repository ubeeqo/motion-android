package activities.selectorbutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.phoenix.R;

public class SelectorButtonActivity extends AppCompatActivity {

    TextView mTvText;
    TextView mTvError;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mTvText.setText("**** 1234");
        mTvError.setText("sst! You need to fill this up!");
    }

    private void bindViews() {

        mTvText = findViewById(R.id.tv_text);
        mTvError = findViewById(R.id.tv_error);
    }

    public void showError(View view) {

        if(mTvError.getVisibility() == View.GONE){
            mTvError.setVisibility(View.VISIBLE);
        }else{
            mTvError.setVisibility(View.GONE);
        }
    }
}
