// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;

import com.sessionm.core.Session;

// Referenced classes of package com.sessionm.net:
//            RequestQueue, Request

class val.request
    implements Runnable
{

    final RequestQueue hx;
    final Request val$request;

    public void run()
    {
        synchronized (Session.D())
        {
            RequestQueue.d(hx, val$request);
        }
        return;
        exception;
        session;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Request request1)
    {
        hx = final_requestqueue;
        val$request = request1;
        super();
    }
}
