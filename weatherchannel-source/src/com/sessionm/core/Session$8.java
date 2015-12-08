// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.webkit.CookieSyncManager;
import com.sessionm.a.a;
import com.sessionm.c.c;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import java.util.List;

// Referenced classes of package com.sessionm.core:
//            Session, e, StatsCollector

class dU
    implements Runnable
{

    final Session dU;

    public void run()
    {
        a.r(dU.getApplicationContext());
        Object obj = dU.an();
        synchronized (dU)
        {
            Object obj2 = dU.N();
            ((RequestQueue) (obj2)).start();
            Object obj1 = e.u();
            obj2 = ((e) (obj1)).a((c)((RequestQueue) (obj2)).bn().get(0), (c)((RequestQueue) (obj2)).bn().get(1));
            StatsCollector.reset();
            CookieSyncManager.createInstance(dU.getApplicationContext());
            ((e) (obj1)).w();
            obj1 = new Request(com.sessionm.net.pe.gL, new Object[] {
                dU.E()
            });
            ((com.sessionm.b.a) (obj)).put("sessions", obj2);
            ((com.sessionm.b.a) (obj)).put("stats", StatsCollector.i(Session.h(dU)).aL());
            if (Session.g(dU) == 0L)
            {
                com.sessionm.core.Session.a(dU, System.currentTimeMillis());
            }
            ((com.sessionm.b.a) (obj)).put("e", Session.i(dU).aL());
            ((Request) (obj1)).d(((com.sessionm.b.a) (obj)));
            obj = dU.N();
            ((RequestQueue) (obj)).a(dU);
            ((RequestQueue) (obj)).e(((Request) (obj1)));
            Session.e(dU);
            if (((RequestQueue) (obj)).bl() > 0L)
            {
                dU.a(com.sessionm.api.tate.STARTED_OFFLINE);
            }
        }
        return;
        exception;
        session;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ate(Session session)
    {
        dU = session;
        super();
    }
}
