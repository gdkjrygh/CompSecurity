// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

final class idy
    implements ich
{

    private static final AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(idy, "m");
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicLong b = new AtomicLong();
    private final List c;
    private final ick d;
    private final ido e;
    private final idz f[];
    private final igg g = igg.d();
    private final Object h[];
    private final BitSet i;
    private volatile int j;
    private final BitSet k;
    private volatile int l;
    private volatile long m;

    public idy(ick ick1, List list, ido ido1)
    {
        c = list;
        d = ick1;
        e = ido1;
        int i1 = list.size();
        f = new idz[i1];
        h = new Object[i1];
        i = new BitSet(i1);
        k = new BitSet(i1);
    }

    private void a()
    {
        boolean flag = false;
        if (n.getAndIncrement(this) == 0L)
        {
            int j1 = 0;
            do
            {
                int i1 = j1;
                if (b.get() > 0L)
                {
                    Object obj = g.h();
                    i1 = j1;
                    int k1;
                    if (obj != null)
                    {
                        if (igg.b(obj))
                        {
                            d.a();
                            i1 = j1;
                        } else
                        {
                            igg.a(obj, d);
                            i1 = j1 + 1;
                            b.decrementAndGet();
                        }
                    }
                }
                j1 = i1;
            } while (n.decrementAndGet(this) > 0L);
            if (i1 > 0)
            {
                obj = f;
                k1 = obj.length;
                for (j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
                {
                    obj[j1].b(i1);
                }

            }
        }
    }

    public final void a(int i1, boolean flag)
    {
        boolean flag2 = false;
        if (flag) goto _L2; else goto _L1
_L1:
        d.a();
_L4:
        return;
_L2:
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = flag2;
        if (k.get(i1))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        k.set(i1);
        l = l + 1;
        flag1 = flag2;
        if (l == h.length)
        {
            flag1 = true;
        }
        this;
        JVM INSTR monitorexit ;
        if (!flag1) goto _L4; else goto _L3
_L3:
        g.f();
        a();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l1)
    {
        idq.a(b, l1);
        if (!a.get() && a.compareAndSet(false, true))
        {
            int k1 = igg.c / c.size();
            int i2 = igg.c;
            int j2 = c.size();
            int i1 = 0;
            while (i1 < c.size()) 
            {
                ica ica1 = (ica)c.get(i1);
                idz idz1;
                int j1;
                if (i1 == c.size() - 1)
                {
                    j1 = k1 + i2 % j2;
                } else
                {
                    j1 = k1;
                }
                idz1 = new idz(i1, j1, d, this);
                f[i1] = idz1;
                ica1.a(idz1);
                i1++;
            }
        }
        a();
    }

    public final void a(Throwable throwable)
    {
        d.a(throwable);
    }

    public final boolean a(int i1, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!i.get(i1))
        {
            i.set(i1);
            j = j + 1;
        }
        h[i1] = obj;
        if (j == h.length)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        g.a(e.a(h));
_L1:
        this;
        JVM INSTR monitorexit ;
        a();
        return true;
        obj;
        a(((Throwable) (obj)));
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        a(((Throwable) (obj)));
          goto _L1
    }

}
