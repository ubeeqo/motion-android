package activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.phoenix.R;
import com.phoenix.motion.selectorbutton.SelectorButtonView;

import model.ComponentModel;
import utils.ComponentsUtils;


public class DemoActivity extends AppCompatActivity {

    private ComponentsUtils mComponentsUtils;
    private LinearLayout mContentViews;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_app);
        mContentViews = findViewById(R.id.layout_content_views);
        mComponentsUtils = new ComponentsUtils();
        fillActivity();
    }

    public void fillActivity(){
        if(mComponentsUtils.getComponentsList().size()!=0){
            for(ComponentModel componentModel:mComponentsUtils.getComponentsList()){
                SelectorButtonView selectorButtonView = new SelectorButtonView(this);
                selectorButtonView.hideError();
                selectorButtonView.initSelectorText(componentModel.getName());
                mContentViews.addView(selectorButtonView);
            }
        }
    }


}
