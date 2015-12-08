// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import android.text.format.DateFormat;
import com.weather.dal2.data.DailyForecastRecord;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.date.TwcDateParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord, RecordSets

public class DfRecord extends DsxRecord
    implements DailyForecastRecord
{
    public static class DfData
        implements com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData
    {

        private final String _sunriseISOLocal = null;
        private final String _sunsetISOLocal = null;
        private final Long fcstValGMT = null;
        private final Integer hiTmpC = null;
        private final Integer hiTmpF = null;
        private final Integer loTmpC = null;
        private final Integer loTmpF = null;
        private final Integer pOP12 = null;
        private final Integer pOP12_24 = null;
        private final Double qpf12 = null;
        private final Double qpf12_24 = null;
        private final Integer rH12 = null;
        private final Integer rH12_24 = null;
        private final String shrtCst = null;
        private final Integer sky12 = null;
        private final String sky12X = null;
        private final Integer sky12_24 = null;
        private final String sky12_24X = null;
        private final String snsblWx12 = null;
        private final String snsblWx12_24 = null;
        private final Double snwQpf12 = null;
        private final Double snwQpf12_24 = null;
        private final String sunriseISO = null;
        private transient SunriseSunset sunriseSunsetWrapper;
        private final String sunsetISO = null;
        private final String tSnsblWx12 = null;
        private final String tSnsblWx12_24 = null;
        private final Integer uvIdx = null;
        private final Integer wDir12 = null;
        private final Integer wDir12_24 = null;
        private final String wDirAsc12 = null;
        private final String wDirAsc12_24 = null;
        private final Integer wSpdK12 = null;
        private final Integer wSpdK12_24 = null;
        private final Integer wSpdM12 = null;
        private final Integer wSpdM12_24 = null;
        private final String wrlsWx12 = null;
        private final String wrlsWx12_24 = null;

        private Long getTimeAsEpochMs(String s)
        {
            if (s == null)
            {
                return null;
            }
            s = TwcDateParser.parseISO(s);
            if (s == null)
            {
                throw new IllegalArgumentException("Invalid date time string");
            } else
            {
                return Long.valueOf(s.getTime());
            }
        }

        public Long getForecastValidDateGMTMillis()
        {
            Long long1 = null;
            if (fcstValGMT != null)
            {
                long1 = Long.valueOf(fcstValGMT.longValue() * 1000L);
            }
            return long1;
        }

        public Integer getHiTemperatureCelsius()
        {
            return hiTmpC;
        }

        public Integer getHiTemperatureFahrenheit()
        {
            return hiTmpF;
        }

        public Integer getLowTemperatureCelsius()
        {
            return loTmpC;
        }

        public Integer getLowTemperatureFahrenheit()
        {
            return loTmpF;
        }

        public Integer getPercentChanceOfPrecipitationDay()
        {
            return pOP12;
        }

        public Integer getPercentChanceOfPrecipitationNight()
        {
            return pOP12_24;
        }

        public Integer getRelativeHumidityDay()
        {
            return rH12;
        }

        public Integer getRelativeHumidityNight()
        {
            return rH12_24;
        }

        public String getSensibleWeatherPhraseDay()
        {
            return snsblWx12;
        }

        public String getSensibleWeatherPhraseNight()
        {
            return snsblWx12_24;
        }

        public String getShortCast()
        {
            return shrtCst;
        }

        public Double getSnowAccumulationForecastDay()
        {
            return qpf12;
        }

        public Double getSnowAccumulationForecastNight()
        {
            return qpf12_24;
        }

        public Double getSnowAccumulationForecastTerseDay()
        {
            return snwQpf12;
        }

        public Double getSnowAccumulationForecastTerseNight()
        {
            return snwQpf12_24;
        }

        public String getSnwAccumPhrase12()
        {
            if (qpf12 == null)
            {
                return null;
            } else
            {
                return String.valueOf(Math.round(qpf12.doubleValue()));
            }
        }

        public String getSnwAccumPhrase24()
        {
            if (qpf12_24 == null)
            {
                return null;
            } else
            {
                return String.valueOf(Math.round(qpf12_24.doubleValue()));
            }
        }

        public String getSnwAccumPhraseTerse12()
        {
            if (snwQpf12 == null)
            {
                return null;
            } else
            {
                return String.valueOf(Math.round(snwQpf12.doubleValue()));
            }
        }

        public String getSnwAccumPhraseTerse24()
        {
            if (snwQpf12_24 == null)
            {
                return null;
            } else
            {
                return String.valueOf(Math.round(snwQpf12_24.doubleValue()));
            }
        }

        public String getSunrise()
        {
        /* block-local class not found */
        class SunriseSunset {}

            return SunriseSunset.access._mth900(sunriseSunsetWrapper);
        }

        public String getSunriseISO()
        {
            return sunriseISO;
        }

        public String getSunriseOffset()
        {
            return SunriseSunset.access._mth800(sunriseSunsetWrapper);
        }

        public Long getSunriseTime()
        {
            return SunriseSunset.access._mth500(sunriseSunsetWrapper);
        }

        public String getSunset()
        {
            return SunriseSunset.access._mth1000(sunriseSunsetWrapper);
        }

        public String getSunsetISO()
        {
            return sunsetISO;
        }

        public String getSunsetOffset()
        {
            return SunriseSunset.access._mth700(sunriseSunsetWrapper);
        }

        public Long getSunsetTime()
        {
            return SunriseSunset.access._mth600(sunriseSunsetWrapper);
        }

        public String getTerseSensibleWeatherPhraseDay()
        {
            return tSnsblWx12;
        }

        public String getTerseSensibleWeatherPhraseNight()
        {
            return tSnsblWx12_24;
        }

        public Integer getUvIndex()
        {
            return uvIdx;
        }

        public Integer getWeatherIconCodeDay()
        {
            return sky12;
        }

        public String getWeatherIconCodeExtendedDay()
        {
            return sky12X;
        }

        public String getWeatherIconCodeExtendedNight()
        {
            return sky12_24X;
        }

        public Integer getWeatherIconCodeNight()
        {
            return sky12_24;
        }

        public String getWindDirectionAsciiDay()
        {
            return wDirAsc12;
        }

        public String getWindDirectionAsciiNight()
        {
            return wDirAsc12_24;
        }

        public Integer getWindDirectionInDegreesDay()
        {
            return wDir12;
        }

        public Integer getWindDirectionInDegreesNight()
        {
            return wDir12_24;
        }

        public Integer getWindSpeedInKilometersDay()
        {
            return wSpdK12;
        }

        public Integer getWindSpeedInKilometersNight()
        {
            return wSpdK12_24;
        }

        public Integer getWindSpeedInMilesDay()
        {
            return wSpdM12;
        }

        public Integer getWindSpeedInMilesNight()
        {
            return wSpdM12_24;
        }

        public String getWirelessWeatherPhraseDay()
        {
            return wrlsWx12;
        }

        public String getWirelessWeatherPhraseNight()
        {
            return wrlsWx12_24;
        }

        public String toString()
        {
            return (new StringBuilder()).append("DfData [hiTmpF=").append(hiTmpF).append(", sky12=").append(sky12).append(", sunrise=").append(_sunriseISOLocal).append(']').toString();
        }







/*
        static SunriseSunset access$302(DfData dfdata, SunriseSunset sunrisesunset)
        {
            dfdata.sunriseSunsetWrapper = sunrisesunset;
            return sunrisesunset;
        }

*/

        public DfData()
        {
        }
    }

    public static class DfDoc
        implements com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc
    {

        private final DfData DFData[] = null;
        private final DfHeader DFHdr = null;

        private void initializeSunriseSunset()
        {
            boolean flag = DateFormat.is24HourFormat(AbstractTwcApplication.getRootContext());
            DfData adfdata[] = DFData;
            int j = adfdata.length;
            for (int i = 0; i < j; i++)
            {
                DfData dfdata = adfdata[i];
                dfdata.getClass();
                dfdata.sunriseSunsetWrapper = new DfData.SunriseSunset(dfdata, flag, null);
            }

        }

        public List getDailyForecastData()
        {
            ArrayList arraylist = new ArrayList();
            if (DFData != null)
            {
                Collections.addAll(arraylist, DFData);
            }
            return arraylist;
        }

        public volatile com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastHeader getDailyForecastHeader()
        {
            return getDailyForecastHeader();
        }

        public DfHeader getDailyForecastHeader()
        {
            return DFHdr;
        }

        public String toString()
        {
            return (new StringBuilder()).append("DfDoc [DfHdr=").append(DFHdr).append(", DFData=").append(Arrays.toString(DFData)).append(']').toString();
        }




        public DfDoc()
        {
        }
    }

    public static class DfDoc.DfHeader
        implements com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastHeader
    {

        private final String _procTmLocal = null;
        private final String coopId = null;
        private final Long procTm = null;
        private final String stnNm = null;

        public String getCoopId()
        {
            return coopId;
        }

        public Long getProcTm()
        {
            return procTm;
        }

        public String getProcessTimeLocal()
        {
            return _procTmLocal;
        }

        public String getStnNm()
        {
            return stnNm;
        }


        public DfDoc.DfHeader()
        {
        }
    }


    private DfDoc doc;

    public DfRecord()
    {
    }

    private boolean isHeaderAvailable()
    {
        return doc != null && doc.getDailyForecastHeader() != null;
    }

    public Date getCurrentDate()
    {
        if (isHeaderAvailable())
        {
            return TwcDateParser.parseISO(doc.getDailyForecastHeader()._procTmLocal);
        } else
        {
            return null;
        }
    }

    public volatile com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc getDailyForecastDoc()
    {
        return getDailyForecastDoc();
    }

    public DfDoc getDailyForecastDoc()
    {
        return doc;
    }

    public List getDfData()
    {
        if (doc != null)
        {
            return doc.getDailyForecastData();
        } else
        {
            return null;
        }
    }

    public void normalize()
    {
        if (doc != null && (doc.DFData == null || doc.DFHdr == null))
        {
            status = Integer.valueOf(500);
            doc = null;
        }
    }

    public void postParsingInitializer(RecordSets recordsets)
    {
        doc.initializeSunriseSunset();
    }

    public String toString()
    {
        return (new StringBuilder()).append("DfRecord [id=").append(getId()).append(", status=").append(getStatus()).append(", doc=").append(doc).append(']').toString();
    }
}
