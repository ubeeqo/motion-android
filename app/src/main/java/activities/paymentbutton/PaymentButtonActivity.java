package activities.paymentbutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.R;
import com.phoenix.motion.paymentbutton.PaymentButtonClickListener;
import com.phoenix.motion.paymentbutton.PaymentButtonView;

import activities.base.BaseActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PaymentButtonActivity extends BaseActivity implements PaymentButtonClickListener {

    //region BindViews
    @BindView(R.id.payment_button)
    PaymentButtonView mPaymentButtonView;
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

        mPaymentButtonView.setPaymentMethod("**** 1234","card");
        mPaymentButtonView.setClickListener(this);
    }

    //region OnClick
    @OnClick(R.id.payment_content)
    public void showError(View view) {

        mPaymentButtonView.hideError();
    }

    @Override
    public void onPaymentClick() {

        mPaymentButtonView.showError("Psst! You need to fill this up");
    }
    //endregion
}
