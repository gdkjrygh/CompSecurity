// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute

public final class LocalyticsVideoTags
{
    public static final class VideoCommonTags extends Enum
        implements Attribute
    {

        private static final VideoCommonTags $VALUES[];
        public static final VideoCommonTags PREVIOUS_SCREEN;
        private final String attribute;

        public static VideoCommonTags valueOf(String s)
        {
            return (VideoCommonTags)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoCommonTags, s);
        }

        public static VideoCommonTags[] values()
        {
            return (VideoCommonTags[])$VALUES.clone();
        }

        public String getName()
        {
            return attribute;
        }

        static 
        {
            PREVIOUS_SCREEN = new VideoCommonTags("PREVIOUS_SCREEN", 0, "previous screen");
            $VALUES = (new VideoCommonTags[] {
                PREVIOUS_SCREEN
            });
        }

        private VideoCommonTags(String s, int i, String s1)
        {
            super(s, i);
            attribute = s1;
        }
    }

    public static final class VideoDetailsTagName extends Enum
        implements Attribute
    {

        private static final VideoDetailsTagName $VALUES[];
        public static final VideoDetailsTagName SCROLL_ACTION;
        public static final VideoDetailsTagName TIME_SPENT;
        public static final VideoDetailsTagName VIDEO_CATEGORY_LOCAL;
        public static final VideoDetailsTagName VIDEO_CATEGORY_MUST_SEE;
        public static final VideoDetailsTagName VIDEO_CATEGORY_ON_TV;
        public static final VideoDetailsTagName VIDEO_NUMBER_VIEWED;
        public static final VideoDetailsTagName VIDEO_SCROLL_ACTION;
        public static final VideoDetailsTagName VIDEO_SHARE;
        public static final VideoDetailsTagName VIDEO_SHARE_TITLE;
        public static final VideoDetailsTagName VIDEO_TAPPED;
        private final String attribute;

        public static VideoDetailsTagName valueOf(String s)
        {
            return (VideoDetailsTagName)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoDetailsTagName, s);
        }

        public static VideoDetailsTagName[] values()
        {
            return (VideoDetailsTagName[])$VALUES.clone();
        }

        public String getName()
        {
            return attribute;
        }

        static 
        {
            TIME_SPENT = new VideoDetailsTagName("TIME_SPENT", 0, "time spent");
            SCROLL_ACTION = new VideoDetailsTagName("SCROLL_ACTION", 1, "scroll action");
            VIDEO_TAPPED = new VideoDetailsTagName("VIDEO_TAPPED", 2, "video taped");
            VIDEO_CATEGORY_MUST_SEE = new VideoDetailsTagName("VIDEO_CATEGORY_MUST_SEE", 3, "must see");
            VIDEO_CATEGORY_ON_TV = new VideoDetailsTagName("VIDEO_CATEGORY_ON_TV", 4, "on tv");
            VIDEO_CATEGORY_LOCAL = new VideoDetailsTagName("VIDEO_CATEGORY_LOCAL", 5, "local");
            VIDEO_SHARE_TITLE = new VideoDetailsTagName("VIDEO_SHARE_TITLE", 6, "video name");
            VIDEO_SHARE = new VideoDetailsTagName("VIDEO_SHARE", 7, "video share");
            VIDEO_SCROLL_ACTION = new VideoDetailsTagName("VIDEO_SCROLL_ACTION", 8, "scroll action");
            VIDEO_NUMBER_VIEWED = new VideoDetailsTagName("VIDEO_NUMBER_VIEWED", 9, "number of videos viewed");
            $VALUES = (new VideoDetailsTagName[] {
                TIME_SPENT, SCROLL_ACTION, VIDEO_TAPPED, VIDEO_CATEGORY_MUST_SEE, VIDEO_CATEGORY_ON_TV, VIDEO_CATEGORY_LOCAL, VIDEO_SHARE_TITLE, VIDEO_SHARE, VIDEO_SCROLL_ACTION, VIDEO_NUMBER_VIEWED
            });
        }

        private VideoDetailsTagName(String s, int i, String s1)
        {
            super(s, i);
            attribute = s1;
        }
    }

    public static final class VideoRightNowTagName extends Enum
        implements Attribute
    {

        private static final VideoRightNowTagName $VALUES[];
        public static final VideoRightNowTagName VIDEO_CATEGORY;
        public static final VideoRightNowTagName VIDEO_TAPPED;
        private final String attribute;

        public static VideoRightNowTagName valueOf(String s)
        {
            return (VideoRightNowTagName)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoRightNowTagName, s);
        }

        public static VideoRightNowTagName[] values()
        {
            return (VideoRightNowTagName[])$VALUES.clone();
        }

        public String getName()
        {
            return attribute;
        }

        static 
        {
            VIDEO_TAPPED = new VideoRightNowTagName("VIDEO_TAPPED", 0, "video tapped");
            VIDEO_CATEGORY = new VideoRightNowTagName("VIDEO_CATEGORY", 1, "video category");
            $VALUES = (new VideoRightNowTagName[] {
                VIDEO_TAPPED, VIDEO_CATEGORY
            });
        }

        private VideoRightNowTagName(String s, int i, String s1)
        {
            super(s, i);
            attribute = s1;
        }
    }

    public static final class VideoSummaryTagName extends Enum
        implements Attribute
    {

        private static final VideoSummaryTagName $VALUES[];
        public static final VideoSummaryTagName AD_TIME_SPENT;
        public static final VideoSummaryTagName REASON_FOR_VIDEO_EXIT;
        public static final VideoSummaryTagName TOTAL_TIME_WATCHED_BUCKETED;
        public static final VideoSummaryTagName TOTAL_TIME_WATCHED_RAW;
        public static final VideoSummaryTagName VIDEO_AD_STARTED;
        public static final VideoSummaryTagName VIDEO_AD_TITLE;
        public static final VideoSummaryTagName VIDEO_CATEGORY;
        public static final VideoSummaryTagName VIDEO_COLLECTION;
        public static final VideoSummaryTagName VIDEO_COMPLETED;
        public static final VideoSummaryTagName VIDEO_DMA_LOCALE;
        public static final VideoSummaryTagName VIDEO_EXIT_ERROR_REASON;
        public static final VideoSummaryTagName VIDEO_FULL_SCREEN;
        public static final VideoSummaryTagName VIDEO_ID;
        public static final VideoSummaryTagName VIDEO_LENGTH_BUCKETED;
        public static final VideoSummaryTagName VIDEO_LENGTH_RAW;
        public static final VideoSummaryTagName VIDEO_MILESTONE;
        public static final VideoSummaryTagName VIDEO_PAUSED;
        public static final VideoSummaryTagName VIDEO_PAUSE_COUNT;
        public static final VideoSummaryTagName VIDEO_PLAYER;
        public static final VideoSummaryTagName VIDEO_PLAYLIST;
        public static final VideoSummaryTagName VIDEO_PROVIDER;
        public static final VideoSummaryTagName VIDEO_SHARE;
        public static final VideoSummaryTagName VIDEO_SHARE_TITLE;
        public static final VideoSummaryTagName VIDEO_START_METHOD;
        public static final VideoSummaryTagName VIDEO_STREAM_FAILURE_COUNT;
        public static final VideoSummaryTagName VIDEO_STREAM_FAILURE_VARIANT_NAME;
        public static final VideoSummaryTagName VIDEO_TIME_SPENT_DURING_ADS;
        public static final VideoSummaryTagName VIDEO_TIME_SPENT_OUTSIDE_ADS;
        public static final VideoSummaryTagName VIDEO_TITLE;
        private final String attribute;

        public static VideoSummaryTagName valueOf(String s)
        {
            return (VideoSummaryTagName)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoSummaryTagName, s);
        }

        public static VideoSummaryTagName[] values()
        {
            return (VideoSummaryTagName[])$VALUES.clone();
        }

        public String getName()
        {
            return attribute;
        }

        static 
        {
            VIDEO_FULL_SCREEN = new VideoSummaryTagName("VIDEO_FULL_SCREEN", 0, "viewed fullscreen");
            VIDEO_LENGTH_RAW = new VideoSummaryTagName("VIDEO_LENGTH_RAW", 1, "video length (RAW)");
            VIDEO_ID = new VideoSummaryTagName("VIDEO_ID", 2, "video");
            VIDEO_TITLE = new VideoSummaryTagName("VIDEO_TITLE", 3, "video title");
            VIDEO_LENGTH_BUCKETED = new VideoSummaryTagName("VIDEO_LENGTH_BUCKETED", 4, "video length (Bucketed)");
            VIDEO_START_METHOD = new VideoSummaryTagName("VIDEO_START_METHOD", 5, "video start method");
            VIDEO_COMPLETED = new VideoSummaryTagName("VIDEO_COMPLETED", 6, "video completed");
            VIDEO_PAUSED = new VideoSummaryTagName("VIDEO_PAUSED", 7, "video paused");
            VIDEO_PAUSE_COUNT = new VideoSummaryTagName("VIDEO_PAUSE_COUNT", 8, "video pause count");
            VIDEO_STREAM_FAILURE_COUNT = new VideoSummaryTagName("VIDEO_STREAM_FAILURE_COUNT", 9, "video stream failure count");
            VIDEO_STREAM_FAILURE_VARIANT_NAME = new VideoSummaryTagName("VIDEO_STREAM_FAILURE_VARIANT_NAME", 10, "video stream variant type failed");
            TOTAL_TIME_WATCHED_RAW = new VideoSummaryTagName("TOTAL_TIME_WATCHED_RAW", 11, "total time watched (RAW)");
            TOTAL_TIME_WATCHED_BUCKETED = new VideoSummaryTagName("TOTAL_TIME_WATCHED_BUCKETED", 12, "total time watched (bucketed)");
            VIDEO_MILESTONE = new VideoSummaryTagName("VIDEO_MILESTONE", 13, "video milestone: bucket");
            REASON_FOR_VIDEO_EXIT = new VideoSummaryTagName("REASON_FOR_VIDEO_EXIT", 14, "reason for video exit");
            VIDEO_EXIT_ERROR_REASON = new VideoSummaryTagName("VIDEO_EXIT_ERROR_REASON", 15, "video exit error reason");
            AD_TIME_SPENT = new VideoSummaryTagName("AD_TIME_SPENT", 16, "ad time spent");
            VIDEO_SHARE_TITLE = new VideoSummaryTagName("VIDEO_SHARE_TITLE", 17, "video name");
            VIDEO_SHARE = new VideoSummaryTagName("VIDEO_SHARE", 18, "video share");
            VIDEO_CATEGORY = new VideoSummaryTagName("VIDEO_CATEGORY", 19, "video category");
            VIDEO_TIME_SPENT_DURING_ADS = new VideoSummaryTagName("VIDEO_TIME_SPENT_DURING_ADS", 20, "time spent during ads");
            VIDEO_TIME_SPENT_OUTSIDE_ADS = new VideoSummaryTagName("VIDEO_TIME_SPENT_OUTSIDE_ADS", 21, "time spent outside of ads");
            VIDEO_COLLECTION = new VideoSummaryTagName("VIDEO_COLLECTION", 22, "video collection");
            VIDEO_PLAYLIST = new VideoSummaryTagName("VIDEO_PLAYLIST", 23, "video playlist");
            VIDEO_PLAYER = new VideoSummaryTagName("VIDEO_PLAYER", 24, "video player");
            VIDEO_AD_STARTED = new VideoSummaryTagName("VIDEO_AD_STARTED", 25, "ad started");
            VIDEO_AD_TITLE = new VideoSummaryTagName("VIDEO_AD_TITLE", 26, "ad title");
            VIDEO_PROVIDER = new VideoSummaryTagName("VIDEO_PROVIDER", 27, "video provider");
            VIDEO_DMA_LOCALE = new VideoSummaryTagName("VIDEO_DMA_LOCALE", 28, "DMA locale");
            $VALUES = (new VideoSummaryTagName[] {
                VIDEO_FULL_SCREEN, VIDEO_LENGTH_RAW, VIDEO_ID, VIDEO_TITLE, VIDEO_LENGTH_BUCKETED, VIDEO_START_METHOD, VIDEO_COMPLETED, VIDEO_PAUSED, VIDEO_PAUSE_COUNT, VIDEO_STREAM_FAILURE_COUNT, 
                VIDEO_STREAM_FAILURE_VARIANT_NAME, TOTAL_TIME_WATCHED_RAW, TOTAL_TIME_WATCHED_BUCKETED, VIDEO_MILESTONE, REASON_FOR_VIDEO_EXIT, VIDEO_EXIT_ERROR_REASON, AD_TIME_SPENT, VIDEO_SHARE_TITLE, VIDEO_SHARE, VIDEO_CATEGORY, 
                VIDEO_TIME_SPENT_DURING_ADS, VIDEO_TIME_SPENT_OUTSIDE_ADS, VIDEO_COLLECTION, VIDEO_PLAYLIST, VIDEO_PLAYER, VIDEO_AD_STARTED, VIDEO_AD_TITLE, VIDEO_PROVIDER, VIDEO_DMA_LOCALE
            });
        }

        private VideoSummaryTagName(String s, int i, String s1)
        {
            super(s, i);
            attribute = s1;
        }
    }


    private LocalyticsVideoTags()
    {
    }
}
