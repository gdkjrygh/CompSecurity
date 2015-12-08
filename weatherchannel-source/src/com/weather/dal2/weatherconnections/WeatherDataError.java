// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.weatherconnections;

import com.google.common.base.Preconditions;
import com.weather.dal2.locations.SavedLocation;

public class WeatherDataError
{

    private final boolean fromManualRefresh;
    private final SavedLocation location;
    private final Throwable thrown;
    private final boolean wasStaleDataPosted;

    WeatherDataError(Throwable throwable, SavedLocation savedlocation, boolean flag, boolean flag1)
    {
        thrown = (Throwable)Preconditions.checkNotNull(throwable);
        location = savedlocation;
        wasStaleDataPosted = flag;
        fromManualRefresh = flag1;
    }

    public SavedLocation getLocation()
    {
        return location;
    }

    public Throwable getThrowable()
    {
        return thrown;
    }

    public boolean postedStaleData()
    {
        return wasStaleDataPosted;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WeatherDataError: ").append(location).append(": wasStaleDataPosted: ").append(wasStaleDataPosted).append(" fromManualRefresh: ").append(fromManualRefresh).toString();
    }

    public boolean wasTriggeredByManualRefresh()
    {
        return fromManualRefresh;
    }
}
