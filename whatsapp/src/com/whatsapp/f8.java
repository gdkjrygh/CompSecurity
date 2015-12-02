// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ak3

class f8
{

    private int a[];
    private int b;
    private int c;
    private int d;

    private f8(int i, int ai[], int j, int k)
    {
        b = i;
        a = ai;
        c = j;
        d = k;
    }

    f8(int i, int ai[], int j, int k, ak3 ak3)
    {
        this(i, ai, j, k);
    }

    static int a(f8 f8_1)
    {
        return f8_1.c;
    }

    static int b(f8 f8_1)
    {
        return f8_1.d;
    }

    static int c(f8 f8_1)
    {
        return f8_1.b;
    }

    public int a()
    {
        return a.length;
    }

    public int a(int i)
    {
        return a[i];
    }
}
