// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

public class ResetDataReceiver extends BroadcastReceiver
{

    public ResetDataReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.getContentResolver().delete(WeatherContentProvider.c, null, null);
    }
}
