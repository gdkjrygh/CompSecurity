// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.view.View;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

private class <init>
    implements android.view.ckListener
{

    final WeatherController this$0;

    public void onClick(View view)
    {
        WeatherController.access$700(WeatherController.this, LocalyticsFeedButton.COIN);
        scrollToModule("current-conditions");
    }

    private ()
    {
        this$0 = WeatherController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
