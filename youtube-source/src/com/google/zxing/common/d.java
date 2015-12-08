// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import java.util.List;

public final class d
{

    private final byte a[];
    private final String b;
    private final List c;
    private final String d;
    private Integer e;
    private Integer f;
    private Object g;

    public d(byte abyte0[], String s, List list, String s1)
    {
        a = abyte0;
        b = s;
        c = list;
        d = s1;
    }

    public final void a(Integer integer)
    {
        e = integer;
    }

    public final void a(Object obj)
    {
        g = obj;
    }

    public final byte[] a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final void b(Integer integer)
    {
        f = integer;
    }

    public final List c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final Object e()
    {
        return g;
    }
}
