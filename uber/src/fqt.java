// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fqt
    implements hst
{

    static final boolean a;
    private final fqq b;
    private final hzb c;

    private fqt(fqq fqq1, hzb hzb1)
    {
        if (!a && fqq1 == null)
        {
            throw new AssertionError();
        }
        b = fqq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(fqq fqq1, hzb hzb1)
    {
        return new fqt(fqq1, hzb1);
    }

    private ewj b()
    {
        return fqq.a((gmg)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fqt.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
