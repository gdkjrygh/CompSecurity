// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.util.UnitType;
import java.util.Locale;

// Referenced classes of package com.weather.commons.facade:
//            UnitTypedFormat

public class Pressure extends UnitTypedFormat
{

    public static final String IN = " In";
    public static final String MBAR = " MB";
    private static final String wholeFormat = "%.0f%s";

    public Pressure(Double double1, UnitType unittype)
    {
        super(double1, unittype, " In", " MB", " MB");
    }

    public volatile String format()
    {
        return super.format();
    }

    public String formatWhole()
    {
        if (value != null)
        {
            return String.format(Locale.getDefault(), "%.0f%s", new Object[] {
                value, getUnit()
            });
        } else
        {
            return "--";
        }
    }

    public volatile String getUnit()
    {
        return super.getUnit();
    }
}
