// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ggg
    implements hst
{

    static final boolean a;
    private final ggf b;
    private final hzb c;

    private ggg(ggf ggf1, hzb hzb1)
    {
        if (!a && ggf1 == null)
        {
            throw new AssertionError();
        }
        b = ggf1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ggf ggf1, hzb hzb1)
    {
        return new ggg(ggf1, hzb1);
    }

    private gxx b()
    {
        return ggf.a((grs)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ggg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
