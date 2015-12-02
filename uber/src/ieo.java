// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

final class ieo extends ick
{

    static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ieo, "d");
    private static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(ieo, "h");
    final idv a = idv.a();
    final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    volatile iem c;
    volatile int d;
    private final ick f;
    private final ijb g;
    private volatile long h;
    private final ifs j = new ifs();

    public ieo(ick ick1, ijb ijb1)
    {
        super(ick1);
        f = ick1;
        g = ijb1;
        a(ijd.a(new idd() {

            final ieo a;

            public final void a()
            {
                a.b.clear();
            }

            
            {
                a = ieo.this;
                super();
            }
        }));
    }

    private void a(ica ica1)
    {
        b.add(idv.a(ica1));
        if (e.getAndIncrement(this) == 0)
        {
            g();
        }
    }

    static void a(ieo ieo1)
    {
        ieo1.f();
    }

    static void a(ieo ieo1, long l)
    {
        ieo1.b(l);
    }

    private void b(long l)
    {
        if (l > 0L)
        {
            long l1 = idq.a(i, this, l);
            j.a(l);
            if (l1 == 0L && c == null && d > 0)
            {
                g();
                return;
            }
        }
    }

    private void f()
    {
        i.decrementAndGet(this);
    }

    private void g()
    {
        if (h <= 0L) goto _L2; else goto _L1
_L1:
        Object obj = b.poll();
        if (!idv.b(obj)) goto _L4; else goto _L3
_L3:
        f.a();
_L6:
        return;
_L4:
        if (obj != null)
        {
            obj = (ica)idv.d(obj);
            c = new iem(this, f, j);
            g.a(c);
            ((ica) (obj)).a(c);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (idv.b(b.peek()))
        {
            f.a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a()
    {
        b.add(idv.b());
        if (e.getAndIncrement(this) == 0)
        {
            g();
        }
    }

    public final volatile void a(Object obj)
    {
        a((ica)obj);
    }

    public final void a(Throwable throwable)
    {
        f.a(throwable);
        b();
    }

    public final void d()
    {
        a(2L);
    }

    final void e()
    {
        c = null;
        if (e.decrementAndGet(this) > 0)
        {
            g();
        }
        a(1L);
    }

}
