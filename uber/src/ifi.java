// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

final class ifi extends AtomicLong
    implements ich, icl
{

    private static final long serialVersionUID = 0xc23093c4d18f2746L;
    final ifj a;
    final ick b;

    public ifi(ifj ifj1, ick ick)
    {
        a = ifj1;
        b = ick;
        lazySet(0xc000000000000000L);
    }

    public final long a()
    {
        if (1L <= 0L)
        {
            throw new IllegalArgumentException("Cant produce zero or less");
        }
        long l;
        long l1;
        do
        {
            l = get();
            if (l == 0xc000000000000000L)
            {
                throw new IllegalStateException("Produced without request");
            }
            if (l == 0x8000000000000000L)
            {
                return 0x8000000000000000L;
            }
            l1 = l - 1L;
            if (l1 < 0L)
            {
                throw new IllegalStateException((new StringBuilder("More produced (1) than requested (")).append(l).append(")").toString());
            }
        } while (!compareAndSet(l, l1));
        return l1;
    }

    public final void a(long l)
    {
        long l3;
        if (l >= 0L)
        {
            while ((l3 = get()) != 0x8000000000000000L && (l3 < 0L || l != 0L)) 
            {
                long l1;
                if (l3 == 0xc000000000000000L)
                {
                    l1 = l;
                } else
                {
                    long l2 = l3 + l;
                    l1 = l2;
                    if (l2 < 0L)
                    {
                        l1 = 0x7fffffffffffffffL;
                    }
                }
                if (compareAndSet(l3, l1))
                {
                    a.f();
                    return;
                }
            }
        }
    }

    public final void b()
    {
        if (get() != 0x8000000000000000L && getAndSet(0x8000000000000000L) != 0x8000000000000000L)
        {
            a.b(this);
            a.f();
        }
    }

    public final boolean c()
    {
        return get() == 0x8000000000000000L;
    }
}
