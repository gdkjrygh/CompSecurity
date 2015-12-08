// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;

// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            g, f

public final class e
{

    private static final e a[] = {
        new e(1, 10, 10, 8, 8, new g(5, new f(1, 3, (byte)0), (byte)0)), new e(2, 12, 12, 10, 10, new g(7, new f(1, 5, (byte)0), (byte)0)), new e(3, 14, 14, 12, 12, new g(10, new f(1, 8, (byte)0), (byte)0)), new e(4, 16, 16, 14, 14, new g(12, new f(1, 12, (byte)0), (byte)0)), new e(5, 18, 18, 16, 16, new g(14, new f(1, 18, (byte)0), (byte)0)), new e(6, 20, 20, 18, 18, new g(18, new f(1, 22, (byte)0), (byte)0)), new e(7, 22, 22, 20, 20, new g(20, new f(1, 30, (byte)0), (byte)0)), new e(8, 24, 24, 22, 22, new g(24, new f(1, 36, (byte)0), (byte)0)), new e(9, 26, 26, 24, 24, new g(28, new f(1, 44, (byte)0), (byte)0)), new e(10, 32, 32, 14, 14, new g(36, new f(1, 62, (byte)0), (byte)0)), 
        new e(11, 36, 36, 16, 16, new g(42, new f(1, 86, (byte)0), (byte)0)), new e(12, 40, 40, 18, 18, new g(48, new f(1, 114, (byte)0), (byte)0)), new e(13, 44, 44, 20, 20, new g(56, new f(1, 144, (byte)0), (byte)0)), new e(14, 48, 48, 22, 22, new g(68, new f(1, 174, (byte)0), (byte)0)), new e(15, 52, 52, 24, 24, new g(42, new f(2, 102, (byte)0), (byte)0)), new e(16, 64, 64, 14, 14, new g(56, new f(2, 140, (byte)0), (byte)0)), new e(17, 72, 72, 16, 16, new g(36, new f(4, 92, (byte)0), (byte)0)), new e(18, 80, 80, 18, 18, new g(48, new f(4, 114, (byte)0), (byte)0)), new e(19, 88, 88, 20, 20, new g(56, new f(4, 144, (byte)0), (byte)0)), new e(20, 96, 96, 22, 22, new g(68, new f(4, 174, (byte)0), (byte)0)), 
        new e(21, 104, 104, 24, 24, new g(56, new f(6, 136, (byte)0), (byte)0)), new e(22, 120, 120, 18, 18, new g(68, new f(6, 175, (byte)0), (byte)0)), new e(23, 132, 132, 20, 20, new g(62, new f(8, 163, (byte)0), (byte)0)), new e(24, 144, 144, 22, 22, new g(62, new f(8, 156, (byte)0), new f(2, 155, (byte)0), (byte)0)), new e(25, 8, 18, 6, 16, new g(7, new f(1, 5, (byte)0), (byte)0)), new e(26, 8, 32, 6, 14, new g(11, new f(1, 10, (byte)0), (byte)0)), new e(27, 12, 26, 10, 24, new g(14, new f(1, 16, (byte)0), (byte)0)), new e(28, 12, 36, 10, 16, new g(18, new f(1, 22, (byte)0), (byte)0)), new e(29, 16, 36, 14, 16, new g(24, new f(1, 32, (byte)0), (byte)0)), new e(30, 16, 48, 14, 22, new g(28, new f(1, 49, (byte)0), (byte)0))
    };
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final g g;
    private final int h;

    private e(int i, int j, int k, int l, int i1, g g1)
    {
        boolean flag = false;
        super();
        b = i;
        c = j;
        d = k;
        e = l;
        f = i1;
        g = g1;
        k = g1.a();
        g1 = g1.b();
        l = g1.length;
        j = 0;
        for (i = ((flag) ? 1 : 0); i < l; i++)
        {
            f f1 = g1[i];
            i1 = f1.a();
            j += (f1.b() + k) * i1;
        }

        h = j;
    }

    public static e a(int i, int j)
    {
        if ((i & 1) != 0 || (j & 1) != 0)
        {
            throw FormatException.getFormatInstance();
        }
        e ae[] = a;
        int l = ae.length;
        for (int k = 0; k < l; k++)
        {
            e e1 = ae[k];
            if (e1.c == i && e1.d == j)
            {
                return e1;
            }
        }

        throw FormatException.getFormatInstance();
    }

    public final int a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final int d()
    {
        return e;
    }

    public final int e()
    {
        return f;
    }

    public final int f()
    {
        return h;
    }

    final g g()
    {
        return g;
    }

    public final String toString()
    {
        return String.valueOf(b);
    }

}
