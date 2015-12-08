// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import com.gau.go.launcherex.gowidget.weather.service.WeatherService;
import com.gau.go.launcherex.gowidget.weather.service.e;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWeatherWidget41Style2

class d extends BroadcastReceiver
{

    final GLWeatherWidget41Style2 a;

    d(GLWeatherWidget41Style2 glweatherwidget41style2)
    {
        a = glweatherwidget41style2;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null && GLWeatherWidget41Style2.access$500(a) != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (context.equals("android.intent.action.TIME_TICK"))
        {
            GLWeatherWidget41Style2.access$600(a);
            return;
        }
        if (context.equals("android.intent.action.SCREEN_OFF"))
        {
            GLWeatherWidget41Style2.access$702(a, false);
            return;
        }
        if (context.equals("android.intent.action.SCREEN_ON"))
        {
            GLWeatherWidget41Style2.access$702(a, true);
            GLWeatherWidget41Style2.access$600(a);
            return;
        }
        if (context.equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            GLWeatherWidget41Style2.access$600(a);
            return;
        }
        if (context.equals("android.intent.action.TIME_SET") || context.equals("android.intent.action.DATE_CHANGED"))
        {
            GLWeatherWidget41Style2.access$800(a).a();
            if (a.mIsPro && a.mSettings.h)
            {
                GLWeatherWidget41Style2.access$800(a).a(true);
            }
            GLWeatherWidget41Style2.access$600(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED"))
        {
            GLWeatherWidget41Style2.access$900(a, true);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_INITIALIZED_CITY"))
        {
            GLWeatherWidget41Style2.access$1002(a, false);
            int i = intent.getIntExtra("city_location_state", 3);
            context = intent.getStringExtra("city_location_id");
            if (i == 4 && !TextUtils.isEmpty(context))
            {
                GLWeatherWidget41Style2.access$1100(a);
                return;
            } else
            {
                GLWeatherWidget41Style2.access$1100(a);
                return;
            }
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (GLWeatherWidget41Style2.access$000(a) == null) goto _L1; else goto _L3
_L3:
        try
        {
            GLWeatherWidget41Style2.access$300(a, GLWeatherWidget41Style2.access$000(a).b(), GLWeatherWidget41Style2.access$000(a).a(), GLWeatherWidget41Style2.access$000(a).a(GLWeatherWidget41Style2.access$200(a)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (!c.a()) goto _L1; else goto _L4
_L4:
        context.printStackTrace();
        return;
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY")) goto _L1; else goto _L5
_L5:
        if (GLWeatherWidget41Style2.access$000(a) == null) goto _L7; else goto _L6
_L6:
        if (GLWeatherWidget41Style2.access$1200(a))
        {
            try
            {
                GLWeatherWidget41Style2.access$300(a, GLWeatherWidget41Style2.access$000(a).b(), GLWeatherWidget41Style2.access$000(a).a(), GLWeatherWidget41Style2.access$000(a).a(GLWeatherWidget41Style2.access$200(a)));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (c.a())
                {
                    context.printStackTrace();
                }
                continue; /* Loop/switch isn't completed */
            }
        }
_L9:
        GLWeatherWidget41Style2.access$1202(a, false);
        return;
_L7:
        if (GLWeatherWidget41Style2.access$1300(a))
        {
            GLWeatherWidget41Style2.access$1600(a).bindService(new Intent(GLWeatherWidget41Style2.access$1400(a), com/gau/go/launcherex/gowidget/weather/service/WeatherService), GLWeatherWidget41Style2.access$1500(a), 1);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }
}
