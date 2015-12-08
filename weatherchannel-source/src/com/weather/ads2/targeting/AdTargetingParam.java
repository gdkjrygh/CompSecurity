// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;


public final class AdTargetingParam extends Enum
{

    private static final AdTargetingParam $VALUES[];
    public static final AdTargetingParam ADID;
    public static final AdTargetingParam AGE;
    public static final AdTargetingParam AID;
    public static final AdTargetingParam ALERT;
    public static final AdTargetingParam ATFID;
    public static final AdTargetingParam AUDIENCE;
    public static final AdTargetingParam CHANNEL;
    public static final AdTargetingParam FAMILY;
    public static final AdTargetingParam FIRST_TIME_LAUNCH;
    public static final AdTargetingParam GENDER;
    public static final AdTargetingParam H20;
    public static final AdTargetingParam HYPER_LOCAL_ZIP;
    public static final AdTargetingParam HZCS;
    public static final AdTargetingParam KW;
    public static final AdTargetingParam LAUNCH_PARTNER;
    public static final AdTargetingParam LAYER;
    public static final AdTargetingParam LNID;
    public static final AdTargetingParam LOCATION_CITY;
    public static final AdTargetingParam LOCATION_COUNTRY_CODE;
    public static final AdTargetingParam LOCATION_DMA;
    public static final AdTargetingParam LOCATION_STATE;
    public static final AdTargetingParam LOCATION_ZIP;
    public static final AdTargetingParam LOTAME;
    public static final AdTargetingParam LPID;
    public static final AdTargetingParam NZCS;
    public static final AdTargetingParam PARTNER;
    public static final AdTargetingParam PLAYLIST;
    public static final AdTargetingParam PRELOAD_PARTNER;
    public static final AdTargetingParam PROXIMITY;
    public static final AdTargetingParam RMID;
    public static final AdTargetingParam TPID;
    public static final AdTargetingParam TTID;
    public static final AdTargetingParam VAPP;
    public static final AdTargetingParam VIDEO;
    public static final AdTargetingParam VIEW;
    public static final AdTargetingParam VSDK;
    public static final AdTargetingParam WEATHERFX;
    public static final AdTargetingParam WEATHER_CONDITION;
    public static final AdTargetingParam WEATHER_FEELS_LIKE_TEMPERATURE_CELSIUS;
    public static final AdTargetingParam WEATHER_FORECAST_HIGH_TEMPERATURE_CELSIUS;
    public static final AdTargetingParam WEATHER_FORECAST_LOW_TEMPERATURE_CELSIUS;
    public static final AdTargetingParam WEATHER_HUMIDITY;
    public static final AdTargetingParam WEATHER_POLLEN;
    public static final AdTargetingParam WEATHER_SEVERE_ALERTS;
    public static final AdTargetingParam WEATHER_TEMPERATURE_CELSIUS;
    public static final AdTargetingParam WEATHER_TEMPERATURE_INCREMENT;
    public static final AdTargetingParam WEATHER_TEMPERATURE_RANGE;
    public static final AdTargetingParam WEATHER_UV_INDEX;
    public static final AdTargetingParam WEATHER_WIND_SPEED;
    public static final AdTargetingParam ZCS;
    private final String parameterKey;

    private AdTargetingParam(String s, int i, String s1)
    {
        super(s, i);
        parameterKey = s1;
    }

    public static AdTargetingParam valueOf(String s)
    {
        return (AdTargetingParam)Enum.valueOf(com/weather/ads2/targeting/AdTargetingParam, s);
    }

    public static AdTargetingParam[] values()
    {
        return (AdTargetingParam[])$VALUES.clone();
    }

    public String getParameterKey()
    {
        return parameterKey;
    }

