// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Preconditions;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;

// Referenced classes of package com.weather.commons.tropical:
//            StormDataManager, Storms

class this._cls0
    implements Receiver
{

    final StormDataManager this$0;

    public void onCompletion(Storms storms, Object obj)
    {
        boolean flag;
        if (!StormDataManager.access$000(StormDataManager.this).equals(storms))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        StormDataManager.access$002(StormDataManager.this, (Storms)Preconditions.checkNotNull(storms));
        if (flag)
        {
            StormDataManager.access$100(StormDataManager.this).post(storms);
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

    ()
    {
        this$0 = StormDataManager.this;
        super();
    }
}
