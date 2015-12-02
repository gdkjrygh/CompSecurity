// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ewb
    implements hst
{

    static final boolean a;
    private final evx b;

    private ewb(evx evx1)
    {
        if (!a && evx1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = evx1;
            return;
        }
    }

    public static hst a(evx evx1)
    {
        return new ewb(evx1);
    }

    private static evp b()
    {
        return evx.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ewb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
