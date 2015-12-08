// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;

import com.weather.ads2.targeting.AdRefreshEvent;

// Referenced classes of package com.weather.ads2.ui:
//            AdHolder

class freshEvent
    implements Runnable
{

    final AdHolder this$0;
    final AdRefreshEvent val$triggeringEvent;

    public void run()
    {
        AdHolder.access$000(AdHolder.this, val$triggeringEvent);
    }

    freshEvent()
    {
        this$0 = final_adholder;
        val$triggeringEvent = AdRefreshEvent.this;
        super();
    }
}
