// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            GCMIntentService

public class GCMBroadcastReceiver extends WakefulBroadcastReceiver
{

    public GCMBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE"))
        {
            intent.setClassName(context, com/walmart/android/app/ereceipt/GCMIntentService.getName());
            startWakefulService(context, intent);
            setResult(-1, null, null);
        }
    }
}
