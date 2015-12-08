// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            WeatherTrendView, TemperatureCubeView

class ai extends Handler
{

    final WeatherTrendView a;

    ai(WeatherTrendView weathertrendview)
    {
        a = weathertrendview;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = message.what;
        WeatherTrendView.access$100(a)[i].setVisibility(0);
        if (!WeatherTrendView.access$100(a)[i].isNoData())
        {
            WeatherTrendView.access$100(a)[i].startAnimating(WeatherTrendView.access$300(a), WeatherTrendView.access$400(a), true);
        } else
        {
            WeatherTrendView.access$100(a)[i].updateLastWeatherMark();
        }
        if (i < 5)
        {
            WeatherTrendView.access$500(a).sendEmptyMessageDelayed(i + 1, 50L);
        }
    }
}
