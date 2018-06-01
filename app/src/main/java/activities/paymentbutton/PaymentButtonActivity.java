package activities.paymentbutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PaymentButtonActivity extends AppCompatActivity {

    //region BindViews
    @BindView(R.id.iv_icon)
    ImageView mIvIcon;
    @BindView(R.id.tv_payment_method)
    TextView mTvPaymentMethod;
    @BindView(R.id.tv_error)
    TextView mTvError;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_button);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        ButterKnife.bind(this);
        fillFields();
    }

    private void fillFields() {

        mIvIcon.setBackgroundResource(R.drawable.ic_credit_card);
        mTvPaymentMethod.setText("**** 1234");
        mTvError.setText("Psst! You need to fill this up");
    }

    //region OnClick
    @OnClick(R.id.payment_content)
    public void showError(View view) {

        if (mTvError.getVisibility() == View.GONE) {

            mTvError.setVisibility(View.VISIBLE);
        } else {

            mTvError.setVisibility(View.GONE);
        }
    }
    //endregion
}
