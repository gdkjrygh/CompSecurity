// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.net.TrafficStats;
import com.google.common.base.Preconditions;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.MetricsHttpGetRequest;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.nio.charset.Charset;
import java.util.Locale;

// Referenced classes of package com.weather.commons.video2:
//            VideoDmaConnection, Dma

private static class configurationManagers extends FileCacheLoader
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
        return (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.A_REQUEST)).fetch(s, true).getBytes(Charset.forName("UTF-8"));
    }

    public volatile byte[] getContentsBytes(Object obj)
        throws Exception
    {
        return getContentsBytes((Dma)obj);
    }

    (ConfigurationManagers configurationmanagers)
    {
        configurationManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
    }
}
