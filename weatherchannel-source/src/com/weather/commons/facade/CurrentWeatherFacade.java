// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.common.primitives.Ints;
import com.weather.dal2.data.TimeParseUtil;
import com.weather.dal2.data.WeatherAlertsRecord;
import com.weather.dal2.dsx.DfRecord;
import com.weather.dal2.dsx.DhRecord;
import com.weather.dal2.dsx.RecordSets;
import com.weather.dal2.dsx.WhenWillRainRecord;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.date.DateUtil;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.weather.commons.facade:
//            Temperature, Pressure, Distance, Wind, 
//            Percentage, UVIndex, PrecipitationRoundedValue, WeatherAlertsFacade, 
//            FacadeUtils

public class CurrentWeatherFacade
{
    private static class ShortCastData
    {

        private final String shortCastPhrase;
        private final String temp;

        public boolean hasValidData()
        {
            return shortCastPhrase != null && temp != null;
        }



        private ShortCastData(String s, String s1)
        {
            shortCastPhrase = s;
            temp = s1;
        }

    }


    private static final int DAY_START = 3;
    private static final String EMPTY_NARRATIVE = "";
    private static final Pattern LEADING_ZERO = Pattern.compile("^0+(?!$)");
    private static final int NIGHT_START = 15;
    private static final String TAG = "CurrentWeatherFacade";
    private static final Context context = AbstractTwcApplication.getRootContext();
    private final Temperature currentTemp;
    private final Integer currentTempCelsius;
    private final Integer currentTempFahrenheit;
    private final Temperature dewPoint;
    private final Temperature feelsLikeTemp;
    private final Temperature hiTemp;
    private final Percentage humidity;
    private final boolean isEmpty;
    private final Temperature loTemp;
    private final String narrativePhrase;
    private final String observationStation;
    private final long observationTime;
    private final String phrase;
    private final PrecipitationRoundedValue precip;
    private final Pressure pressure;
    private final List rainCodes;
    private final long recordCreationTime;
    private final SavedLocation savedLocation;
    private final int sky;
    private final int skyExt;
    private final String sunrise;
    private final Long sunriseMs;
    private final String sunset;
    private final Long sunsetMs;
    private final UVIndex uvIndex;
    private final Distance visibility;
    private final BigDecimal visibilityInMiles;
    private final WeatherAlertsFacade weatherAlertsFacade;
    private final com.weather.dal2.dsx.RecordSets.RecordSetsSource weatherDataSourceType;
    private final Wind wind;

