// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.sessionm.core.Session;
import com.sessionm.net.RequestQueue;

// Referenced classes of package com.sessionm.api:
//            ConnectionReceiver

class val.context
    implements Runnable
{

    final ConnectionReceiver this$0;
    final Context val$context;
    final Session val$session;

    public void run()
    {
        Session session1 = Session.D();
        session1;
        JVM INSTR monitorenter ;
        RequestQueue requestqueue;
        NetworkInfo networkinfo;
        requestqueue = val$session.N();
        networkinfo = ((ConnectivityManager)val$context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null) goto _L2; else goto _L1
_L1:
        if (!networkinfo.isConnected()) goto _L2; else goto _L3
_L3:
        if (requestqueue.bs() == com.sessionm.net.ueueNetworkState.hz)
        {
            requestqueue.reconnect();
        }
_L5:
        session1;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (requestqueue.br() == com.sessionm.net.ueueSendState.hC && requestqueue.bs() == com.sessionm.net.ueueNetworkState.hy)
        {
            requestqueue.a(com.sessionm.net.ueueNetworkState.hz);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        session1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ueueSendState()
    {
        this$0 = final_connectionreceiver;
        val$session = session1;
        val$context = Context.this;
        super();
    }
}
