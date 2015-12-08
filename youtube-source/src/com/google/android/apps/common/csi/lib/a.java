// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            g, Sender

public final class a
{

    private final String a;
    private final String b;
    private int c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Map j;
    private Sender k;
    private String l;
    private String m;

    public a()
    {
        a = String.format("Android %s", new Object[] {
            android.os.Build.VERSION.RELEASE
        });
        b = android.os.Build.VERSION.SDK;
        c = 3;
        d = "_s";
        e = "http://csi.gstatic.com/csi";
        f = 16;
        g = 3;
        h = 1;
        i = 1;
        j = new LinkedHashMap();
    }

    public final int a()
    {
        return c;
    }

    public final a a(int i1)
    {
        i = 1;
        return this;
    }

    public final a a(Sender sender)
    {
        k = sender;
        return this;
    }

    public final a a(String s)
    {
        d = s;
        return this;
    }

    public final a a(String s, String s1)
    {
        l = s;
        m = s1;
        return this;
    }

    public final a b(String s)
    {
        e = s;
        return this;
    }

    public final String b()
    {
        return d;
    }

    public final String c()
    {
        return e;
    }

    public final int d()
    {
        return f;
    }

    public final int e()
    {
        return g;
    }

    public final int f()
    {
        return h;
    }

    public final int g()
    {
        return i;
    }

    public final Map h()
    {
        return j;
    }

    public final Sender i()
    {
        if (k == null)
        {
            k = new g(l, m);
        }
        return k;
    }
}
