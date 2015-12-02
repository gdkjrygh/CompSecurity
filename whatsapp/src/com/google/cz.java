// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ed

final class cz
{

    private int a;
    private ed b;

    cz()
    {
        a = 0;
        b = ed.NUMERIC;
    }

    void a(int i)
    {
        a = a + i;
    }

    boolean a()
    {
        return b == ed.ALPHA;
    }

    void b()
    {
        b = ed.ALPHA;
    }

    void b(int i)
    {
        a = i;
    }

    void c()
    {
        b = ed.ISO_IEC_646;
    }

    int d()
    {
        return a;
    }

    boolean e()
    {
        return b == ed.ISO_IEC_646;
    }

    void f()
    {
        b = ed.NUMERIC;
    }
}
