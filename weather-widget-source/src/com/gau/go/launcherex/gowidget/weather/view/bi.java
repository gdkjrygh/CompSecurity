// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.e.h;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherWidget41Style2

class bi extends Handler
{

    private final WeakReference a;

    public bi(WeatherWidget41Style2 weatherwidget41style2)
    {
        a = new WeakReference(weatherwidget41style2);
    }

    public void handleMessage(Message message)
    {
        WeatherWidget41Style2 weatherwidget41style2 = (WeatherWidget41Style2)a.get();
        if (weatherwidget41style2 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            return;

        case 3: // '\003'
            message = (String)message.obj;
            if (!TextUtils.isEmpty(WeatherWidget41Style2.m(weatherwidget41style2)) && h.a(weatherwidget41style2.getContext(), WeatherWidget41Style2.c(weatherwidget41style2), WeatherWidget41Style2.m(weatherwidget41style2)))
            {
                if (WeatherWidget41Style2.m(weatherwidget41style2).equals("app_widget_theme_white"))
                {
                    WeatherWidget41Style2.a(weatherwidget41style2, weatherwidget41style2.getContext().getPackageName());
                    WeatherWidget41Style2.a(weatherwidget41style2, 0);
                } else
                if (message.equals("app_widget_theme_black"))
                {
                    WeatherWidget41Style2.a(weatherwidget41style2, weatherwidget41style2.getContext().getPackageName());
                    WeatherWidget41Style2.a(weatherwidget41style2, 0);
                } else
                {
                    WeatherWidget41Style2.a(weatherwidget41style2, message);
                    WeatherWidget41Style2.a(weatherwidget41style2, 0);
                }
                WeatherWidget41Style2.b(weatherwidget41style2, WeatherWidget41Style2.n(weatherwidget41style2));
                return;
            }
            break;

        case 4: // '\004'
            WeatherWidget41Style2.o(weatherwidget41style2);
            return;

        case 5: // '\005'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
