// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.reedsolomon;


// Referenced classes of package com.google.zxing.common.reedsolomon:
//            b

public final class a
{

    public static final a a = new a(4201, 4096, 1);
    public static final a b = new a(1033, 1024, 1);
    public static final a c;
    public static final a d = new a(19, 16, 1);
    public static final a e = new a(285, 256, 0);
    public static final a f;
    public static final a g;
    public static final a h;
    private int i[];
    private int j[];
    private b k;
    private b l;
    private final int m;
    private final int n;
    private final int o;
    private boolean p;

    private a(int i1, int j1, int k1)
    {
        p = false;
        n = i1;
        m = j1;
        o = k1;
        if (j1 <= 0)
        {
            e();
        }
    }

    static int b(int i1, int j1)
    {
        return i1 ^ j1;
    }

    private void e()
    {
        i = new int[m];
        j = new int[m];
        int k1 = 0;
        int i1 = 1;
        for (; k1 < m; k1++)
        {
            i[k1] = i1;
            int l1 = i1 << 1;
            i1 = l1;
            if (l1 >= m)
            {
                i1 = (l1 ^ n) & m - 1;
            }
        }

        for (int j1 = 0; j1 < m - 1; j1++)
        {
            j[i[j1]] = j1;
        }

        k = new b(this, new int[] {
            0
        });
        l = new b(this, new int[] {
            1
        });
        p = true;
    }

    private void f()
    {
        if (!p)
        {
            e();
        }
    }

    final int a(int i1)
    {
        f();
        return i[i1];
    }

    final b a()
    {
        f();
        return k;
    }

    final b a(int i1, int j1)
    {
        f();
        if (i1 < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j1 == 0)
        {
            return k;
        } else
        {
            int ai[] = new int[i1 + 1];
            ai[0] = j1;
            return new b(this, ai);
        }
    }

    final int b(int i1)
    {
        f();
        if (i1 == 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return j[i1];
        }
    }

    final b b()
    {
        f();
        return l;
    }

    public final int c()
    {
        return m;
    }

    final int c(int i1)
    {
        f();
        if (i1 == 0)
        {
            throw new ArithmeticException();
        } else
        {
            return i[m - j[i1] - 1];
        }
    }

    final int c(int i1, int j1)
    {
        f();
        if (i1 == 0 || j1 == 0)
        {
            return 0;
        } else
        {
            return i[(j[i1] + j[j1]) % (m - 1)];
        }
    }

    public final int d()
    {
        return o;
    }

    public final String toString()
    {
        return (new StringBuilder("GF(0x")).append(Integer.toHexString(n)).append(',').append(m).append(')').toString();
    }

    static 
    {
        c = new a(67, 64, 1);
        a a1 = new a(301, 256, 1);
        f = a1;
        g = a1;
        h = c;
    }
}
