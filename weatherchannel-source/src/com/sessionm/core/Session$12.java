// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import java.util.Map;

// Referenced classes of package com.sessionm.core:
//            Session

class eb
    implements Runnable
{

    final Session dU;
    final String eb;

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        RequestQueue requestqueue = dU.N();
        a a1 = a.aJ();
        a1.put("user[data][email]", eb);
        a1.put("user[data][age]", (String)com.sessionm.core.Session.a(dU).get("age"));
        a1.put("user[data][gender]", (String)com.sessionm.core.Session.a(dU).get("gender"));
        a1.put("user[data][profile_image_url]", (String)com.sessionm.core.Session.a(dU).get("profile_image_url"));
        a1.put("user[data][first_name]", (String)com.sessionm.core.Session.a(dU).get("first_name"));
        a1.put("user[data][last_name]", (String)com.sessionm.core.Session.a(dU).get("last_name"));
        a1.put("user[data][zip_code]", (String)com.sessionm.core.Session.a(dU).get("zip_code"));
        Request request = new Request(com.sessionm.net.e.gO);
        request.d(a1);
        requestqueue.e(request);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Session session, String s)
    {
        dU = session;
        eb = s;
        super();
    }
}
