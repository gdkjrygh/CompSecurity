// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.analytics.model;

import chu;

// Referenced classes of package com.ubercab.analytics.model:
//            Shape_AnalyticsLocation

public abstract class AnalyticsLocation
{

    public AnalyticsLocation()
    {
    }

    public static AnalyticsLocation create(chu chu1)
    {
        return (new Shape_AnalyticsLocation()).setLat(chu1.a()).setLng(chu1.b()).setCourse(chu1.c()).setSpeed(chu1.d()).setAltitude(chu1.e()).setHorizontalAccuracy(chu1.f()).setVerticalAccuracy(chu1.g()).setGpsTimeMs(chu1.h());
    }

    public abstract Double getAltitude();

    public abstract Float getCourse();

    public abstract Long getGpsTimeMs();

    public abstract Float getHorizontalAccuracy();

    public abstract Double getLat();

    public abstract Double getLng();

    public abstract Float getSpeed();

    public abstract Float getVerticalAccuracy();

    public abstract AnalyticsLocation setAltitude(Double double1);

    public abstract AnalyticsLocation setCourse(Float float1);

    public abstract AnalyticsLocation setGpsTimeMs(Long long1);

    public abstract AnalyticsLocation setHorizontalAccuracy(Float float1);

    public abstract AnalyticsLocation setLat(Double double1);

    public abstract AnalyticsLocation setLng(Double double1);

    public abstract AnalyticsLocation setSpeed(Float float1);

    public abstract AnalyticsLocation setVerticalAccuracy(Float float1);
}
