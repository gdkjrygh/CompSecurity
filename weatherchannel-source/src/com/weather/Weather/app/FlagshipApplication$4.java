// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.weather.commons.analytics.Attribute;
import com.weather.dal2.PerformanceEvents;

// Referenced classes of package com.weather.Weather.app:
//            FlagshipApplication

class PerformanceEvent
    implements Attribute
{

    final FlagshipApplication this$0;
    final com.weather.dal2.herDataPerformanceEvent val$weatherDataPerformanceEvent;

    public String getName()
    {
        return val$weatherDataPerformanceEvent.event.getEvent();
    }

    PerformanceEvent()
    {
        this$0 = final_flagshipapplication;
        val$weatherDataPerformanceEvent = com.weather.dal2.herDataPerformanceEvent.this;
        super();
    }
}
