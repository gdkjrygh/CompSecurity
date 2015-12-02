// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gbk
    implements hst
{

    static final boolean a;
    private final hzb b;
    private final hzb c;

    private gbk(hzb hzb1, hzb hzb2)
    {
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        b = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb2;
            return;
        }
    }

    public static hst a(hzb hzb1, hzb hzb2)
    {
        return new gbk(hzb1, hzb2);
    }

    private gbj b()
    {
        return new gbj((chp)b.a(), (gbi)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!gbk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
