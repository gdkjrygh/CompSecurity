// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.alerts;


// Referenced classes of package com.weather.commons.analytics.alerts:
//            LocalyticsAlertsAttribute

public static final class alertAttribute extends Enum
{

    private static final ALERT_SETTING_SCREEN $VALUES[];
    public static final ALERT_SETTING_SCREEN ACTIVATION_SCREEN;
    public static final ALERT_SETTING_SCREEN ALERT_SETTING_SCREEN;
    private final String alertAttribute;

    public static alertAttribute valueOf(String s)
    {
        return (alertAttribute)Enum.valueOf(com/weather/commons/analytics/alerts/LocalyticsAlertsAttribute$AlertAttributeValues, s);
    }

    public static alertAttribute[] values()
    {
        return (alertAttribute[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return alertAttribute;
    }

    static 
    {
        ACTIVATION_SCREEN = new <init>("ACTIVATION_SCREEN", 0, "activation");
        ALERT_SETTING_SCREEN = new <init>("ALERT_SETTING_SCREEN", 1, "settings");
        $VALUES = (new .VALUES[] {
            ACTIVATION_SCREEN, ALERT_SETTING_SCREEN
        });
    }

    private Y(String s, int i, String s1)
    {
        super(s, i);
        alertAttribute = s1;
    }
}
