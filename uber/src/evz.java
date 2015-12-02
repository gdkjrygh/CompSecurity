// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class evz
    implements hst
{

    static final boolean a;
    private final evx b;
    private final hzb c;

    private evz(evx evx1, hzb hzb1)
    {
        if (!a && evx1 == null)
        {
            throw new AssertionError();
        }
        b = evx1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(evx evx1, hzb hzb1)
    {
        return new evz(evx1, hzb1);
    }

    private hkd b()
    {
        hkd hkd = evx.a((hjo)c.a());
        if (hkd == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hkd;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!evz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
