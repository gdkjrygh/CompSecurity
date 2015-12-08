// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.net.TrafficStats;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.exceptions.DalException;
import com.weather.dal2.net.MetricsHttpGetRequest;
import com.weather.dal2.net.SimpleHttpGetRequest;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.nio.charset.Charset;

// Referenced classes of package com.weather.commons.video2:
//            VideoAssetListRangedQueryConnection, RangedQueryUrlBuilder, RangedQuery

private class <init> extends FileCacheLoader
{

    final VideoAssetListRangedQueryConnection this$0;

    public byte[] getContentsBytes(RangedQuery rangedquery)
        throws DalException, ConfigException
    {
        TrafficStats.setThreadStatsTag(61445);
        String s = VideoAssetListRangedQueryConnection.access$200(VideoAssetListRangedQueryConnection.this).getUrl(rangedquery, VideoAssetListRangedQueryConnection.access$100(VideoAssetListRangedQueryConnection.this));
        LogUtil.d("VideoAssetListRangedQueryConnection", LoggingMetaTags.TWC_VIDEOS, "hitting dsx query api.  key=%s, url=%s", new Object[] {
            rangedquery, s
        });
        return (new MetricsHttpGetRequest(new SimpleHttpGetRequest(), com.weather.util.metric.T)).fetch(s, true).getBytes(Charset.forName("UTF-8"));
    }

    public volatile byte[] getContentsBytes(Object obj)
        throws Exception
    {
        return getContentsBytes((RangedQuery)obj);
    }

    private Y()
    {
        this$0 = VideoAssetListRangedQueryConnection.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
