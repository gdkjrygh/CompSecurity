// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationSummaryView;

public class PhotoBaseView extends LinearLayout
{
    public static interface ButtonListener
    {

        public abstract void onPrimaryClicked();
    }


    private ButtonListener mButtonListener;
    private LinearLayout mFooterLayout;
    private LinearLayout mMainLayout;
    private Button mPrimaryButton;
    private OrderConfigurationSummaryView mSummaryView;

    public PhotoBaseView(Context context)
    {
        super(context);
    }

    public PhotoBaseView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PhotoBaseView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public OrderConfigurationSummaryView getSummaryView()
    {
        return mSummaryView;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mMainLayout = (LinearLayout)findViewById(com.walmartlabs.android.photo.R.id.base_main);
        mFooterLayout = (LinearLayout)findViewById(com.walmartlabs.android.photo.R.id.footer);
        mPrimaryButton = (Button)mFooterLayout.findViewById(com.walmartlabs.android.photo.R.id.primary_button);
        mSummaryView = (OrderConfigurationSummaryView)findViewById(com.walmartlabs.android.photo.R.id.summary_layout);
        mPrimaryButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PhotoBaseView this$0;

            public void onClick(View view)
            {
                if (mButtonListener != null)
                {
                    mButtonListener.onPrimaryClicked();
                }
            }

            
            {
                this$0 = PhotoBaseView.this;
                super();
            }
        });
    }

    public void setButtonListener(ButtonListener buttonlistener)
    {
        mButtonListener = buttonlistener;
    }

    public void setFooterVisible(boolean flag)
    {
        LinearLayout linearlayout = mFooterLayout;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
    }

    public void setMainContent(View view)
    {
        mMainLayout.removeAllViews();
        mMainLayout.addView(view);
    }

    public void setPrimaryButtonEnabled(boolean flag)
    {
        mPrimaryButton.setEnabled(flag);
    }

    public void setPrimaryButtonText(String s)
    {
        mPrimaryButton.setText(s);
    }

    public void setPrimaryButtonVisible(boolean flag)
    {
        Button button = mPrimaryButton;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        button.setVisibility(i);
    }

}
