// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.detector;

import com.google.zxing.g;

final class b
{

    private final g a;
    private final g b;
    private final int c;

    private b(g g, g g1, int i)
    {
        a = g;
        b = g1;
        c = i;
    }

    b(g g, g g1, int i, byte byte0)
    {
        this(g, g1, i);
    }

    final g a()
    {
        return a;
    }

    final g b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append("/").append(b).append('/').append(c).toString();
    }
}
