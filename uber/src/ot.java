// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ot
{

    private static final Object a = new Object();
    private static ot b;
    private final ne c = new ne();
    private final mc d = new mc();
    private final mi e = new mi();
    private final ahb f = new ahb();
    private final ajc g = new ajc();
    private final akp h = new akp();
    private final aje i;
    private final air j = new air();
    private final alm k = new aln();
    private final abq l = new abq();
    private final abl m = new abl();
    private final abk n = new abk();
    private final abm o = new abm();
    private final mz p = new mz();
    private final aeh q = new aeh();
    private final ads r = new ads();

    protected ot()
    {
        i = aje.a(android.os.Build.VERSION.SDK_INT);
    }

    public static ne a()
    {
        return q().c;
    }

    private static void a(ot ot1)
    {
        synchronized (a)
        {
            b = ot1;
        }
        return;
        ot1;
        obj;
        JVM INSTR monitorexit ;
        throw ot1;
    }

    public static mc b()
    {
        return q().d;
    }

    public static mi c()
    {
        return q().e;
    }

    public static ahb d()
    {
        return q().f;
    }

    public static ajc e()
    {
        return q().g;
    }

    public static akp f()
    {
        return q().h;
    }

    public static aje g()
    {
        return q().i;
    }

    public static air h()
    {
        return q().j;
    }

    public static alm i()
    {
        return q().k;
    }

    public static abq j()
    {
        return q().l;
    }

    public static abl k()
    {
        return q().m;
    }

    public static abk l()
    {
        return q().n;
    }

    public static abm m()
    {
        return q().o;
    }

    public static mz n()
    {
        return q().p;
    }

    public static aeh o()
    {
        return q().q;
    }

    public static ads p()
    {
        return q().r;
    }

    private static ot q()
    {
        ot ot1;
        synchronized (a)
        {
            ot1 = b;
        }
        return ot1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a(new ot());
    }
}
