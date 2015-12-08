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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class CachingWeatherNodesImageFetcher
{
    private static class FileNameReceiver
        implements Receiver
    {

        private final Receiver weatherNodeImageReceiver;

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((String)obj, obj1);
        }

        public void onCompletion(String s, Object obj)
        {
            Object obj1;
            try
            {
                s = Files.toString(new File(s), Charsets.UTF_8);
                obj1 = (new JSONObject(CachingWeatherNodesImageFetcher.REMOVE_EXTRA_LINE.matcher(s).replaceAll(""))).optJSONObject("variants");
                s = ((JSONObject) (obj1)).optString("bw3grid");
                obj1 = ((JSONObject) (obj1)).optString("9");
                if (!s.isEmpty())
                {
                    weatherNodeImageReceiver.onCompletion(s, obj);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                weatherNodeImageReceiver.onError(s, obj);
                return;
            }
            if (!((String) (obj1)).isEmpty())
            {
                weatherNodeImageReceiver.onCompletion(obj1, obj);
                return;
            }
            weatherNodeImageReceiver.onError(new Throwable("Empty url found for map and image specified variants"), obj);
            return;
        }

        public void onError(Throwable throwable, Object obj)
        {
            weatherNodeImageReceiver.onError(throwable, obj);
        }

        private FileNameReceiver(Receiver receiver)
        {
            weatherNodeImageReceiver = receiver;
        }

    }

    private static class WeatherNodesImageLoader extends FileCacheLoader
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
            String s1 = String.format("%s%s", new Object[] {
                ConfigurationManagers.getInstance().getFlagshipConfig().wxNodeImageUrl, s
            });
            LogUtil.d("CachingWeatherNodesImageFetcher", LoggingMetaTags.TWC_BREAKING_NEWS, "hitting dsx api.  key=%s, url=%s", new Object[] {
                s, s1
            });
            return (new SimpleHttpGetRequest()).fetchGoogleTWCUserAgentRequestBytes(s1);
        }

        private WeatherNodesImageLoader()
        {
        }

    }


    private static final String CACHE_ID = "WeatherNodes";
    private static final String IMAGE_VARIANTS = "9";
    private static final String MAP_IMAGE_VARIANTS = "bw3grid";
    private static final Pattern REMOVE_EXTRA_LINE = Pattern.compile("\n", 16);
    private static final String TAG = "CachingWeatherNodesImageFetcher";
    private static final String VARIANTS = "variants";
    private static final CachingWeatherNodesImageFetcher instance = new CachingWeatherNodesImageFetcher();
    private final FileCache cache;

    private CachingWeatherNodesImageFetcher()
    {
        cache = FileCache.create(new WeatherNodesImageLoader(), 1, 20, String.format("%s", new Object[] {
            "WeatherNodes"
        }), com.weather.dal2.cache.FileCache.FileCacheDirectory.CACHE_DIR);
        LanguageDependentCaches.getInstance().add(cache.getLoadingCache());
    }

    public static CachingWeatherNodesImageFetcher getInstance()
    {
        com/weather/commons/news/provider/CachingWeatherNodesImageFetcher;
        JVM INSTR monitorenter ;
        CachingWeatherNodesImageFetcher cachingweathernodesimagefetcher = instance;
        com/weather/commons/news/provider/CachingWeatherNodesImageFetcher;
        JVM INSTR monitorexit ;
        return cachingweathernodesimagefetcher;
        Exception exception;
        exception;
        throw exception;
    }

    public void asyncFetch(String s, boolean flag, Receiver receiver, Object obj)
    {
        cache.asyncFetch(s, flag, new FileNameReceiver(receiver), obj);
    }


}
