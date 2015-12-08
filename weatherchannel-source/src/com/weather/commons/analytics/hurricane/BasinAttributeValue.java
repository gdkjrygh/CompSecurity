// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.hurricane;


public final class BasinAttributeValue extends Enum
{

    private static final BasinAttributeValue $VALUES[];
    public static final BasinAttributeValue ATLANTIC;
    public static final BasinAttributeValue EASTERN_PACIFIC;
    private final String attributeValue;

    private BasinAttributeValue(String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }

    public static BasinAttributeValue valueOf(String s)
    {
        return (BasinAttributeValue)Enum.valueOf(com/weather/commons/analytics/hurricane/BasinAttributeValue, s);
    }

    public static BasinAttributeValue[] values()
    {
        return (BasinAttributeValue[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        EASTERN_PACIFIC = new BasinAttributeValue("EASTERN_PACIFIC", 0, "eastern pacifice");
        ATLANTIC = new BasinAttributeValue("ATLANTIC", 1, "atlantic");
        $VALUES = (new BasinAttributeValue[] {
            EASTERN_PACIFIC, ATLANTIC
        });
    }
}
