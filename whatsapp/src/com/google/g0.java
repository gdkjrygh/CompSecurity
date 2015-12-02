// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            bc, b5

final class g0
{

    private final int a;
    private final bc b[];

    private g0(int i, bc bc1)
    {
        a = i;
        b = (new bc[] {
            bc1
        });
    }

    g0(int i, bc bc1, b5 b5)
    {
        this(i, bc1);
    }

    private g0(int i, bc bc1, bc bc2)
    {
        a = i;
        b = (new bc[] {
            bc1, bc2
        });
    }

    g0(int i, bc bc1, bc bc2, b5 b5)
    {
        this(i, bc1, bc2);
    }

    bc[] a()
    {
        return b;
    }

    int b()
    {
        return a;
    }
}
