// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            Session, StatsCollector

class dU
    implements Runnable
{

    final Session dU;

    public void run()
    {
        synchronized (dU)
        {
            if (Session.g(dU) != 0L)
            {
                StatsCollector.a(tor.Stat.eC, System.currentTimeMillis() - Session.g(dU));
            }
            if (Session.D().getSessionState() == com.sessionm.api.ate.STARTED_ONLINE)
            {
                Session.a(dU, false);
            }
        }
        return;
        exception;
        session;
        JVM INSTR monitorexit ;
        throw exception;
    }

    te(Session session)
    {
        dU = session;
        super();
    }
}
