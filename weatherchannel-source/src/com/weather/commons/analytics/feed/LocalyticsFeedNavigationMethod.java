// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;


public final class LocalyticsFeedNavigationMethod extends Enum
{

    private static final LocalyticsFeedNavigationMethod $VALUES[];
    public static final LocalyticsFeedNavigationMethod FOLLOW_ME;
    public static final LocalyticsFeedNavigationMethod LOCATION_LIST;
    public static final LocalyticsFeedNavigationMethod LOCATION_MANAGER;
    public static final LocalyticsFeedNavigationMethod SEARCH;
    private final String attributeValue;

    private LocalyticsFeedNavigationMethod(String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }

    public static LocalyticsFeedNavigationMethod valueOf(String s)
    {
        return (LocalyticsFeedNavigationMethod)Enum.valueOf(com/weather/commons/analytics/feed/LocalyticsFeedNavigationMethod, s);
    }

    public static LocalyticsFeedNavigationMethod[] values()
    {
        return (LocalyticsFeedNavigationMethod[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        LOCATION_MANAGER = new LocalyticsFeedNavigationMethod("LOCATION_MANAGER", 0, "manage locations");
        SEARCH = new LocalyticsFeedNavigationMethod("SEARCH", 1, "search");
        FOLLOW_ME = new LocalyticsFeedNavigationMethod("FOLLOW_ME", 2, "follow me");
        LOCATION_LIST = new LocalyticsFeedNavigationMethod("LOCATION_LIST", 3, "location list");
        $VALUES = (new LocalyticsFeedNavigationMethod[] {
            LOCATION_MANAGER, SEARCH, FOLLOW_ME, LOCATION_LIST
        });
    }
}
