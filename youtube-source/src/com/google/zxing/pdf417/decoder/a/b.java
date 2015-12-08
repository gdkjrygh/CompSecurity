// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder.a;


// Referenced classes of package com.google.zxing.pdf417.decoder.a:
//            c

public final class b
{

    public static final b a = new b(929, 3);
    private final int b[] = new int[929];
    private final int c[] = new int[929];
    private final c d = new c(this, new int[] {
        0
    });
    private final c e = new c(this, new int[] {
        1
    });
    private final int f = 929;

    private b(int i, int j)
    {
        i = 0;
        j = 1;
        for (; i < 929; i++)
        {
            b[i] = j;
            j = (j * 3) % 929;
        }

        for (i = 0; i < 928; i++)
        {
            c[b[i]] = i;
        }

    }

    final int a(int i)
    {
        return b[i];
    }

    final c a()
    {
        return d;
    }

    final c a(int i, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j == 0)
        {
            return d;
        } else
        {
            int ai[] = new int[i + 1];
            ai[0] = j;
            return new c(this, ai);
        }
    }

    final int b(int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return c[i];
        }
    }

    final int b(int i, int j)
    {
        return (i + j) % f;
    }

    final c b()
    {
        return e;
    }

    final int c()
    {
        return f;
    }

    final int c(int i)
    {
        if (i == 0)
        {
            throw new ArithmeticException();
        } else
        {
            return b[f - c[i] - 1];
        }
    }

    final int c(int i, int j)
    {
        return ((f + i) - j) % f;
    }

    final int d(int i, int j)
    {
        if (i == 0 || j == 0)
        {
            return 0;
        } else
        {
            return b[(c[i] + c[j]) % (f - 1)];
        }
    }

}
