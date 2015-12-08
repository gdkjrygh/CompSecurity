// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.go.weatherex.home.current:
//            AirQualityIndex

class a extends BroadcastReceiver
{

    final AirQualityIndex a;

    a(AirQualityIndex airqualityindex)
    {
        a = airqualityindex;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !intent.getAction().equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA")) 
        {
            return;
        }
        AirQualityIndex.a(a);
    }
}
