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

    @BindView(R.id.payment_button_error)
    PaymentButtonView mPaymentButtonViewError;
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

        mPaymentButtonViewError.setPaymentMethod("**** 1234", "credit-card");
        mPaymentButtonViewError.setClickListener(this);
        mPaymentButtonViewError.showError("Psst! You need to fill this up");
    }

    //region OnClick

    @Override
    public void onPaymentClick() {

    }
    //endregion
}
