// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iew
    implements icd
{

    final boolean a;
    final int b;

    private iew(boolean flag)
    {
        a = flag;
        b = 0x7fffffff;
    }

    iew(boolean flag, byte byte0)
    {
        this(flag);
    }

    private ick a(ick ick1)
    {
        ifb ifb1 = new ifb(ick1, a, b);
        ifa ifa1 = new ifa(ifb1);
        ifb1.d = ifa1;
        ick1.a(ifb1);
        ick1.a(ifa1);
        return ifb1;
    }

    public static iew a(boolean flag)
    {
        if (flag)
        {
            return iex.a;
        } else
        {
            return iey.a;
        }
    }

    public final volatile Object a(Object obj)
    {
        return a((ick)obj);
    }
}
