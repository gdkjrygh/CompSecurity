// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.payment;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.walmart.android.app.main.MiscActivity;
import com.walmart.android.app.saver.SaverAutomaticSubmitReceiptActivity;
import com.walmart.android.app.saver.SaverReceiptActivity;
import com.walmartlabs.payment.integration.AppIntegration;

public class WalmartAppIntegration
    implements AppIntegration
{

    public WalmartAppIntegration()
    {
    }

    public Intent createSubmitToSaverIntent(Context context, String s, String s1)
    {
        context = new Intent(context, com/walmart/android/app/saver/SaverAutomaticSubmitReceiptActivity);
        context.putExtra("TC_NBR", s);
        context.putExtra("LOCAL_DATE", s1);
        context.putExtra("SOURCE", "existing");
        return context;
    }

    public Intent createTermsIntent(Context context)
    {
        context = new Intent(context, com/walmart/android/app/main/MiscActivity);
        context.putExtra("show", 5);
        return context;
    }

    public Intent handleSubmitToSaverResult(Context context, int i, Intent intent)
    {
        if (i == 11)
        {
            intent.setComponent(new ComponentName(context, com/walmart/android/app/saver/SaverReceiptActivity));
            intent.addFlags(0x20000);
            return intent;
        } else
        {
            return null;
        }
    }
}
