// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.session;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsSessionAttribute extends Enum
    implements Attribute
{

    private static final LocalyticsSessionAttribute $VALUES[];
    public static final LocalyticsSessionAttribute LOCATIONS_VIEWED;
    public static final LocalyticsSessionAttribute MAP_LAYERS_VIEWED;
    public static final LocalyticsSessionAttribute MODULES_VIEWED;
    public static final LocalyticsSessionAttribute NEWS_ARTICLES_VIEWED;
    public static final LocalyticsSessionAttribute SOCIAL_CHECKIN_SUBMITTED;
    public static final LocalyticsSessionAttribute SOCIAL_PHOTO_SUBMITTED;
    public static final LocalyticsSessionAttribute VIDEOS_WATCHED;
    private final String attributeName;

    private LocalyticsSessionAttribute(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static LocalyticsSessionAttribute valueOf(String s)
    {
        return (LocalyticsSessionAttribute)Enum.valueOf(com/weather/commons/analytics/session/LocalyticsSessionAttribute, s);
    }

    public static LocalyticsSessionAttribute[] values()
    {
        return (LocalyticsSessionAttribute[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        LOCATIONS_VIEWED = new LocalyticsSessionAttribute("LOCATIONS_VIEWED", 0, "locations viewed");
        VIDEOS_WATCHED = new LocalyticsSessionAttribute("VIDEOS_WATCHED", 1, "videos watched");
        MAP_LAYERS_VIEWED = new LocalyticsSessionAttribute("MAP_LAYERS_VIEWED", 2, "map layers viewed");
        MODULES_VIEWED = new LocalyticsSessionAttribute("MODULES_VIEWED", 3, "number of modules viewed");
        NEWS_ARTICLES_VIEWED = new LocalyticsSessionAttribute("NEWS_ARTICLES_VIEWED", 4, "news articles read");
        SOCIAL_CHECKIN_SUBMITTED = new LocalyticsSessionAttribute("SOCIAL_CHECKIN_SUBMITTED", 5, "submitted social weather checkin");
        SOCIAL_PHOTO_SUBMITTED = new LocalyticsSessionAttribute("SOCIAL_PHOTO_SUBMITTED", 6, "submitted social weather photo");
        $VALUES = (new LocalyticsSessionAttribute[] {
            LOCATIONS_VIEWED, VIDEOS_WATCHED, MAP_LAYERS_VIEWED, MODULES_VIEWED, NEWS_ARTICLES_VIEWED, SOCIAL_CHECKIN_SUBMITTED, SOCIAL_PHOTO_SUBMITTED
        });
    }
}
