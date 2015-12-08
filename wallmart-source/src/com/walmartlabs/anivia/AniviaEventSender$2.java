// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.walmartlabs.anivia:
//            AniviaEventSender, AniviaLog

class this._cls0
    implements Runnable
{

    final AniviaEventSender this$0;

    public void run()
    {
        int i = AniviaEventSender.access$000(AniviaEventSender.this);
        AniviaLog.d(AniviaEventSender.access$100(), (new StringBuilder()).append("scheduleSendIfNecessary(): events available: ").append(i).toString());
        if (i > 0 && (AniviaEventSender.access$200(AniviaEventSender.this) == null || AniviaEventSender.access$200(AniviaEventSender.this).isDone()))
        {
            AniviaEventSender.access$202(AniviaEventSender.this, AniviaEventSender.access$500(AniviaEventSender.this).schedule(AniviaEventSender.access$300(AniviaEventSender.this), AniviaEventSender.access$400(AniviaEventSender.this), TimeUnit.SECONDS));
            AniviaLog.d(AniviaEventSender.access$100(), (new StringBuilder()).append("scheduled next send in ").append(AniviaEventSender.access$400(AniviaEventSender.this)).append(" seconds").toString());
        }
    }

    ce()
    {
        this$0 = AniviaEventSender.this;
        super();
    }
}
