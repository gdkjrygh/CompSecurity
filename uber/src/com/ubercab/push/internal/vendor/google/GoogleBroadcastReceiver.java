// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.push.internal.vendor.google;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

// Referenced classes of package com.ubercab.push.internal.vendor.google:
//            GoogleIntentService

public class GoogleBroadcastReceiver extends WakefulBroadcastReceiver
{

    public GoogleBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent.setComponent(new ComponentName(context.getPackageName(), com/ubercab/push/internal/vendor/google/GoogleIntentService.getName()));
        startWakefulService(context, intent);
    }
}
