// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.util.UnitType;
import com.weather.util.date.TwcDateFormatter;
import com.weather.util.device.LocaleUtil;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.weather.commons.facade:
//            Temperature, PrecipitationRoundedValue, Wind

public class DailyWeather
{

    private final Date dateGMT;
    private final String dayHeadline;
    private final Integer dayIcon;
    private final String dayPhrase;
    private final PrecipitationRoundedValue dayPrecipitation;
    private final String dayTitle;
    private final Wind dayWind;
    private final Temperature hiTemp;
    private final Temperature loTemp;
    private final String nightHeadLine;
    private final Integer nightIcon;
    private final String nightPhrase;
    private final PrecipitationRoundedValue nightPrecipitation;
    private final String nightTitle;
    private final Wind nightWind;
    private final String sunrise;
    private final Long sunriseMs;
    private final String sunriseOffset;
    private final String sunset;
    private final Long sunsetMs;
    private final boolean useDayPart;

    public DailyWeather(boolean flag, com.weather.dal2.data.DailyForecastRecord.DailyForecastDoc.DailyForecastData dailyforecastdata, UnitType unittype, String s, String s1, String s2, String s3)
    {
        useDayPart = flag;
        dailyforecastdata.getSunsetOffset();
        sunriseOffset = dailyforecastdata.getSunriseOffset();
        Integer integer;
        if (UnitType.ENGLISH == unittype)
        {
            integer = dailyforecastdata.getHiTemperatureFahrenheit();
        } else
        {
            integer = dailyforecastdata.getHiTemperatureCelsius();
        }
        hiTemp = new Temperature(integer, unittype);
        if (UnitType.ENGLISH == unittype)
        {
            integer = dailyforecastdata.getLowTemperatureFahrenheit();
        } else
        {
            integer = dailyforecastdata.getLowTemperatureCelsius();
        }
        loTemp = new Temperature(integer, unittype);
        dayPrecipitation = new PrecipitationRoundedValue(dailyforecastdata.getPercentChanceOfPrecipitationDay());
        nightPrecipitation = new PrecipitationRoundedValue(dailyforecastdata.getPercentChanceOfPrecipitationNight());
        dayWind = new Wind(dailyforecastdata.getWindDirectionAsciiDay(), dailyforecastdata.getWindSpeedInKilometersDay(), dailyforecastdata.getWindSpeedInMilesDay(), unittype);
        nightWind = new Wind(dailyforecastdata.getWindDirectionAsciiNight(), dailyforecastdata.getWindSpeedInKilometersNight(), dailyforecastdata.getWindSpeedInMilesNight(), unittype);
        dayPhrase = s;
        nightPhrase = s1;
        dayHeadline = dailyforecastdata.getSensibleWeatherPhraseDay();
        nightHeadLine = dailyforecastdata.getSensibleWeatherPhraseNight();
        dayIcon = dailyforecastdata.getWeatherIconCodeDay();
        nightIcon = dailyforecastdata.getWeatherIconCodeNight();
        dayTitle = s2;
        nightTitle = s3;
        sunriseMs = dailyforecastdata.getSunriseTime();
        sunsetMs = dailyforecastdata.getSunsetTime();
        sunrise = dailyforecastdata.getSunrise();
        sunset = dailyforecastdata.getSunset();
        dailyforecastdata = dailyforecastdata.getForecastValidDateGMTMillis();
        if (dailyforecastdata == null)
        {
            dailyforecastdata = null;
        } else
        {
            dailyforecastdata = new Date(dailyforecastdata.longValue());
        }
        dateGMT = dailyforecastdata;
    }

    public String formatDay()
    {
        String s = "";
        if (dateGMT != null)
        {
            s = TwcDateFormatter.formatEEE(dateGMT, getSunriseTimeOffset());
        }
        return s.toUpperCase(Locale.getDefault());
    }

    public String formatDayLong()
    {
        String s = "";
        if (dateGMT != null)
        {
            s = TwcDateFormatter.formatEEEE(dateGMT, getSunriseTimeOffset());
        }
        return s;
    }

    public String formatDayTitle()
    {
        if (dayTitle == null)
        {
            return null;
        } else
        {
            return dayTitle.toUpperCase(Locale.getDefault());
        }
    }

