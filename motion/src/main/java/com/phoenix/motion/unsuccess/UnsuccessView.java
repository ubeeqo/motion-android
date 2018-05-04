package com.phoenix.motion.unsuccess;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.motion.R;
import com.phoenix.motion.callus.CallUsView;

public class UnsuccessView extends RelativeLayout {

    private ImageView mIvImage;
    private TextView mTvTitle;
    private TextView mTvSubtitle;
    private TextView mTvTryAgain;
    private CallUsView mCallUsView;
    private ImageView mIvClose;

    private TryAgainListener mTryAgainListener;
    private Activity mActivity;

    public interface TryAgainListener {

        void tryAgain();
    }

    public UnsuccessView(Context context) {

        super(context);
    }

    public UnsuccessView(Context context,
                         AttributeSet attrs) {

        super(context, attrs);
        inflateView();
    }

    public UnsuccessView(Context context,
                         AttributeSet attrs,
                         int defStyleAttr) {

        super(context, attrs, defStyleAttr);
    }

    private void inflateView() {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.view_unsuccess_layout, this, true);
        bindViews();
        setCloseOnClickListener();
        setTryAgainOnClickListener();
    }

    private void bindViews() {

        mIvImage = findViewById(R.id.iv_unsuccess_image);
        mTvTitle = findViewById(R.id.tv_unsuccess_title);
        mTvSubtitle = findViewById(R.id.tv_unsuccess_subtitle);
        mTvTryAgain = findViewById(R.id.tv_try_again);
        mCallUsView = findViewById(R.id.call_us_view);
        mIvClose = findViewById(R.id.iv_close);
    }

    private void setCloseOnClickListener() {

        mIvClose.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                if (mActivity != null) {

                    mActivity.finish();
                } else {

                    setVisibility(GONE);
                }
            }
        });
    }

    private void setTryAgainOnClickListener() {

        mTvTryAgain.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                setVisibility(GONE);

                if (mTryAgainListener != null) {

                    mTryAgainListener.tryAgain();
                }
            }
        });
    }

    public void setActivity(Activity activity) {

        mActivity = activity;
    }

    public void setTryAgainListener(String action,
                                    TryAgainListener tryAgainListener) {

        mTvTryAgain.setText(action);
        mTvTryAgain.setVisibility(VISIBLE);
        this.mTryAgainListener = tryAgainListener;
    }

    public void setTitle(String message) {

        if (!TextUtils.isEmpty(message)) {

            mTvTitle.setText(message);
        }
    }

    public void setSubtitle(String message) {

        mTvSubtitle.setText(message);
        mTvSubtitle.setVisibility(VISIBLE);
    }

    public void show() {

        setVisibility(VISIBLE);
    }

    public void hideCall() {

        mCallUsView.setVisibility(View.GONE);
    }

    public void setCsOperatorData(String title,
                                  String workingHours,
                                  String phoneNumber) {

        mCallUsView.setPhoneNumber(phoneNumber);
        mCallUsView.setWorkingHours(workingHours);

        mCallUsView.initTexts(title,
                null);
    }
}
