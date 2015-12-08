// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;

// Referenced classes of package com.sessionm.core:
//            Session

class ei
    implements Runnable
{

    final Session dU;
    final String eb;
    final String ei;
    final Session val$session;

    public void run()
    {
        RequestQueue requestqueue = val$session.N();
        a a1 = a.aJ();
        Object obj = a.aJ();
        ((a) (obj)).put("email", eb);
        ((a) (obj)).put("password", ei);
        a1.put("login", obj);
        a1.put("authenticity_token", val$session.dI);
        obj = new Request(com.sessionm.net.e.gY);
        ((Request) (obj)).d(a1);
        requestqueue.e(((Request) (obj)));
    }

    (Session session2, String s, String s1)
    {
        dU = final_session1;
        val$session = session2;
        eb = s;
        ei = s1;
        super();
    }
}
