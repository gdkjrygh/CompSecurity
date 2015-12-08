// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.urbanairship.analytics.Analytics;

// Referenced classes of package com.urbanairship:
//            Preferences, UAirship

public class ApplicationMetrics
{

    private static final String KEY_PREFIX = "com.urbanairship.application.metrics";
    private static final String LAST_OPEN_KEY = "com.urbanairship.application.metrics.LAST_OPEN";
    private final Preferences preferences;

    ApplicationMetrics(Context context)
    {
        preferences = new Preferences(context);
        registerBroadcastReceivers(context);
    }

    private void registerBroadcastReceivers(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(Analytics.ACTION_APP_FOREGROUND);
        intentfilter.addCategory(UAirship.getPackageName());
        context.registerReceiver(new BroadcastReceiver() {

            final ApplicationMetrics this$0;

            public void onReceive(Context context1, Intent intent)
            {
                preferences.put("com.urbanairship.application.metrics.LAST_OPEN", Long.valueOf(System.currentTimeMillis()));
            }

            
            {
                this$0 = ApplicationMetrics.this;
                super();
            }
        }, intentfilter);
    }

    public long getLastOpenTimeMillis()
    {
        return preferences.getLong("com.urbanairship.application.metrics.LAST_OPEN", -1L);
    }

}
