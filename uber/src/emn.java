// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emn
    implements hst
{

    static final boolean a;
    private final emm b;

    private emn(emm emm1)
    {
        if (!a && emm1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = emm1;
            return;
        }
    }

    public static hst a(emm emm1)
    {
        return new emn(emm1);
    }

    private static dce b()
    {
        return emm.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!emn.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
