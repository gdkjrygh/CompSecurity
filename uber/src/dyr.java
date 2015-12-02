// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dyr
    implements hst
{

    static final boolean a;
    private final dyq b;

    private dyr(dyq dyq1)
    {
        if (!a && dyq1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dyq1;
            return;
        }
    }

    public static hst a(dyq dyq1)
    {
        return new dyr(dyq1);
    }

    private static dyi b()
    {
        return dyq.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dyr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
