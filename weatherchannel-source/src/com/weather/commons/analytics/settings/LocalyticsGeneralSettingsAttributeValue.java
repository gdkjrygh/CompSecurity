// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.settings;

import com.weather.util.UnitType;

public final class LocalyticsGeneralSettingsAttributeValue extends Enum
{

    private static final LocalyticsGeneralSettingsAttributeValue $VALUES[];
    public static final LocalyticsGeneralSettingsAttributeValue LOGIN;
    public static final LocalyticsGeneralSettingsAttributeValue LOGOUT;
    public static final LocalyticsGeneralSettingsAttributeValue OFF;
    public static final LocalyticsGeneralSettingsAttributeValue ON;
    public static final LocalyticsGeneralSettingsAttributeValue UNIT_TYPE_HYBRID;
    public static final LocalyticsGeneralSettingsAttributeValue UNIT_TYPE_IMPERIAL;
    public static final LocalyticsGeneralSettingsAttributeValue UNIT_TYPE_METRIC;
    private final String attributeValue;

    private LocalyticsGeneralSettingsAttributeValue(String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }

    public static String toLocalyticsUnitType(UnitType unittype)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$weather$util$UnitType[];

            static 
            {
                $SwitchMap$com$weather$util$UnitType = new int[UnitType.values().length];
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.ENGLISH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.METRIC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.HYBRID.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.weather.util.UnitType[unittype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return UNIT_TYPE_IMPERIAL.getAttributeValue();

        case 2: // '\002'
            return UNIT_TYPE_METRIC.getAttributeValue();

        case 3: // '\003'
            return UNIT_TYPE_HYBRID.getAttributeValue();
        }
    }

    public static LocalyticsGeneralSettingsAttributeValue valueOf(String s)
    {
        return (LocalyticsGeneralSettingsAttributeValue)Enum.valueOf(com/weather/commons/analytics/settings/LocalyticsGeneralSettingsAttributeValue, s);
    }

    public static LocalyticsGeneralSettingsAttributeValue[] values()
    {
        return (LocalyticsGeneralSettingsAttributeValue[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        LOGOUT = new LocalyticsGeneralSettingsAttributeValue("LOGOUT", 0, "Log out");
        LOGIN = new LocalyticsGeneralSettingsAttributeValue("LOGIN", 1, "Log in");
        OFF = new LocalyticsGeneralSettingsAttributeValue("OFF", 2, "off");
        ON = new LocalyticsGeneralSettingsAttributeValue("ON", 3, "on");
        UNIT_TYPE_IMPERIAL = new LocalyticsGeneralSettingsAttributeValue("UNIT_TYPE_IMPERIAL", 4, "imperial");
        UNIT_TYPE_HYBRID = new LocalyticsGeneralSettingsAttributeValue("UNIT_TYPE_HYBRID", 5, "hybrid");
        UNIT_TYPE_METRIC = new LocalyticsGeneralSettingsAttributeValue("UNIT_TYPE_METRIC", 6, "metric");
        $VALUES = (new LocalyticsGeneralSettingsAttributeValue[] {
            LOGOUT, LOGIN, OFF, ON, UNIT_TYPE_IMPERIAL, UNIT_TYPE_HYBRID, UNIT_TYPE_METRIC
        });
    }
}
