// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddb
    implements hst
{

    static final boolean a;
    private final hzb b;

    private ddb(hzb hzb1)
    {
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = hzb1;
            return;
        }
    }

    public static hst a(hzb hzb1)
    {
        return new ddb(hzb1);
    }

    private dda b()
    {
        return new dda((hkr)b.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
