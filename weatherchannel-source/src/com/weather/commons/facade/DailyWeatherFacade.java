// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.dal2.locations.SavedLocation;
import java.util.Collection;
import java.util.List;

public class DailyWeatherFacade
{

    public final List dailyWeatherList;
    public final SavedLocation savedLocation;

    public DailyWeatherFacade(Collection collection)
    {
        dailyWeatherList = ImmutableList.copyOf((Collection)Preconditions.checkNotNull(collection));
        savedLocation = null;
    }

    public DailyWeatherFacade(Collection collection, SavedLocation savedlocation)
    {
        dailyWeatherList = ImmutableList.copyOf((Collection)Preconditions.checkNotNull(collection));
        savedLocation = (SavedLocation)Preconditions.checkNotNull(savedlocation);
    }
}
