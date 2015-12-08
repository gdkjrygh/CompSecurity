// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.weather.dal2.locations.SavedLocation;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.commons.facade:
//            HourlyWeather

public class HourlyWeatherFacade
{

    public final List hourlyWeatherList;
    public final SavedLocation savedLocation;

    public HourlyWeatherFacade(List list)
    {
        hourlyWeatherList = ImmutableList.copyOf(list);
        savedLocation = null;
    }

    public HourlyWeatherFacade(List list, SavedLocation savedlocation)
    {
        hourlyWeatherList = ImmutableList.copyOf(list);
        savedLocation = (SavedLocation)Preconditions.checkNotNull(savedlocation);
    }

    public List getFilteredHourlyList()
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        long l = System.currentTimeMillis();
        Iterator iterator = hourlyWeatherList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            HourlyWeather hourlyweather = (HourlyWeather)iterator.next();
            Date date = hourlyweather.getDateGMT();
            if (date == null || l < date.getTime())
            {
                arraylist.add(hourlyweather);
            }
        } while (true);
        return arraylist;
    }
}
