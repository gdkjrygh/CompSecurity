// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnm
    implements hst
{

    static final boolean a;
    private final fnl b;
    private final hzb c;

    private fnm(fnl fnl1, hzb hzb1)
    {
        if (!a && fnl1 == null)
        {
            throw new AssertionError();
        }
        b = fnl1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(fnl fnl1, hzb hzb1)
    {
        return new fnm(fnl1, hzb1);
    }

    private doa b()
    {
        return fnl.a((gmg)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fnm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
