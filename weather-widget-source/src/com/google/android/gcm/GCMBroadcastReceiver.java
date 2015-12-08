// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package com.google.android.gcm:
//            GCMRegistrar, GCMBaseIntentService

public class GCMBroadcastReceiver extends BroadcastReceiver
{

    private static final String TAG = "GCMBroadcastReceiver";
    private static boolean mReceiverSet = false;

    public GCMBroadcastReceiver()
    {
    }

    static final String getDefaultIntentServiceClassName(Context context)
    {
        return (new StringBuilder()).append(context.getPackageName()).append(".GCMIntentService").toString();
    }

    protected String getGCMIntentServiceClassName(Context context)
    {
        return getDefaultIntentServiceClassName(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        Log.v("GCMBroadcastReceiver", (new StringBuilder()).append("onReceive: ").append(intent.getAction()).toString());
        if (!mReceiverSet)
        {
            mReceiverSet = true;
            String s = getClass().getName();
            if (!s.equals(com/google/android/gcm/GCMBroadcastReceiver.getName()))
            {
                GCMRegistrar.setRetryReceiverClassName(s);
            }
        }
        String s1 = getGCMIntentServiceClassName(context);
        Log.v("GCMBroadcastReceiver", (new StringBuilder()).append("GCM IntentService class: ").append(s1).toString());
        GCMBaseIntentService.runIntentInService(context, intent, s1);
        setResult(-1, null, null);
    }

}
