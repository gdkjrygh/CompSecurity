// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;


public interface Metric
{
    public static final class MetricTag extends Enum
    {

        private static final MetricTag $VALUES[];
        public static final MetricTag TIMER_APPLAUNCH_DISKCACHE;
        public static final MetricTag TIMER_APPLAUNCH_MEMCACHE;
        public static final MetricTag TIMER_APPLAUNCH_NETWORK;
        public static final MetricTag TIMER_COLDAPPLAUNCH_DISKCACHE;
        public static final MetricTag TIMER_COLDAPPLAUNCH_NETWORK;
        public static final MetricTag TIMER_NHC_ALERT_DATA_REQUEST;
        public static final MetricTag TIMER_PAST_POLLEN_DATA_REQUEST;
        public static final MetricTag TIMER_PULL_TO_REFRESH_DISPLAY;
        public static final MetricTag TIMER_STORMS_LIST_DATA_REQUEST;
        public static final MetricTag TIMER_STORM_DETAILS_DATA_REQUEST;
        public static final MetricTag TIMER_VAST_VIDEO_DATA_FEED_REQUEST;
        public static final MetricTag TIMER_VIDEO_ASSET_DATA_FEED_REQUEST;
        public static final MetricTag TIMER_VIDEO_ASSET_QUERY_DATA_FEED_REQUEST;
        public static final MetricTag TIMER_VIDEO_DEDUPED_COLLECTIONS_DATA_FEED_REQUEST;
        public static final MetricTag TIMER_VIDEO_DMA_DATA_REQUEST;
        public static final MetricTag TIMER_VIDEO_PLAYLIST_DATA_FEED_REQUEST;
        public static final MetricTag TIMER_VIDEO_PROGRAMMING_DATA_REQUEST;
        public static final MetricTag TIMER_WEATHER_DATA_PARSE;
        public static final MetricTag TIMER_WEATHER_DATA_REQUEST;
        private final String metricDescription;
        private final String metricName;

        public static MetricTag valueOf(String s)
        {
            return (MetricTag)Enum.valueOf(com/weather/util/metric/Metric$MetricTag, s);
        }

        public static MetricTag[] values()
        {
            return (MetricTag[])$VALUES.clone();
        }

        public String getMetricDescription()
        {
            return metricDescription;
        }

        public String getMetricName()
        {
            return metricName;
        }

