// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ick
    implements icg, icl
{

    private static final Long a = Long.valueOf(0x8000000000000000L);
    private final igm b;
    private final ick c;
    private ich d;
    private long e;

    public ick()
    {
        this(null, false);
    }

    protected ick(ick ick1)
    {
        this(ick1, true);
    }

    protected ick(ick ick1, boolean flag)
    {
        e = a.longValue();
        c = ick1;
        if (flag && ick1 != null)
        {
            ick1 = ick1.b;
        } else
        {
            ick1 = new igm();
        }
        b = ick1;
    }

    private void b(long l)
    {
        if (e == a.longValue())
        {
            e = l;
            return;
        }
        l = e + l;
        if (l < 0L)
        {
            e = 0x7fffffffffffffffL;
            return;
        } else
        {
            e = l;
            return;
        }
    }

    protected final void a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("number requested cannot be negative: ")).append(l).toString());
        }
        this;
        JVM INSTR monitorenter ;
        ich ich1;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        ich1 = d;
        this;
        JVM INSTR monitorexit ;
        ich1.a(l);
        return;
        b(l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ich ich1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        long l;
        l = e;
        d = ich1;
        boolean flag = flag1;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        flag = flag1;
        if (l == a.longValue())
        {
            flag = true;
        }
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            c.a(d);
            return;
        }
        break MISSING_BLOCK_LABEL_63;
        ich1;
        this;
        JVM INSTR monitorexit ;
        throw ich1;
        if (l == a.longValue())
        {
            d.a(0x7fffffffffffffffL);
            return;
        } else
        {
            d.a(l);
            return;
        }
    }

    public final void a(icl icl1)
    {
        b.a(icl1);
    }

    public final void b()
    {
        b.b();
    }

    public final boolean c()
    {
        return b.c();
    }

    public void d()
    {
    }

}
