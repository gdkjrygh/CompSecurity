// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fbl
    implements hst
{

    static final boolean a;
    private final fbk b;

    private fbl(fbk fbk1)
    {
        if (!a && fbk1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = fbk1;
            return;
        }
    }

    public static hst a(fbk fbk1)
    {
        return new fbl(fbk1);
    }

    private static fbn b()
    {
        return fbk.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fbl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
