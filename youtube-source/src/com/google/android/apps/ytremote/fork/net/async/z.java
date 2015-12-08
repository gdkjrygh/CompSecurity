// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            ae, x, aa, p, 
//            ad, ab

final class z extends Thread
    implements ae
{

    static final boolean a;
    private p b;
    private RuntimeException c;
    private final ab d;
    private long e;

    public z(boolean flag, ab ab1, String s)
    {
        super(s);
        b = null;
        c = null;
        e = System.currentTimeMillis();
        d = ab1;
        if (flag)
        {
            setDaemon(true);
        }
        setUncaughtExceptionHandler(new aa(this));
    }

    public final p a()
    {
        this;
        JVM INSTR monitorenter ;
_L4:
        if (b != null) goto _L2; else goto _L1
_L1:
        Object obj = c;
        if (obj != null) goto _L2; else goto _L3
_L3:
        Exception exception;
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception) { }
        finally
        {
            this;
        }
        if (true) goto _L4; else goto _L2
_L2:
        if (c != null)
        {
            throw c;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        JVM INSTR monitorexit ;
        throw exception;
        if (!a && b == null)
        {
            throw new AssertionError();
        }
        exception = b;
        this;
        JVM INSTR monitorexit ;
        return exception;
    }

    public final void b()
    {
        e = System.currentTimeMillis();
    }

    public final void run()
    {
        this;
        JVM INSTR monitorenter ;
        b = new p();
        if (x.c().longValue() > 0L)
        {
            (new ad(b)).a(x.c().longValue(), this);
            x.d().add(this);
        }
        notify();
        this;
        JVM INSTR monitorexit ;
        d.a(b);
        x.d().remove(this);
        if (b != null)
        {
            b.d();
        }
_L2:
        return;
        Object obj;
        obj;
        c = ((RuntimeException) (obj));
        notify();
        this;
        JVM INSTR monitorexit ;
        x.d().remove(this);
        if (b == null) goto _L2; else goto _L1
_L1:
        b.d();
        return;
        obj;
        return;
        obj;
        notify();
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        x.d().remove(this);
        try
        {
            if (b != null)
            {
                b.d();
            }
        }
        catch (IOException ioexception) { }
        throw obj;
        obj;
    }

    public final String toString()
    {
        return (new StringBuilder("Thread[")).append(getId()).append(",").append(getName()).append("]").toString();
    }

    static 
    {
        boolean flag;
        if (!com/google/android/apps/ytremote/fork/net/async/x.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
