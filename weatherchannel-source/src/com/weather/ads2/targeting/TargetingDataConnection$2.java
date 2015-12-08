// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;
import java.util.Map;

// Referenced classes of package com.weather.ads2.targeting:
//            TargetingDataConnection, AdTargetingChange

class this._cls0
    implements Receiver
{

    final TargetingDataConnection this$0;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((Map)obj, (Void)obj1);
    }

    public void onCompletion(Map map, Void void1)
    {
        bus.post(new AdTargetingChange(map));
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (Void)obj);
    }

    public void onError(Throwable throwable, Void void1)
    {
        EventLog.e(tag, "Error updating ad targeting parameters", throwable);
    }

    ()
    {
        this$0 = TargetingDataConnection.this;
        super();
    }
}
