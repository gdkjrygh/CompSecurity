// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eda
    implements hst
{

    static final boolean a;
    private final ecz b;

    private eda(ecz ecz1)
    {
        if (!a && ecz1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = ecz1;
            return;
        }
    }

    public static hst a(ecz ecz1)
    {
        return new eda(ecz1);
    }

    private ede b()
    {
        return b.b();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!eda.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
