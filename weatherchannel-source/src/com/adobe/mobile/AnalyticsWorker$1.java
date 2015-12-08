// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.adobe.mobile:
//            AnalyticsWorker, StaticMethods

class init> extends BroadcastReceiver
{

    final AnalyticsWorker this$0;

    public void onReceive(Context context, Intent intent)
    {
        boolean _tmp = AnalyticsWorker.access$002(AnalyticsWorker.networkConnectivity(context));
        if (AnalyticsWorker.access$000())
        {
            StaticMethods.logDebugFormat("Analytics - Network status changed (reachable)", new Object[0]);
            AnalyticsWorker.sharedInstance().kick(false);
            return;
        } else
        {
            StaticMethods.logDebugFormat("Analytics - Network status changed (unreachable)", new Object[0]);
            return;
        }
    }

    ()
    {
        this$0 = AnalyticsWorker.this;
        super();
    }
}
