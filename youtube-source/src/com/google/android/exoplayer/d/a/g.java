// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.d.a;


final class g
{

    private final byte a[];
    private int b;

    public g(int l)
    {
        a = new byte[l];
    }

    private static int b(byte abyte0[], int l, int i1)
    {
        int k1 = abyte0[l] & 0xff;
        for (int j1 = l + 1; j1 < l + i1; j1++)
        {
            k1 = k1 << 8 | abyte0[j1] & 0xff;
        }

        return k1;
    }

    private static long c(byte abyte0[], int l, int i1)
    {
        long l1 = abyte0[l] & 0xff;
        for (int j1 = l + 1; j1 < l + i1; j1++)
        {
            l1 = l1 << 8 | (long)(abyte0[j1] & 0xff);
        }

        return l1;
    }

    public final void a(int l)
    {
        b = l;
    }

    public final void a(byte abyte0[], int l, int i1)
    {
        System.arraycopy(a, b, abyte0, 0, i1);
        b = b + i1;
    }

    public final byte[] a()
    {
        return a;
    }

    public final int b()
    {
        return a.length;
    }

    public final void b(int l)
    {
        b = b + l;
    }

    public final int c()
    {
        return b;
    }

    public final int d()
    {
        int l = b(a, b, 1);
        b = b + 1;
        return l;
    }

    public final int e()
    {
        int l = b(a, b, 2);
        b = b + 2;
        return l;
    }

    public final long f()
    {
        long l = c(a, b, 4);
        b = b + 4;
        return l;
    }

    public final int g()
    {
        int l = b(a, b, 4);
        b = b + 4;
        return l;
    }

    public final long h()
    {
        long l = c(a, b, 8);
        b = b + 8;
        return l;
    }

    public final int i()
    {
        int l = b(a, b, 2);
        b = b + 4;
        return l;
    }

    public final int j()
    {
        int l = b(a, b, 4);
        b = b + 4;
        if (l < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Top bit not zero: ")).append(l).toString());
        } else
        {
            return l;
        }
    }

    public final long k()
    {
        long l = c(a, b, 8);
        b = b + 8;
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Top bit not zero: ")).append(l).toString());
        } else
        {
            return l;
        }
    }
}
