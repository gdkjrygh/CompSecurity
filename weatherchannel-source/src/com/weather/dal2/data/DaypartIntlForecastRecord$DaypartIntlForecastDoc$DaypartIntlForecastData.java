// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;


// Referenced classes of package com.weather.dal2.data:
//            DaypartIntlForecastRecord

public static interface 
{

    public abstract String getDayPartName();

    public abstract Long getForecastDateInGMT();

    public abstract String getForecastDateLocal();

    public abstract String getForecastText();

    public abstract String getShortCast();

    public abstract Integer getUvIndex();

    public abstract Integer getWeatherIconCode();

    public abstract Integer getWeatherIconCodeExtended();
}
