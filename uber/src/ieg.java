// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public final class ieg
    implements icc
{

    private final ihq a;
    private volatile iiy b;
    private final AtomicInteger c = new AtomicInteger(0);
    private final ReentrantLock d = new ReentrantLock();

    public ieg(ihq ihq1)
    {
        b = new iiy();
        a = ihq1;
    }

    private icl a(iiy iiy1)
    {
        return ijd.a(new idd(iiy1) {

            final iiy a;
            final ieg b;

            public final void a()
            {
                ieg.b(b).lock();
                if (ieg.a(b) == a && ieg.c(b).decrementAndGet() == 0)
                {
                    ieg.a(b).b();
                    ieg.a(b, new iiy());
                }
                ieg.b(b).unlock();
                return;
                Exception exception;
                exception;
                ieg.b(b).unlock();
                throw exception;
            }

            
            {
                b = ieg.this;
                a = iiy1;
                super();
            }
        });
    }

    private ide a(ick ick1, AtomicBoolean atomicboolean)
    {
        return new ide(ick1, atomicboolean) {

            final ick a;
            final AtomicBoolean b;
            final ieg c;

            private void a(icl icl1)
            {
                ieg.a(c).a(icl1);
                c.a(a, ieg.a(c));
                ieg.b(c).unlock();
                b.set(false);
                return;
                icl1;
                ieg.b(c).unlock();
                b.set(false);
                throw icl1;
            }

            public final void call(Object obj)
            {
                a((icl)obj);
            }

            
            {
                c = ieg.this;
                a = ick1;
                b = atomicboolean;
                super();
            }
        };
    }

    static iiy a(ieg ieg1)
    {
        return ieg1.b;
    }

    static iiy a(ieg ieg1, iiy iiy1)
    {
        ieg1.b = iiy1;
        return iiy1;
    }

    private void a(ick ick1)
    {
        AtomicBoolean atomicboolean;
        d.lock();
        if (c.incrementAndGet() != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        atomicboolean = new AtomicBoolean(true);
        a.d(a(ick1, atomicboolean));
        if (atomicboolean.get())
        {
            d.unlock();
        }
        return;
        ick1;
        if (atomicboolean.get())
        {
            d.unlock();
        }
        throw ick1;
        a(ick1, b);
        d.unlock();
        return;
        ick1;
        d.unlock();
        throw ick1;
    }

    static ReentrantLock b(ieg ieg1)
    {
        return ieg1.d;
    }

    static AtomicInteger c(ieg ieg1)
    {
        return ieg1.c;
    }

    final void a(ick ick1, iiy iiy1)
    {
        ick1.a(a(iiy1));
        a.a(new ick(ick1, ick1, iiy1) {

            final ick a;
            final iiy b;
            final ieg c;

            private void e()
            {
                ieg.b(c).lock();
                if (ieg.a(c) == b)
                {
                    ieg.a(c).b();
                    ieg.a(c, new iiy());
                    ieg.c(c).set(0);
                }
                ieg.b(c).unlock();
                return;
                Exception exception;
                exception;
                ieg.b(c).unlock();
                throw exception;
            }

            public final void a()
            {
                e();
                a.a();
            }

            public final void a(Object obj)
            {
                a.a(obj);
            }

            public final void a(Throwable throwable)
            {
                e();
                a.a(throwable);
            }

            
            {
                c = ieg.this;
                a = ick2;
                b = iiy1;
                super(ick1);
            }
        });
    }

    public final void call(Object obj)
    {
        a((ick)obj);
    }
}
