// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;

import com.google.zxing.g;

public final class c
{

    private final int a;
    private final int b[];
    private final g c[];

    public c(int i, int ai[], int j, int k, int l)
    {
        a = i;
        b = ai;
        c = (new g[] {
            new g(j, l), new g(k, l)
        });
    }

    public final int a()
    {
        return a;
    }

    public final int[] b()
    {
        return b;
    }

    public final g[] c()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            if (a == ((c) (obj = (c)obj)).a)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a;
    }
}
