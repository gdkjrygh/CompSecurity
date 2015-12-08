// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.util.UnitType;

// Referenced classes of package com.weather.commons.facade:
//            UnitTypedFormat

public class Temperature extends UnitTypedFormat
{

    public static final String DEGREE_SYMBOL = "\260";
    public static final String DEGREE_SYMBOL_C = "\260 C";
    public static final String DEGREE_SYMBOL_F = "\260 F";
    public static final Temperature NONE;

    public Temperature(Integer integer, UnitType unittype)
    {
        super(integer, unittype, "\260 F", "\260 C", "\260 C");
    }

    public volatile String format()
    {
        return super.format();
    }

    public String formatAbsValue()
    {
        if (value == null)
        {
            return "--";
        } else
        {
            return Integer.toString(Math.abs(((Integer)value).intValue()));
        }
    }

    public String formatShort()
    {
        if (value == null)
        {
            return "--";
        } else
        {
            return (new StringBuilder()).append(value).append("\260").toString();
        }
    }

    public volatile String getUnit()
    {
        return super.getUnit();
    }

    static 
    {
        NONE = new Temperature(null, UnitType.ENGLISH);
    }
}
