// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class djc
    implements hst
{

    static final boolean a;
    private final djb b;
    private final hzb c;

    private djc(djb djb1, hzb hzb1)
    {
        if (!a && djb1 == null)
        {
            throw new AssertionError();
        }
        b = djb1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(djb djb1, hzb hzb1)
    {
        return new djc(djb1, hzb1);
    }

    private czz b()
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
        if (!djc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
