// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class enz
    implements hst
{

    static final boolean a;
    private final eny b;
    private final hzb c;

    private enz(eny eny1, hzb hzb1)
    {
        if (!a && eny1 == null)
        {
            throw new AssertionError();
        }
        b = eny1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(eny eny1, hzb hzb1)
    {
        return new enz(eny1, hzb1);
    }

    private doa b()
    {
        return eny.a((gmg)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!enz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
