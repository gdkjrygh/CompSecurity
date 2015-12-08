// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.b;
import com.google.zxing.oned.rss.c;

final class a
{

    private final boolean a = true;
    private final b b;
    private final b c;
    private final c d;

    a(b b1, b b2, c c1, boolean flag)
    {
        b = b1;
        c = b2;
        d = c1;
    }

    private static int a(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return obj.hashCode();
        }
    }

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    final b a()
    {
        return b;
    }

    final b b()
    {
        return c;
    }

    final c c()
    {
        return d;
    }

    public final boolean d()
    {
        return c == null;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof a)
        {
            if (a(b, ((a) (obj = (a)obj)).b) && a(c, ((a) (obj)).c) && a(d, ((a) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a(b) ^ a(c) ^ a(d);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("[ ")).append(b).append(" , ").append(c).append(" : ");
        Object obj;
        if (d == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(d.a());
        }
        return stringbuilder.append(obj).append(" ]").toString();
    }
}
