// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.lotame;

import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.Receiver;
import com.weather.util.prefs.Prefs;
import java.util.Map;

// Referenced classes of package com.weather.ads2.lotame:
//            LotameConnectionV1

class this._cls0
    implements Receiver
{

    final LotameConnectionV1 this$0;

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((Map)obj, (Void)obj1);
    }

    public void onCompletion(Map map, Void void1)
    {
        LotameConnectionV1.access$100(LotameConnectionV1.this).putLong(_V1_UPDATE, System.currentTimeMillis());
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (Void)obj);
    }

    public void onError(Throwable throwable, Void void1)
    {
        EventLog.e(LotameConnectionV1.access$000(LotameConnectionV1.this), "Error updating ad targeting parameters", throwable);
    }

    ()
    {
        this$0 = LotameConnectionV1.this;
        super();
    }
}
