// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fjs
    implements hst
{

    static final boolean a;
    private final fjr b;

    private fjs(fjr fjr1)
    {
        if (!a && fjr1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = fjr1;
            return;
        }
    }

    public static hst a(fjr fjr1)
    {
        return new fjs(fjr1);
    }

    private iu b()
    {
        return b.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fjs.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
