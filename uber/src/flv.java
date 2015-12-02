// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flv
    implements hst
{

    static final boolean a;
    private final flt b;
    private final hzb c;

    private flv(flt flt1, hzb hzb1)
    {
        if (!a && flt1 == null)
        {
            throw new AssertionError();
        }
        b = flt1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(flt flt1, hzb hzb1)
    {
        return new flv(flt1, hzb1);
    }

    private fmh b()
    {
        return flt.a((dkn)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!flv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
