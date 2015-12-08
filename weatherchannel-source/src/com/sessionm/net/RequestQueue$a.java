// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;

import android.util.Log;
import com.sessionm.core.Session;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.sessionm.net:
//            RequestQueue

class hx extends TimerTask
{

    final RequestQueue hx;

    public void run()
    {
        if (Log.isLoggable("SessionM.RequestQueue", 3))
        {
            Log.d("SessionM.RequestQueue", "Executing scheduled send task.");
        }
        RequestQueue.d(hx).execute(new Runnable() {

            final RequestQueue.a hL;

            public void run()
            {
                synchronized (Session.D())
                {
                    RequestQueue.a(hL.hx, null, null, true);
                }
                return;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                hL = RequestQueue.a.this;
                super();
            }
        });
    }

    _cls1.hL(RequestQueue requestqueue)
    {
        hx = requestqueue;
        super();
    }
}
