// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.weatherconnections;


public abstract class AbstractCachingDataFetcher
{

    protected static final int CACHE_SIZE = 20;
    protected static final int EXPIRATION_IN_MINUTES = 5;
    protected static final int TOLERABLE_STALENESS = 240;

    public AbstractCachingDataFetcher()
    {
    }
}
