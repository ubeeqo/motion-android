package activities.paymentbutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

public class PaymentButtonActivity extends AppCompatActivity {

    private ImageView mIvIcon;
    private TextView mTvPaymentMethod;
    private TextView mTvError;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_button);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        bindViews();
        fillFields();
    }

    private void fillFields() {

        mIvIcon.setBackgroundResource(R.drawable.ic_credit_card);
        mTvPaymentMethod.setText("**** 1234");
        mTvError.setText("Psst! You need to fill this up");
    }

    private void bindViews() {

        mIvIcon = findViewById(R.id.iv_icon);
        mTvPaymentMethod = findViewById(R.id.tv_payment_method);
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
