// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            WeatherIcon

class ad extends Handler
{

    final WeatherIcon a;

    ad(WeatherIcon weathericon)
    {
        a = weathericon;
        super();
    }

    public void handleMessage(Message message)
    {
        WeatherIcon.access$002(a, false);
        if (!WeatherIcon.access$100(a))
        {
            a.startZoom();
        }
    }
}
