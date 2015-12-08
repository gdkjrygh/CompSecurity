// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            FormattedValue

public class PrecipitationRoundedValue
    implements FormattedValue
{

    private static final Double MULTIPLE_VALUE = Double.valueOf(5D);
    private static final String PERCENT_SYMBOL = "%";
    private final String precipitationValueFormatted;

    public PrecipitationRoundedValue(Integer integer)
    {
        precipitationValueFormatted = getPrecipitationValue(integer);
    }

    private String getPrecipitationValue(Integer integer)
    {
        if (integer == null || integer.intValue() < 0)
        {
            return "--";
        } else
        {
            return (new StringBuilder()).append(getRoundedvalue(integer.intValue())).append("%").toString();
        }
    }

    private int getRoundedvalue(int i)
    {
        return (int)((double)Math.round((double)i / MULTIPLE_VALUE.doubleValue()) * MULTIPLE_VALUE.doubleValue());
    }

    public String format()
    {
        return precipitationValueFormatted;
    }

    public boolean isNotValidPrecipitation()
    {
        return precipitationValueFormatted.equals("--");
    }

}
