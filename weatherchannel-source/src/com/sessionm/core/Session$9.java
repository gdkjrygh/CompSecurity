// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            Session

class dU
    implements Runnable
{

    final Session dU;

    public void run()
    {
        Session.D().a(Session.h(dU), Session.j(dU));
    }

    (Session session)
    {
        dU = session;
        super();
    }
}
