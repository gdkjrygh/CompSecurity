// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class ifj extends ick
    implements icl
{

    static final ifi e[] = new ifi[0];
    static final ifi f[] = new ifi[0];
    final Queue a;
    final idv b = idv.a();
    final AtomicReference c;
    volatile Object d;
    final AtomicReference g;
    final AtomicBoolean h = new AtomicBoolean();
    boolean i;
    boolean j;

    public ifj(AtomicReference atomicreference)
    {
        Object obj;
        if (iho.a())
        {
            obj = new ihh(igg.c);
        } else
        {
            obj = new ign(igg.c);
        }
        a = ((Queue) (obj));
        g = new AtomicReference(e);
        c = atomicreference;
    }

    private boolean a(Object obj, boolean flag)
    {
        int k;
        int l;
        l = 0;
        k = 0;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (!idv.b(obj))
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        c.compareAndSet(this, null);
        obj = (ifi[])g.getAndSet(f);
        l = obj.length;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ifi) (obj[k])).b.a();
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        b();
        return true;
        obj;
        b();
        throw obj;
        obj = idv.e(obj);
        c.compareAndSet(this, null);
        ifi aifi[];
        int i1;
        aifi = (ifi[])g.getAndSet(f);
        i1 = aifi.length;
        k = l;
_L4:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        aifi[k].b.a(((Throwable) (obj)));
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        b();
        return true;
        obj;
        b();
        throw obj;
        return false;
    }

    public final void a()
    {
        if (d == null)
        {
            d = idv.b();
            f();
        }
    }

    public final void a(Object obj)
    {
        if (!a.offer(idv.a(obj)))
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
        if (d == null)
        {
            d = idv.a(throwable);
            f();
        }
    }

    final boolean a(ifi ifi1)
    {
        ifi aifi[];
        ifi aifi1[];
        do
        {
            aifi = (ifi[])g.get();
            if (aifi == f)
            {
                return false;
            }
            int k = aifi.length;
            aifi1 = new ifi[k + 1];
            System.arraycopy(aifi, 0, aifi1, 0, k);
            aifi1[k] = ifi1;
        } while (!g.compareAndSet(aifi, aifi1));
        return true;
    }

    final void b(ifi ifi1)
    {
_L4:
        ifi aifi1[] = (ifi[])g.get();
        if (aifi1 != e && aifi1 != f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        byte byte0;
        int i1;
        byte0 = -1;
        i1 = aifi1.length;
        k = 0;
_L5:
        int l;
        l = byte0;
        if (k >= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!aifi1[k].equals(ifi1))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        l = k;
        if (l < 0) goto _L1; else goto _L3
_L3:
        ifi aifi[];
        if (i1 == 1)
        {
            aifi = e;
        } else
        {
            aifi = new ifi[i1 - 1];
            System.arraycopy(aifi1, 0, aifi, 0, l);
            System.arraycopy(aifi1, l + 1, aifi, l, i1 - l - 1);
        }
        if (g.compareAndSet(aifi1, aifi))
        {
            return;
        }
          goto _L4
        k++;
          goto _L5
    }

    public final void d()
    {
        a(igg.c);
    }

    final void e()
    {
        a(ijd.a(new idd() {

            final ifj a;

            public final void a()
            {
                a.g.getAndSet(ifj.f);
                a.c.compareAndSet(a, null);
            }

            
            {
                a = ifj.this;
                super();
            }
        }));
    }

    final void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        j = true;
        this;
        JVM INSTR monitorexit ;
        return;
        i = true;
        j = false;
        this;
        JVM INSTR monitorexit ;
        boolean flag = false;
_L11:
        Object obj;
        boolean flag1;
        obj = d;
        flag1 = a.isEmpty();
        if (a(obj, flag1)) goto _L2; else goto _L1
_L1:
        if (flag1) goto _L4; else goto _L3
_L3:
        int j1;
        obj = (ifi[])g.get();
        j1 = obj.length;
        long l1 = 0x7fffffffffffffffL;
        int k1 = obj.length;
        int k;
        int l;
        l = 0;
        k = 0;
_L6:
        if (k >= k1)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        long l3 = obj[k].get();
        if (l3 < 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        long l2 = Math.min(l1, l3);
        int i1 = l;
_L7:
        k++;
        l = i1;
        l1 = l2;
        if (true) goto _L6; else goto _L5
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        i1 = l;
        l2 = l1;
        if (l3 == 0x8000000000000000L)
        {
            i1 = l + 1;
            l2 = l1;
        }
          goto _L7
        if (j1 != l) goto _L9; else goto _L8
_L8:
        obj = d;
        if (a.poll() == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (a(obj, flag1)) goto _L2; else goto _L10
_L10:
        a(1L);
          goto _L11
        obj;
        k = ((flag) ? 1 : 0);
_L24:
        if (k != 0) goto _L13; else goto _L12
_L12:
        this;
        JVM INSTR monitorenter ;
        i = false;
        this;
        JVM INSTR monitorexit ;
_L13:
        throw obj;
_L9:
        k = 0;
_L27:
        if ((long)k >= l1) goto _L15; else goto _L14
_L14:
        Object obj1;
        Object obj2;
        obj1 = d;
        obj2 = a.poll();
        Exception exception;
        Throwable throwable;
        if (obj2 == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (a(obj1, flag1)) goto _L2; else goto _L16
_L16:
        if (flag1) goto _L15; else goto _L17
_L17:
        obj1 = idv.d(obj2);
        i1 = obj.length;
        l = 0;
_L26:
        if (l >= i1) goto _L19; else goto _L18
_L18:
        obj2 = obj[l];
        l2 = ((ifi) (obj2)).get();
        if (l2 <= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((ifi) (obj2)).b.a(obj1);
        ((ifi) (obj2)).a();
        continue; /* Loop/switch isn't completed */
        throwable;
        ((ifi) (obj2)).b();
        ((ifi) (obj2)).b.a(throwable);
        continue; /* Loop/switch isn't completed */
_L15:
        if (k <= 0) goto _L21; else goto _L20
_L20:
        a(k);
          goto _L21
_L4:
        this;
        JVM INSTR monitorenter ;
        if (j) goto _L23; else goto _L22
_L22:
        i = false;
        l = 1;
        this;
        JVM INSTR monitorexit ;
        return;
_L25:
        l = k;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
          goto _L24
_L23:
        j = false;
        this;
        JVM INSTR monitorexit ;
        break; /* Loop/switch isn't completed */
        exception;
        k = 0;
          goto _L25
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        return;
          goto _L26
_L19:
        k++;
          goto _L27
_L21:
        if (l1 != 0L && !flag1) goto _L11; else goto _L4
        exception;
        k = l;
          goto _L25
    }

}
