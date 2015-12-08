// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


public class LocalyticsAttributeValues
{
    public static final class AttributeValue extends Enum
    {

        private static final AttributeValue $VALUES[];
        public static final AttributeValue BOOLEAN_NO;
        public static final AttributeValue BOOLEAN_YES;
        public static final AttributeValue NOT_AVAILABLE;
        public static final AttributeValue NOT_DISPLAYED;
        public static final AttributeValue OFF;
        public static final AttributeValue ON;
        public static final AttributeValue PREVIOUS_SCREEN_MAIN_FEED;
        public static final AttributeValue PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP;
        public static final AttributeValue PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP;
        public static final AttributeValue PREVIOUS_SCREEN_VIDEO_PAGE;
        public static final AttributeValue REASONS_FOR_EXIT_ERROR_ENCOUNTERED;
        public static final AttributeValue REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO;
        public static final AttributeValue REASONS_FOR_EXIT_USER_EXITED;
        public static final AttributeValue REASONS_FOR_EXIT_USER_EXITED_DURING_AD;
        public static final AttributeValue REASONS_FOR_EXIT_VIDEO_COMPLETED;
        public static final AttributeValue VIDEO_START_METHOD_AUTO;
        public static final AttributeValue VIDEO_START_METHOD_DEEP_LINK;
        public static final AttributeValue VIDEO_START_METHOD_DETAIL_CLICK;
        public static final AttributeValue VIDEO_START_METHOD_FAILURE_RETRY;
        public static final AttributeValue VIDEO_START_METHOD_MODULE_CLICK;
        public static final AttributeValue VIDEO_START_METHOD_RESUMED;
        private final String attributeValue;

        public static AttributeValue getYesNo(boolean flag)
        {
            if (flag)
            {
                return BOOLEAN_YES;
            } else
            {
                return BOOLEAN_NO;
            }
        }

        public static AttributeValue valueOf(String s)
        {
            return (AttributeValue)Enum.valueOf(com/weather/commons/analytics/LocalyticsAttributeValues$AttributeValue, s);
        }

        public static AttributeValue[] values()
        {
            return (AttributeValue[])$VALUES.clone();
        }

        public String getAttributeValue()
        {
            return attributeValue;
        }

