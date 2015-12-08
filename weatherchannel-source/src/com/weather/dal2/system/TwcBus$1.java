// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;

import com.squareup.otto.Bus;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.weather.dal2.system:
//            TwcBus

class this._cls0
    implements Runnable
{

    final TwcBus this$0;

    public void run()
    {
_L2:
        stableTimeStamp stabletimestamp;
        long l;
        long l1;
        do
        {
            if (Thread.currentThread().isInterrupted())
            {
                break MISSING_BLOCK_LABEL_193;
            }
            stabletimestamp = (stableTimeStamp)TwcBus.access$200(TwcBus.this).take();
            l1 = System.currentTimeMillis();
            l = l1 - stableTimeStamp.access._mth300(stabletimestamp);
            TwcBus.access$500(TwcBus.this).post(stableTimeStamp.access._mth400(stabletimestamp));
            l1 = System.currentTimeMillis() - l1;
            LogUtil.d("TwcBus", LoggingMetaTags.TWC_DAL, "Posted: %s, hash: %d,queuingTime:%s, processTime: %s", new Object[] {
                stableTimeStamp.access._mth400(stabletimestamp), Integer.valueOf(stableTimeStamp.access._mth400(stabletimestamp).hashCode()), Long.valueOf(l), Long.valueOf(l1)
            });
        } while (l1 <= 1000L);
        EventLog.e("TwcBus", (new StringBuilder()).append("SLOW POST TO BUS: queuingTime=").append(l).append(",processTime=").append(l1).append(", ").append("p=").append(stableTimeStamp.access._mth400(stabletimestamp)).append(" QueueSize:").append(TwcBus.access$200(TwcBus.this).size()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        InterruptedException interruptedexception;
        interruptedexception;
    }

    entLog()
    {
        this$0 = TwcBus.this;
        super();
    }
}
