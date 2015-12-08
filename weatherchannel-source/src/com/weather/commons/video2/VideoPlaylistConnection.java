// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.net.TrafficStats;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.Files;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.video2.dsx.VideoOrderedListEndpoint;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.cache.LanguageDependentCaches;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.MetricsHttpGetRequest;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import org.json.JSONException;

public class VideoPlaylistConnection
{
    private class FileNameReceiver
        implements Receiver
    {

        private final String playlistName;
        final VideoPlaylistConnection this$0;
        private final Receiver videoMessageReceiver;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, obj1);
        }

        public void onCompletion(final String result, Object obj)
        {
            (new Thread(((_cls1) (obj)). new Runnable() {

                final FileNameReceiver this$1;
                final String val$result;
                final Object val$userData;

                public void run()
                {
                    java.util.List list = VideoOrderedListEndpoint.fromJsonString(Files.toString(new File(result), Charsets.UTF_8)).getVideos();
                    videoMessageReceiver.onCompletion(list, userData);
                    return;
                    Object obj;
                    obj;
_L2:
                    cache.invalidate(playlistName);
                    videoMessageReceiver.onError(((Throwable) (obj)), userData);
                    return;
                    obj;
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                this$1 = final_filenamereceiver;
                result = s;
                userData = Object.this;
                super();
            }
            })).start();
        }

        public void onError(Throwable throwable, Object obj)
        {
            videoMessageReceiver.onError(throwable, obj);
        }



        private FileNameReceiver(String s, Receiver receiver)
        {
            this$0 = VideoPlaylistConnection.this;
            super();
            playlistName = s;
            videoMessageReceiver = receiver;
        }

    }

    private static class VideoFeedCacheLoader extends FileCacheLoader
    {

        private final ConfigurationManagers configurationManagers;

        public volatile byte[] getContentsBytes(Object obj)
            throws Exception
        {
            return getContentsBytes((String)obj);
        }

        public byte[] getContentsBytes(String s)
            throws DalException, ConfigException
        {
            TrafficStats.setThreadStatsTag(61445);
            Object obj = configurationManagers.getFlagshipConfig();
            if (LocaleUtil.isDeviceInGermanyGerman())
            {
                obj = ((FlagshipConfig) (obj)).burdaVideoOrderedListUrl;
            } else
            {
                obj = ((FlagshipConfig) (obj)).videoOrderedListUrl;
            }
            obj = String.format(Locale.US, ((String) (obj)), new Object[] {
                s
            });
            LogUtil.d("VideoPlaylistConnection", LoggingMetaTags.TWC_VIDEOS, "hitting dsx playlist api.  key=%s, url=%s", new Object[] {
                s, obj
            });
            return (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.Metric.MetricTag.TIMER_VIDEO_PLAYLIST_DATA_FEED_REQUEST)).fetch(((String) (obj)), true).getBytes(Charset.forName("UTF-8"));
        }

        VideoFeedCacheLoader(ConfigurationManagers configurationmanagers)
        {
            configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        }
    }


    private static final int MAX_SIZE = 15;
    private static final String TAG = "VideoPlaylistConnection";
    private final FileCache cache;

    VideoPlaylistConnection(String s, ConfigurationManagers configurationmanagers, int i)
    {
        cache = FileCache.create(new VideoFeedCacheLoader(configurationmanagers), 15, i, s, com.weather.dal2.cache.FileCache.FileCacheDirectory.CACHE_DIR);
        LanguageDependentCaches.getInstance().add(cache.getLoadingCache());
    }

    public void asyncFetch(String s, boolean flag, Receiver receiver, Object obj)
    {
        cache.asyncFetch(s, flag, new FileNameReceiver(s, receiver), obj);
    }

    public void invalidateAll()
    {
        cache.invalidateAll();
    }

}
