package com.phoenix.motion.success;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;
import com.phoenix.motion.Configurations;
import com.squareup.picasso.Picasso;

public class SuccessView extends RelativeLayout {

    private ImageView mIvImage;
    private TextView mTvTitle;
    private TextView mTvSubtitle;
    private ImageView mIvZone;
    private TextView mBtGotIt;

    public SuccessView(Context context) {

        super(context);
    }

    public SuccessView(Context context,
                       AttributeSet attrs) {

        super(context, attrs);
        inflateView();
    }

    public SuccessView(Context context,
                       AttributeSet attrs,
                       int defStyleAttr) {

        super(context, attrs, defStyleAttr);
    }

    private void inflateView() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.view_succes_layout, this, true);
        bindViews();
    }

    private void bindViews() {

        mIvImage = findViewById(R.id.iv_success_image);
        mTvTitle = findViewById(R.id.tv_success_title);
        mTvSubtitle = findViewById(R.id.tv_success_subtitle);
        mIvZone = findViewById(R.id.iv_zone);
        mBtGotIt = findViewById(R.id.bt_got_it);
    }

    public void setImage(int resourceId) {

        mIvImage.setImageResource(resourceId);
    }

    public void setTitle(int resourceId) {

        mTvTitle.setText(getContext().getString(resourceId));
    }

    public void setTitle(String message) {

        mTvTitle.setText(message);
    }

    public void setSubtitle(int resourceId) {

        mTvSubtitle.setText(getContext().getString(resourceId));
        mTvSubtitle.setVisibility(VISIBLE);
    }

    public void setImageZone(String imageUrl) {

        Picasso.get().load(imageUrl).into(mIvZone);
        mIvZone.setVisibility(View.VISIBLE);
    }

    public void setGotItButton(final Activity currentActivity,
                               final Intent resultIntent,
                               String text) {

        mBtGotIt.setText(text);
        mBtGotIt.setVisibility(View.VISIBLE);
        mBtGotIt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                currentActivity.setResult(Activity.RESULT_OK, resultIntent);
                currentActivity.finish();
            }
        });
    }

    public void showAndStartActivity(final Activity currentActivity, final Intent nextActivity) {

        setVisibility(VISIBLE);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                currentActivity.startActivity(nextActivity);
                currentActivity.finish();
            }
        }, Configurations.MILLISECONDS_IN_SUCCESS_SCREENS);
    }

    public void showAndFinish(final Activity activity) {

        showAndFinish(activity, null);
    }

    public void showAndFinish(final Activity activity, final Intent intent) {

        setVisibility(VISIBLE);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                activity.setResult(Activity.RESULT_OK, intent);
                activity.finish();
            }
        }, Configurations.MILLISECONDS_IN_SUCCESS_SCREENS);
    }

    public void showAndHide(boolean autoClose) {

        setVisibility(VISIBLE);

        if (autoClose) {

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    setVisibility(GONE);
                }
            }, Configurations.MILLISECONDS_IN_SUCCESS_SCREENS);
        }
    }

    public void hide() {

        setVisibility(GONE);
    }

    public void show() {

        setVisibility(VISIBLE);
    }
}
