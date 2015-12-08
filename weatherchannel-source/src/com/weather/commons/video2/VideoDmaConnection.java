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
import java.util.Locale;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.video2:
//            Dma

public class VideoDmaConnection
{
    private class FileNameReceiver
        implements Receiver
    {

        private final Dma dma;
        final VideoDmaConnection this$0;
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
                    String s = Files.toString(new File(result), Charsets.UTF_8);
                    videoMessageReceiver.onCompletion(VideoAssetList.fromJsonString(s).getVideos(), userData);
                    return;
                    Object obj;
                    obj;
_L2:
                    cache.invalidate(dma);
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



        private FileNameReceiver(Dma dma1, Receiver receiver)
        {
            this$0 = VideoDmaConnection.this;
            super();
            dma = dma1;
            videoMessageReceiver = receiver;
        }

    }

    private static class VideoCacheLoader extends FileCacheLoader
    {

        private final ConfigurationManagers configurationManagers;

        public byte[] getContentsBytes(Dma dma)
            throws DalException, ConfigException
        {
            TrafficStats.setThreadStatsTag(61445);
            String s = configurationManagers.getFlagshipConfig().videoDmaUrlFormat;
            s = String.format(Locale.US, s, new Object[] {
                dma.get()
            });
            LogUtil.d("VideoDmaConnection", LoggingMetaTags.TWC_VIDEOS, "hitting dsx DMA api. key=%s, url=%s", new Object[] {
                dma, s
            });
            return (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.Metric.MetricTag.TIMER_VIDEO_DMA_DATA_REQUEST)).fetch(s, true).getBytes(Charset.forName("UTF-8"));
        }

        public volatile byte[] getContentsBytes(Object obj)
            throws Exception
        {
            return getContentsBytes((Dma)obj);
        }

        VideoCacheLoader(ConfigurationManagers configurationmanagers)
        {
            configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        }
    }


    private static final int MAX_SIZE = 10;
    private static final String TAG = "VideoDmaConnection";
    private final FileCache cache;

    VideoDmaConnection(String s, ConfigurationManagers configurationmanagers, int i)
    {
        cache = FileCache.create(new VideoCacheLoader(configurationmanagers), 10, i, s, com.weather.dal2.cache.FileCache.FileCacheDirectory.CACHE_DIR);
        LanguageDependentCaches.getInstance().add(cache.getLoadingCache());
    }

    public void asyncFetch(Dma dma, boolean flag, Receiver receiver, Object obj)
    {
        cache.asyncFetch(dma, flag, new FileNameReceiver(dma, receiver), obj);
    }

    public void invalidateAll()
    {
        cache.invalidateAll();
    }

}
