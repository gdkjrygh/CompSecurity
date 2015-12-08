// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.dal2.data.CurrentConditionsRecord;
import com.weather.util.UnitType;
import java.util.Locale;

// Referenced classes of package com.weather.commons.facade:
//            AirportFacade

public static final class pressure
{

    public static final String IN = " In";
    public static final String MBAR = " MB";
    private static final String wholeFormat = "%.1f%s";
    public final String pressure;

    public sDoc.CurrentConditionsData(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
    {
        com.weather.dal2.data.itionsDoc.CurrentConditionsData currentconditionsdata = _mth0(currentconditionsrecord);
        currentconditionsrecord = null;
        if (currentconditionsdata != null)
        {
            if (unittype == UnitType.ENGLISH)
            {
                currentconditionsrecord = currentconditionsdata.getBarometricPressureInInches();
            } else
            {
                currentconditionsrecord = currentconditionsdata.getBarometricPressureInMillibars();
            }
        }
        if (unittype == UnitType.ENGLISH)
        {
            unittype = " In";
        } else
        {
            unittype = " MB";
        }
        if (currentconditionsrecord == null)
        {
            currentconditionsrecord = "--";
        } else
        {
            currentconditionsrecord = String.format(Locale.getDefault(), "%.1f%s", new Object[] {
                currentconditionsrecord, unittype
            });
        }
        pressure = currentconditionsrecord;
    }
}
