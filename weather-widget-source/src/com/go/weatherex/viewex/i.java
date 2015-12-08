// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;


// Referenced classes of package com.go.weatherex.viewex:
//            j, h

class i
    implements j
{

    private int a[];
    private int b[];

    private i()
    {
    }

    i(h h)
    {
        this();
    }

    public final int a(int k)
    {
        return a[k % a.length];
    }

    transient void a(int ai[])
    {
        a = ai;
    }

    public final int b(int k)
    {
        return b[k % b.length];
    }

    transient void b(int ai[])
    {
        b = ai;
    }
}
