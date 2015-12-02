// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fzr
    implements hst
{

    static final boolean a;
    private final fzq b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private fzr(fzq fzq1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && fzq1 == null)
        {
            throw new AssertionError();
        }
        b = fzq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hst a(fzq fzq1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new fzr(fzq1, hzb1, hzb2, hzb3);
    }

    private fzk b()
    {
        return fzq.a((chp)c.a(), (cev)d.a(), (fta)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fzr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
