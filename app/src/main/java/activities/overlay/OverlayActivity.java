package activities.overlay;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenix.R;
import com.phoenix.motion.overlay.OverlayDialog;

import activities.base.BaseActivity;

public class OverlayActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        getSupportActionBar().setTitle(this.getClass().getSimpleName());
        initDialog();
    }

    public void initDialog() {

        OverlayDialog overlayDialog = new OverlayDialog(this);
        overlayDialog.setTitle("We are still validating your license...");
        overlayDialog.setMessage("Why? Our cars open by using your smartphone through this app, " +
                "but in some cases there's poor connection on the parkings. " +
                "On those case you can user a card.");
        overlayDialog.show();
    }
}
