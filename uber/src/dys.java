// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dys
    implements hst
{

    static final boolean a;
    private final dyq b;
    private final hzb c;

    private dys(dyq dyq1, hzb hzb1)
    {
        if (!a && dyq1 == null)
        {
            throw new AssertionError();
        }
        b = dyq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dyq dyq1, hzb hzb1)
    {
        return new dys(dyq1, hzb1);
    }

    private hkf b()
    {
        hkf hkf = dyq.a((hjo)c.a());
        if (hkf == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hkf;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dys.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
