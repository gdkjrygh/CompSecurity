// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import com.weather.Weather.app.WeatherController;
import com.weather.Weather.feed.FeedBounceActivity;

public class News extends FeedBounceActivity
{

    public News()
    {
        super(com/weather/Weather/app/WeatherController);
    }

    protected String getModuleId()
    {
        return "news";
    }
}
