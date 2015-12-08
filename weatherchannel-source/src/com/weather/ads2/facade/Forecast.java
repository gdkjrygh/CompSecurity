// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Ordering;
import com.weather.dal2.data.HourlyForecastRecord;

// Referenced classes of package com.weather.ads2.facade:
//            ParameterFormatter

public class Forecast
{
    private static final class TemperatureCelsius
        implements Function
    {

        public Integer apply(com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData hourlyforecastdata)
        {
            if (hourlyforecastdata == null)
            {
                return null;
            } else
            {
                return hourlyforecastdata.getTemperatureInCelsius();
            }
        }

        public volatile Object apply(Object obj)
        {
            return apply((com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData)obj);
        }

        private TemperatureCelsius()
        {
        }

    }


    public static final Forecast EMPTY = new Forecast("nl", "nl");
    private static final int HOURS_TO_INCLUDE = 36;
    public final String highTemperatureCelsius;
    public final String lowTemperatureCelsius;

    public Forecast(HourlyForecastRecord hourlyforecastrecord)
    {
        Preconditions.checkNotNull(hourlyforecastrecord);
        hourlyforecastrecord = hourlyforecastrecord.getDhDoc();
        if (hourlyforecastrecord == null)
        {
            lowTemperatureCelsius = "nl";
            highTemperatureCelsius = "nl";
            return;
        }
        hourlyforecastrecord = FluentIterable.from(hourlyforecastrecord.getDhData()).limit(36).transform(new TemperatureCelsius()).filter(Predicates.not(Predicates.isNull()));
        if (hourlyforecastrecord.isEmpty())
        {
            lowTemperatureCelsius = "nl";
            highTemperatureCelsius = "nl";
            return;
        } else
        {
            Ordering ordering = Ordering.natural();
            lowTemperatureCelsius = ParameterFormatter.formatCelsius((Integer)ordering.min(hourlyforecastrecord));
            highTemperatureCelsius = ParameterFormatter.formatCelsius((Integer)ordering.max(hourlyforecastrecord));
            return;
        }
    }

    public Forecast(String s, String s1)
    {
        lowTemperatureCelsius = (String)Preconditions.checkNotNull(s);
        highTemperatureCelsius = (String)Preconditions.checkNotNull(s1);
    }

}
