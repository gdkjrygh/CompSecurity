// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.boat;

import android.content.Context;
import android.os.Handler;
import com.weather.Weather.html.AbstractHtmlModule;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.BoatAndBeachFacade;
import com.weather.commons.facade.BoatAndBeachUnavailableEvent;

public final class BoatAndBeachModule extends AbstractHtmlModule
{

    static final String TAG = "BoatAndBeachModule";

    public BoatAndBeachModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler, getHeightInPixels(context, 0x7f0a0089, "BoatAndBeachModule"), "file:///android_asset/boat/module.html", "{ }");
    }

    public void onBoatAndBeachClear(BoatAndBeachUnavailableEvent boatandbeachunavailableevent)
    {
        setModuleData(null);
    }

    public void onReceiveData(BoatAndBeachFacade boatandbeachfacade)
    {
        setModuleData(boatandbeachfacade);
    }
}
