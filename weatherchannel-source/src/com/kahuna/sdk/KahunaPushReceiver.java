// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.kahuna.sdk:
//            KahunaLogger, GCMRegistrar, GCMBaseIntentService

public class KahunaPushReceiver extends BroadcastReceiver
{

    private static boolean mReceiverSet = false;
    private final KahunaLogger mLogger = new KahunaLogger((new StringBuilder()).append("[").append(getClass().getName()).append("]: ").toString());

    public KahunaPushReceiver()
    {
    }

    static final String getDefaultIntentServiceClassName(Context context)
    {
        return "com.kahuna.sdk.KahunaPushService";
    }

    protected String getGCMIntentServiceClassName(Context context)
    {
        return getDefaultIntentServiceClassName(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        mLogger.log(2, "onReceive: %s", new Object[] {
            intent.getAction()
        });
        if (!mReceiverSet)
        {
            mReceiverSet = true;
            GCMRegistrar.setRetryReceiverClassName(context, getClass().getName());
        }
        String s = getGCMIntentServiceClassName(context);
        mLogger.log(2, "GCM IntentService class: %s", new Object[] {
            s
        });
        GCMBaseIntentService.runIntentInService(context, intent, s);
        setResult(-1, null, null);
    }

}
