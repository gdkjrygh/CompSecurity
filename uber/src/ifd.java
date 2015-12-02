// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

final class ifd extends ick
{

    static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(ifd, "g");
    static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(ifd, "i");
    final ick a;
    final icj b;
    final ife c;
    final idv d = idv.a();
    final Queue e;
    volatile boolean f;
    volatile long g;
    volatile long i;
    volatile Throwable k;
    final idd l = new idd() {

        final ifd a;

        public final void a()
        {
            a.g();
        }

            
            {
                a = ifd.this;
                super();
            }
    };

    public ifd(ici ici1, ick ick1)
    {
        f = false;
        g = 0L;
        a = ick1;
        b = ici1.a();
        if (iho.a())
        {
            e = new ihh(igg.c);
        } else
        {
            e = new ign(igg.c);
        }
        c = new ife(b);
    }

    public final void a()
    {
        if (c() || f)
        {
            return;
        } else
        {
            f = true;
            f();
            return;
        }
    }

    public final void a(Object obj)
    {
        if (c())
        {
            return;
        }
        if (!e.offer(idv.a(obj)))
        {
            a(((Throwable) (new icx())));
            return;
        } else
        {
            f();
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        if (c() || f)
        {
            return;
        } else
        {
            k = throwable;
            b();
            f = true;
            f();
            return;
        }
    }

    public final void d()
    {
        a(igg.c);
    }

    final void e()
    {
        a.a(c);
        a.a(new ich() {

            final ifd a;

            public final void a(long l1)
            {
                idq.a(ifd.h, a, l1);
                a.f();
            }

            
            {
                a = ifd.this;
                super();
            }
        });
        a.a(b);
        a.a(this);
    }

    protected final void f()
    {
        if (j.getAndIncrement(this) == 0L)
        {
            b.a(l);
        }
    }

    final void g()
    {
        int i1 = 0;
_L5:
        int j1;
        long l1;
        long l2;
        i = 1L;
        l2 = g;
        l1 = 0L;
        j1 = i1;
_L3:
        if (!a.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (f)
            {
                Throwable throwable = k;
                if (throwable != null)
                {
                    e.clear();
                    a.a(throwable);
                    return;
                }
                if (e.isEmpty())
                {
                    a.a();
                    return;
                }
            }
            if (l2 <= 0L)
            {
                break label0;
            }
            Object obj = e.poll();
            if (obj == null)
            {
                break label0;
            }
            a.a(idv.d(obj));
            l2--;
            l1++;
            j1++;
        }
          goto _L3
        if (l1 > 0L && g != 0x7fffffffffffffffL)
        {
            h.addAndGet(this, -l1);
        }
        i1 = j1;
        if (j.decrementAndGet(this) > 0L) goto _L5; else goto _L4
_L4:
        if (j1 <= 0) goto _L1; else goto _L6
_L6:
        a(j1);
        return;
          goto _L3
    }

}