        static 
        {
            PREVIOUS_SCREEN_MAIN_FEED = new AttributeValue("PREVIOUS_SCREEN_MAIN_FEED", 0, "main feed");
            PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP = new AttributeValue("PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP", 1, "videodrivers 3up");
            PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP = new AttributeValue("PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP", 2, "videodrivers 4up");
            PREVIOUS_SCREEN_VIDEO_PAGE = new AttributeValue("PREVIOUS_SCREEN_VIDEO_PAGE", 3, "video page");
            VIDEO_START_METHOD_AUTO = new AttributeValue("VIDEO_START_METHOD_AUTO", 4, "auto");
            VIDEO_START_METHOD_RESUMED = new AttributeValue("VIDEO_START_METHOD_RESUMED", 5, "resumed");
            VIDEO_START_METHOD_DETAIL_CLICK = new AttributeValue("VIDEO_START_METHOD_DETAIL_CLICK", 6, "detail video click");
            VIDEO_START_METHOD_MODULE_CLICK = new AttributeValue("VIDEO_START_METHOD_MODULE_CLICK", 7, "module video click");
            VIDEO_START_METHOD_DEEP_LINK = new AttributeValue("VIDEO_START_METHOD_DEEP_LINK", 8, "deep link");
            VIDEO_START_METHOD_FAILURE_RETRY = new AttributeValue("VIDEO_START_METHOD_FAILURE_RETRY", 9, "retry failed video click");
            REASONS_FOR_EXIT_USER_EXITED = new AttributeValue("REASONS_FOR_EXIT_USER_EXITED", 10, "user exited");
            REASONS_FOR_EXIT_VIDEO_COMPLETED = new AttributeValue("REASONS_FOR_EXIT_VIDEO_COMPLETED", 11, "video completed");
            REASONS_FOR_EXIT_ERROR_ENCOUNTERED = new AttributeValue("REASONS_FOR_EXIT_ERROR_ENCOUNTERED", 12, "error encountered");
            REASONS_FOR_EXIT_USER_EXITED_DURING_AD = new AttributeValue("REASONS_FOR_EXIT_USER_EXITED_DURING_AD", 13, "user exited during ad");
            REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO = new AttributeValue("REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO", 14, "user clicked another video");
            NOT_AVAILABLE = new AttributeValue("NOT_AVAILABLE", 15, "not available");
            BOOLEAN_YES = new AttributeValue("BOOLEAN_YES", 16, "Yes");
            BOOLEAN_NO = new AttributeValue("BOOLEAN_NO", 17, "No");
            ON = new AttributeValue("ON", 18, "On");
            OFF = new AttributeValue("OFF", 19, "Off");
            NOT_DISPLAYED = new AttributeValue("NOT_DISPLAYED", 20, "Not Displayed");
            $VALUES = (new AttributeValue[] {
                PREVIOUS_SCREEN_MAIN_FEED, PREVIOUS_SCREEN_VIDEO_DRIVERS_3UP, PREVIOUS_SCREEN_VIDEO_DRIVERS_4UP, PREVIOUS_SCREEN_VIDEO_PAGE, VIDEO_START_METHOD_AUTO, VIDEO_START_METHOD_RESUMED, VIDEO_START_METHOD_DETAIL_CLICK, VIDEO_START_METHOD_MODULE_CLICK, VIDEO_START_METHOD_DEEP_LINK, VIDEO_START_METHOD_FAILURE_RETRY, 
                REASONS_FOR_EXIT_USER_EXITED, REASONS_FOR_EXIT_VIDEO_COMPLETED, REASONS_FOR_EXIT_ERROR_ENCOUNTERED, REASONS_FOR_EXIT_USER_EXITED_DURING_AD, REASONS_FOR_EXIT_USER_CLICKED_ANOTHER_VIDEO, NOT_AVAILABLE, BOOLEAN_YES, BOOLEAN_NO, ON, OFF, 
                NOT_DISPLAYED
            });
        }

        private AttributeValue(String s, int i, String s1)
        {
            super(s, i);
            attributeValue = s1;
        }
    }

    public static final class LocationType extends Enum
    {

        private static final LocationType $VALUES[];
        public static final LocationType FIXED;
        public static final LocationType FOLLOW_ME;
        private final String attributeValue;

        public static LocationType valueOf(String s)
        {
            return (LocationType)Enum.valueOf(com/weather/commons/analytics/LocalyticsAttributeValues$LocationType, s);
        }

        public static LocationType[] values()
        {
            return (LocationType[])$VALUES.clone();
        }

        public String getAttributeValue()
        {
            return attributeValue;
        }

        static 
        {
            FOLLOW_ME = new LocationType("FOLLOW_ME", 0, "follow me location");
            FIXED = new LocationType("FIXED", 1, "fixed location");
            $VALUES = (new LocationType[] {
                FOLLOW_ME, FIXED
            });
        }

        private LocationType(String s, int i, String s1)
        {
            super(s, i);
            attributeValue = s1;
        }
    }

    public static final class VideoCategory extends Enum
    {

        private static final VideoCategory $VALUES[];
        public static final VideoCategory LOCAL;
        public static final VideoCategory MUST_SEE;
        public static final VideoCategory ON_TV;
        private final String videoCategory;

        public static VideoCategory valueOf(String s)
        {
            return (VideoCategory)Enum.valueOf(com/weather/commons/analytics/LocalyticsAttributeValues$VideoCategory, s);
        }

        public static VideoCategory[] values()
        {
            return (VideoCategory[])$VALUES.clone();
        }

        public String getAttributeValue()
        {
            return videoCategory;
        }

        static 
        {
            LOCAL = new VideoCategory("LOCAL", 0, "local");
            ON_TV = new VideoCategory("ON_TV", 1, "on tv");
            MUST_SEE = new VideoCategory("MUST_SEE", 2, "must see");
            $VALUES = (new VideoCategory[] {
                LOCAL, ON_TV, MUST_SEE
            });
        }

        private VideoCategory(String s, int i, String s1)
        {
            super(s, i);
            videoCategory = s1;
        }
    }


    public LocalyticsAttributeValues()
    {
    }
}
