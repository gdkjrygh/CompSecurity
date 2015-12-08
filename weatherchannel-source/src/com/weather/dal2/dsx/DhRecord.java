// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.HourlyForecastRecord;
import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord, RecordSets, DfRecord

public class DhRecord extends DsxRecord
    implements HourlyForecastRecord
{
    public static class DhDoc.DhData
        implements com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData
    {

        private final Integer dwptF = null;
        private final Long fcstValGMT = null;
        private transient Boolean isFirstHourOfDay;
        private final Integer pOP = null;
        private final Integer rH = null;
        private final Integer sky = null;
        private final String tSnsblWx = null;
        private final Integer tmpC = null;
        private final Integer tmpF = null;
        private final Integer uvIdx = null;
        private final Integer wDir = null;
        private final String wDirAsc = null;
        private final Integer wSpdK = null;
        private final Integer wSpdM = null;

        public Integer getDewPointInFahrenheit()
        {
            return dwptF;
        }

        public Long getForecastDateInGMTMillis()
        {
            Long long1 = null;
            if (fcstValGMT != null)
            {
                long1 = Long.valueOf(fcstValGMT.longValue() * 1000L);
            }
            return long1;
        }

        public Integer getPercentChanceOfPrecipitation()
        {
            return pOP;
        }

        public Integer getRelativeHumidity()
        {
            return rH;
        }

        public Integer getTemperatureInCelsius()
        {
            return tmpC;
        }

        public Integer getTemperatureInFahrenheit()
        {
            return tmpF;
        }

        public String getTerseSensibleWeatherPhrase()
        {
            return tSnsblWx;
        }

        public Integer getUvIndex()
        {
            return uvIdx;
        }

        public Integer getWeatherIconCode()
        {
            return sky;
        }

        public String getWindDirectionAscii()
        {
            return wDirAsc;
        }

        public Integer getWindDirectionInDegrees()
        {
            return wDir;
        }

        public Integer getWindSpeedInKilometers()
        {
            return wSpdK;
        }

        public Integer getWindSpeedInMiles()
        {
            return wSpdM;
        }

        public boolean isFirstHourOfDay()
        {
            if (isFirstHourOfDay == null)
            {
                return false;
            } else
            {
                return isFirstHourOfDay.booleanValue();
            }
        }



/*
        static Boolean access$302(DhDoc.DhData dhdata, Boolean boolean1)
        {
            dhdata.isFirstHourOfDay = boolean1;
            return boolean1;
        }

*/

        public DhDoc.DhData()
        {
        }
    }

    public static class DhDoc.DhHeader
        implements com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastHeader
    {

        private final String _procTmLocal = null;
        private final String coopId = null;
        private final Long procTm = null;
        private final String stnNm = null;

        public Long getProcessTime()
        {
            return procTm;
        }

        public String getProcessTimeLocal()
        {
            return _procTmLocal;
        }

        public String getStationId()
        {
            return coopId;
        }

        public String getStationName()
        {
            return stnNm;
        }

        public DhDoc.DhHeader()
        {
        }
    }


    private DhDoc doc;

    public DhRecord()
    {
    }

    public List getDhData()
    {
    /* block-local class not found */
    class DhDoc {}

        if (doc != null)
        {
            return doc.getDhData();
        } else
        {
            return null;
        }
    }

    public com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc getDhDoc()
    {
        return doc;
    }

    public void normalize()
    {
        if (doc != null && (DhDoc.access._mth000(doc) == null || DhDoc.access._mth100(doc) == null))
        {
            status = Integer.valueOf(500);
            doc = null;
        }
    }

    public void postParsingInitializer(RecordSets recordsets)
    {
        if (recordsets.wxdv2DFRecord != null)
        {
            recordsets = recordsets.wxdv2DFRecord.getDfData();
            if (recordsets != null && !recordsets.isEmpty())
            {
                DhDoc.access._mth200(doc, ((com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)recordsets.get(0)).getSunriseOffset());
            }
        }
    }
}
