// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.DaypartIntlForecastRecord;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import java.util.List;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord

public class DiRecord extends DsxRecord
    implements DaypartIntlForecastRecord
{
    public static class DiDoc.DiData
        implements com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc.DaypartIntlForecastData
    {

        private final String altPhrase = null;
        private final String dyPrtNm = null;
        private final Long fcstValGMT = null;
        private final String locValDay = null;
        private final String mtrcPhrase = null;
        private final String phraseInt = null;
        private final String shrtCst = null;
        private final Integer sky = null;
        private final Integer skyX = null;
        private final Integer uvIdx = null;

        public String getDayPartName()
        {
            return dyPrtNm;
        }

        public Long getForecastDateInGMT()
        {
            return fcstValGMT;
        }

        public String getForecastDateLocal()
        {
            return locValDay;
        }

        public String getForecastText()
        {
            String s = phraseInt;
            switch (_cls1..SwitchMap.com.weather.util.UnitType[DataUnits.getCurrentUnitType().ordinal()])
            {
            default:
                return s;

            case 1: // '\001'
                return mtrcPhrase;

            case 2: // '\002'
                return altPhrase;

            case 3: // '\003'
                return phraseInt;
            }
        }

        public String getShortCast()
        {
            return shrtCst;
        }

        public Integer getUvIndex()
        {
            return uvIdx;
        }

        public Integer getWeatherIconCode()
        {
            return sky;
        }

        public Integer getWeatherIconCodeExtended()
        {
            return skyX;
        }

        public DiDoc.DiData()
        {
        }

        /* member class not found */
        class _cls1 {}

    }

    public static class DiDoc.DiHeader
        implements com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc.DaypartIntlForecastHeader
    {

        private final String coopId = null;
        private final Long procTm = null;
        private final String stnNm = null;

        public Long getProcessTime()
        {
            return procTm;
        }

        public String getStationId()
        {
            return coopId;
        }

        public String getStationName()
        {
            return stnNm;
        }

        public DiDoc.DiHeader()
        {
        }
    }


    private static final int NIGHT = 0x2e630;
    private DiDoc doc;

    public DiRecord()
    {
    }

    public List getDiData()
    {
    /* block-local class not found */
    class DiDoc {}

        if (doc != null)
        {
            return doc.getDiData();
        } else
        {
            return null;
        }
    }

    public com.weather.dal2.data.DaypartIntlForecastRecord.DaypartIntlForecastDoc getDiDoc()
    {
        return doc;
    }

    public void normalize()
    {
        if (doc != null && (DiDoc.access._mth000(doc) == null || DiDoc.access._mth100(doc) == null))
        {
            status = Integer.valueOf(500);
            doc = null;
        }
    }
}
