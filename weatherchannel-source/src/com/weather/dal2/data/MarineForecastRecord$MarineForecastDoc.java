// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;


// Referenced classes of package com.weather.dal2.data:
//            MarineForecastRecord

public static interface MarineForecastHeader
{
    public static interface MarineForecastData
    {

        public abstract Double getPeakWaveDirectionInDegrees();

        public abstract Double getPeakWavePeriodInSeconds();

        public abstract Integer getSeaStateDescription();

        public abstract Double getSeaSurfaceTempFahrenheit();

        public abstract Integer getSurfDescription();

        public abstract Integer getWaveDescription();

        public abstract Double getWaveDirectionInDegrees();

        public abstract Double getWaveHeight();

        public abstract Double getWavePeriodInSeconds();

        public abstract Integer getWindDescription();

        public abstract String getWindDirectionAscii();

        public abstract Double getWindDirectionInDegrees();

        public abstract Double getWindSpeedInMiles();

        public abstract Double getWindWaveDirectionInDegrees();

        public abstract Double getWindWavePeriodInSeconds();
    }

    public static interface MarineForecastHeader
    {

        public abstract Integer getDayOfWeek();

        public abstract String getProcessTime();

        public abstract String getTimeSlot();

        public abstract String getWMOId();
    }


    public abstract MarineForecastData getMarineForecastData();

    public abstract MarineForecastHeader getMarineForecastHeader();
}
