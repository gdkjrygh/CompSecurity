// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import java.util.TreeMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.b:
//            i, p

public class h
{

    private boolean a;
    private String b;
    private TreeMap c;
    private boolean d;

    public h(String s, boolean flag)
    {
        b = s;
        a = flag;
        c = new TreeMap(new i(this));
    }

    public String a()
    {
        return b;
    }

    public void a(p p1)
    {
        c.put(Long.valueOf(p1.c()), p1);
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a(long l)
    {
        return c.remove(Long.valueOf(l)) != null;
    }

    public p b(long l)
    {
        return (p)c.get(Long.valueOf(l));
    }

    public TreeMap b()
    {
        return c;
    }

    public boolean c()
    {
        return c.isEmpty();
    }

    public boolean d()
    {
        return d;
    }

    public boolean e()
    {
        return a;
    }
}
