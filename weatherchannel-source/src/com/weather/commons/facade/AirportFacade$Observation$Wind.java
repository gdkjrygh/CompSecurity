// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.dal2.data.CurrentConditionsRecord;
import com.weather.util.UnitType;

// Referenced classes of package com.weather.commons.facade:
//            AirportFacade, Speed

public static final class speed
{

    public final String directionCardinal;
    public final String speed;

    public tionsDoc.CurrentConditionsData(CurrentConditionsRecord currentconditionsrecord, UnitType unittype)
    {
        com.weather.dal2.data.ConditionsDoc.CurrentConditionsData currentconditionsdata = s._mth400(currentconditionsrecord);
        String s = null;
        currentconditionsrecord = null;
        Integer integer = null;
        if (currentconditionsdata != null)
        {
            s = currentconditionsdata.getWindDirectionAscii();
            currentconditionsrecord = currentconditionsdata.getWindSpeedInKilometers();
            integer = currentconditionsdata.getWindSpeedInMiles();
        }
        directionCardinal = (String)AirportFacade.access$000(s, "");
        if (unittype != UnitType.METRIC)
        {
            currentconditionsrecord = integer;
        }
        speed = (new Speed(currentconditionsrecord, unittype)).format();
    }
}
