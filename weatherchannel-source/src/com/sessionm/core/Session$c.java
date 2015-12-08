// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import java.util.TimerTask;

// Referenced classes of package com.sessionm.core:
//            Session

private class <init> extends TimerTask
{

    final Session dU;

    public void run()
    {
        dU.stopSession();
    }

    private (Session session)
    {
        dU = session;
        super();
    }

    dU(Session session, dU du)
    {
        this(session);
    }
}