    static 
    {
        WEATHERFX = new AdTargetingParam("WEATHERFX", 0, "wfxtg");
        AUDIENCE = new AdTargetingParam("AUDIENCE", 1, "faud");
        PROXIMITY = new AdTargetingParam("PROXIMITY", 2, "fgeo");
        HYPER_LOCAL_ZIP = new AdTargetingParam("HYPER_LOCAL_ZIP", 3, "hlzip");
        ZCS = new AdTargetingParam("ZCS", 4, "zcs");
        NZCS = new AdTargetingParam("NZCS", 5, "nzcs");
        HZCS = new AdTargetingParam("HZCS", 6, "hzcs");
        LOTAME = new AdTargetingParam("LOTAME", 7, "sg");
        LOCATION_COUNTRY_CODE = new AdTargetingParam("LOCATION_COUNTRY_CODE", 8, "cc");
        LOCATION_STATE = new AdTargetingParam("LOCATION_STATE", 9, "st");
        LOCATION_CITY = new AdTargetingParam("LOCATION_CITY", 10, "ct");
        LOCATION_ZIP = new AdTargetingParam("LOCATION_ZIP", 11, "zip");
        LOCATION_DMA = new AdTargetingParam("LOCATION_DMA", 12, "dma");
        WEATHER_CONDITION = new AdTargetingParam("WEATHER_CONDITION", 13, "cnd");
        WEATHER_TEMPERATURE_INCREMENT = new AdTargetingParam("WEATHER_TEMPERATURE_INCREMENT", 14, "tmp");
        WEATHER_TEMPERATURE_RANGE = new AdTargetingParam("WEATHER_TEMPERATURE_RANGE", 15, "tmpr");
        WEATHER_TEMPERATURE_CELSIUS = new AdTargetingParam("WEATHER_TEMPERATURE_CELSIUS", 16, "tmpc");
        WEATHER_FEELS_LIKE_TEMPERATURE_CELSIUS = new AdTargetingParam("WEATHER_FEELS_LIKE_TEMPERATURE_CELSIUS", 17, "fltmpc");
        WEATHER_WIND_SPEED = new AdTargetingParam("WEATHER_WIND_SPEED", 18, "wind");
        WEATHER_HUMIDITY = new AdTargetingParam("WEATHER_HUMIDITY", 19, "hmid");
        WEATHER_UV_INDEX = new AdTargetingParam("WEATHER_UV_INDEX", 20, "uv");
        WEATHER_SEVERE_ALERTS = new AdTargetingParam("WEATHER_SEVERE_ALERTS", 21, "sev");
        WEATHER_POLLEN = new AdTargetingParam("WEATHER_POLLEN", 22, "plln");
        WEATHER_FORECAST_HIGH_TEMPERATURE_CELSIUS = new AdTargetingParam("WEATHER_FORECAST_HIGH_TEMPERATURE_CELSIUS", 23, "fhic");
        WEATHER_FORECAST_LOW_TEMPERATURE_CELSIUS = new AdTargetingParam("WEATHER_FORECAST_LOW_TEMPERATURE_CELSIUS", 24, "floc");
        RMID = new AdTargetingParam("RMID", 25, "rmid");
        VIEW = new AdTargetingParam("VIEW", 26, "vw");
        AID = new AdTargetingParam("AID", 27, "aid");
        KW = new AdTargetingParam("KW", 28, "kw");
        ATFID = new AdTargetingParam("ATFID", 29, "atfid");
        VSDK = new AdTargetingParam("VSDK", 30, "vsdk");
        VAPP = new AdTargetingParam("VAPP", 31, "vapp");
        FIRST_TIME_LAUNCH = new AdTargetingParam("FIRST_TIME_LAUNCH", 32, "ftl");
        LAYER = new AdTargetingParam("LAYER", 33, "layer");
        FAMILY = new AdTargetingParam("FAMILY", 34, "fam");
        CHANNEL = new AdTargetingParam("CHANNEL", 35, "ch");
        PRELOAD_PARTNER = new AdTargetingParam("PRELOAD_PARTNER", 36, "preload_partner");
        LAUNCH_PARTNER = new AdTargetingParam("LAUNCH_PARTNER", 37, "launch_partner");
        PARTNER = new AdTargetingParam("PARTNER", 38, "par");
        AGE = new AdTargetingParam("AGE", 39, "a");
        GENDER = new AdTargetingParam("GENDER", 40, "g");
        TPID = new AdTargetingParam("TPID", 41, "tpid");
        LPID = new AdTargetingParam("LPID", 42, "lpid");
        ALERT = new AdTargetingParam("ALERT", 43, "alert");
        H20 = new AdTargetingParam("H20", 44, "h2o");
        LNID = new AdTargetingParam("LNID", 45, "lnid");
        TTID = new AdTargetingParam("TTID", 46, "ttid");
        VIDEO = new AdTargetingParam("VIDEO", 47, "vid");
        PLAYLIST = new AdTargetingParam("PLAYLIST", 48, "plist");
        ADID = new AdTargetingParam("ADID", 49, "adid");
        $VALUES = (new AdTargetingParam[] {
            WEATHERFX, AUDIENCE, PROXIMITY, HYPER_LOCAL_ZIP, ZCS, NZCS, HZCS, LOTAME, LOCATION_COUNTRY_CODE, LOCATION_STATE, 
            LOCATION_CITY, LOCATION_ZIP, LOCATION_DMA, WEATHER_CONDITION, WEATHER_TEMPERATURE_INCREMENT, WEATHER_TEMPERATURE_RANGE, WEATHER_TEMPERATURE_CELSIUS, WEATHER_FEELS_LIKE_TEMPERATURE_CELSIUS, WEATHER_WIND_SPEED, WEATHER_HUMIDITY, 
            WEATHER_UV_INDEX, WEATHER_SEVERE_ALERTS, WEATHER_POLLEN, WEATHER_FORECAST_HIGH_TEMPERATURE_CELSIUS, WEATHER_FORECAST_LOW_TEMPERATURE_CELSIUS, RMID, VIEW, AID, KW, ATFID, 
            VSDK, VAPP, FIRST_TIME_LAUNCH, LAYER, FAMILY, CHANNEL, PRELOAD_PARTNER, LAUNCH_PARTNER, PARTNER, AGE, 
            GENDER, TPID, LPID, ALERT, H20, LNID, TTID, VIDEO, PLAYLIST, ADID
        });
    }
}
