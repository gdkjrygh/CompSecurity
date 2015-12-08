// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            ca, cb

final class cf
{

    private final boolean a;
    private final ca b;
    private final ca c;
    private final cb d;

    cf(ca ca, ca ca1, cb cb, boolean flag)
    {
        b = ca;
        c = ca1;
        d = cb;
        a = flag;
    }

    final boolean a()
    {
        return a;
    }

    final ca b()
    {
        return b;
    }

    final ca c()
    {
        return c;
    }

    final cb d()
    {
        return d;
    }

    public final boolean e()
    {
        return c == null;
    }
}
