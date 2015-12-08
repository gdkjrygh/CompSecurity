// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.net.TrafficStats;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.cache.FileCache;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.cache.LanguageDependentCaches;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;

// Referenced classes of package com.weather.commons.news.provider:
//            BreakingNewsData

public class CachingBreakingNewsDataFetcher
{
    private static class BreakingNewsFeedCacheLoader extends FileCacheLoader
    {

        public volatile byte[] getContentsBytes(Object obj)
            throws Exception
        {
            return getContentsBytes((String)obj);
        }

        public byte[] getContentsBytes(String s)
            throws DalException, ConfigException
        {
            TrafficStats.setThreadStatsTag(61441);
            String s1;
            try
            {
                s1 = ConfigurationManagers.getInstance().getFlagshipConfig().breakingNews;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException("Flagship config not available", s);
            }
            LogUtil.d("CachingBreakingNewsDataFetcher", LoggingMetaTags.TWC_BREAKING_NEWS, "hitting dsx api.  key=%s, url=%s", new Object[] {
                s, s1
            });
            return (new SimpleHttpGetRequest()).fetchGoogleTWCUserAgentRequestBytes(s1);
        }

        private BreakingNewsFeedCacheLoader()
        {
        }

    }

    private class FileNameReceiver
        implements Receiver
    {

        private final Receiver articleReceiver;
        private final String breakingKey;
        final CachingBreakingNewsDataFetcher this$0;

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
                    try
                    {
                        String s = Files.toString(new File(result), Charsets.UTF_8);
                        articleReceiver.onCompletion(BreakingNewsData.fromJsonString(s), userData);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        cache.invalidate(breakingKey);
                        articleReceiver.onError(throwable, userData);
                        return;
                    }
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
            articleReceiver.onError(throwable, obj);
        }



        private FileNameReceiver(String s, Receiver receiver)
        {
            this$0 = CachingBreakingNewsDataFetcher.this;
            super();
            breakingKey = s;
            articleReceiver = receiver;
        }

    }


    private static final String CACHE_ID = "BreakingNews";
    public static final int EXPIRATION_MINUTES = 20;
    public static final String KEY = "breaking";
    public static final int MAX_SIZE = 1;
    private static final String TAG = "CachingBreakingNewsDataFetcher";
    private static CachingBreakingNewsDataFetcher instance;
    final Receiver articleReceiver = new Receiver() {

        final CachingBreakingNewsDataFetcher this$0;

        public void onCompletion(BreakingNewsData breakingnewsdata, String s)
        {
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((BreakingNewsData)obj, (String)obj1);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (String)obj);
        }

        public void onError(Throwable throwable, String s)
        {
        }

            
            {
                this$0 = CachingBreakingNewsDataFetcher.this;
                super();
            }
    };
    private final FileCache cache;

    private CachingBreakingNewsDataFetcher()
    {
        cache = FileCache.create(new BreakingNewsFeedCacheLoader(), 1, 20, "BreakingNews", com.weather.dal2.cache.FileCache.FileCacheDirectory.CACHE_DIR);
        LanguageDependentCaches.getInstance().add(cache.getLoadingCache());
    }

    public static CachingBreakingNewsDataFetcher getInstance()
    {
        com/weather/commons/news/provider/CachingBreakingNewsDataFetcher;
        JVM INSTR monitorenter ;
        CachingBreakingNewsDataFetcher cachingbreakingnewsdatafetcher;
        if (instance == null)
        {
            instance = new CachingBreakingNewsDataFetcher();
        }
        cachingbreakingnewsdatafetcher = instance;
        com/weather/commons/news/provider/CachingBreakingNewsDataFetcher;
        JVM INSTR monitorexit ;
        return cachingbreakingnewsdatafetcher;
        Exception exception;
        exception;
        throw exception;
    }

    public void asyncFetch(String s, boolean flag, Receiver receiver, Object obj)
    {
        cache.asyncFetch(s, flag, new FileNameReceiver(s, receiver), obj);
    }

    public void request(boolean flag)
    {
        asyncFetch("breaking", flag, articleReceiver, "breaking");
    }

}
