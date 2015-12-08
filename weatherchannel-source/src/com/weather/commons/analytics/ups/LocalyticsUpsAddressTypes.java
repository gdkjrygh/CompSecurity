// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;


public final class LocalyticsUpsAddressTypes extends Enum
{

    private static final LocalyticsUpsAddressTypes $VALUES[];
    public static final LocalyticsUpsAddressTypes HOME;
    public static final LocalyticsUpsAddressTypes WORK;
    private final String attributeValue;

    private LocalyticsUpsAddressTypes(String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }

    public static LocalyticsUpsAddressTypes valueOf(String s)
    {
        return (LocalyticsUpsAddressTypes)Enum.valueOf(com/weather/commons/analytics/ups/LocalyticsUpsAddressTypes, s);
    }

    public static LocalyticsUpsAddressTypes[] values()
    {
        return (LocalyticsUpsAddressTypes[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        HOME = new LocalyticsUpsAddressTypes("HOME", 0, "Home");
        WORK = new LocalyticsUpsAddressTypes("WORK", 1, "Work");
        $VALUES = (new LocalyticsUpsAddressTypes[] {
            HOME, WORK
        });
    }
}
