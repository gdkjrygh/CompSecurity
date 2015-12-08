// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;


// Referenced classes of package com.weather.Weather.app:
//            WeatherController

class this._cls0
    implements Runnable
{

    final WeatherController this$0;

    public void run()
    {
        setActionBarToCurrentLocation();
    }

    ()
    {
        this$0 = WeatherController.this;
        super();
    }
}
