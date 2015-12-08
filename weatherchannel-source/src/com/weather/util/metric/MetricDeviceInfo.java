// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;


public class MetricDeviceInfo
{

    private final String androidOsVersion;
    private final String deviceId;
    private final String manufacturer;
    private final String model;

    public MetricDeviceInfo(String s, String s1, String s2, String s3)
    {
        deviceId = s;
        manufacturer = s1;
        model = s2;
        androidOsVersion = s3;
    }

    public String getAndroidOsVersion()
    {
        return androidOsVersion;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getModel()
    {
        return model;
    }

    public String getPlatform()
    {
        return "android";
    }
}
