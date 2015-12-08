// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import com.walmartlabs.payment.analytics.AniviaAnalytics;

public class ConfirmationActivity extends Activity
{

    public static final String EXTRA_CONFIRMATION_TEXT = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/ConfirmationActivity.getName()).append(".CONFIRMATION_TEXT").toString();
    public static final String EXTRA_CONFIRMATION_TIME = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/ConfirmationActivity.getName()).append(".CONFIRMATION_TIME").toString();
    private TextView mConfirmation;
    private final Runnable mFinish = new Runnable() {

        final ConfirmationActivity this$0;

        public void run()
        {
            finish();
        }

            
            {
                this$0 = ConfirmationActivity.this;
                super();
            }
    };
    private Handler mHandler;

    public ConfirmationActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.walmartlabs.android.payment.R.layout.pm_activity_confirmation);
        mConfirmation = (TextView)findViewById(com.walmartlabs.android.payment.R.id.pm_confirmation_text);
        mHandler = new Handler();
        AniviaAnalytics.sendPageViewEvent();
    }

    protected void onPause()
    {
        super.onPause();
        mHandler.removeCallbacks(mFinish);
    }

    protected void onResume()
    {
        super.onResume();
        String s = getIntent().getStringExtra(EXTRA_CONFIRMATION_TEXT);
        if (s != null)
        {
            mConfirmation.setText(s);
        }
        long l = getIntent().getLongExtra(EXTRA_CONFIRMATION_TIME, 1000L);
        mHandler.postDelayed(mFinish, l);
    }

}
