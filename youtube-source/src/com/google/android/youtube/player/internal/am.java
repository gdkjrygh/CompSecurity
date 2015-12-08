// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import java.util.ArrayList;

// Referenced classes of package com.google.android.youtube.player.internal:
//            aj

public abstract class am
{

    final aj a;
    private Object b;

    public am(aj aj1, Object obj)
    {
        a = aj1;
        super();
        b = obj;
        synchronized (aj.c(aj1))
        {
            aj.c(aj1).add(this);
        }
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = b;
        this;
        JVM INSTR monitorexit ;
        a(obj);
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract void a(Object obj);

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
