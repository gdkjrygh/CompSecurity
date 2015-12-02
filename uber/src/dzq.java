// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dzq
    implements hst
{

    static final boolean a;
    private final dzp b;
    private final hzb c;

    private dzq(dzp dzp1, hzb hzb1)
    {
        if (!a && dzp1 == null)
        {
            throw new AssertionError();
        }
        b = dzp1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dzp dzp1, hzb hzb1)
    {
        return new dzq(dzp1, hzb1);
    }

    private hka b()
    {
        hka hka = dzp.a((hjo)c.a());
        if (hka == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hka;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dzq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
