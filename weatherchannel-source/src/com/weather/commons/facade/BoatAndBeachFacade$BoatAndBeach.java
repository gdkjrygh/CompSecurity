// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.dal2.data.MarineForecastRecord;
import com.weather.dal2.data.TideRecord;
import java.util.List;

// Referenced classes of package com.weather.commons.facade:
//            BoatAndBeachFacade

private static final class marineForecastData
{

    public final com.weather.dal2.data.astDoc.MarineForecastData marineForecastData;
    public final com.weather.dal2.data.astDoc.MarineForecastData tideData[];

    c.MarineForecastData(TideRecord tiderecord, MarineForecastRecord marineforecastrecord)
    {
        com.weather.dal2.data.each each = tiderecord.getTideDoc();
        tiderecord = null;
        if (each != null)
        {
            tiderecord = each.st();
        }
        if (tiderecord != null)
        {
            tideData = new com.weather.dal2.data.each.tideData[tiderecord.size()];
            for (int i = 0; i < tiderecord.size(); i++)
            {
                tideData[i] = (com.weather.dal2.data.each.tideData)tiderecord.get(i);
            }

        } else
        {
            tideData = null;
        }
        tiderecord = marineforecastrecord.getMarineForecastDoc();
        if (tiderecord != null)
        {
            marineForecastData = tiderecord.getMarineForecastData();
            return;
        } else
        {
            marineForecastData = null;
            return;
        }
    }
}
