// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import android.content.Context;
import com.weather.dal2.data.SkiRecord;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SkiFacade
{

    private static final Pattern COMPILE = Pattern.compile(".+:\\s");
    private static final Context context = AbstractTwcApplication.getRootContext();
    private static final Map openingDays;
    private final Calendar calendar = Calendar.getInstance();
    private final SkiRecord skiRecord;

    public SkiFacade(SkiRecord skirecord)
    {
        skiRecord = skirecord;
    }

    private String checkWindSpeedNoZero(int i, Integer integer)
    {
        if (integer == null || integer.intValue() == 0)
        {
            return context.getString(com.weather.commons.R.string.calm);
        } else
        {
            return context.getString(i, new Object[] {
                String.valueOf(integer)
            });
        }
    }

    public String getFutureSnow(int i)
    {
        String s = null;
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

        _cls1..SwitchMap.com.weather.util.UnitType[DataUnits.getCurrentUnitType().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 46
    //                   2 46
    //                   3 82;
           goto _L1 _L2 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_82;
_L4:
        String s1;
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
_L2:
        s1 = skiRecord.getSnowAccumulationForecastInCentimeters(i);
        if (s1 != null)
        {
            s = context.getString(com.weather.commons.R.string.snow_string_cm, new Object[] {
                s1
            });
        }
          goto _L4
        String s2 = skiRecord.getSnowAccumulationForecastInInches(i);
        if (s2 != null)
        {
            s = context.getString(com.weather.commons.R.string.snow_string_in, new Object[] {
                s2
            });
        }
          goto _L4
    }

    public String getLiftsOpen(int i)
    {
        Object obj = null;
        Integer integer = skiRecord.getOpenLifts(i);
        Integer integer1 = skiRecord.getTotalNumberOfLift(i);
        String s = obj;
        if (integer != null)
        {
            s = obj;
            if (integer1 != null)
            {
                s = context.getString(com.weather.commons.R.string.open_lifts_divider, new Object[] {
                    String.valueOf(integer), String.valueOf(integer1)
                });
            }
        }
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

    public String getOperationTime(int i)
    {
        return getOperationTime(i, calendar.get(7));
    }

    public String getOperationTime(int i, int j)
    {
        String s;
        Object obj;
        String as[];
        as = skiRecord.getOperatingHours(i);
        obj = null;
        s = obj;
        if (as == null) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = (String)openingDays.get(Integer.valueOf(j));
        s = obj;
        if (s1 == null) goto _L2; else goto _L3
_L3:
        j = as.length;
        i = 0;
_L7:
        s = obj;
        if (i >= j) goto _L2; else goto _L4
_L4:
        s = as[i];
        if (!s.contains(s1)) goto _L5; else goto _L2
_L2:
        if (s != null)
        {
            return COMPILE.matcher(s).replaceAll("");
        } else
        {
            return context.getString(com.weather.commons.R.string.ski_close);
        }
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String getResortName(int i)
    {
        String s = skiRecord.getResortName(i);
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

    public String getSnowBase(int i)
    {
        Object obj = null;
        _cls1..SwitchMap.com.weather.util.UnitType[DataUnits.getCurrentUnitType().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 48
    //                   2 48
    //                   3 119;
           goto _L1 _L2 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_119;
_L1:
        String s = obj;
_L4:
        Integer integer;
        Integer integer2;
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
_L2:
        integer = skiRecord.getMinSnowLevelCm(i);
        integer2 = skiRecord.getMaxSnowLevelCm(i);
        s = obj;
        if (integer != null)
        {
            s = obj;
            if (integer2 != null)
            {
                s = context.getString(com.weather.commons.R.string.snow_base_cm, new Object[] {
                    String.valueOf(integer), String.valueOf(integer2)
                });
            }
        }
          goto _L4
        Integer integer1 = skiRecord.getMinSnowLevelIn(i);
        Integer integer3 = skiRecord.getMaxSnowLevelIn(i);
        s = obj;
        if (integer1 != null)
        {
            s = obj;
            if (integer3 != null)
            {
                s = context.getString(com.weather.commons.R.string.snow_base_in, new Object[] {
                    String.valueOf(integer1), String.valueOf(integer3)
                });
            }
        }
          goto _L4
    }

    public String getSnowCondition(int i)
    {
        String s = skiRecord.getSnowCondition(i);
        if (s != null)
        {
            return s;
        } else
        {
            return context.getString(com.weather.commons.R.string.no_data_available);
        }
    }

    public String getSnowFallenLast24Hrs(int i)
    {
        Object obj = null;
        _cls1..SwitchMap.com.weather.util.UnitType[DataUnits.getCurrentUnitType().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 46
    //                   2 46
    //                   3 91;
           goto _L1 _L2 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_91;
_L4:
        if (obj != null)
        {
            return ((String) (obj));
        } else
        {
            return "";
        }
_L2:
        obj = skiRecord.getSnowFallenLast24HoursCm(i);
        if (obj != null)
        {
            obj = context.getString(com.weather.commons.R.string.snow_string_cm, new Object[] {
                String.valueOf(obj)
            });
        } else
        {
            obj = "";
        }
          goto _L4
        obj = skiRecord.getSnowFallenLast24HoursIn(i);
        if (obj != null)
        {
            obj = context.getString(com.weather.commons.R.string.snow_string_in, new Object[] {
                String.valueOf(obj)
            });
        } else
        {
            obj = "";
        }
          goto _L4
    }

    public String getTemperature(int i)
    {
        String s = null;
        _cls1..SwitchMap.com.weather.util.UnitType[DataUnits.getCurrentUnitType().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 46
    //                   2 46
    //                   3 85;
           goto _L1 _L2 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_85;
_L4:
        Integer integer;
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
_L2:
        integer = skiRecord.getTemperatureC(i);
        if (integer != null)
        {
            s = context.getString(com.weather.commons.R.string.temperature_string, new Object[] {
                String.valueOf(integer)
            });
        }
          goto _L4
        Integer integer1 = skiRecord.getTemperatureF(i);
        if (integer1 != null)
        {
            s = context.getString(com.weather.commons.R.string.temperature_string, new Object[] {
                String.valueOf(integer1)
            });
        }
          goto _L4
    }

    public int getTotalNumberOfResorts()
    {
        return skiRecord.totalNumberOfResorts();
    }

    public String getWindSpeed(int i)
    {
        String s = null;
        _cls1..SwitchMap.com.weather.util.UnitType[DataUnits.getCurrentUnitType().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 61
    //                   2 82
    //                   3 82;
           goto _L1 _L2 _L3 _L3
_L1:
        String s2 = skiRecord.getWindDirection(i);
        if (s != null) goto _L5; else goto _L4
_L4:
        String s1 = "";
_L7:
        return s1;
_L2:
        s = checkWindSpeedNoZero(com.weather.commons.R.string.wind_speed_string_km, skiRecord.getWindSpeedKm(i));
        continue; /* Loop/switch isn't completed */
_L3:
        s = checkWindSpeedNoZero(com.weather.commons.R.string.wind_speed_string_miles, skiRecord.getWindSpeedMi(i));
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = s;
        if (s.equals("Calm")) goto _L7; else goto _L6
_L6:
        s1 = s;
        if (s2 == null) goto _L7; else goto _L8
_L8:
        return (new StringBuilder()).append(s2).append(' ').append(s).toString();
        if (true) goto _L1; else goto _L9
_L9:
    }

    static 
    {
        openingDays = new TreeMap();
        openingDays.put(Integer.valueOf(1), "Sun:");
        openingDays.put(Integer.valueOf(2), "Mon:");
        openingDays.put(Integer.valueOf(3), "Tue:");
        openingDays.put(Integer.valueOf(4), "Wed:");
        openingDays.put(Integer.valueOf(5), "Thu:");
        openingDays.put(Integer.valueOf(6), "Fri:");
        openingDays.put(Integer.valueOf(7), "Sat:");
    }
}
