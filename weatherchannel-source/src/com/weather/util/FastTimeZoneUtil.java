// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.TimeZone;

public final class FastTimeZoneUtil
{

    private static final LoadingCache timezones = CacheBuilder.newBuilder().maximumSize(50L).build(new CacheLoader() {

        public volatile Object load(Object obj)
            throws Exception
        {
            return load((String)obj);
        }

        public TimeZone load(String s)
        {
            return TimeZone.getTimeZone(s);
        }

    });

    private FastTimeZoneUtil()
    {
    }

    public static TimeZone getTimeZone(String s)
    {
        return (TimeZone)timezones.getUnchecked(s);
    }

}