        static 
        {
            TIMER_COLDAPPLAUNCH_NETWORK = new MetricTag("TIMER_COLDAPPLAUNCH_NETWORK", 0, "com.weather.timer.coldapplaunch.network", "Time from cold app launch to first load of data from network");
            TIMER_COLDAPPLAUNCH_DISKCACHE = new MetricTag("TIMER_COLDAPPLAUNCH_DISKCACHE", 1, "com.weather.timer.coldapplaunch.diskcache", "Time from cold app launch to first load of datafrom disk");
            TIMER_APPLAUNCH_NETWORK = new MetricTag("TIMER_APPLAUNCH_NETWORK", 2, "com.weather.timer.applaunch.network", "Time from app launch to first load of data from network");
            TIMER_APPLAUNCH_MEMCACHE = new MetricTag("TIMER_APPLAUNCH_MEMCACHE", 3, "com.weather.timer.applaunch.memcache", "Time from app launch to first load of data from memory cache");
            TIMER_APPLAUNCH_DISKCACHE = new MetricTag("TIMER_APPLAUNCH_DISKCACHE", 4, "com.weather.timer.applaunch.diskcache", "Time from app launch to first load of data from disk cache");
            TIMER_WEATHER_DATA_REQUEST = new MetricTag("TIMER_WEATHER_DATA_REQUEST", 5, "com.weather.timer.weatherdata.request", "Time it takes to request weather data");
            TIMER_WEATHER_DATA_PARSE = new MetricTag("TIMER_WEATHER_DATA_PARSE", 6, "com.weather.timer.weatherdata.parse", "Time it takes to parse weather data");
            TIMER_NHC_ALERT_DATA_REQUEST = new MetricTag("TIMER_NHC_ALERT_DATA_REQUEST", 7, "com.weather.timer.nhcalertdata.request", "Time it takes to request nhc alert data");
            TIMER_PAST_POLLEN_DATA_REQUEST = new MetricTag("TIMER_PAST_POLLEN_DATA_REQUEST", 8, "com.weather.timer.pastpollendata.request", "Time it takes to request past pollen data");
            TIMER_STORMS_LIST_DATA_REQUEST = new MetricTag("TIMER_STORMS_LIST_DATA_REQUEST", 9, "com.weather.timer.stormslistdata.request", "Time it takes to request storms list data");
            TIMER_STORM_DETAILS_DATA_REQUEST = new MetricTag("TIMER_STORM_DETAILS_DATA_REQUEST", 10, "com.weather.timer.stormdetaildata.request", "Time it takes to request detailed data for a particular storm");
            TIMER_VAST_VIDEO_DATA_FEED_REQUEST = new MetricTag("TIMER_VAST_VIDEO_DATA_FEED_REQUEST", 11, "com.weather.timer.vastvideofeeddata.request", "Time it takes to request vast video feed data");
            TIMER_VIDEO_PLAYLIST_DATA_FEED_REQUEST = new MetricTag("TIMER_VIDEO_PLAYLIST_DATA_FEED_REQUEST", 12, "com.weather.timer.videoplaylistdata.request", "Time it takes to request video playlist data");
            TIMER_VIDEO_ASSET_DATA_FEED_REQUEST = new MetricTag("TIMER_VIDEO_ASSET_DATA_FEED_REQUEST", 13, "com.weather.timer.videoassetdata.request", "Time it takes to request video asset data");
            TIMER_VIDEO_ASSET_QUERY_DATA_FEED_REQUEST = new MetricTag("TIMER_VIDEO_ASSET_QUERY_DATA_FEED_REQUEST", 14, "com.weather.timer.videoassetquerydata.request", "Time it takes to request video asset query data");
            TIMER_VIDEO_PROGRAMMING_DATA_REQUEST = new MetricTag("TIMER_VIDEO_PROGRAMMING_DATA_REQUEST", 15, "com.weather.timer.videoprogrammingdata.request", "Time it takes to request video programming data");
            TIMER_VIDEO_DMA_DATA_REQUEST = new MetricTag("TIMER_VIDEO_DMA_DATA_REQUEST", 16, "com.weather.timer.videodmadata.request", "Time it takes to request video dma data");
            TIMER_PULL_TO_REFRESH_DISPLAY = new MetricTag("TIMER_PULL_TO_REFRESH_DISPLAY", 17, "com.weather.timer.pulltorefresh.display", "Time it takes for weather data to display after a pull to refresh");
            TIMER_VIDEO_DEDUPED_COLLECTIONS_DATA_FEED_REQUEST = new MetricTag("TIMER_VIDEO_DEDUPED_COLLECTIONS_DATA_FEED_REQUEST", 18, "com.weather.timer.videodedupedcollectionsdata.request", "Time it takes to request video deduped collections data");
            $VALUES = (new MetricTag[] {
                TIMER_COLDAPPLAUNCH_NETWORK, TIMER_COLDAPPLAUNCH_DISKCACHE, TIMER_APPLAUNCH_NETWORK, TIMER_APPLAUNCH_MEMCACHE, TIMER_APPLAUNCH_DISKCACHE, TIMER_WEATHER_DATA_REQUEST, TIMER_WEATHER_DATA_PARSE, TIMER_NHC_ALERT_DATA_REQUEST, TIMER_PAST_POLLEN_DATA_REQUEST, TIMER_STORMS_LIST_DATA_REQUEST, 
                TIMER_STORM_DETAILS_DATA_REQUEST, TIMER_VAST_VIDEO_DATA_FEED_REQUEST, TIMER_VIDEO_PLAYLIST_DATA_FEED_REQUEST, TIMER_VIDEO_ASSET_DATA_FEED_REQUEST, TIMER_VIDEO_ASSET_QUERY_DATA_FEED_REQUEST, TIMER_VIDEO_PROGRAMMING_DATA_REQUEST, TIMER_VIDEO_DMA_DATA_REQUEST, TIMER_PULL_TO_REFRESH_DISPLAY, TIMER_VIDEO_DEDUPED_COLLECTIONS_DATA_FEED_REQUEST
            });
        }

        private MetricTag(String s, int i, String s1, String s2)
        {
            super(s, i);
            metricName = s1;
            metricDescription = s2;
        }
    }


    public abstract String getDescription();

    public abstract String getName();
}
