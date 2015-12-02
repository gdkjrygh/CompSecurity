// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class diy
    implements hst
{

    static final boolean a;
    private final diw b;
    private final hzb c;

    private diy(diw diw1, hzb hzb1)
    {
        if (!a && diw1 == null)
        {
            throw new AssertionError();
        }
        b = diw1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(diw diw1, hzb hzb1)
    {
        return new diy(diw1, hzb1);
    }

    private czy b()
    {
        return b.a((cev)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!diy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
