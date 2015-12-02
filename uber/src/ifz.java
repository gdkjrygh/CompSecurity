// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public final class ifz extends AtomicReference
    implements icl, Runnable
{

    private static final long serialVersionUID = 0xc902baa90878364fL;
    final igm a;
    final idd b;

    public ifz(idd idd1)
    {
        b = idd1;
        a = new igm();
    }

    public ifz(idd idd1, igm igm1)
    {
        b = idd1;
        a = new igm(new igc(this, igm1));
    }

    public ifz(idd idd1, iiy iiy)
    {
        b = idd1;
        a = new igm(new igb(this, iiy));
    }

    public final void a(icl icl1)
    {
        a.a(icl1);
    }

    public final void a(iiy iiy)
    {
        a.a(new igb(this, iiy));
    }

    public final void a(Future future)
    {
        a.a(new iga(this, future, (byte)0));
    }

    public final void b()
    {
        if (!a.c())
        {
            a.b();
        }
    }

    public final boolean c()
    {
        return a.c();
    }

    public final void run()
    {
        lazySet(Thread.currentThread());
        b.a();
        b();
        return;
        Object obj;
        obj;
        if (!(obj instanceof icz))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", ((Throwable) (obj)));
_L1:
        iia.a().b();
        Thread thread = Thread.currentThread();
        thread.getUncaughtExceptionHandler().uncaughtException(thread, ((Throwable) (obj)));
        b();
        return;
        obj = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", ((Throwable) (obj)));
          goto _L1
        obj;
        b();
        throw obj;
    }
}
