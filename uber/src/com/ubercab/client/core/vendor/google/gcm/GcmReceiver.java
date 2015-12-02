// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

// Referenced classes of package com.ubercab.client.core.vendor.google.gcm:
//            GcmService

public class GcmReceiver extends WakefulBroadcastReceiver
{

    public GcmReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent.setComponent(new ComponentName(context.getPackageName(), com/ubercab/client/core/vendor/google/gcm/GcmService.getName()));
        startWakefulService(context, intent);
        setResultCode(-1);
    }
}
