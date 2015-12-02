// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ghq
    implements hst
{

    static final boolean a;
    private final ghp b;
    private final hzb c;

    private ghq(ghp ghp1, hzb hzb1)
    {
        if (!a && ghp1 == null)
        {
            throw new AssertionError();
        }
        b = ghp1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ghp ghp1, hzb hzb1)
    {
        return new ghq(ghp1, hzb1);
    }

    private hkh b()
    {
        hkh hkh = ghp.a((hjo)c.a());
        if (hkh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hkh;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ghq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
