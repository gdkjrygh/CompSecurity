// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.net.TrafficStats;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.Files;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.video2.dsx.VideoAssetList;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.cache.LanguageDependentCaches;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.MetricsHttpGetRequest;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.video2:
//            RangedQueryUrlBuilder, RangedQuery

public class VideoAssetListRangedQueryConnection
{
    private class FileNameReceiver
        implements Receiver
    {

        private final RangedQuery localQuery;
        final VideoAssetListRangedQueryConnection this$0;
        private final Receiver videoAssetListReceiver;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, obj1);
        }

        public void onCompletion(String s, Object obj)
        {
            try
            {
                s = Files.toString(new File(s), Charsets.UTF_8);
                videoAssetListReceiver.onCompletion(VideoAssetList.fromJsonString(s), obj);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            cache.invalidate(localQuery);
            videoAssetListReceiver.onError(s, obj);
        }

        public void onError(Throwable throwable, Object obj)
        {
            videoAssetListReceiver.onError(throwable, obj);
        }

        private FileNameReceiver(RangedQuery rangedquery, Receiver receiver)
        {
            this$0 = VideoAssetListRangedQueryConnection.this;
            super();
            localQuery = rangedquery;
            videoAssetListReceiver = receiver;
        }

    }

    private class VideoFeedCacheLoader extends FileCacheLoader
    {

        final VideoAssetListRangedQueryConnection this$0;

        public byte[] getContentsBytes(RangedQuery rangedquery)
            throws DalException, ConfigException
        {
            TrafficStats.setThreadStatsTag(61445);
            String s = urlBuilder.getUrl(rangedquery, configurationManagers);
            LogUtil.d("VideoAssetListRangedQueryConnection", LoggingMetaTags.TWC_VIDEOS, "hitting dsx query api.  key=%s, url=%s", new Object[] {
                rangedquery, s
            });
            return (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.Metric.MetricTag.TIMER_VIDEO_ASSET_QUERY_DATA_FEED_REQUEST)).fetch(s, true).getBytes(Charset.forName("UTF-8"));
        }

        public volatile byte[] getContentsBytes(Object obj)
            throws Exception
        {
            return getContentsBytes((RangedQuery)obj);
        }

        private VideoFeedCacheLoader()
        {
            this$0 = VideoAssetListRangedQueryConnection.this;
            super();
        }

    }


    private static final String TAG = "VideoAssetListRangedQueryConnection";
    private final FileCache cache;
    private final ConfigurationManagers configurationManagers;
    private final RangedQueryUrlBuilder urlBuilder;

    VideoAssetListRangedQueryConnection(String s, ConfigurationManagers configurationmanagers, RangedQueryUrlBuilder rangedqueryurlbuilder, int i, int j)
    {
        configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        urlBuilder = (RangedQueryUrlBuilder)Preconditions.checkNotNull(rangedqueryurlbuilder);
        cache = FileCache.create(new VideoFeedCacheLoader(), j, i, (String)Preconditions.checkNotNull(s), com.weather.dal2.cache.FileCache.FileCacheDirectory.CACHE_DIR);
        LanguageDependentCaches.getInstance().add(cache.getLoadingCache());
    }

    public void asyncFetch(RangedQuery rangedquery, boolean flag, Receiver receiver, Object obj)
    {
        cache.asyncFetch(rangedquery, flag, new FileNameReceiver(rangedquery, receiver), obj);
    }

    void cleanup()
    {
        cache.deleteCache();
    }

    public void invalidateAll()
    {
        cache.invalidateAll();
    }



}
