// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;

import java.util.Map;

// Referenced classes of package com.google.ads.conversiontracking:
//            e

public final class g
{

    private String a;
    private boolean b;
    private GoogleConversionPing.ConversionType c;
    private String d;
    private String e;
    private String f;
    private e g;
    private Map h;

    public g()
    {
    }

    static boolean a(g g1)
    {
        return g1.b;
    }

    static GoogleConversionPing.ConversionType b(g g1)
    {
        return g1.c;
    }

    static String c(g g1)
    {
        return g1.a;
    }

    static String d(g g1)
    {
        return g1.f;
    }

    static Map e(g g1)
    {
        return g1.h;
    }

    static e f(g g1)
    {
        return g1.g;
    }

    static String g(g g1)
    {
        return g1.e;
    }

    static String h(g g1)
    {
        return g1.d;
    }

    public final g a()
    {
        b = true;
        return this;
    }

    public final g a(String s)
    {
        a = s;
        return this;
    }

    public final g a(Map map)
    {
        h = map;
        return this;
    }

    public final g b(String s)
    {
        d = s;
        return this;
    }

    public final g c(String s)
    {
        e = s;
        return this;
    }

    public final g d(String s)
    {
        f = s;
        return this;
    }
}
