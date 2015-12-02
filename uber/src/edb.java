// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class edb
    implements hst
{

    static final boolean a;
    private final ecz b;
    private final hzb c;
    private final hzb d;

    private edb(ecz ecz1, hzb hzb1, hzb hzb2)
    {
        if (!a && ecz1 == null)
        {
            throw new AssertionError();
        }
        b = ecz1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(ecz ecz1, hzb hzb1, hzb hzb2)
    {
        return new edb(ecz1, hzb1, hzb2);
    }

    private edf b()
    {
        return ecz.a((cev)c.a(), (ede)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!edb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
