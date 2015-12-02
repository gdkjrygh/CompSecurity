// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dfj
    implements hst
{

    static final boolean a;
    private final dfe b;
    private final hzb c;

    private dfj(dfe dfe1, hzb hzb1)
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
        return new dfj(dfe1, hzb1);
    }

    private czn b()
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
        if (!dfj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
