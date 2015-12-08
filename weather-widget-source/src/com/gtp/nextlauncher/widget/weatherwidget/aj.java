// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;


// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            WeatherTrendView

class aj
    implements Runnable
{

    final WeatherTrendView a;

    aj(WeatherTrendView weathertrendview)
    {
        a = weathertrendview;
        super();
    }

    public void run()
    {
        a.refreshScreenMode();
        a.startShowUpAnimation();
    }
}
