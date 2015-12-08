// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

final class b
{

    private final List a;
    private final int b;
    private final boolean c;

    b(List list, int i, boolean flag)
    {
        a = new ArrayList(list);
        b = i;
        c = flag;
    }

    final List a()
    {
        return a;
    }

    final boolean a(List list)
    {
        return a.equals(list);
    }

    final int b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (a.equals(((b) (obj = (b)obj)).a) && c == ((b) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode() ^ Boolean.valueOf(c).hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("{ ")).append(a).append(" }").toString();
    }
}
