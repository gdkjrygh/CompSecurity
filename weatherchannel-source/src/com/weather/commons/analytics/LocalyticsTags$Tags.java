// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, LocalyticsTags

public static final class tagName extends Enum
    implements Attribute
{

    private static final LOCATION $VALUES[];
    public static final LOCATION INTERNATIONAL_REAL_TIME_RAIN_ALERT;
    public static final LOCATION LIGHTNING_STRIKES_ALERT;
    public static final LOCATION LOCATION;
    public static final LOCATION REAL_TIME_RAIN_ALERT;
    public static final LOCATION SETTINGS_FEEDBACK;
    private final String tagName;

    public static tagName valueOf(String s)
    {
        return (tagName)Enum.valueOf(com/weather/commons/analytics/LocalyticsTags$Tags, s);
    }

    public static tagName[] values()
    {
        return (tagName[])$VALUES.clone();
    }

    public String getName()
    {
        return tagName;
    }

    static 
    {
        SETTINGS_FEEDBACK = new <init>("SETTINGS_FEEDBACK", 0, "settings_feedback");
        REAL_TIME_RAIN_ALERT = new <init>("REAL_TIME_RAIN_ALERT", 1, "real time rain alert");
        INTERNATIONAL_REAL_TIME_RAIN_ALERT = new <init>("INTERNATIONAL_REAL_TIME_RAIN_ALERT", 2, "international real time rain alert");
        LIGHTNING_STRIKES_ALERT = new <init>("LIGHTNING_STRIKES_ALERT", 3, "lightning alert");
        LOCATION = new <init>("LOCATION", 4, "Location");
        $VALUES = (new .VALUES[] {
            SETTINGS_FEEDBACK, REAL_TIME_RAIN_ALERT, INTERNATIONAL_REAL_TIME_RAIN_ALERT, LIGHTNING_STRIKES_ALERT, LOCATION
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        tagName = s1;
    }
}