    public CurrentWeatherFacade(RecordSets recordsets, com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata, com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsHeader currentconditionsheader, com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData dailyforecastdata, WeatherAlertsRecord weatheralertsrecord, UnitType unittype, SavedLocation savedlocation)
    {
        rainCodes = Ints.asList(context.getResources().getIntArray(com.weather.commons.R.array.rain_weather_icons));
        static class _cls1
        {

            static final int $SwitchMap$com$weather$util$UnitType[];

            static 
            {
                $SwitchMap$com$weather$util$UnitType = new int[UnitType.values().length];
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.METRIC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.HYBRID.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.ENGLISH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.weather.util.UnitType[unittype.ordinal()])
        {
        default:
            currentTemp = new Temperature(currentconditionsdata.getTemperatureInFahrenheit(), unittype);
            loTemp = new Temperature(dailyforecastdata.getLowTemperatureFahrenheit(), unittype);
            hiTemp = new Temperature(dailyforecastdata.getHiTemperatureFahrenheit(), unittype);
            feelsLikeTemp = new Temperature(currentconditionsdata.getFeelsLikeIndexInFahrenheit(), unittype);
            dewPoint = new Temperature(currentconditionsdata.getDewPointInFahrenheit(), unittype);
            pressure = new Pressure(currentconditionsdata.getBarometricPressureInInches(), unittype);
            visibility = new Distance(currentconditionsdata.getVisibilityInMiles(), unittype);
            break;

        case 1: // '\001'
        case 2: // '\002'
            break MISSING_BLOCK_LABEL_540;
        }
_L1:
        visibilityInMiles = currentconditionsdata.getVisibilityInMiles();
        sky = currentconditionsdata.getWeatherIconCode().intValue();
        skyExt = currentconditionsdata.getExtendedWeatherIconCode().intValue();
        currentTempFahrenheit = currentconditionsdata.getTemperatureInFahrenheit();
        currentTempCelsius = currentconditionsdata.getTemperatureInCelsius();
        phrase = currentconditionsdata.getWeatherPhrase();
        wind = new Wind(currentconditionsdata.getWindDirectionAscii(), currentconditionsdata.getWindSpeedInKilometers(), currentconditionsdata.getWindSpeedInMiles(), unittype);
        humidity = new Percentage(currentconditionsdata.getRelativeHumidity());
        uvIndex = new UVIndex(currentconditionsdata.getUvIndex(), currentconditionsdata.getUvIndexDescription());
        unittype = dailyforecastdata.getPercentChanceOfPrecipitationDay();
        BigDecimal bigdecimal;
        if (unittype == null)
        {
            unittype = dailyforecastdata.getPercentChanceOfPrecipitationNight();
        }
        precip = new PrecipitationRoundedValue(unittype);
        unittype = weatheralertsrecord.getWeatherAlertsDoc();
        if (unittype != null && !unittype.isEmpty())
        {
            weatheralertsrecord = new WeatherAlertsFacade(weatheralertsrecord);
        } else
        {
            weatheralertsrecord = null;
        }
        weatherAlertsFacade = weatheralertsrecord;
        observationTime = getObservationTime(currentconditionsdata);
        observationStation = currentconditionsheader.getObsStn();
        isEmpty = false;
        weatherDataSourceType = recordsets.getSource();
        recordCreationTime = recordsets.getCreationTimeStamp();
        savedLocation = savedlocation;
        currentconditionsdata = dailyforecastdata.getSunriseOffset();
        narrativePhrase = extractNarrative(recordsets, currentconditionsdata);
        sunriseMs = dailyforecastdata.getSunriseTime();
        sunsetMs = dailyforecastdata.getSunsetTime();
        if (sunriseMs == null)
        {
            recordsets = null;
        } else
        {
            recordsets = DateUtil.getUserFormattedTime(sunriseMs.longValue(), currentconditionsdata, context);
        }
        sunrise = recordsets;
        if (sunsetMs == null)
        {
            recordsets = null;
        } else
        {
            recordsets = DateUtil.getUserFormattedTime(sunsetMs.longValue(), currentconditionsdata, context);
        }
        sunset = recordsets;
        LogUtil.v("CurrentWeatherFacade", LoggingMetaTags.TWC_UI, "sunrise=%s, sunset=%s", new Object[] {
            sunriseMs, sunsetMs
        });
        return;
        currentTemp = new Temperature(currentconditionsdata.getTemperatureInCelsius(), unittype);
        loTemp = new Temperature(dailyforecastdata.getLowTemperatureCelsius(), unittype);
        hiTemp = new Temperature(dailyforecastdata.getHiTemperatureCelsius(), unittype);
        feelsLikeTemp = new Temperature(currentconditionsdata.getFeelsLikeIndexInCelsius(), unittype);
        dewPoint = new Temperature(currentconditionsdata.getDewPointInCelsius(), unittype);
        pressure = new Pressure(currentconditionsdata.getBarometricPressureInMillibars(), unittype);
        if (unittype == UnitType.METRIC)
        {
            bigdecimal = currentconditionsdata.getVisibilityInKilometers();
        } else
        {
            bigdecimal = currentconditionsdata.getVisibilityInMiles();
        }
        visibility = new Distance(bigdecimal, unittype);
          goto _L1
    }

    public CurrentWeatherFacade(UnitType unittype)
    {
        rainCodes = Ints.asList(context.getResources().getIntArray(com.weather.commons.R.array.rain_weather_icons));
        sky = 44;
        skyExt = 44;
        currentTemp = new Temperature(Integer.valueOf(0), unittype);
        currentTempFahrenheit = Integer.valueOf(0);
        currentTempCelsius = Integer.valueOf(0);
        phrase = "";
        loTemp = new Temperature(Integer.valueOf(0), unittype);
        hiTemp = new Temperature(Integer.valueOf(0), unittype);
        feelsLikeTemp = new Temperature(Integer.valueOf(0), unittype);
        wind = new Wind(null, null, null, unittype);
        dewPoint = new Temperature(Integer.valueOf(0), unittype);
        humidity = new Percentage(null);
        pressure = new Pressure(null, unittype);
        uvIndex = new UVIndex(null, null);
        sunrise = formatHHMM(null);
        sunset = formatHHMM(null);
        sunriseMs = null;
        sunsetMs = null;
        visibilityInMiles = null;
        visibility = new Distance(null, unittype);
        precip = new PrecipitationRoundedValue(null);
        weatherAlertsFacade = null;
        observationTime = 0L;
        observationStation = "";
        isEmpty = true;
        recordCreationTime = 0L;
        savedLocation = null;
        narrativePhrase = null;
        weatherDataSourceType = com.weather.dal2.dsx.RecordSets.RecordSetsSource.UNKNOWN;
    }

    private String extractNarrative(RecordSets recordsets, String s)
    {
        int i;
        boolean flag1;
label0:
        {
            DfRecord dfrecord = recordsets.getDfRecord();
            DhRecord dhrecord = recordsets.getDhRecord();
            WhenWillRainRecord whenwillrainrecord = recordsets.getWWITRecord();
            Object obj = "";
            if (dfrecord != null)
            {
                recordsets = dfrecord.getCurrentDate();
            } else
            {
                recordsets = null;
            }
            if (recordsets != null)
            {
                s = Calendar.getInstance(TimeZone.getTimeZone((new StringBuilder()).append("GMT").append(s).toString()));
                s.setTime(recordsets);
                recordsets = dfrecord.getDfData();
                i = 0;
                obj = dhrecord.getDhData();
                boolean flag = i;
                if (obj != null)
                {
                    flag = i;
                    int j;
                    if (((List) (obj)).size() >= 2)
                    {
                        if (isRainExpected((com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData)((List) (obj)).get(0)) || isRainExpected((com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData)((List) (obj)).get(1)))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
                i = s.get(7);
                j = s.get(11);
                if (j < 3 || j >= 15)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!flag || !whenwillrainrecord.hasNarrative())
                {
                    break label0;
                }
                obj = whenwillrainrecord.getStandardPhrase();
            }
            return ((String) (obj));
        }
        return getShortCast(recordsets, Integer.valueOf(i), Boolean.valueOf(flag1));
    }

    private String formatHHMM(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return LEADING_ZERO.matcher((new StringBuilder()).append(s.substring(0, 5)).append(s.substring(8, 11).toUpperCase(Locale.US)).toString()).replaceFirst("");
        }
    }

    private long getObservationTime(com.weather.dal2.data.CurrentConditionsRecord.CurrentConditionsDoc.CurrentConditionsData currentconditionsdata)
    {
        String s = currentconditionsdata.getObservationDateGMT();
        currentconditionsdata = currentconditionsdata.getObservationTimeGMT();
        long l;
        try
        {
            l = TimeParseUtil.getTimeFromGMTObservationDateAndTimeComponents(s, currentconditionsdata);
        }
        catch (Exception exception)
        {
            Log.w("CurrentWeatherFacade", (new StringBuilder()).append("Could not parse observation time. observationDateGMT=").append(s).append(", observationTimeGMT=").append(currentconditionsdata).toString());
            return 0L;
        }
        return l;
    }

    private String getShortCast(List list, Integer integer, Boolean boolean1)
    {
        String s;
        Object obj;
        obj = null;
        s = obj;
        if (integer == null) goto _L2; else goto _L1
_L1:
        s = obj;
        if (boolean1 == null) goto _L2; else goto _L3
_L3:
        s = obj;
        if (list == null) goto _L2; else goto _L4
_L4:
        s = obj;
        if (list.isEmpty()) goto _L2; else goto _L5
_L5:
        if (!LocaleUtil.isDeviceInEnglish())
        {
            list = ((com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)list.get(0)).getShortCast();
            if (list != null)
            {
                return list;
            } else
            {
                return "";
            }
        }
        integer.intValue();
        JVM INSTR tableswitch 5 6: default 96
    //                   5 124
    //                   6 157;
           goto _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_157;
_L6:
        s = getShortCastSatToWed(boolean1.booleanValue(), (com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)list.get(0));
_L2:
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
_L7:
        s = getShortCastThurAndFri(boolean1.booleanValue(), (com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)list.get(0), (com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)list.get(2));
          goto _L2
        s = getShortCastThurAndFri(boolean1.booleanValue(), (com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)list.get(0), (com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData)list.get(1));
          goto _L2
    }

    private ShortCastData getShortCastData(boolean flag, com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData dailyforecastdata)
    {
        Integer integer;
        String s;
        Object obj;
        s = null;
        obj = null;
        integer = obj;
        if (dailyforecastdata == null) goto _L2; else goto _L1
_L1:
        s = dailyforecastdata.getShortCast();
        _cls1..SwitchMap.com.weather.util.UnitType[DataUnits.getCurrentUnitType().ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 80
    //                   2 80
    //                   3 104;
           goto _L3 _L4 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L3:
        integer = obj;
_L2:
        if (integer != null)
        {
            dailyforecastdata = String.valueOf(integer);
        } else
        {
            dailyforecastdata = null;
        }
        return new ShortCastData(s, dailyforecastdata, null);
_L4:
        if (flag)
        {
            integer = dailyforecastdata.getLowTemperatureCelsius();
        } else
        {
            integer = dailyforecastdata.getHiTemperatureCelsius();
        }
          goto _L2
        if (flag)
        {
            integer = dailyforecastdata.getLowTemperatureFahrenheit();
        } else
        {
            integer = dailyforecastdata.getHiTemperatureFahrenheit();
        }
          goto _L2
    }

    private String getShortCastSatToWed(boolean flag, com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData dailyforecastdata)
    {
        String s;
        if (flag)
        {
            s = getString(com.weather.commons.R.string.narrative_saturday_to_wednesday_nighttime);
        } else
        {
            s = getString(com.weather.commons.R.string.narrative_saturday_to_wednesday_daytime);
        }
        dailyforecastdata = getShortCastData(flag, dailyforecastdata);
        if (dailyforecastdata.hasValidData())
        {
            return String.format(Locale.getDefault(), s, new Object[] {
                ((ShortCastData) (dailyforecastdata)).shortCastPhrase, ((ShortCastData) (dailyforecastdata)).temp
            });
        } else
        {
            return null;
        }
    }

    private String getShortCastThurAndFri(boolean flag, com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData dailyforecastdata, com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData dailyforecastdata1)
    {
        String s;
        if (flag)
        {
            s = getString(com.weather.commons.R.string.narrative_thursday_to_friday_nighttime);
        } else
        {
            s = getString(com.weather.commons.R.string.narrative_thursday_to_friday_daytime);
        }
        dailyforecastdata = getShortCastData(flag, dailyforecastdata);
        dailyforecastdata1 = getShortCastData(flag, dailyforecastdata1);
        if (dailyforecastdata.hasValidData() && dailyforecastdata1.hasValidData())
        {
            return String.format(Locale.getDefault(), s, new Object[] {
                ((ShortCastData) (dailyforecastdata)).shortCastPhrase, ((ShortCastData) (dailyforecastdata1)).shortCastPhrase, ((ShortCastData) (dailyforecastdata1)).temp
            });
        } else
        {
            return null;
        }
    }

    private String getString(int i)
    {
        return context.getString(i);
    }

    private boolean isRainExpected(com.weather.dal2.data.HourlyForecastRecord.HourlyForecastDoc.HourlyForecastData hourlyforecastdata)
    {
        if (hourlyforecastdata != null)
        {
            return rainCodes.contains(hourlyforecastdata.getWeatherIconCode());
        } else
        {
            return false;
        }
    }

    public Temperature getCurrentTemp()
    {
        return currentTemp;
    }

    public Integer getCurrentTempCelsius()
    {
        return currentTempCelsius;
    }

    public Integer getCurrentTempFahrenheit()
    {
        return currentTempFahrenheit;
    }

    public Temperature getDewPoint()
    {
        return dewPoint;
    }

    public int getExtendedSkyCode()
    {
        return skyExt;
    }

    public Temperature getFeelsLikeTemp()
    {
        return feelsLikeTemp;
    }

    public Temperature getHiTemp()
    {
        return hiTemp;
    }

    public Percentage getHumidity()
    {
        return humidity;
    }

    public Temperature getLoTemp()
    {
        return loTemp;
    }

    public String getNarrativePhrase()
    {
        return narrativePhrase;
    }

    public String getObservationStation()
    {
        return observationStation;
    }

    public long getObservationTime()
    {
        return observationTime;
    }

    public String getPhrase()
    {
        return phrase;
    }

    public PrecipitationRoundedValue getPrecip()
    {
        return precip;
    }

    public Pressure getPressure()
    {
        return pressure;
    }

    public long getRecordCreationTime()
    {
        return recordCreationTime;
    }

    public com.weather.dal2.dsx.RecordSets.RecordSetsSource getRecordSetsSource()
    {
        return weatherDataSourceType;
    }

    public SavedLocation getSavedLocation()
    {
        return savedLocation;
    }

    public int getSkyCode()
    {
        return sky;
    }

    public String getSunrise()
    {
        return sunrise;
    }

    public Long getSunriseMs()
    {
        return sunriseMs;
    }

    public String getSunset()
    {
        return sunset;
    }

    public Long getSunsetMs()
    {
        return sunsetMs;
    }

    public UVIndex getUvIndex()
    {
        return uvIndex;
    }

    public Distance getVisibility()
    {
        return visibility;
    }

    public BigDecimal getVisibilityInMiles()
    {
        return visibilityInMiles;
    }

    public WeatherAlertsFacade getWeatherAlertsFacade()
    {
        return weatherAlertsFacade;
    }

    public Wind getWind()
    {
        return wind;
    }

    public boolean isDay()
    {
        return FacadeUtils.isDay(sunriseMs, sunsetMs);
    }

    public boolean isEmpty()
    {
        return isEmpty;
    }

    public boolean isNight()
    {
        return FacadeUtils.isNight(sunriseMs, sunsetMs);
    }

    public String toString()
    {
        return (new StringBuilder()).append("CurrentWeatherFacade{savedLocation=").append(savedLocation).append('}').toString();
    }

}
