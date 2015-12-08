// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;


// Referenced classes of package com.google.zxing.common:
//            a

public final class b
{

    private final int a;
    private final int b;
    private final int c;
    private final int d[];

    public b(int i)
    {
        this(i, i);
    }

    public b(int i, int j)
    {
        if (i <= 0 || j <= 0)
        {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        } else
        {
            a = i;
            b = j;
            c = i + 31 >> 5;
            d = new int[c * j];
            return;
        }
    }

    public final a a(int i, a a1)
    {
        a a2;
label0:
        {
            if (a1 != null)
            {
                a2 = a1;
                if (a1.a() >= a)
                {
                    break label0;
                }
            }
            a2 = new a(a);
        }
        int k = c;
        for (int j = 0; j < c; j++)
        {
            a2.a(j << 5, d[i * k + j]);
        }

        return a2;
    }

    public final void a(int i, int j, int k, int l)
    {
        int i1;
        if (j < 0 || i < 0)
        {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (l <= 0 || k <= 0)
        {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        i1 = i + k;
        l = j + l;
        if (l > b || i1 > a)
        {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
_L3:
        if (j < l)
        {
            int j1 = c;
            k = i;
            while (k < i1) 
            {
                int ai[] = d;
                int k1 = (k >> 5) + j * j1;
                ai[k1] = ai[k1] | 1 << (k & 0x1f);
                k++;
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        j++;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public final boolean a(int i, int j)
    {
        int k = c;
        return (d[k * j + (i >> 5)] >>> (i & 0x1f) & 1) != 0;
    }

    public final int[] a()
    {
        int i;
        int k;
        int l;
        int i1;
        int l1;
        i1 = a;
        l = b;
        k = -1;
        l1 = -1;
        i = 0;
_L12:
        if (i >= b) goto _L2; else goto _L1
_L1:
        int i2 = 0;
_L11:
        if (i2 >= c) goto _L4; else goto _L3
_L3:
        int j1;
        int j2;
        j2 = d[c * i + i2];
        if (j2 == 0)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        j1 = l;
        if (i < l)
        {
            j1 = i;
        }
        l = l1;
        if (i > l1)
        {
            l = i;
        }
        if (i2 * 32 >= i1) goto _L6; else goto _L5
_L5:
        for (l1 = 0; j2 << 31 - l1 == 0; l1++) { }
        if (i2 * 32 + l1 >= i1) goto _L6; else goto _L7
_L7:
        l1 = i2 * 32 + l1;
_L14:
        if (i2 * 32 + 31 <= k) goto _L9; else goto _L8
_L8:
        for (i1 = 31; j2 >>> i1 == 0; i1--) { }
        if (i2 * 32 + i1 <= k) goto _L9; else goto _L10
_L10:
        int k2 = i2 * 32 + i1;
        k = l;
        i1 = j1;
        l = k2;
_L13:
        i2++;
        j1 = l1;
        l1 = k;
        k = l;
        l = i1;
        i1 = j1;
          goto _L11
_L4:
        i++;
          goto _L12
_L2:
        int j = k - i1;
        k = l1 - l;
        if (j < 0 || k < 0)
        {
            return null;
        } else
        {
            return (new int[] {
                i1, l, j, k
            });
        }
_L9:
        i1 = j1;
        j1 = k;
        k = l;
        l = j1;
          goto _L13
_L6:
        l1 = i1;
          goto _L14
        int k1 = i1;
        i1 = l;
        l = k;
        k = l1;
        l1 = k1;
          goto _L13
    }

    public final void b(int i, int j)
    {
        j = c * j + (i >> 5);
        int ai[] = d;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public final void b(int i, a a1)
    {
        System.arraycopy(a1.c(), 0, d, c * i, c);
    }

    public final int[] b()
    {
        int i;
        for (i = 0; i < d.length && d[i] == 0; i++) { }
        if (i == d.length)
        {
            return null;
        }
        int k = i / c;
        int l = c;
        int i1 = d[i];
        int j;
        for (j = 0; i1 << 31 - j == 0; j++) { }
        return (new int[] {
            (i % l << 5) + j, k
        });
    }

    public final void c(int i, int j)
    {
        j = c * j + (i >> 5);
        int ai[] = d;
        ai[j] = ai[j] ^ 1 << (i & 0x1f);
    }

    public final int[] c()
    {
        int i;
        for (i = d.length - 1; i >= 0 && d[i] == 0; i--) { }
        if (i < 0)
        {
            return null;
        }
        int k = i / c;
        int l = c;
        int i1 = d[i];
        int j;
        for (j = 31; i1 >>> j == 0; j--) { }
        return (new int[] {
            (i % l << 5) + j, k
        });
    }

    public final int d()
    {
        return a;
    }

    public final int e()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof b) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a == ((b) (obj = (b)obj)).a && b == ((b) (obj)).b && c == ((b) (obj)).c && d.length == ((b) (obj)).d.length)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= d.length)
                    {
                        break label1;
                    }
                    if (d[i] != ((b) (obj)).d[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        int i = a;
        int k = a;
        int l = b;
        k = c + ((i * 31 + k) * 31 + l) * 31;
        int ai[] = d;
        l = ai.length;
        for (int j = 0; j < l; j++)
        {
            k = k * 31 + ai[j];
        }

        return k;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(b * (a + 1));
        for (int i = 0; i < b; i++)
        {
            int j = 0;
            while (j < a) 
            {
                String s;
                if (a(j, i))
                {
                    s = "X ";
                } else
                {
                    s = "  ";
                }
                stringbuilder.append(s);
                j++;
            }
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }
}
