// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;


// Referenced classes of package com.weather.commons.analytics:
//            Attribute, LocalyticsVideoTags

public static final class attribute extends Enum
    implements Attribute
{

    private static final VIDEO_DMA_LOCALE $VALUES[];
    public static final VIDEO_DMA_LOCALE AD_TIME_SPENT;
    public static final VIDEO_DMA_LOCALE REASON_FOR_VIDEO_EXIT;
    public static final VIDEO_DMA_LOCALE TOTAL_TIME_WATCHED_BUCKETED;
    public static final VIDEO_DMA_LOCALE TOTAL_TIME_WATCHED_RAW;
    public static final VIDEO_DMA_LOCALE VIDEO_AD_STARTED;
    public static final VIDEO_DMA_LOCALE VIDEO_AD_TITLE;
    public static final VIDEO_DMA_LOCALE VIDEO_CATEGORY;
    public static final VIDEO_DMA_LOCALE VIDEO_COLLECTION;
    public static final VIDEO_DMA_LOCALE VIDEO_COMPLETED;
    public static final VIDEO_DMA_LOCALE VIDEO_DMA_LOCALE;
    public static final VIDEO_DMA_LOCALE VIDEO_EXIT_ERROR_REASON;
    public static final VIDEO_DMA_LOCALE VIDEO_FULL_SCREEN;
    public static final VIDEO_DMA_LOCALE VIDEO_ID;
    public static final VIDEO_DMA_LOCALE VIDEO_LENGTH_BUCKETED;
    public static final VIDEO_DMA_LOCALE VIDEO_LENGTH_RAW;
    public static final VIDEO_DMA_LOCALE VIDEO_MILESTONE;
    public static final VIDEO_DMA_LOCALE VIDEO_PAUSED;
    public static final VIDEO_DMA_LOCALE VIDEO_PAUSE_COUNT;
    public static final VIDEO_DMA_LOCALE VIDEO_PLAYER;
    public static final VIDEO_DMA_LOCALE VIDEO_PLAYLIST;
    public static final VIDEO_DMA_LOCALE VIDEO_PROVIDER;
    public static final VIDEO_DMA_LOCALE VIDEO_SHARE;
    public static final VIDEO_DMA_LOCALE VIDEO_SHARE_TITLE;
    public static final VIDEO_DMA_LOCALE VIDEO_START_METHOD;
    public static final VIDEO_DMA_LOCALE VIDEO_STREAM_FAILURE_COUNT;
    public static final VIDEO_DMA_LOCALE VIDEO_STREAM_FAILURE_VARIANT_NAME;
    public static final VIDEO_DMA_LOCALE VIDEO_TIME_SPENT_DURING_ADS;
    public static final VIDEO_DMA_LOCALE VIDEO_TIME_SPENT_OUTSIDE_ADS;
    public static final VIDEO_DMA_LOCALE VIDEO_TITLE;
    private final String attribute;

    public static attribute valueOf(String s)
    {
        return (attribute)Enum.valueOf(com/weather/commons/analytics/LocalyticsVideoTags$VideoSummaryTagName, s);
    }

    public static attribute[] values()
    {
        return (attribute[])$VALUES.clone();
    }

    public String getName()
    {
        return attribute;
    }

    static 
    {
        VIDEO_FULL_SCREEN = new <init>("VIDEO_FULL_SCREEN", 0, "viewed fullscreen");
        VIDEO_LENGTH_RAW = new <init>("VIDEO_LENGTH_RAW", 1, "video length (RAW)");
        VIDEO_ID = new <init>("VIDEO_ID", 2, "video");
        VIDEO_TITLE = new <init>("VIDEO_TITLE", 3, "video title");
        VIDEO_LENGTH_BUCKETED = new <init>("VIDEO_LENGTH_BUCKETED", 4, "video length (Bucketed)");
        VIDEO_START_METHOD = new <init>("VIDEO_START_METHOD", 5, "video start method");
        VIDEO_COMPLETED = new <init>("VIDEO_COMPLETED", 6, "video completed");
        VIDEO_PAUSED = new <init>("VIDEO_PAUSED", 7, "video paused");
        VIDEO_PAUSE_COUNT = new <init>("VIDEO_PAUSE_COUNT", 8, "video pause count");
        VIDEO_STREAM_FAILURE_COUNT = new <init>("VIDEO_STREAM_FAILURE_COUNT", 9, "video stream failure count");
        VIDEO_STREAM_FAILURE_VARIANT_NAME = new <init>("VIDEO_STREAM_FAILURE_VARIANT_NAME", 10, "video stream variant type failed");
        TOTAL_TIME_WATCHED_RAW = new <init>("TOTAL_TIME_WATCHED_RAW", 11, "total time watched (RAW)");
        TOTAL_TIME_WATCHED_BUCKETED = new <init>("TOTAL_TIME_WATCHED_BUCKETED", 12, "total time watched (bucketed)");
        VIDEO_MILESTONE = new <init>("VIDEO_MILESTONE", 13, "video milestone: bucket");
        REASON_FOR_VIDEO_EXIT = new <init>("REASON_FOR_VIDEO_EXIT", 14, "reason for video exit");
        VIDEO_EXIT_ERROR_REASON = new <init>("VIDEO_EXIT_ERROR_REASON", 15, "video exit error reason");
        AD_TIME_SPENT = new <init>("AD_TIME_SPENT", 16, "ad time spent");
        VIDEO_SHARE_TITLE = new <init>("VIDEO_SHARE_TITLE", 17, "video name");
        VIDEO_SHARE = new <init>("VIDEO_SHARE", 18, "video share");
        VIDEO_CATEGORY = new <init>("VIDEO_CATEGORY", 19, "video category");
        VIDEO_TIME_SPENT_DURING_ADS = new <init>("VIDEO_TIME_SPENT_DURING_ADS", 20, "time spent during ads");
        VIDEO_TIME_SPENT_OUTSIDE_ADS = new <init>("VIDEO_TIME_SPENT_OUTSIDE_ADS", 21, "time spent outside of ads");
        VIDEO_COLLECTION = new <init>("VIDEO_COLLECTION", 22, "video collection");
        VIDEO_PLAYLIST = new <init>("VIDEO_PLAYLIST", 23, "video playlist");
        VIDEO_PLAYER = new <init>("VIDEO_PLAYER", 24, "video player");
        VIDEO_AD_STARTED = new <init>("VIDEO_AD_STARTED", 25, "ad started");
        VIDEO_AD_TITLE = new <init>("VIDEO_AD_TITLE", 26, "ad title");
        VIDEO_PROVIDER = new <init>("VIDEO_PROVIDER", 27, "video provider");
        VIDEO_DMA_LOCALE = new <init>("VIDEO_DMA_LOCALE", 28, "DMA locale");
        $VALUES = (new .VALUES[] {
            VIDEO_FULL_SCREEN, VIDEO_LENGTH_RAW, VIDEO_ID, VIDEO_TITLE, VIDEO_LENGTH_BUCKETED, VIDEO_START_METHOD, VIDEO_COMPLETED, VIDEO_PAUSED, VIDEO_PAUSE_COUNT, VIDEO_STREAM_FAILURE_COUNT, 
            VIDEO_STREAM_FAILURE_VARIANT_NAME, TOTAL_TIME_WATCHED_RAW, TOTAL_TIME_WATCHED_BUCKETED, VIDEO_MILESTONE, REASON_FOR_VIDEO_EXIT, VIDEO_EXIT_ERROR_REASON, AD_TIME_SPENT, VIDEO_SHARE_TITLE, VIDEO_SHARE, VIDEO_CATEGORY, 
            VIDEO_TIME_SPENT_DURING_ADS, VIDEO_TIME_SPENT_OUTSIDE_ADS, VIDEO_COLLECTION, VIDEO_PLAYLIST, VIDEO_PLAYER, VIDEO_AD_STARTED, VIDEO_AD_TITLE, VIDEO_PROVIDER, VIDEO_DMA_LOCALE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }
}
