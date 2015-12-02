// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

final class idu extends AtomicLong
    implements ich, icl
{

    private static final long serialVersionUID = 0xdc81b6e2531291e3L;
    final ick a;
    final ids b;
    Object c[];
    int d;
    int e;
    boolean f;
    boolean g;

    public idu(ick ick1, ids ids1)
    {
        a = ick1;
        b = ids1;
    }

    private long b(long l)
    {
        return addAndGet(-l);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        g = true;
        this;
        JVM INSTR monitorexit ;
        return;
        f = true;
        this;
        JVM INSTR monitorexit ;
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        flag = false;
        i = ((flag) ? 1 : 0);
        ick ick1 = a;
_L14:
        i = ((flag) ? 1 : 0);
        long l1 = get();
        if (l1 < 0L) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
        int j1 = b.d();
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
        Object aobj[] = c;
        Object obj;
        obj = ((Object) (aobj));
        if (aobj != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i = ((flag) ? 1 : 0);
        obj = ((Object) (b.c()));
        i = ((flag) ? 1 : 0);
        c = ((Object []) (obj));
        i = ((flag) ? 1 : 0);
        int k1 = obj.length - 1;
        i = ((flag) ? 1 : 0);
        int i1 = e;
        i = ((flag) ? 1 : 0);
        int j = d;
        if (l1 != 0L) goto _L6; else goto _L5
_L5:
        obj = obj[j];
        i = ((flag) ? 1 : 0);
        if (!idv.b(obj))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        i = ((flag) ? 1 : 0);
        ick1.a();
        i = 1;
        b();
        return;
        JVM INSTR monitorenter ;
        f = false;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        i = ((flag) ? 1 : 0);
        if (!idv.c(obj)) goto _L4; else goto _L7
_L7:
        i = ((flag) ? 1 : 0);
        ick1.a(idv.e(obj));
        i = 1;
        b();
        return;
_L16:
        if (i1 >= j1 || l1 <= 0L) goto _L9; else goto _L8
_L8:
        i = ((flag) ? 1 : 0);
        if (ick1.c()) goto _L2; else goto _L10
_L10:
        int l;
        l = j;
        obj = ((Object) (aobj));
        if (j != k1)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        i = ((flag) ? 1 : 0);
        obj = ((Object) ((Object[])(Object[])aobj[k1]));
        l = 0;
        aobj = ((Object []) (obj[l]));
        i = ((flag) ? 1 : 0);
        j = ((flag1) ? 1 : 0);
        if (!idv.a(ick1, ((Object) (aobj))))
        {
            break MISSING_BLOCK_LABEL_510;
        }
        j = 1;
        i = 1;
        try
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            i = j;
        }
        finally
        {
            if (i != 0) goto _L0; else goto _L0
        }
        icw.a(((Throwable) (obj)));
        j = 1;
        i = j;
        b();
        i = j;
        if (idv.c(((Object) (aobj)))) goto _L2; else goto _L11
_L11:
        i = j;
        if (idv.b(((Object) (aobj)))) goto _L2; else goto _L12
_L12:
        i = j;
        ick1.a(ida.a(((Throwable) (obj)), idv.d(((Object) (aobj)))));
        return;
_L9:
        i = ((flag) ? 1 : 0);
        if (ick1.c()) goto _L2; else goto _L13
_L13:
        i = ((flag) ? 1 : 0);
        e = i1;
        i = ((flag) ? 1 : 0);
        d = j;
        i = ((flag) ? 1 : 0);
        c = aobj;
        i = ((flag) ? 1 : 0);
        int k;
        b(k);
_L4:
        i = ((flag) ? 1 : 0);
        this;
        JVM INSTR monitorenter ;
        i = ((flag2) ? 1 : 0);
        if (g)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        i = ((flag2) ? 1 : 0);
        f = false;
        i = 1;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        i = ((flag2) ? 1 : 0);
        g = false;
        i = ((flag2) ? 1 : 0);
        this;
        JVM INSTR monitorexit ;
          goto _L14
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        return;
_L6:
        if (l1 <= 0L) goto _L4; else goto _L15
_L15:
        k = 0;
        aobj = ((Object []) (obj));
          goto _L16
        i1++;
        l1--;
        k++;
        j = l + 1;
        aobj = ((Object []) (obj));
          goto _L16
    }

    public final void a(long l)
    {
        long l1;
        long l3;
        do
        {
            l3 = get();
            if (l3 < 0L)
            {
                return;
            }
            long l2 = l3 + l;
            l1 = l2;
            if (l2 < 0L)
            {
                l1 = 0x7fffffffffffffffL;
            }
        } while (!compareAndSet(l3, l1));
        a();
    }

    public final void b()
    {
        if (get() >= 0L && getAndSet(-1L) >= 0L)
        {
            b.b(this);
        }
    }

    public final boolean c()
    {
        return get() < 0L;
    }
}
