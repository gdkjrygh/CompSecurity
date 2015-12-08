// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

public static class yChangeReceiver extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(context);
        WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("ShutdownReceiver.onReceive(): ").append(intent).append(", extras=").append(intent.getExtras()).append(", enable=").append(flag).toString());
        yChangeReceiver.access._mth000(context, flag);
    }

    public yChangeReceiver()
    {
    }
}
