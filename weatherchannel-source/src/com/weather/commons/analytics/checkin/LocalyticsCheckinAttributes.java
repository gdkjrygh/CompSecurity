// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.checkin;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsCheckinAttributes extends Enum
    implements Attribute
{

    private static final LocalyticsCheckinAttributes $VALUES[];
    public static final LocalyticsCheckinAttributes ADDED_PHOTOS;
    public static final LocalyticsCheckinAttributes ADDED_PHOTOS_FAILED;
    public static final LocalyticsCheckinAttributes ADDED_PHOTOS_FAILED_CHECKIN_PATH;
    public static final LocalyticsCheckinAttributes FAILED_SUBMIT_WEATHER_CHECKIN;
    public static final LocalyticsCheckinAttributes PREVIOUS_SCREEN;
    public static final LocalyticsCheckinAttributes USER_CLICKED_WEATHER_CHECKIN;
    public static final LocalyticsCheckinAttributes USER_SUBMITTED_WEATHER_CHECKIN;
    public static final LocalyticsCheckinAttributes USER_VIEWED_WEATHER_HISTORY;
    private final String attribute;

    private LocalyticsCheckinAttributes(String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }

    public static LocalyticsCheckinAttributes valueOf(String s)
    {
        return (LocalyticsCheckinAttributes)Enum.valueOf(com/weather/commons/analytics/checkin/LocalyticsCheckinAttributes, s);
    }

    public static LocalyticsCheckinAttributes[] values()
    {
        return (LocalyticsCheckinAttributes[])$VALUES.clone();
    }

    public String getName()
    {
        return attribute;
    }

    static 
    {
        PREVIOUS_SCREEN = new LocalyticsCheckinAttributes("PREVIOUS_SCREEN", 0, "previous screen");
        USER_CLICKED_WEATHER_CHECKIN = new LocalyticsCheckinAttributes("USER_CLICKED_WEATHER_CHECKIN", 1, "user clicked the weather check-in");
        FAILED_SUBMIT_WEATHER_CHECKIN = new LocalyticsCheckinAttributes("FAILED_SUBMIT_WEATHER_CHECKIN", 2, "failed weather checkin submit");
        USER_SUBMITTED_WEATHER_CHECKIN = new LocalyticsCheckinAttributes("USER_SUBMITTED_WEATHER_CHECKIN", 3, "user submitted weather checkin");
        USER_VIEWED_WEATHER_HISTORY = new LocalyticsCheckinAttributes("USER_VIEWED_WEATHER_HISTORY", 4, "user viewed social weather history");
        ADDED_PHOTOS = new LocalyticsCheckinAttributes("ADDED_PHOTOS", 5, "number of photos taken");
        ADDED_PHOTOS_FAILED_CHECKIN_PATH = new LocalyticsCheckinAttributes("ADDED_PHOTOS_FAILED_CHECKIN_PATH", 6, "photos failed checkin path");
        ADDED_PHOTOS_FAILED = new LocalyticsCheckinAttributes("ADDED_PHOTOS_FAILED", 7, "photos failed");
        $VALUES = (new LocalyticsCheckinAttributes[] {
            PREVIOUS_SCREEN, USER_CLICKED_WEATHER_CHECKIN, FAILED_SUBMIT_WEATHER_CHECKIN, USER_SUBMITTED_WEATHER_CHECKIN, USER_VIEWED_WEATHER_HISTORY, ADDED_PHOTOS, ADDED_PHOTOS_FAILED_CHECKIN_PATH, ADDED_PHOTOS_FAILED
        });
    }
}
