// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.b;

// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            e

final class a
{

    private final b a;
    private final b b;
    private final e c;

    a(b b1)
    {
        int i = b1.e();
        if (i < 8 || i > 144 || (i & 1) != 0)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            c = e.a(b1.e(), b1.d());
            a = a(b1);
            b = new b(a.d(), a.e());
            return;
        }
    }

    private b a(b b1)
    {
        int k = c.b();
        int i = c.c();
        if (b1.e() != k)
        {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int k1 = c.d();
        int l1 = c.e();
        int i2 = k / k1;
        int j2 = i / l1;
        b b2 = new b(j2 * l1, i2 * k1);
        for (int j = 0; j < i2; j++)
        {
            for (int l = 0; l < j2; l++)
            {
                for (int i1 = 0; i1 < k1; i1++)
                {
                    for (int j1 = 0; j1 < l1; j1++)
                    {
                        if (b1.a((l1 + 2) * l + 1 + j1, (k1 + 2) * j + 1 + i1))
                        {
                            b2.b(l * l1 + j1, j * k1 + i1);
                        }
                    }

                }

            }

        }

        return b2;
    }

    private boolean a(int i, int j, int k, int l)
    {
        if (i < 0)
        {
            i += k;
            j = (4 - (k + 4 & 7)) + j;
        }
        int i1 = j;
        k = i;
        if (j < 0)
        {
            i1 = j + l;
            k = i + (4 - (l + 4 & 7));
        }
        b.b(i1, k);
        return a.a(i1, k);
    }

    private int b(int i, int j, int k, int l)
    {
        int i1 = 0;
        if (a(i - 2, j - 2, k, l))
        {
            i1 = 1;
        }
        int j1 = i1 << 1;
        i1 = j1;
        if (a(i - 2, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i - 1, j - 2, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i - 1, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i - 1, j, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i, j - 2, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i, j, k, l))
        {
            i1 = j1 | 1;
        }
        return i1;
    }

    final e a()
    {
        return c;
    }

    final byte[] b()
    {
        byte abyte0[];
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int k4;
        int l4;
        abyte0 = new byte[c.f()];
        j1 = 4;
        k4 = a.e();
        l4 = a.d();
        i1 = 0;
        k1 = 0;
        j = 0;
        k = 0;
        l = 0;
        i = 0;
_L3:
        if (j1 == k4 && i1 == 0 && j == 0)
        {
            int l1 = k1 + 1;
            j = 0;
            if (a(k4 - 1, 0, k4, l4))
            {
                j = 1;
            }
            int j3 = j << 1;
            j = j3;
            if (a(k4 - 1, 1, k4, l4))
            {
                j = j3 | 1;
            }
            j3 = j << 1;
            j = j3;
            if (a(k4 - 1, 2, k4, l4))
            {
                j = j3 | 1;
            }
            j3 = j << 1;
            j = j3;
            if (a(0, l4 - 2, k4, l4))
            {
                j = j3 | 1;
            }
            j3 = j << 1;
            j = j3;
            if (a(0, l4 - 1, k4, l4))
            {
                j = j3 | 1;
            }
            j3 = j << 1;
            j = j3;
            if (a(1, l4 - 1, k4, l4))
            {
                j = j3 | 1;
            }
            j3 = j << 1;
            j = j3;
            if (a(2, l4 - 1, k4, l4))
            {
                j = j3 | 1;
            }
            j3 = j << 1;
            j = j3;
            if (a(3, l4 - 1, k4, l4))
            {
                j = j3 | 1;
            }
            abyte0[k1] = (byte)j;
            j1 -= 2;
            j3 = i1 + 2;
            j = l;
            l = 1;
            k1 = l1;
            i1 = j1;
            j1 = j3;
        } else
        if (j1 == k4 - 2 && i1 == 0 && (l4 & 3) != 0 && k == 0)
        {
            int i2 = k1 + 1;
            k = 0;
            if (a(k4 - 3, 0, k4, l4))
            {
                k = 1;
            }
            int k3 = k << 1;
            k = k3;
            if (a(k4 - 2, 0, k4, l4))
            {
                k = k3 | 1;
            }
            k3 = k << 1;
            k = k3;
            if (a(k4 - 1, 0, k4, l4))
            {
                k = k3 | 1;
            }
            k3 = k << 1;
            k = k3;
            if (a(0, l4 - 4, k4, l4))
            {
                k = k3 | 1;
            }
            k3 = k << 1;
            k = k3;
            if (a(0, l4 - 3, k4, l4))
            {
                k = k3 | 1;
            }
            k3 = k << 1;
            k = k3;
            if (a(0, l4 - 2, k4, l4))
            {
                k = k3 | 1;
            }
            k3 = k << 1;
            k = k3;
            if (a(0, l4 - 1, k4, l4))
            {
                k = k3 | 1;
            }
            k3 = k << 1;
            k = k3;
            if (a(1, l4 - 1, k4, l4))
            {
                k = k3 | 1;
            }
            abyte0[k1] = (byte)k;
            k1 = j1 - 2;
            k = 1;
            j1 = i1 + 2;
            i1 = j;
            j = l;
            l = i1;
            i1 = k1;
            k1 = i2;
        } else
        if (j1 == k4 + 4 && i1 == 2 && (l4 & 7) == 0 && l == 0)
        {
            int j2 = k1 + 1;
            l = 0;
            if (a(k4 - 1, 0, k4, l4))
            {
                l = 1;
            }
            int l3 = l << 1;
            l = l3;
            if (a(k4 - 1, l4 - 1, k4, l4))
            {
                l = l3 | 1;
            }
            l3 = l << 1;
            l = l3;
            if (a(0, l4 - 3, k4, l4))
            {
                l = l3 | 1;
            }
            l3 = l << 1;
            l = l3;
            if (a(0, l4 - 2, k4, l4))
            {
                l = l3 | 1;
            }
            l3 = l << 1;
            l = l3;
            if (a(0, l4 - 1, k4, l4))
            {
                l = l3 | 1;
            }
            l3 = l << 1;
            l = l3;
            if (a(1, l4 - 3, k4, l4))
            {
                l = l3 | 1;
            }
            l3 = l << 1;
            l = l3;
            if (a(1, l4 - 2, k4, l4))
            {
                l = l3 | 1;
            }
            l3 = l << 1;
            l = l3;
            if (a(1, l4 - 1, k4, l4))
            {
                l = l3 | 1;
            }
            abyte0[k1] = (byte)l;
            k1 = j1 - 2;
            j1 = 1;
            l = j;
            i1 += 2;
            j = j1;
            j1 = i1;
            i1 = k1;
            k1 = j2;
        } else
        {
            if (j1 != k4 - 2 || i1 != 0 || (l4 & 7) != 4 || i != 0)
            {
                break MISSING_BLOCK_LABEL_1541;
            }
            int k2 = k1 + 1;
            i = 0;
            if (a(k4 - 3, 0, k4, l4))
            {
                i = 1;
            }
            int i4 = i << 1;
            i = i4;
            if (a(k4 - 2, 0, k4, l4))
            {
                i = i4 | 1;
            }
            i4 = i << 1;
            i = i4;
            if (a(k4 - 1, 0, k4, l4))
            {
                i = i4 | 1;
            }
            i4 = i << 1;
            i = i4;
            if (a(0, l4 - 2, k4, l4))
            {
                i = i4 | 1;
            }
            i4 = i << 1;
            i = i4;
            if (a(0, l4 - 1, k4, l4))
            {
                i = i4 | 1;
            }
            i4 = i << 1;
            i = i4;
            if (a(1, l4 - 1, k4, l4))
            {
                i = i4 | 1;
            }
            i4 = i << 1;
            i = i4;
            if (a(2, l4 - 1, k4, l4))
            {
                i = i4 | 1;
            }
            i4 = i << 1;
            i = i4;
            if (a(3, l4 - 1, k4, l4))
            {
                i = i4 | 1;
            }
            abyte0[k1] = (byte)i;
            k1 = j1 - 2;
            i = 1;
            j1 = j;
            i1 += 2;
            j = l;
            l = j1;
            j1 = i1;
            i1 = k1;
            k1 = k2;
        }
          goto _L1
        i3 = i1;
        int j4 = j1;
        i1 = k1;
        j1 = i3;
        k1 = j4;
        do
        {
            if (k1 < k4 && j1 >= 0 && !b.a(j1, k1))
            {
                int l2 = i1 + 1;
                abyte0[i1] = (byte)b(k1, j1, k4, l4);
                i1 = l2;
            }
            k1 -= 2;
            j1 += 2;
        } while (k1 >= 0 && j1 < l4);
        i3 = k1 + 1;
        j1 += 3;
        if (i3 >= 0 && j1 < l4 && !b.a(j1, i3))
        {
            k1 = i1 + 1;
            abyte0[i1] = (byte)b(i3, j1, k4, l4);
        } else
        {
            k1 = i1;
        }
        i3 += 2;
        j1 -= 2;
        if (i3 < k4 && j1 >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i3 += 3;
        i1 = j;
        j1++;
        j = l;
        l = i1;
        i1 = i3;
_L1:
        if (i1 >= k4 && j1 >= l4)
        {
            if (k1 != c.f())
            {
                throw FormatException.getFormatInstance();
            } else
            {
                return abyte0;
            }
        }
        i3 = j1;
        j1 = l;
        l = j;
        j = j1;
        j1 = i1;
        i1 = i3;
        if (true) goto _L3; else goto _L2
_L2:
        i1 = k1;
        break MISSING_BLOCK_LABEL_1395;
    }
}
