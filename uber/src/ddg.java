// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddg
    implements hst
{

    static final boolean a;
    private final ddc b;

    private ddg(ddc ddc1)
    {
        if (!a && ddc1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = ddc1;
            return;
        }
    }

    public static hst a(ddc ddc1)
    {
        return new ddg(ddc1);
    }

    private static cyi b()
    {
        return ddc.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
