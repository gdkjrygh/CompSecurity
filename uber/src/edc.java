// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class edc
    implements hst
{

    static final boolean a;
    private final ecz b;

    private edc(ecz ecz1)
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
        return new edc(ecz1);
    }

    private edm b()
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
        if (!edc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
