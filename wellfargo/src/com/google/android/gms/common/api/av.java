// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            ai, ax, aj

abstract class av
    implements Runnable
{

    final ai b;

    private av(ai ai1)
    {
        b = ai1;
        super();
    }

    av(ai ai1, aj aj)
    {
        this(ai1);
    }

    protected abstract void a();

    public void run()
    {
        ai.c(b).lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            ai.c(b).unlock();
            return;
        }
        a();
        ai.c(b).unlock();
        return;
        Object obj;
        obj;
        ai.d(b).a(((RuntimeException) (obj)));
        ai.c(b).unlock();
        return;
        obj;
        ai.c(b).unlock();
        throw obj;
    }
}
