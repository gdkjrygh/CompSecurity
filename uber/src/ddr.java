// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddr
    implements hst
{

    static final boolean a;
    private final ddn b;
    private final hzb c;

    private ddr(ddn ddn1, hzb hzb1)
    {
        if (!a && ddn1 == null)
        {
            throw new AssertionError();
        }
        b = ddn1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ddn ddn1, hzb hzb1)
    {
        return new ddr(ddn1, hzb1);
    }

    private gmc b()
    {
        ddn ddn1 = b;
        c.a();
        return ddn1.d();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
