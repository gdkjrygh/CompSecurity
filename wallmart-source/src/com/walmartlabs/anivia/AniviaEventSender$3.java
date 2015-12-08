// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.walmartlabs.anivia:
//            AniviaEventSender, AniviaLog

class this._cls0
    implements Runnable
{

    final AniviaEventSender this$0;

    public void run()
    {
        AniviaLog.d(AniviaEventSender.access$100(), "sendEventsRunnable run()");
        if (!AniviaEventSender.access$600(AniviaEventSender.this)) goto _L2; else goto _L1
_L1:
        AniviaEventSender.access$402(AniviaEventSender.this, 60);
_L4:
        AniviaEventSender.access$500(AniviaEventSender.this).execute(AniviaEventSender.access$700(AniviaEventSender.this));
        return;
_L2:
        try
        {
            AniviaEventSender.access$402(AniviaEventSender.this, Math.min(AniviaEventSender.access$400(AniviaEventSender.this) * 2, 900));
        }
        catch (Exception exception)
        {
            AniviaLog.e(AniviaEventSender.access$100(), "run(): ", exception);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ce()
    {
        this$0 = AniviaEventSender.this;
        super();
    }
}
