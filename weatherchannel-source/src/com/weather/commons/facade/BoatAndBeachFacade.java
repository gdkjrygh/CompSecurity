// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.google.common.base.Preconditions;
import com.weather.dal2.data.MarineForecastRecord;
import com.weather.dal2.data.TideRecord;
import com.weather.dal2.net.JsonObjectMapper;
import java.util.List;

// Referenced classes of package com.weather.commons.facade:
//            Html5ModuleData

public class BoatAndBeachFacade
    implements Html5ModuleData
{
    private static final class BoatAndBeach
    {

        public final com.weather.dal2.data.MarineForecastRecord.MarineForecastDoc.MarineForecastData marineForecastData;
        public final com.weather.dal2.data.TideRecord.TideDoc.TideData tideData[];

        BoatAndBeach(TideRecord tiderecord, MarineForecastRecord marineforecastrecord)
        {
            com.weather.dal2.data.TideRecord.TideDoc tidedoc = tiderecord.getTideDoc();
            tiderecord = null;
            if (tidedoc != null)
            {
                tiderecord = tidedoc.getTideDataList();
            }
            if (tiderecord != null)
            {
                tideData = new com.weather.dal2.data.TideRecord.TideDoc.TideData[tiderecord.size()];
                for (int i = 0; i < tiderecord.size(); i++)
                {
                    tideData[i] = (com.weather.dal2.data.TideRecord.TideDoc.TideData)tiderecord.get(i);
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


    private final BoatAndBeach boatAndBeach;

    public BoatAndBeachFacade(TideRecord tiderecord, MarineForecastRecord marineforecastrecord)
    {
        Preconditions.checkNotNull(tiderecord);
        Preconditions.checkNotNull(marineforecastrecord);
        boatAndBeach = new BoatAndBeach(tiderecord, marineforecastrecord);
    }

    public String getData()
    {
        return JsonObjectMapper.toJson(boatAndBeach);
    }
}
