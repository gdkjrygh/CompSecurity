// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import com.weather.util.device.LocaleUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.util:
//            UnitType

public final class DataUnits
{

    private DataUnits()
    {
    }

    public static UnitType getCurrentUnitType()
    {
        return getUnitType(TwcPrefs.getInstance().getInt(com.weather.util.prefs.TwcPrefs.Keys.UNITS, getDefaultForDeviceLocale().getIndex()));
    }

    public static UnitType getDefaultForDeviceLocale()
    {
        if (LocaleUtil.isDeviceInUKEnglish())
        {
            return UnitType.HYBRID;
        }
        if (LocaleUtil.isDeviceInUSEnglish())
        {
            return UnitType.ENGLISH;
        } else
        {
            return UnitType.METRIC;
        }
    }

    public static UnitType getUnitType(int i)
    {
        UnitType unittype = UnitType.ENGLISH;
        if (UnitType.METRIC.getIndex() == i)
        {
            unittype = UnitType.METRIC;
        } else
        if (UnitType.HYBRID.getIndex() == i)
        {
            return UnitType.HYBRID;
        }
        return unittype;
    }

    public static boolean setCurrentUnitType(UnitType unittype)
    {
        if (getCurrentUnitType() != unittype)
        {
            TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.UNITS, unittype.getIndex());
            return true;
        } else
        {
            return false;
        }
    }
}
