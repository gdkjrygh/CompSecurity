// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules.test;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.feed.LocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;

// Referenced classes of package com.weather.Weather.hurricane.modules.test:
//            FakeEvent

public class InjectionTestModule extends Module
{

    private volatile boolean eventOccurred;
    private volatile boolean injectionOccurredBeforeEvent;
    volatile String stormId;

    public InjectionTestModule(Context context, ModuleConfig moduleconfig, Handler handler, LocalyticsModuleHandler localyticsmodulehandler)
    {
        super(context, moduleconfig, handler, localyticsmodulehandler);
    }

    protected View createView(ViewGroup viewgroup)
    {
        return new View(viewgroup.getContext());
    }

    public String getStormId()
    {
        return stormId;
    }

    public boolean isEventOccurred()
    {
        return eventOccurred;
    }

    public boolean isInjectionOccurredBeforeEvent()
    {
        return injectionOccurredBeforeEvent;
    }

    public void onEvent(FakeEvent fakeevent)
    {
        boolean flag = true;
        eventOccurred = true;
        if (stormId == null)
        {
            flag = false;
        }
        injectionOccurredBeforeEvent = flag;
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((Void)obj);
    }

    protected void updateUi(Void void1)
    {
    }
}
