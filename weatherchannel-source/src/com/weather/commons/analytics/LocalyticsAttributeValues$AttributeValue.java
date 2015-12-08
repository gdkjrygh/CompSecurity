// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsAttributeValues

public static final class attributeValue extends Enum
{

    private static final NOT_DISPLAYED $VALUES[];
    public static final NOT_DISPLAYED BOOLEAN_NO;
    public static final NOT_DISPLAYED BOOLEAN_YES;
    public static final NOT_DISPLAYED NOT_AVAILABLE;
    public static final NOT_DISPLAYED NOT_DISPLAYED;
    public static final NOT_DISPLAYED OFF;
    public static final NOT_DISPLAYED ON;
    public static final NOT_DISPLAYED PREVIOUS_SCREEN_MAIN_FEED;
    public static final NOT_DISPLAYED PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP;
    public static final NOT_DISPLAYED PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP;
    public static final NOT_DISPLAYED PREVIOUS_SCREEN_VIDEO_PAGE;
    public static final NOT_DISPLAYED REASONS_FOR_EXIT_ERROR_ENCOUNTERED;
    public static final NOT_DISPLAYED REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO;
    public static final NOT_DISPLAYED REASONS_FOR_EXIT_USER_EXITED;
    public static final NOT_DISPLAYED REASONS_FOR_EXIT_USER_EXITED_DURING_AD;
    public static final NOT_DISPLAYED REASONS_FOR_EXIT_VIDEO_COMPLETED;
    public static final NOT_DISPLAYED VIDEO_START_METHOD_AUTO;
    public static final NOT_DISPLAYED VIDEO_START_METHOD_DEEP_LINK;
    public static final NOT_DISPLAYED VIDEO_START_METHOD_DETAIL_CLICK;
    public static final NOT_DISPLAYED VIDEO_START_METHOD_FAILURE_RETRY;
    public static final NOT_DISPLAYED VIDEO_START_METHOD_MODULE_CLICK;
    public static final NOT_DISPLAYED VIDEO_START_METHOD_RESUMED;
    private final String attributeValue;

    public static attributeValue getYesNo(boolean flag)
    {
        if (flag)
        {
            return BOOLEAN_YES;
        } else
        {
            return BOOLEAN_NO;
        }
    }

    public static BOOLEAN_NO valueOf(String s)
    {
        return (BOOLEAN_NO)Enum.valueOf(com/weather/commons/analytics/LocalyticsAttributeValues$AttributeValue, s);
    }

    public static BOOLEAN_NO[] values()
    {
        return (BOOLEAN_NO[])$VALUES.clone();
    }

    public String getAttributeValue()
    {
        return attributeValue;
    }

    static 
    {
        PREVIOUS_SCREEN_MAIN_FEED = new <init>("PREVIOUS_SCREEN_MAIN_FEED", 0, "main feed");
        PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP = new <init>("PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP", 1, "videodrivers 3up");
        PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP = new <init>("PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP", 2, "videodrivers 4up");
        PREVIOUS_SCREEN_VIDEO_PAGE = new <init>("PREVIOUS_SCREEN_VIDEO_PAGE", 3, "video page");
        VIDEO_START_METHOD_AUTO = new <init>("VIDEO_START_METHOD_AUTO", 4, "auto");
        VIDEO_START_METHOD_RESUMED = new <init>("VIDEO_START_METHOD_RESUMED", 5, "resumed");
        VIDEO_START_METHOD_DETAIL_CLICK = new <init>("VIDEO_START_METHOD_DETAIL_CLICK", 6, "detail video click");
        VIDEO_START_METHOD_MODULE_CLICK = new <init>("VIDEO_START_METHOD_MODULE_CLICK", 7, "module video click");
        VIDEO_START_METHOD_DEEP_LINK = new <init>("VIDEO_START_METHOD_DEEP_LINK", 8, "deep link");
        VIDEO_START_METHOD_FAILURE_RETRY = new <init>("VIDEO_START_METHOD_FAILURE_RETRY", 9, "retry failed video click");
        REASONS_FOR_EXIT_USER_EXITED = new <init>("REASONS_FOR_EXIT_USER_EXITED", 10, "user exited");
        REASONS_FOR_EXIT_VIDEO_COMPLETED = new <init>("REASONS_FOR_EXIT_VIDEO_COMPLETED", 11, "video completed");
        REASONS_FOR_EXIT_ERROR_ENCOUNTERED = new <init>("REASONS_FOR_EXIT_ERROR_ENCOUNTERED", 12, "error encountered");
        REASONS_FOR_EXIT_USER_EXITED_DURING_AD = new <init>("REASONS_FOR_EXIT_USER_EXITED_DURING_AD", 13, "user exited during ad");
        REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO = new <init>("REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO", 14, "user clicked another video");
        NOT_AVAILABLE = new <init>("NOT_AVAILABLE", 15, "not available");
        BOOLEAN_YES = new <init>("BOOLEAN_YES", 16, "Yes");
        BOOLEAN_NO = new <init>("BOOLEAN_NO", 17, "No");
        ON = new <init>("ON", 18, "On");
        OFF = new <init>("OFF", 19, "Off");
        NOT_DISPLAYED = new <init>("NOT_DISPLAYED", 20, "Not Displayed");
        $VALUES = (new .VALUES[] {
            PREVIOUS_SCREEN_MAIN_FEED, PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP, PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP, PREVIOUS_SCREEN_VIDEO_PAGE, VIDEO_START_METHOD_AUTO, VIDEO_START_METHOD_RESUMED, VIDEO_START_METHOD_DETAIL_CLICK, VIDEO_START_METHOD_MODULE_CLICK, VIDEO_START_METHOD_DEEP_LINK, VIDEO_START_METHOD_FAILURE_RETRY, 
            REASONS_FOR_EXIT_USER_EXITED, REASONS_FOR_EXIT_VIDEO_COMPLETED, REASONS_FOR_EXIT_ERROR_ENCOUNTERED, REASONS_FOR_EXIT_USER_EXITED_DURING_AD, REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO, NOT_AVAILABLE, BOOLEAN_YES, BOOLEAN_NO, ON, OFF, 
            NOT_DISPLAYED
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attributeValue = s1;
    }
}
