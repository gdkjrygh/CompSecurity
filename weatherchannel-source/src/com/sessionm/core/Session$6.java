// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            Session, g

class dU
    implements Runnable
{

    final Session dU;

    public void run()
    {
        synchronized (dU)
        {
            if (!dU.C().isOptedOut() && dU.getSessionState().isStarted())
            {
                Session.a(dU, null);
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
