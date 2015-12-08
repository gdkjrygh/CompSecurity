// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.app.Activity;

// Referenced classes of package com.sessionm.core:
//            Session, StatsCollector

class dZ
    implements Runnable
{

    final Session dU;
    final Activity dZ;

    public void run()
    {
        synchronized (dU)
        {
            if (Session.g(dU) != 0L)
            {
                StatsCollector.a(ctor.Stat.eC, System.currentTimeMillis() - Session.g(dU));
            }
            StatsCollector.h(dZ);
            if (Session.D().getSessionState() == com.sessionm.api.tate.STARTED_ONLINE)
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

    ate(Session session, Activity activity)
    {
        dU = session;
        dZ = activity;
        super();
    }
}
