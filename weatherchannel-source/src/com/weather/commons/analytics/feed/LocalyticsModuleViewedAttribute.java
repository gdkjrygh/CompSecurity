// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsModuleViewedAttribute extends Enum
    implements Attribute
{

    private static final LocalyticsModuleViewedAttribute $VALUES[];
    public static final LocalyticsModuleViewedAttribute AIRPORT;
    public static final LocalyticsModuleViewedAttribute BOAT_AND_BEACH;
    public static final LocalyticsModuleViewedAttribute BREAKING_NEWS;
    public static final LocalyticsModuleViewedAttribute FAVORITE_THINGS;
    public static final LocalyticsModuleViewedAttribute FLU;
    public static final LocalyticsModuleViewedAttribute HEALTH;
    public static final LocalyticsModuleViewedAttribute HOURLY;
    public static final LocalyticsModuleViewedAttribute HURRICANE;
    public static final LocalyticsModuleViewedAttribute MAP;
    public static final LocalyticsModuleViewedAttribute NEWS;
    public static final LocalyticsModuleViewedAttribute POLLEN;
    public static final LocalyticsModuleViewedAttribute RIGHT_NOW;
    public static final LocalyticsModuleViewedAttribute SKI;
    public static final LocalyticsModuleViewedAttribute SOCIAL;
    public static final LocalyticsModuleViewedAttribute TEN_DAY;
    public static final LocalyticsModuleViewedAttribute VIDEO;
    private final String attributeName;

    private LocalyticsModuleViewedAttribute(String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }

    public static LocalyticsModuleViewedAttribute valueOf(String s)
    {
        return (LocalyticsModuleViewedAttribute)Enum.valueOf(com/weather/commons/analytics/feed/LocalyticsModuleViewedAttribute, s);
    }

    public static LocalyticsModuleViewedAttribute[] values()
    {
        return (LocalyticsModuleViewedAttribute[])$VALUES.clone();
    }

    public String getName()
    {
        return attributeName;
    }

    static 
    {
        RIGHT_NOW = new LocalyticsModuleViewedAttribute("RIGHT_NOW", 0, "viewed right now module");
        HOURLY = new LocalyticsModuleViewedAttribute("HOURLY", 1, "viewed hourly module");
        TEN_DAY = new LocalyticsModuleViewedAttribute("TEN_DAY", 2, "viewed 10 day module");
        VIDEO = new LocalyticsModuleViewedAttribute("VIDEO", 3, "viewed video module");
        MAP = new LocalyticsModuleViewedAttribute("MAP", 4, "viewed radar module");
        SOCIAL = new LocalyticsModuleViewedAttribute("SOCIAL", 5, "viewed social module");
        NEWS = new LocalyticsModuleViewedAttribute("NEWS", 6, "viewed news module");
        BREAKING_NEWS = new LocalyticsModuleViewedAttribute("BREAKING_NEWS", 7, "viewed breaking news module");
        FLU = new LocalyticsModuleViewedAttribute("FLU", 8, "viewed flu module");
        FAVORITE_THINGS = new LocalyticsModuleViewedAttribute("FAVORITE_THINGS", 9, "viewed favorite things module");
        AIRPORT = new LocalyticsModuleViewedAttribute("AIRPORT", 10, "viewed airport conditions");
        POLLEN = new LocalyticsModuleViewedAttribute("POLLEN", 11, "viewed pollen index");
        BOAT_AND_BEACH = new LocalyticsModuleViewedAttribute("BOAT_AND_BEACH", 12, "viewed boat and beach");
        SKI = new LocalyticsModuleViewedAttribute("SKI", 13, "viewed ski conditions");
        HURRICANE = new LocalyticsModuleViewedAttribute("HURRICANE", 14, "viewed hurricane module");
        HEALTH = new LocalyticsModuleViewedAttribute("HEALTH", 15, "viewed health module");
        $VALUES = (new LocalyticsModuleViewedAttribute[] {
            RIGHT_NOW, HOURLY, TEN_DAY, VIDEO, MAP, SOCIAL, NEWS, BREAKING_NEWS, FLU, FAVORITE_THINGS, 
            AIRPORT, POLLEN, BOAT_AND_BEACH, SKI, HURRICANE, HEALTH
        });
    }
}
