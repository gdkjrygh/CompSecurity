// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import java.util.Locale;

public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    private static final d h[];

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d a(String s)
    {
        s = s.toLowerCase(Locale.US);
        if ("mba".equals(s))
        {
            return b;
        }
        if ("brk".equals(s))
        {
            return d;
        }
        if ("tpb".equals(s))
        {
            return c;
        }
        if ("pcg".equals(s))
        {
            return e;
        }
        if ("bob".equals(s))
        {
            return f;
        }
        if ("cob".equals(s))
        {
            return g;
        } else
        {
            return a;
        }
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/wf/wellsfargomobile/util/d, s);
    }

    public static d[] values()
    {
        return (d[])h.clone();
    }

    static 
    {
        a = new d("UNK", 0);
        b = new d("MBA", 1);
        c = new d("TPB", 2);
        d = new d("BRK", 3);
        e = new d("PCG", 4);
        f = new d("BOB", 5);
        g = new d("COB", 6);
        h = (new d[] {
            a, b, c, d, e, f, g
        });
    }
}
