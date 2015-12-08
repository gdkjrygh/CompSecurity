// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import com.sessionm.api.SessionM;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import java.util.Map;

// Referenced classes of package com.sessionm.core:
//            Session

class ej
    implements Runnable
{

    final Session dU;
    final Map ej;
    final Session val$session;

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        RequestQueue requestqueue = val$session.N();
        a a1 = a.aJ();
        Object obj = a.aJ();
        ((a) (obj)).put("email", (String)ej.get(SessionM.USER_DATA_EMAIL_KEY));
        ((a) (obj)).put("birth_year", (String)ej.get(SessionM.USER_DATA_BIRTH_YEAR_KEY));
        ((a) (obj)).put("gender", (String)ej.get(SessionM.USER_DATA_GENDER_KEY));
        ((a) (obj)).put("zip", (String)ej.get(SessionM.USER_DATA_ZIP_CODE_KEY));
        ((a) (obj)).put("password", (String)ej.get(SessionM.USER_DATA_PASSWORD_KEY));
        ((a) (obj)).put("tos", 1);
        a1.put("member", obj);
        a1.put("authenticity_token", val$session.dI);
        a1.put("confirm_account", true);
        obj = new Request(com.sessionm.net.e.gZ);
        ((Request) (obj)).d(a1);
        requestqueue.e(((Request) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Session session2, Map map)
    {
        dU = final_session1;
        val$session = session2;
        ej = map;
        super();
    }
}
