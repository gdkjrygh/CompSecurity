// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            O, e0, fd, dC, 
//            gw, g, bv, ga, 
//            cR

final class aG
    implements O
{

    private final int a;
    private final boolean b;
    private final boolean c;
    private final e0 d;
    private final gw e;

    private aG(gw gw, int i, e0 e0_1, boolean flag, boolean flag1)
    {
        e = gw;
        a = i;
        d = e0_1;
        b = flag;
        c = flag1;
    }

    aG(gw gw, int i, e0 e0_1, boolean flag, boolean flag1, g g)
    {
        this(gw, i, e0_1, flag, flag1);
    }

    static e0 a(aG ag)
    {
        return ag.d;
    }

    static boolean b(aG ag)
    {
        return ag.b;
    }

    public bv a()
    {
        return d.getJavaType();
    }

    public ga a(ga ga, cR cr)
    {
        return ((fd)ga).a((dC)cr);
    }

    public gw a()
    {
        return e;
    }

    public e0 b()
    {
        return d;
    }

    public int c()
    {
        return a;
    }

    public int c(aG ag)
    {
        return a - ag.a;
    }

    public int compareTo(Object obj)
    {
        return c((aG)obj);
    }

    public boolean d()
    {
        return c;
    }

    public boolean e()
    {
        return b;
    }
}
