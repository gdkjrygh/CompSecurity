// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dfl
    implements hst
{

    static final boolean a;
    private final dfe b;
    private final hzb c;

    private dfl(dfe dfe1, hzb hzb1)
    {
        if (!a && dfe1 == null)
        {
            throw new AssertionError();
        }
        b = dfe1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dfe dfe1, hzb hzb1)
    {
        return new dfl(dfe1, hzb1);
    }

    private czp b()
    {
        return b.a((gqd)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dfl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
