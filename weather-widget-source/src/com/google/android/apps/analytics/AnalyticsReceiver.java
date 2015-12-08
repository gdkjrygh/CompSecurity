// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.google.android.apps.analytics:
//            PersistentHitStore, HitStore

public class AnalyticsReceiver extends BroadcastReceiver
{

    static final String INSTALL_ACTION = "com.android.vending.INSTALL_REFERRER";
    static final String REFERRER_KEY = "referrer";

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
        Log.i("GoogleAnalyticsTracker", (new StringBuilder()).append("referrer=").append(s).toString());
        if ((new PersistentHitStore(context)).setReferrer(s))
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
