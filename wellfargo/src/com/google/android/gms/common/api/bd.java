// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            ax, bh

abstract class bd
{

    private final bh a;

    protected bd(bh bh)
    {
        a = bh;
    }

    protected abstract void a();

    public final void a(ax ax1)
    {
        ax.a(ax1).lock();
        bh bh;
        bh bh1;
        bh = ax.b(ax1);
        bh1 = a;
        if (bh != bh1)
        {
            ax.a(ax1).unlock();
            return;
        }
        a();
        ax.a(ax1).unlock();
        return;
        Exception exception;
        exception;
        ax.a(ax1).unlock();
        throw exception;
    }
}
