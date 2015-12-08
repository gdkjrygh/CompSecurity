// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            ca, cb

final class cc extends ca
{

    private final cb a;
    private int b;

    cc(int i, int j, cb cb)
    {
        super(i, j);
        a = cb;
    }

    final cb c()
    {
        return a;
    }

    final int d()
    {
        return b;
    }

    final void e()
    {
        b = b + 1;
    }
}
