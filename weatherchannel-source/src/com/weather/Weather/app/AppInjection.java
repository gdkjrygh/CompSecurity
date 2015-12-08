// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;

public class AppInjection
{

    public AppInjection()
    {
    }

    public ConfigurationManagers provideConfigManagers()
    {
        return ConfigurationManagers.getInstance();
    }

    public Context provideContext()
    {
        return AbstractTwcApplication.getRootContext();
    }

    public TwcBus provideDalBus()
    {
        return DataAccessLayer.BUS;
    }

    public FixedLocations provideFixedLocations()
    {
        return FixedLocations.getInstance();
    }

    public LocalyticsHandler provideLocalyticsHandler()
    {
        return LocalyticsHandler.getInstance();
    }

    public LocationManager provideLocationManager()
    {
        return LocationManager.getLocationManager();
    }

    public MultiActivitySummaryManager provideMultiActivitySummaryManager()
    {
        return MultiActivitySummaryManager.getInstance();
    }

    public Picasso providePicasso()
    {
        return Picasso.with(provideContext());
    }

    TimeProvider provideTimeProvider()
    {
        return SystemTimeProvider.getInstance();
    }
}
