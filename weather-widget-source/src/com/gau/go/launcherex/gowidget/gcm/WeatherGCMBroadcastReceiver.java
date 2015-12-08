// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.gcm:
//            WeatherGCMService

public class WeatherGCMBroadcastReceiver extends BroadcastReceiver
{

    public WeatherGCMBroadcastReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        WeatherGCMService.a(context, intent);
        setResult(-1, null, null);
    }
}
