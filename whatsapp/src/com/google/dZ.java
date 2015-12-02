// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            da

final class dZ extends da
{

    private final int b;
    private final String c;
    private final boolean d;

    dZ(int i, String s)
    {
        super(i);
        c = s;
        d = false;
        b = 0;
    }

    dZ(int i, String s, int j)
    {
        super(i);
        d = true;
        b = j;
        c = s;
    }

    String a()
    {
        return c;
    }

    int b()
    {
        return b;
    }

    boolean c()
    {
        return d;
    }
}
