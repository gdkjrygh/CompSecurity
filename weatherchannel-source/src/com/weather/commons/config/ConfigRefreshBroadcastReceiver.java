// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.weather.commons.config:
//            ConfigRefreshService

public class ConfigRefreshBroadcastReceiver extends BroadcastReceiver
{

    public static final String CONFIG_TO_UPDATE_KEY = "CONFIG_TO_UPDATE";

    public ConfigRefreshBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.startService(ConfigRefreshService.getIntent(context, (ConfigPrefs.Keys)intent.getSerializableExtra("CONFIG_TO_UPDATE")));
    }
}
