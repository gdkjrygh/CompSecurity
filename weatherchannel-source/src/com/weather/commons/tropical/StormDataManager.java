// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Preconditions;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;

// Referenced classes of package com.weather.commons.tropical:
//            Storms, StormDataFetcher

public class StormDataManager
{

    private static final String TAG = "StormDataManager";
    private final TwcBus bus;
    private final StormDataFetcher stormDataFetcher;
    private volatile Storms storms;

    public StormDataManager(StormDataFetcher stormdatafetcher, TwcBus twcbus)
    {
        storms = Storms.EMPTY;
        stormDataFetcher = (StormDataFetcher)Preconditions.checkNotNull(stormdatafetcher);
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
    }

    public Storms getActiveStorms()
    {
        return storms;
    }

    public void refresh()
    {
        stormDataFetcher.refresh(false, new Receiver() {

            final StormDataManager this$0;

            public void onCompletion(Storms storms1, Object obj)
            {
                boolean flag;
                if (!storms.equals(storms1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                storms = (Storms)Preconditions.checkNotNull(storms1);
                if (flag)
                {
                    bus.post(storms1);
                }
            }

            public volatile void onCompletion(Object obj, Object obj1)
            {
                onCompletion((Storms)obj, obj1);
            }

            public void onError(Throwable throwable, Object obj)
            {
                EventLog.w("StormDataManager", "Unable to retrieve hurricane data", throwable);
            }

            
            {
                this$0 = StormDataManager.this;
                super();
            }
        }, null);
    }



/*
    static Storms access$002(StormDataManager stormdatamanager, Storms storms1)
    {
        stormdatamanager.storms = storms1;
        return storms1;
    }

*/

}
