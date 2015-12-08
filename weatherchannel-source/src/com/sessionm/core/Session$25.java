// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;

// Referenced classes of package com.sessionm.core:
//            Session

class val.session
    implements Runnable
{

    final Session dU;
    final Session val$session;

    public void run()
    {
        val$session.N().e(new Request(com.sessionm.net.e.ha));
    }

    (Session session2)
    {
        dU = final_session1;
        val$session = session2;
        super();
    }
}
