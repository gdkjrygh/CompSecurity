// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.util.UnitType;
import java.math.BigDecimal;
import java.util.Locale;

// Referenced classes of package com.weather.commons.facade:
//            UnitTypedFormat

public class Distance extends UnitTypedFormat
{

    public static final String KM = " KM";
    public static final String MI = " Mi";
    private static final String decimalFormat = "%.1f%s";
    private static final String wholeFormat = "%.0f%s";

    public Distance(BigDecimal bigdecimal, UnitType unittype)
    {
        super(bigdecimal, unittype, " Mi", " KM", " Mi");
    }

    public volatile String format()
    {
        return super.format();
    }

    public String formatDecimal()
    {
        if (value != null)
        {
            return String.format(Locale.getDefault(), "%.1f%s", new Object[] {
                value, getUnit()
            });
        } else
        {
            return "--";
        }
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
