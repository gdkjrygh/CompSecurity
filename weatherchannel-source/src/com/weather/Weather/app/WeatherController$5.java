// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.google.common.base.Predicate;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

class this._cls0
    implements Predicate
{

    final WeatherController this$0;

    public volatile boolean apply(Object obj)
    {
        return apply((Void)obj);
    }

    public boolean apply(Void void1)
    {
        return desiredSevereAlertVisibility() == 0;
    }

    ()
    {
        this$0 = WeatherController.this;
        super();
    }
}
