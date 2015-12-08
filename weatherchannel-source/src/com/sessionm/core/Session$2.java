// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.sessionm.core:
//            Session

class dU
    implements ThreadFactory
{

    final Session dU;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setName("SessionM Session Thread");
        return runnable;
    }

    actory(Session session)
    {
        dU = session;
        super();
    }
}
