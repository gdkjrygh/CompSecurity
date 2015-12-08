// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.util.UnitType;

// Referenced classes of package com.weather.commons.facade:
//            UnitTypedFormat

public class Speed extends UnitTypedFormat
{

    public static final String KMH = " KMH";
    public static final String MPH = " MPH";

    public Speed(Integer integer, UnitType unittype)
    {
        super(integer, unittype, " MPH", " KMH", " MPH");
    }

    public volatile String format()
    {
        return super.format();
    }

    public volatile String getUnit()
    {
        return super.getUnit();
    }
}
