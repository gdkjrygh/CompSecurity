// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.a;

import android.content.ContentValues;

public class a
{

    private int a;
    private long b;
    private long c;
    private long d;
    private int e;
    private String f;
    private String g;
    private int h;

    public a(long l, long l1, String s, String s1, int i, 
            long l2, int j, int k)
    {
        h = 0;
        c = l;
        b = l2;
        d = l1;
        f = s;
        g = s1;
        a = i;
        e = j;
        h = k;
    }

    public ContentValues a()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(com.gau.go.a.c.a.B, f);
        contentvalues.put(com.gau.go.a.c.a.z, Long.valueOf(c));
        contentvalues.put(com.gau.go.a.c.a.x, Integer.valueOf(a));
        contentvalues.put(com.gau.go.a.c.a.A, Long.valueOf(d));
        contentvalues.put(com.gau.go.a.c.a.y, Long.valueOf(b));
        contentvalues.put(com.gau.go.a.c.a.C, g);
        contentvalues.put(com.gau.go.a.c.a.C, g);
        contentvalues.put(com.gau.go.a.c.a.D, Integer.valueOf(e));
        contentvalues.put(com.gau.go.a.c.a.E, Integer.valueOf(h));
        return contentvalues;
    }

    public long b()
    {
        return c;
    }

    public long c()
    {
        return d;
    }

    public String d()
    {
        return f;
    }

    public int e()
    {
        return a;
    }

    public String f()
    {
        return g;
    }

    public int g()
    {
        return e;
    }

    public int h()
    {
        return h;
    }
}
