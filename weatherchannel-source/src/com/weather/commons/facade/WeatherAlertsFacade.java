// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.google.common.collect.ImmutableList;
import com.weather.dal2.data.WeatherAlertsRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// Referenced classes of package com.weather.commons.facade:
//            WeatherAlert

public class WeatherAlertsFacade
{

    public static final int HIGHEST_SEVERITY = 1;
    public static final int SECOND_HIGHEST_SEVERITY = 2;
    public static final int THIRD_HIGHEST_SEVERITY = 3;
    private final List alertsList;
    private final int lowestSeverityNumber;
    private final String title;

    public WeatherAlertsFacade(WeatherAlertsRecord weatheralertsrecord)
    {
        alertsList = makeAlertsList(weatheralertsrecord.getWeatherAlertsDoc());
        int i;
        if (alertsList.isEmpty())
        {
            weatheralertsrecord = null;
        } else
        {
            weatheralertsrecord = ((WeatherAlert)alertsList.get(0)).getDescription();
        }
        title = weatheralertsrecord;
        i = 4;
        if (!alertsList.isEmpty())
        {
            i = ((WeatherAlert)alertsList.get(0)).getSeverity();
        }
        lowestSeverityNumber = i;
    }

    public static List makeAlertsList(List list)
    {
        TreeSet treeset = new TreeSet();
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); treeset.add(new WeatherAlert((com.weather.dal2.data.WeatherAlertsRecord.WeatherAlertsDoc)list.next()))) { }
        }
        return ImmutableList.copyOf(treeset);
    }

    public boolean containsTropicalCyclone()
    {
        for (Iterator iterator = alertsList.iterator(); iterator.hasNext();)
        {
            if (((WeatherAlert)iterator.next()).isForTropicalCyclone())
            {
                return true;
            }
        }

        return false;
    }

    public List getAlertsList()
    {
        return new ArrayList(alertsList);
    }

    public int getLowestSeverityNumber()
    {
        return lowestSeverityNumber;
    }

    public String getTitle()
    {
        return title;
    }
}
