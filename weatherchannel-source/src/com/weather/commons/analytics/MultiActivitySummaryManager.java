// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsHandler, Event

public class MultiActivitySummaryManager
{

    private static final MultiActivitySummaryManager INSTANCE;
    private final Set eventsToTag = Collections.newSetFromMap(new ConcurrentHashMap());
    private final LocalyticsHandler localyticsHandler;

    MultiActivitySummaryManager(LocalyticsHandler localyticshandler)
    {
        localyticsHandler = localyticshandler;
    }

    public static MultiActivitySummaryManager getInstance()
    {
        return INSTANCE;
    }

    public void onAppEvent(AppEvent appevent)
    {
        if (appevent.getCause() == com.weather.dal2.system.AppEvent.Cause.APP_STOP)
        {
            for (appevent = eventsToTag.iterator(); appevent.hasNext(); tagSummary((Event)appevent.next())) { }
        }
    }

    public void registerSummary(Event event)
    {
        eventsToTag.add(event);
    }

    public void tagSummary(Event event)
    {
        if (eventsToTag.remove(event))
        {
            localyticsHandler.tagSummaryEvent(event);
        }
    }

    static 
    {
        INSTANCE = new MultiActivitySummaryManager(LocalyticsHandler.getInstance());
        DataAccessLayer.BUS.register(INSTANCE);
    }
}
