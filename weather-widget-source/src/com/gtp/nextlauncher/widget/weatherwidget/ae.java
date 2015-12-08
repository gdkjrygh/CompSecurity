// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;


// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            WeatherIcon

class ae
    implements Runnable
{

    final WeatherIcon a;

    ae(WeatherIcon weathericon)
    {
        a = weathericon;
        super();
    }

    public void run()
    {
        a.startZoom();
    }
}
