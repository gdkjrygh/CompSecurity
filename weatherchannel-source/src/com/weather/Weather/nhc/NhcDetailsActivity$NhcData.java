// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.nhc;

import com.weather.commons.analytics.LocalyticsEvent;

// Referenced classes of package com.weather.Weather.nhc:
//            NhcDetailsActivity

public static final class showEvent extends Enum
{

    private static final DISCUSSION_DETAILS $VALUES[];
    public static final DISCUSSION_DETAILS DISCUSSION_DETAILS;
    public static final DISCUSSION_DETAILS PUBLIC_ADVISORY;
    private final com.weather.commons.analytics.SION_DETAILS screenName;
    private final LocalyticsEvent showEvent;

    public static showEvent valueOf(String s)
    {
        return (showEvent)Enum.valueOf(com/weather/Weather/nhc/NhcDetailsActivity$NhcData, s);
    }

    public static showEvent[] values()
    {
        return (showEvent[])$VALUES.clone();
    }

    com.weather.commons.analytics.ne getScreenName()
    {
        return screenName;
    }

    LocalyticsEvent getShowEvent()
    {
        return showEvent;
    }

    static 
    {
        PUBLIC_ADVISORY = new <init>("PUBLIC_ADVISORY", 0, com.weather.commons.analytics.UBLIC_ADVISORY, LocalyticsEvent.HC_PUBLIC_ADVISORY);
        DISCUSSION_DETAILS = new <init>("DISCUSSION_DETAILS", 1, com.weather.commons.analytics.ROPICAL_DISCUSSION, LocalyticsEvent.HC_TROPICAL_DISCUSSION);
        $VALUES = (new .VALUES[] {
            PUBLIC_ADVISORY, DISCUSSION_DETAILS
        });
    }

    private Name(String s, int i, com.weather.commons.analytics. , LocalyticsEvent localyticsevent)
    {
        super(s, i);
        screenName = ;
        showEvent = localyticsevent;
    }
}
