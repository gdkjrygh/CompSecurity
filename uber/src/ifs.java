// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifs
    implements ich
{

    static final ich g = new ich() {

        public final void a(long l)
        {
        }

    };
    long a;
    ich b;
    boolean c;
    long d;
    long e;
    ich f;

    public ifs()
    {
    }

    private void b()
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        Object obj;
        long l2;
        long l3;
        l2 = d;
        l3 = e;
        obj = f;
        if (l2 != 0L || l3 != 0L || obj != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        return;
        d = 0L;
        e = 0L;
        f = null;
        this;
        JVM INSTR monitorexit ;
        long l1 = a;
        long l = l1;
        if (l1 != 0x7fffffffffffffffL)
        {
            l = l1 + l2;
            if (l < 0L || l == 0x7fffffffffffffffL)
            {
                a = 0x7fffffffffffffffL;
                l = 0x7fffffffffffffffL;
            } else
            {
                l -= l3;
                if (l < 0L)
                {
                    throw new IllegalStateException("more produced than requested");
                }
                a = l;
            }
        }
        if (obj != null)
        {
            if (obj == g)
            {
                b = null;
            } else
            {
                b = ((ich) (obj));
                ((ich) (obj)).a(l);
            }
        } else
        {
            ich ich1 = b;
            if (ich1 != null && l2 != 0L)
            {
                ich1.a(l2);
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        if (1L <= 0L)
        {
            throw new IllegalArgumentException("n > 0 required");
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        e = e + 1L;
        this;
        JVM INSTR monitorexit ;
        return;
        c = true;
        this;
        JVM INSTR monitorexit ;
        long l = a;
        if (l == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        l--;
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        throw new IllegalStateException("more items arrived than were requested");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a = l;
        b();
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (l == 0L)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        d = d + l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c = true;
        this;
        JVM INSTR monitorexit ;
        long l2 = a + l;
        long l1;
        l1 = l2;
        if (l2 < 0L)
        {
            l1 = 0x7fffffffffffffffL;
        }
        ich ich1;
        a = l1;
        ich1 = b;
        if (ich1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        ich1.a(l);
        b();
        return;
        ich1;
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
        throw ich1;
        ich1;
        this;
        JVM INSTR monitorexit ;
        throw ich1;
    }

    public final void a(ich ich1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ich ich2;
        ich2 = ich1;
        if (ich1 != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ich2 = g;
        f = ich2;
        this;
        JVM INSTR monitorexit ;
        return;
        c = true;
        this;
        JVM INSTR monitorexit ;
        b = ich1;
        if (ich1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        ich1.a(a);
        b();
        return;
        ich1;
        this;
        JVM INSTR monitorenter ;
        c = false;
        this;
        JVM INSTR monitorexit ;
        throw ich1;
        ich1;
        this;
        JVM INSTR monitorexit ;
        throw ich1;
        ich1;
        this;
        JVM INSTR monitorexit ;
        throw ich1;
    }

}
