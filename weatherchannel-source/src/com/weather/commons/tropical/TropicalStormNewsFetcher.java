// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheLoader;
import com.google.gson.reflect.TypeToken;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.news.provider.ArticlePojo;
import com.weather.dal2.cache.MemCache;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.JsonObjectMapper;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import org.json.JSONException;

public class TropicalStormNewsFetcher
{
    private static final class StormNewsLoader extends CacheLoader
    {

        private final ConfigurationManagers configurationManagers;

        public volatile Object load(Object obj)
            throws Exception
        {
            return load((String)obj);
        }

        public List load(String s)
            throws DalException, JSONException, ConfigException
        {
            return TropicalStormNewsFetcher.fetchArticles(configurationManagers.getFlagshipConfig().stormNewsUrl.replace("{STORM_ID}", s));
        }

        private StormNewsLoader(ConfigurationManagers configurationmanagers)
        {
            configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        }

    }

    private static final class UrlNewsLoader extends CacheLoader
    {

        public volatile Object load(Object obj)
            throws Exception
        {
            return load((String)obj);
        }

        public List load(String s)
            throws DalException, JSONException
        {
            return TropicalStormNewsFetcher.fetchArticles(s);
        }

        private UrlNewsLoader()
        {
        }

    }


    private static final int CACHE_EXPIRATION_MINUTES = 5;
    private static final TypeToken LIST_TYPE = new TypeToken() {

    };
    private static final int MAXIMUM_CACHE_SIZE = 20;
    private static final String TAG = "TropicalStormNewsFetcher";
    private final ConfigurationManagers configurationManagers;
    private final MemCache genericNewsCache = new MemCache(new UrlNewsLoader(), 20, 5, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy));
    private final MemCache stormCache;

    public TropicalStormNewsFetcher(ConfigurationManagers configurationmanagers)
    {
        configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
        stormCache = new MemCache(new StormNewsLoader(configurationmanagers), 20, 5, EnumSet.noneOf(com/weather/dal2/cache/BaseCache$Policy));
    }

    private static List fetchArticles(String s)
        throws DalException, JSONException
    {
        s = (new SimpleHttpGetRequest("TropicalStormNewsFetcher")).fetch(s, false);
        if (s.isEmpty())
        {
            s = new ArrayList();
        } else
        {
            s = (List)JsonObjectMapper.fromJson(s, LIST_TYPE.getType());
        }
        s = ArticlePojo.filterEmptyArticles(s);
        ArticlePojo.updateNextArticleFields(s);
        return s;
    }

    public void asyncFetch(String s, Receiver receiver, Object obj)
    {
        Preconditions.checkNotNull(receiver, "receiver cannot be null");
        try
        {
            if (configurationManagers.getFlagshipConfig().hurricaneCentralEnabled)
            {
                stormCache.asyncFetch(s, false, receiver, obj);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException("Unable to get flagship config", s);
        }
        receiver.onCompletion(new ArrayList(), obj);
        return;
    }

    public void asyncFetchHurricaneArticles(Receiver receiver, Object obj)
    {
        Preconditions.checkNotNull(receiver, "receiver cannot be null");
        try
        {
            FlagshipConfig flagshipconfig = configurationManagers.getFlagshipConfig();
            if (flagshipconfig.hurricaneCentralEnabled)
            {
                genericNewsCache.asyncFetch(flagshipconfig.hurricaneNewsUrl, false, receiver, obj);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Receiver receiver)
        {
            throw new IllegalStateException("Configurations are not setup yet", receiver);
        }
        receiver.onCompletion(new ArrayList(), obj);
        return;
    }

    public void asyncFetchUpdateArticles(Receiver receiver, Object obj)
    {
        Preconditions.checkNotNull(receiver, "receiver cannot be null");
        try
        {
            FlagshipConfig flagshipconfig = configurationManagers.getFlagshipConfig();
            if (flagshipconfig.hurricaneCentralEnabled)
            {
                genericNewsCache.asyncFetch(flagshipconfig.tropicalUpdateNewsUrl, false, receiver, obj);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Receiver receiver)
        {
            throw new IllegalStateException("Configurations are not setup yet", receiver);
        }
        receiver.onCompletion(new ArrayList(), obj);
        return;
    }


}
