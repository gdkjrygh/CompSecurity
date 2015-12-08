// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.a;

import com.google.zxing.g;

final class b
{

    private final int a;
    private final int b;

    b(int i, int j)
    {
        a = i;
        b = j;
    }

    final g a()
    {
        return new g(a, b);
    }

    final int b()
    {
        return a;
    }

    final int c()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("<")).append(a).append(' ').append(b).append('>').toString();
    }
}
