// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dqz
{

    private final dra a;
    private final List b = new ArrayList();

    private dqz(dra dra1)
    {
        a = dra1;
    }

    public static dqz a(dra dra1)
    {
        return new dqz(dra1);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); dra.a((drb)iterator.next())) { }
        break MISSING_BLOCK_LABEL_42;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(hjn hjn, long l, TimeUnit timeunit)
    {
        this;
        JVM INSTR monitorenter ;
        b.add(a.a(hjn, l, timeunit));
        this;
        JVM INSTR monitorexit ;
        return;
        hjn;
        throw hjn;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((drb)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_42;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        b.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
