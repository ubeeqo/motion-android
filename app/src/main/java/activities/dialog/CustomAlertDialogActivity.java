package activities.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenix.R;
import com.phoenix.motion.dialog.CustomAlertDialog;
import com.phoenix.motion.dialog.NegativeButtonClickListener;
import com.phoenix.motion.dialog.NeutralButtonClickListener;
import com.phoenix.motion.dialog.PositiveButtonClickListener;

import activities.DemoActivity;

public class CustomAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        InitDialog();
    }

    public void InitDialog() {

        CustomAlertDialog customAlertDialog = new CustomAlertDialog(this);
        PositiveButtonClickListener positiveButtonClickListener = new PositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClickListener() {
                Intent intent = new Intent(getApplicationContext(), DemoActivity.class);
                startActivity(intent);
            }
        };
        NeutralButtonClickListener neutralButtonClickListener = new NeutralButtonClickListener() {
            @Override
            public void onNeutralButtonClickListener() {
                Intent intent = new Intent(getApplicationContext(), DemoActivity.class);
                startActivity(intent);
            }
        };
        NegativeButtonClickListener negativeButtonClickListener = new NegativeButtonClickListener() {
            @Override
            public void onNegativeButtonClickListener() {
                Intent intent = new Intent(getApplicationContext(), DemoActivity.class);
                startActivity(intent);
            }
        };
        customAlertDialog.setTitle("Check out times");
        customAlertDialog.setMessage("Customer care working hours: Mon - Sat (8.00 to 23:00h CET)");
        customAlertDialog.setPositiveButton("Cancel", positiveButtonClickListener);
        customAlertDialog.setNeutralButton("Neutral", neutralButtonClickListener);
        customAlertDialog.setNegativeButton("Accept",negativeButtonClickListener);
        customAlertDialog.show();
    }


}