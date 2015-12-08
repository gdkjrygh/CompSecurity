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
import com.weather.commons.video2.dsx.VideoAsset;
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
import com.weather.util.parsing.ValidationException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoAssetConnection
{
    private class FileNameReceiver
        implements Receiver
    {

        final VideoAssetConnection this$0;
        private final String videoId;
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
                    VideoAsset videoasset = VideoAsset.fromJson(new JSONObject(Files.toString(new File(result), Charsets.UTF_8)));
                    videoMessageReceiver.onCompletion(videoasset, userData);
                    return;
                    Object obj;
                    obj;
_L2:
                    cache.invalidate(videoId);
                    videoMessageReceiver.onError(((Throwable) (obj)), userData);
                    return;
                    obj;
                    continue; /* Loop/switch isn't completed */
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
            this$0 = VideoAssetConnection.this;
            super();
            videoId = s;
            videoMessageReceiver = receiver;
        }

    }

    private static class SingleVideoCacheLoader extends FileCacheLoader
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
            String s1 = configurationManagers.getFlagshipConfig().getAssetRequestUrl(s);
            LogUtil.d("VideoAssetConnection", LoggingMetaTags.TWC_VIDEOS, "hitting dsx asset api.  key=%s, url=%s", new Object[] {
                s, s1
            });
            return (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.Metric.MetricTag.TIMER_VIDEO_ASSET_DATA_FEED_REQUEST)).fetch(s1, true).getBytes(Charset.forName("UTF-8"));
        }

        SingleVideoCacheLoader(ConfigurationManagers configurationmanagers)
        {
            configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        }
    }


    private static final int MAX_SIZE = 15;
    private static final String TAG = "VideoAssetConnection";
    private final FileCache cache;

    public VideoAssetConnection(String s, ConfigurationManagers configurationmanagers, int i)
    {
        cache = FileCache.create(new SingleVideoCacheLoader(configurationmanagers), 15, i, s, com.weather.dal2.cache.FileCache.FileCacheDirectory.CACHE_DIR);
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
