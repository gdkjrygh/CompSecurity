// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.Cache;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.SystemEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class LanguageDependentCaches
{

    private static final LanguageDependentCaches INSTANCE = new LanguageDependentCaches();
    private static final String TAG = "LanguageDependentCaches";
    private final Collection caches = new CopyOnWriteArrayList();

    public LanguageDependentCaches()
    {
    }

    public static LanguageDependentCaches getInstance()
    {
        return INSTANCE;
    }

    private void invalidateCaches()
    {
        LogUtil.method("LanguageDependentCaches", LoggingMetaTags.TWC_DAL_CACHE, "invalidateCaches", new Object[0]);
        for (Iterator iterator = caches.iterator(); iterator.hasNext(); ((Cache)iterator.next()).invalidateAll()) { }
    }

    public void add(Cache cache)
    {
        Preconditions.checkNotNull(cache);
        if (!caches.contains(cache))
        {
            caches.add(cache);
        }
    }

    public void onLocaleChanged(SystemEvent systemevent)
    {
        if (systemevent.getCause() == com.weather.dal2.system.SystemEvent.Cause.LOCALE_CHANGED)
        {
            invalidateCaches();
        }
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

}
