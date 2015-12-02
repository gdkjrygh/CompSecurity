// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dfi
    implements hst
{

    static final boolean a;
    private final dfe b;
    private final hzb c;

    private dfi(dfe dfe1, hzb hzb1)
    {
        if (!a && dfe1 == null)
        {
            throw new AssertionError();
        }
        b = dfe1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dfe dfe1, hzb hzb1)
    {
        return new dfi(dfe1, hzb1);
    }

    private czm b()
    {
        return b.a((chp)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dfi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
