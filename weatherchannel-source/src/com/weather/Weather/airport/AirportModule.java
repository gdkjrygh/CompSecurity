// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.airport;

import android.content.Context;
import android.os.Handler;
import com.weather.Weather.html.AbstractHtmlModule;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.AirportFacade;
import com.weather.commons.facade.AirportUnavailableEvent;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public final class AirportModule extends AbstractHtmlModule
{

    private static final String TAG = "AirportModule";

    public AirportModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler, getHeightInPixels(context, 0x7f0a006c, "AirportModule"), "file:///android_asset/airports/module.html", "[]");
    }

    public void onAirportClear(AirportUnavailableEvent airportunavailableevent)
    {
        LogUtil.d("AirportModule", LoggingMetaTags.TWC_UI, "Updating airport module - unavailable", new Object[0]);
        setModuleData(null);
    }

    public void onReceiveData(AirportFacade airportfacade)
    {
        LogUtil.d("AirportModule", LoggingMetaTags.TWC_UI, "Updating airport module", new Object[0]);
        setModuleData(airportfacade);
    }
}
