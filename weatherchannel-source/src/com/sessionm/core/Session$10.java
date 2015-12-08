// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;

// Referenced classes of package com.sessionm.core:
//            Session

class dU
    implements Runnable
{

    final Session dU;

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        RequestQueue requestqueue = dU.N();
        if (requestqueue != null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        requestqueue.e(new Request(com.sessionm.net.e.gU, new Object[] {
            dU.E()
        }));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Session session)
    {
        dU = session;
        super();
    }
}