    public String formatMonthDate()
    {
label0:
        {
            String s = "";
            if (dateGMT != null)
            {
                if (!LocaleUtil.isDeviceInGermanyGerman())
                {
                    break label0;
                }
                s = TwcDateFormatter.formatDM(dateGMT, getSunriseTimeOffset()).toUpperCase(Locale.getDefault());
            }
            return s;
        }
        if (LocaleUtil.isDeviceInSpanish() || LocaleUtil.isDeviceInPortuguese())
        {
            return TwcDateFormatter.formatDDeM(dateGMT, getSunriseTimeOffset()).toUpperCase(Locale.getDefault());
        } else
        {
            return TwcDateFormatter.formatM(dateGMT, getSunriseTimeOffset()).toUpperCase(Locale.getDefault());
        }
    }

    public String formatMonthFullDayDate()
    {
label0:
        {
            String s = "";
            if (dateGMT != null)
            {
                if (!LocaleUtil.isDeviceInGermanyGerman())
                {
                    break label0;
                }
                s = TwcDateFormatter.formatEEEEdMMMM(dateGMT, getSunriseTimeOffset());
            }
            return s;
        }
        if (LocaleUtil.isDeviceInSpanish())
        {
            return TwcDateFormatter.formatEEEEdDeMMMM(dateGMT, getSunriseTimeOffset());
        }
        if (LocaleUtil.isDeviceInPortuguese())
        {
            return TwcDateFormatter.formatEEEEdDeMMMMDeYYYY(dateGMT, getSunriseTimeOffset());
        } else
        {
            return TwcDateFormatter.formatEEEEMMMMd(dateGMT, getSunriseTimeOffset());
        }
    }

    public String formatNightTitle()
    {
        if (nightTitle == null)
        {
            return null;
        } else
        {
            return nightTitle.toUpperCase(Locale.getDefault());
        }
    }

    public Date getDateGMT()
    {
        if (dateGMT == null)
        {
            return null;
        } else
        {
            return new Date(dateGMT.getTime());
        }
    }

    public String getDayHeadline()
    {
        return dayHeadline;
    }

    public Integer getDayIcon()
    {
        return dayIcon;
    }

    public String getDayPhrase()
    {
        return dayPhrase;
    }

    public PrecipitationRoundedValue getDayPrecipitation()
    {
        return dayPrecipitation;
    }

    public String getDayTitle()
    {
        return dayTitle;
    }

    public Wind getDayWind()
    {
        return dayWind;
    }

    public String getHeadline()
    {
        if (dayHeadline == null)
        {
            return nightHeadLine;
        } else
        {
            return dayHeadline;
        }
    }

    public Temperature getHiTemp()
    {
        return hiTemp;
    }

    public Integer getIcon()
    {
        if (dayIcon == null)
        {
            return nightIcon;
        } else
        {
            return dayIcon;
        }
    }

    public Temperature getLoTemp()
    {
        return loTemp;
    }

    public String getNightHeadLine()
    {
        return nightHeadLine;
    }

    public Integer getNightIcon()
    {
        return nightIcon;
    }

    public String getNightPhrase()
    {
        return nightPhrase;
    }

    public PrecipitationRoundedValue getNightPrecipitation()
    {
        return nightPrecipitation;
    }

    public String getNightTitle()
    {
        return nightTitle;
    }

    public Wind getNightWind()
    {
        return nightWind;
    }

    public String getPhrase()
    {
        if (dayPhrase == null)
        {
            return nightPhrase;
        } else
        {
            return dayPhrase;
        }
    }

    public PrecipitationRoundedValue getPrecipitation()
    {
        boolean flag;
        if (!dayPrecipitation.isNotValidPrecipitation())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return dayPrecipitation;
        } else
        {
            return nightPrecipitation;
        }
    }

    public String getSunrise()
    {
        return sunrise;
    }

    public Long getSunriseMs()
    {
        return sunriseMs;
    }

    public String getSunriseTimeOffset()
    {
        return sunriseOffset;
    }

    public String getSunset()
    {
        return sunset;
    }

    public Long getSunsetMs()
    {
        return sunsetMs;
    }

    public String getTitle()
    {
        if (dayTitle == null)
        {
            return nightTitle;
        } else
        {
            return dayTitle;
        }
    }

    public boolean isUseDayPart()
    {
        return useDayPart;
    }
}
