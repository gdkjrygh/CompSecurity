// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.weatheralert;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.model.ExtremeCityIdBean;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.weatheralert:
//            WeatherAlertActivity, d, a

class f extends BroadcastReceiver
{

    final WeatherAlertActivity a;

    private f(WeatherAlertActivity weatheralertactivity)
    {
        a = weatheralertactivity;
        super();
    }

    f(WeatherAlertActivity weatheralertactivity, a a1)
    {
        this(weatheralertactivity);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        context = intent.getAction();
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER") && !context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER"))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = intent.getParcelableArrayListExtra("extra_extreme_city_ids").iterator();
_L5:
        if (!context.hasNext()) goto _L1; else goto _L3
_L3:
        if (!((ExtremeCityIdBean)context.next()).a().equals(WeatherAlertActivity.c(a)) || WeatherAlertActivity.e(a) == null) goto _L5; else goto _L4
_L4:
        WeatherAlertActivity.e(a).a(WeatherAlertActivity.c(a));
        return;
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CLEAR_EXTREME_WEATHER")) goto _L1; else goto _L6
_L6:
        a.finish();
        return;
    }
}
