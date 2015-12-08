// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.CurrentConditionsRecord;
import java.math.BigDecimal;

// Referenced classes of package com.weather.dal2.dsx:
//            DsxRecord

public class MoDsxRecord extends DsxRecord
    implements CurrentConditionsRecord
{
    public static class MoDoc.MoData
        implements com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData
    {

        private final BigDecimal _presIn = null;
        private final String baroTrndAsc = null;
        private final Integer dwptC = null;
        private final Integer dwptF = null;
        private final Integer flsLkIdxC = null;
        private final Integer flsLkIdxF = null;
        private final Integer iconExt = null;
        private final String obsDayGmt = null;
        private final String obsTmGmt = null;
        private final BigDecimal pres = null;
        private final Integer rH = null;
        private final Integer sky = null;
        private final Integer tmpC = null;
        private final Integer tmpF = null;
        private final String uvDes = null;
        private final Integer uvIdx = null;
        private final Integer uvWrn = null;
        private final BigDecimal visK = null;
        private final BigDecimal visM = null;
        private final Integer wDir = null;
        private final String wDirAsc = null;
        private final Integer wSpdK = null;
        private final Integer wSpdM = null;
        private final String wx = null;

        public Double getBarometricPressureInInches()
        {
            if (_presIn == null)
            {
                return null;
            } else
            {
                return Double.valueOf(_presIn.doubleValue());
            }
        }

        public Double getBarometricPressureInMillibars()
        {
            if (pres == null)
            {
                return null;
            } else
            {
                return Double.valueOf(pres.doubleValue());
            }
        }

        public String getBarometricTrendAscii()
        {
            return baroTrndAsc;
        }

        public Integer getDewPointInCelsius()
        {
            return dwptC;
        }

        public Integer getDewPointInFahrenheit()
        {
            return dwptF;
        }

        public Integer getExtendedWeatherIconCode()
        {
            if (iconExt == null)
            {
                return MoDsxRecord.UNKNOWN_EXTENDED_WEATHER_ICON_CODE;
            } else
            {
                return iconExt;
            }
        }

        public Integer getFeelsLikeIndexInCelsius()
        {
            return flsLkIdxC;
        }

        public Integer getFeelsLikeIndexInFahrenheit()
        {
            return flsLkIdxF;
        }

        public String getObservationDateGMT()
        {
            return obsDayGmt;
        }

        public String getObservationTimeGMT()
        {
            return obsTmGmt;
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

        public Integer getUvIndex()
        {
            return uvIdx;
        }

        public String getUvIndexDescription()
        {
            return uvDes;
        }

        public Integer getUvWarningCode()
        {
            return uvWrn;
        }

        public BigDecimal getVisibilityInKilometers()
        {
            return visK;
        }

        public BigDecimal getVisibilityInMiles()
        {
            return visM;
        }

        public Integer getWeatherIconCode()
        {
            if (sky == null)
            {
                return MoDsxRecord.UNKNOWN_WEATHER_ICON_CODE;
            } else
            {
                return sky;
            }
        }

        public String getWeatherPhrase()
        {
            return wx;
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

        public MoDoc.MoData()
        {
        }
    }

    public static class MoDoc.MoHeader
        implements com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsHeader
    {

        private final String obsStn = null;
        private final Long procTm = null;

        public String getObsStn()
        {
            return obsStn;
        }

        public Long getProcTm()
        {
            return procTm;
        }

        public MoDoc.MoHeader()
        {
        }
    }


    private static final Integer UNKNOWN_EXTENDED_WEATHER_ICON_CODE = Integer.valueOf(4400);
    private static final Integer UNKNOWN_WEATHER_ICON_CODE = Integer.valueOf(44);
    private MoDoc doc;

    public MoDsxRecord()
    {
    }

    public com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc getMoDoc()
    {
        return doc;
    }

    public void normalize()
    {
    /* block-local class not found */
    class MoDoc {}

        if (doc != null && (MoDoc.access._mth000(doc) == null || MoDoc.access._mth100(doc) == null))
        {
            status = Integer.valueOf(500);
            doc = null;
        }
    }



}
