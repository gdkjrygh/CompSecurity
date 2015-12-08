// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.google.android.apps.analytics:
//            x, p

public class AnalyticsReceiver extends BroadcastReceiver
{

    public AnalyticsReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getStringExtra("referrer");
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || s == null)
        {
            return;
        }
        Log.i("GoogleAnalyticsTracker", (new StringBuilder("referrer=")).append(s).toString());
        if ((new x(context)).a(s))
        {
            Log.d("GoogleAnalyticsTracker", "Referrer store attemped succeeded.");
            return;
        } else
        {
            Log.w("GoogleAnalyticsTracker", "Referrer store attempt failed.");
            return;
        }
    }
}
