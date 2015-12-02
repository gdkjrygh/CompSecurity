// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kx
{

    private static final Object a = new Object();
    private static kx b;
    private final oe c = new oe();
    private final ks d = new ks();
    private final ky e = new ky();
    private final ma f = new ma();

    protected kx()
    {
    }

    public static oe a()
    {
        return d().c;
    }

    private static void a(kx kx1)
    {
        synchronized (a)
        {
            b = kx1;
        }
        return;
        kx1;
        obj;
        JVM INSTR monitorexit ;
        throw kx1;
    }

    public static ks b()
    {
        return d().d;
    }

    public static ky c()
    {
        return d().e;
    }

    private static kx d()
    {
        kx kx1;
        synchronized (a)
        {
            kx1 = b;
        }
        return kx1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a(new kx());
    }
}
