// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsTags

public static final class tagName extends Enum
{

    private static final BURDA $VALUES[];
    public static final BURDA BREAKING_ALERT;
    public static final BURDA BURDA;
    public static final BURDA DEEP_LINK;
    public static final BURDA FIRST_TIME;
    public static final BURDA INTERNATIONAL_REAL_TIME_RAIN_ALERT;
    public static final BURDA LAUNCHER_ICON;
    public static final BURDA LIGHTNING_STRIKES_ALERT;
    public static final BURDA NOW_CARD;
    public static final BURDA ONE_BOX;
    public static final BURDA ONGOING_TEMP_ALERT;
    public static final BURDA POLLEN_ALERT;
    public static final BURDA RAINSNOW_ALERT;
    public static final BURDA REAL_TIME_RAIN_ALERT;
    public static final BURDA SEVERE_ALERT;
    public static final BURDA SEVERE_INTERNATIONAL_ALERT;
    public static final BURDA WIDGET_1x1;
    public static final BURDA WIDGET_2x2;
    public static final BURDA WIDGET_4x1;
    public static final BURDA WIDGET_4x2;
    private final String tagName;

    public static tagName valueOf(String s)
    {
        return (tagName)Enum.valueOf(com/weather/commons/analytics/LocalyticsTags$LaunchSourceTag, s);
    }

    public static tagName[] values()
    {
        return (tagName[])$VALUES.clone();
    }

    public String getTagName()
    {
        return tagName;
    }

    static 
    {
        LAUNCHER_ICON = new <init>("LAUNCHER_ICON", 0, "launcher icon");
        WIDGET_1x1 = new <init>("WIDGET_1x1", 1, "widget1x1");
        WIDGET_2x2 = new <init>("WIDGET_2x2", 2, "widget2x2");
        WIDGET_4x1 = new <init>("WIDGET_4x1", 3, "widget4x1");
        WIDGET_4x2 = new <init>("WIDGET_4x2", 4, "widget4x2");
        BREAKING_ALERT = new <init>("BREAKING_ALERT", 5, "breaking news alert");
        RAINSNOW_ALERT = new <init>("RAINSNOW_ALERT", 6, "rain snow alert");
        POLLEN_ALERT = new <init>("POLLEN_ALERT", 7, "pollen alert");
        SEVERE_ALERT = new <init>("SEVERE_ALERT", 8, "severe alert");
        SEVERE_INTERNATIONAL_ALERT = new <init>("SEVERE_INTERNATIONAL_ALERT", 9, "international severe alert");
        INTERNATIONAL_REAL_TIME_RAIN_ALERT = new <init>("INTERNATIONAL_REAL_TIME_RAIN_ALERT", 10, "international real time rain alert");
        REAL_TIME_RAIN_ALERT = new <init>("REAL_TIME_RAIN_ALERT", 11, "real time rain alert");
        LIGHTNING_STRIKES_ALERT = new <init>("LIGHTNING_STRIKES_ALERT", 12, "lightning alert");
        ONGOING_TEMP_ALERT = new <init>("ONGOING_TEMP_ALERT", 13, "on going temp alert");
        FIRST_TIME = new <init>("FIRST_TIME", 14, "first time launch");
        DEEP_LINK = new <init>("DEEP_LINK", 15, "goog deep link");
        ONE_BOX = new <init>("ONE_BOX", 16, "goog onebox");
        NOW_CARD = new <init>("NOW_CARD", 17, "goog nowcard");
        BURDA = new <init>("BURDA", 18, "evar37");
        $VALUES = (new .VALUES[] {
            LAUNCHER_ICON, WIDGET_1x1, WIDGET_2x2, WIDGET_4x1, WIDGET_4x2, BREAKING_ALERT, RAINSNOW_ALERT, POLLEN_ALERT, SEVERE_ALERT, SEVERE_INTERNATIONAL_ALERT, 
            INTERNATIONAL_REAL_TIME_RAIN_ALERT, REAL_TIME_RAIN_ALERT, LIGHTNING_STRIKES_ALERT, ONGOING_TEMP_ALERT, FIRST_TIME, DEEP_LINK, ONE_BOX, NOW_CARD, BURDA
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        tagName = s1;
    }
}
