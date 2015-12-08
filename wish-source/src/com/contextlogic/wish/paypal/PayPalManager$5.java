// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.paypal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.contextlogic.wish.paypal:
//            PayPalManager

class val.activity extends BroadcastReceiver
{

    final PayPalManager this$0;
    final Activity val$activity;

    public void onReceive(Context context, Intent intent)
    {
        int i = intent.getIntExtra("com.braintreepayments.api.messages.EXTRA_RESULT_CODE", -1);
        context = (Intent)intent.getParcelableExtra("com.braintreepayments.api.BraintreeBrowserSwitchActivity.EXTRA_INTENT");
        handleBraintreeBroadcastIntent(val$activity, context, i);
    }

    ()
    {
        this$0 = final_paypalmanager;
        val$activity = Activity.this;
        super();
    }
}
