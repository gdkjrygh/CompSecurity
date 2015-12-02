// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.analytics.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adjust.sdk.ReferrerReceiver;
import com.mobileapptracker.Tracker;
import com.ubercab.client.feature.referrer.ReferrerParserReceiver;
import ijg;

public class InstallReceiver extends BroadcastReceiver
{

    public InstallReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        (new Tracker()).onReceive(context, intent);
        (new ReferrerReceiver()).onReceive(context, intent);
        try
        {
            (new ReferrerParserReceiver()).onReceive(context, intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ijg.d(context, "Failed to parse referrer in InstallReceiver.", new Object[0]);
        }
    }
}
