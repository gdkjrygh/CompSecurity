// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsFeedButton extends Enum
    implements Attribute
{

    private static final LocalyticsFeedButton $VALUES[];
    public static final LocalyticsFeedButton ALLERGY;
    public static final LocalyticsFeedButton BACK_TO_TOP;
    public static final LocalyticsFeedButton BREAKING_NEWS_ARTICLE;
    public static final LocalyticsFeedButton COIN;
    public static final LocalyticsFeedButton COLD_AND_FLU;
    public static final LocalyticsFeedButton EXTENDED_FORECAST;
    public static final LocalyticsFeedButton FAVORITE_THINGS;
    public static final LocalyticsFeedButton HOURLY_MORE;
    public static final LocalyticsFeedButton HURRICANE_CENTRAL;
    public static final LocalyticsFeedButton MENU;
    public static final LocalyticsFeedButton NEWS_ARTICLE;
    public static final LocalyticsFeedButton PLUS;
    public static final LocalyticsFeedButton RADAR_MORE;
    public static final LocalyticsFeedButton RIGHT_NOW_VIDEO;
    public static final LocalyticsFeedButton ROAD_CONDITIONS;
    public static final LocalyticsFeedButton SESSION_M;
    public static final LocalyticsFeedButton SOCIAL_CHECKIN;
    public static final LocalyticsFeedButton SOCIAL_CHECKMARK;
    public static final LocalyticsFeedButton SOCIAL_PHOTO;
    public static final LocalyticsFeedButton VIDEO;
    public static final LocalyticsFeedButton WEEKEND_FORECAST;
    private final String attributeName;

    private LocalyticsFeedButton(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static LocalyticsFeedButton valueOf(String s)
    {
        return (LocalyticsFeedButton)Enum.valueOf(com/weather/commons/analytics/feed/LocalyticsFeedButton, s);
    }

    public static LocalyticsFeedButton[] values()
    {
        return (LocalyticsFeedButton[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        SESSION_M = new LocalyticsFeedButton("SESSION_M", 0, "touched sessionm");
        PLUS = new LocalyticsFeedButton("PLUS", 1, "touched plus button");
        MENU = new LocalyticsFeedButton("MENU", 2, "touched menu button");
        SOCIAL_CHECKMARK = new LocalyticsFeedButton("SOCIAL_CHECKMARK", 3, "touched social checkmark");
        COIN = new LocalyticsFeedButton("COIN", 4, "touched coin");
        BACK_TO_TOP = new LocalyticsFeedButton("BACK_TO_TOP", 5, "tapped back to top");
        RIGHT_NOW_VIDEO = new LocalyticsFeedButton("RIGHT_NOW_VIDEO", 6, "tapped right now video");
        HOURLY_MORE = new LocalyticsFeedButton("HOURLY_MORE", 7, "touched 'more' on hourly");
        EXTENDED_FORECAST = new LocalyticsFeedButton("EXTENDED_FORECAST", 8, "touched extended forecast");
        WEEKEND_FORECAST = new LocalyticsFeedButton("WEEKEND_FORECAST", 9, "touched weekend forecast");
        RADAR_MORE = new LocalyticsFeedButton("RADAR_MORE", 10, "touched 'more' on radar");
        ROAD_CONDITIONS = new LocalyticsFeedButton("ROAD_CONDITIONS", 11, "touched road conditions");
        SOCIAL_CHECKIN = new LocalyticsFeedButton("SOCIAL_CHECKIN", 12, "touched weather checkin");
        SOCIAL_PHOTO = new LocalyticsFeedButton("SOCIAL_PHOTO", 13, "touched photo checkin");
        NEWS_ARTICLE = new LocalyticsFeedButton("NEWS_ARTICLE", 14, "touched a news article");
        BREAKING_NEWS_ARTICLE = new LocalyticsFeedButton("BREAKING_NEWS_ARTICLE", 15, "touched a breaking news article");
        FAVORITE_THINGS = new LocalyticsFeedButton("FAVORITE_THINGS", 16, "touched our favorite things item");
        VIDEO = new LocalyticsFeedButton("VIDEO", 17, "touched video");
        HURRICANE_CENTRAL = new LocalyticsFeedButton("HURRICANE_CENTRAL", 18, "touched hurricane central");
        ALLERGY = new LocalyticsFeedButton("ALLERGY", 19, "clicked allergy");
        COLD_AND_FLU = new LocalyticsFeedButton("COLD_AND_FLU", 20, "clicked cold & flu");
        $VALUES = (new LocalyticsFeedButton[] {
            SESSION_M, PLUS, MENU, SOCIAL_CHECKMARK, COIN, BACK_TO_TOP, RIGHT_NOW_VIDEO, HOURLY_MORE, EXTENDED_FORECAST, WEEKEND_FORECAST, 
            RADAR_MORE, ROAD_CONDITIONS, SOCIAL_CHECKIN, SOCIAL_PHOTO, NEWS_ARTICLE, BREAKING_NEWS_ARTICLE, FAVORITE_THINGS, VIDEO, HURRICANE_CENTRAL, ALLERGY, 
            COLD_AND_FLU
        });
    }
}
