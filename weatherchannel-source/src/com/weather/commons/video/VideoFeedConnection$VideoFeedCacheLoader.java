// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.net.TrafficStats;
import com.weather.dal2.cache.FileCacheLoader;
import com.weather.dal2.net.SimpleHttpGetRequest;

// Referenced classes of package com.weather.commons.video:
//            VideoFeedConnection

private static class <init> extends FileCacheLoader
{

    public byte[] getContentsBytes(<init> <init>1)
        throws Exception
    {
        TrafficStats.setThreadStatsTag(61445);
        <init>1 = VideoFeedConnection.access$100(<init>1);
        return (new SimpleHttpGetRequest()).fetchGoogleTWCUserAgentRequestBytes(<init>1);
    }

    public volatile byte[] getContentsBytes(Object obj)
        throws Exception
    {
        return getContentsBytes((getContentsBytes)obj);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
