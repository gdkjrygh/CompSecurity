// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2;

import android.content.Context;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.weather.dal2.cache.LanguageDependentCaches;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.lbs.LbsServiceController;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.weatherconnections.CachingDsxDataFetcher;
import com.weather.dal2.weatherconnections.RequestManager;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.net.HttpRequest;
import com.weather.util.net.OkConnectionFactory;
import java.io.IOException;

public final class DataAccessLayer
{

    public static final TwcBus BUS = new TwcBus();
    private static final long MAX_CACHE_SIZE_BYTES = 0xa00000L;
    private static final String TAG = "DataAccessLayer";
    private static boolean initialized;

    private DataAccessLayer()
    {
    }

    public static void init()
    {
        com/weather/dal2/DataAccessLayer;
        JVM INSTR monitorenter ;
        if (!initialized)
        {
            BasicDemographicsStorage.getInstance().post();
            initialize();
            BUS.start();
        }
        com/weather/dal2/DataAccessLayer;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void initHttp()
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        java.io.File file1 = AbstractTwcApplication.getRootContext().getExternalCacheDir();
        java.io.File file = file1;
        if (file1 == null)
        {
            file = AbstractTwcApplication.getRootContext().getCacheDir();
        }
        LogUtil.d("DataAccessLayer", LoggingMetaTags.TWC_DAL_CACHE, "cacheDir: %s", new Object[] {
            file
        });
        try
        {
            okhttpclient.setCache(new Cache(file, 0xa00000L));
        }
        catch (IOException ioexception)
        {
            EventLog.w("DataAccessLayer", "Unable to initialize OkHttp cache.", ioexception);
        }
        HttpRequest.setConnectionFactory(new OkConnectionFactory(okhttpclient));
    }

    private static void initialize()
    {
        initHttp();
        CachingDsxDataFetcher.getInstance().register();
        CurrentLocation.getInstance().register();
        FixedLocations.getInstance().register();
        FollowMe.getInstance().register();
        com.weather.dal2.locations.ArchiverService.ArchiverServiceLauncher.getInstance().register();
        LbsServiceController.getInstance().register();
        RequestManager.getInstance().register();
        LanguageDependentCaches.getInstance().register();
        initialized = true;
    }

}
