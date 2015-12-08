// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.analytics.tracking.android:
//            Log

public class AnalyticsReceiver extends BroadcastReceiver
{

    static final String CAMPAIGN_KEY = "referrer";
    static final String INSTALL_ACTION = "com.android.vending.INSTALL_REFERRER";

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
        try
        {
            context = context.openFileOutput("gaInstallData", 0);
            context.write(s.getBytes());
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Error storing install campaign.");
        }
    }
}
