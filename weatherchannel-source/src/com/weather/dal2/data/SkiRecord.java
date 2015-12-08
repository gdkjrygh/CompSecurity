// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;


// Referenced classes of package com.weather.dal2.data:
//            Record

public interface SkiRecord
    extends Record
{

    public abstract Integer getMaxSnowLevelCm(int i);

    public abstract Integer getMaxSnowLevelIn(int i);

    public abstract Integer getMinSnowLevelCm(int i);

    public abstract Integer getMinSnowLevelIn(int i);

    public abstract Integer getOpenLifts(int i);

    public abstract String[] getOperatingHours(int i);

    public abstract String getResortName(int i);

    public abstract String getSnowAccumulationForecastInCentimeters(int i);

    public abstract String getSnowAccumulationForecastInInches(int i);

    public abstract String getSnowCondition(int i);

    public abstract Integer getSnowFallenLast24HoursCm(int i);

    public abstract Integer getSnowFallenLast24HoursIn(int i);

    public abstract Integer getTemperatureC(int i);

    public abstract Integer getTemperatureF(int i);

    public abstract Integer getTotalNumberOfLift(int i);

    public abstract String getWindDirection(int i);

    public abstract Integer getWindSpeedKm(int i);

    public abstract Integer getWindSpeedMi(int i);

    public abstract int totalNumberOfResorts();
}
