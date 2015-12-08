// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

public static class  extends BroadcastReceiver
{

    private static void enable(Context context, boolean flag)
    {
        Object obj = context.getPackageManager();
        context = new ComponentName(context, com/walmart/android/wmservice/WalmartLocationService$ProvidersChangedReceiver);
        StringBuilder stringbuilder;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        ((PackageManager) (obj)).setComponentEnabledSetting(context, i, 1);
        obj = WalmartLocationService.TAG;
        stringbuilder = new StringBuilder();
        if (flag)
        {
            context = "Enabling";
        } else
        {
            context = "Disabling";
        }
        WLog.d(((String) (obj)), stringbuilder.append(context).append(" ProvidersChangedReceiver").toString());
    }

    public void onReceive(Context context, Intent intent)
    {
        WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("ProvidersChangedReceiver.onReceive(): ").append(intent.toString()).append(", extras=").append(intent.getExtras()).toString());
        enable(context, false);
        WalmartLocationService.start(context);
    }


    public ()
    {
    }
}
