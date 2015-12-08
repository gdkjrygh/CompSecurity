// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.analytics.tracking.android.AnalyticsReceiver;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.GAServiceManager;
import com.google.analytics.tracking.android.Tracker;

public class TrackerReceiver extends BroadcastReceiver
{

    public TrackerReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj;
        Log.i("ABEN", "TrackerReceiver");
        if (intent == null || intent.getAction() == null)
        {
            return;
        }
        try
        {
            obj = intent.getStringExtra("referrer");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        Log.i("ABEN", (new StringBuilder()).append("campaign = ").append(((String) (obj))).toString());
_L8:
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) goto _L4; else goto _L3
_L3:
        Log.i("ABEN", "TrackerReceiver action match");
        obj = intent.getData();
        if (obj == null) goto _L4; else goto _L5
_L5:
        if (((Uri) (obj)).getQueryParameter("utm_source") == null) goto _L7; else goto _L6
_L6:
        Log.i("ABEN", (new StringBuilder()).append("TrackerReceiver utm_source = ").append(((Uri) (obj)).getPath()).toString());
        EasyTracker.getTracker().setCampaign(((Uri) (obj)).getPath());
_L4:
        Log.i("ABEN", "TrackerReceiver new AnalyticsReceiver");
        (new AnalyticsReceiver()).onReceive(context, intent);
        Log.i("ABEN", "TrackerReceiver dispatch");
        GAServiceManager.getInstance().dispatch();
        return;
_L2:
        Log.i("ABEN", "campaign is null");
          goto _L8
_L7:
        if (((Uri) (obj)).getQueryParameter("referrer") == null) goto _L4; else goto _L9
_L9:
        Log.i("ABEN", (new StringBuilder()).append("TrackerReceiver referrer = ").append(((Uri) (obj)).getQueryParameter("referrer")).toString());
        EasyTracker.getTracker().setReferrer(((Uri) (obj)).getQueryParameter("referrer"));
          goto _L4
    }
}
