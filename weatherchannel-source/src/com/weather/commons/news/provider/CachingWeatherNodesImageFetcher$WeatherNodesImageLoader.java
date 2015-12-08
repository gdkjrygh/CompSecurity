// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.net.TrafficStats;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.news.provider:
//            CachingWeatherNodesImageFetcher

private static class <init> extends FileCacheLoader
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

    private ()
    {
    }

    ( )
    {
        this();
    }
}
