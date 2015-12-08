// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.c;
import java.lang.reflect.Array;

// Referenced classes of package com.google.zxing.common:
//            g, b

public final class i extends g
{

    private b a;

    public i(c c1)
    {
        super(c1);
    }

    private static int a(int j, int k, int l)
    {
        if (j < 2)
        {
            k = 2;
        } else
        {
            k = l;
            if (j <= l)
            {
                return j;
            }
        }
        return k;
    }

    public final b b()
    {
        c c1;
        int j7;
        int k7;
        if (a != null)
        {
            return a;
        }
        c1 = a();
        j7 = c1.b();
        k7 = c1.c();
        if (j7 < 40 || k7 < 40) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int ai[][];
        int l3;
        int i4;
        int j4;
        abyte0 = c1.a();
        l3 = j7 >> 3;
        if ((j7 & 7) != 0)
        {
            l3++;
        }
        i4 = k7 >> 3;
        if ((k7 & 7) != 0)
        {
            i4++;
        }
        ai = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i4, l3
        });
        j4 = 0;
_L12:
        if (j4 >= i4) goto _L4; else goto _L3
_L3:
        int i5;
        int k5;
        i5 = j4 << 3;
        int j = k7 - 8;
        if (i5 > j)
        {
            i5 = j;
        }
        k5 = 0;
_L11:
        if (k5 >= l3) goto _L6; else goto _L5
_L5:
        int k;
        int l;
        int j1;
        k = k5 << 3;
        l = j7 - 8;
        if (k > l)
        {
            k = l;
        }
        boolean flag = false;
        j1 = 255;
        l = 0;
        int k1 = 0;
        int i2 = i5 * j7 + k;
        k = ((flag) ? 1 : 0);
        int j6;
        for (; k1 < 8; k1 = j6 + 1)
        {
            for (int i3 = 0; i3 < 8;)
            {
                int i6 = abyte0[i2 + i3] & 0xff;
                if (i6 < j1)
                {
                    j1 = i6;
                }
                if (i6 > l)
                {
                    l = i6;
                }
                i3++;
                k += i6;
            }

            int j3;
            int l6;
            if (l - j1 > 24)
            {
                j3 = i2 + j7;
                i2 = k1 + 1;
                k1 = j3;
                do
                {
                    l6 = k1;
                    j6 = i2;
                    j3 = k;
                    if (i2 >= 8)
                    {
                        break;
                    }
                    for (j3 = 0; j3 < 8; j3++)
                    {
                        k += abyte0[k1 + j3] & 0xff;
                    }

                    i2++;
                    k1 += j7;
                } while (true);
            } else
            {
                j3 = k;
                j6 = k1;
                l6 = i2;
            }
            i2 = l6 + j7;
            k = j3;
        }

        k >>= 6;
        if (l - j1 > 24) goto _L8; else goto _L7
_L7:
        if (j4 <= 0 || k5 <= 0) goto _L10; else goto _L9
_L9:
        k = ai[j4 - 1][k5] + ai[j4][k5 - 1] * 2 + ai[j4 - 1][k5 - 1] >> 2;
        if (j1 >= k) goto _L10; else goto _L8
_L8:
        ai[j4][k5] = k;
        k5++;
          goto _L11
_L6:
        j4++;
          goto _L12
_L4:
        b b1 = new b(j7, k7);
        for (k = 0; k < i4; k++)
        {
            int i1 = k << 3;
            j1 = k7 - 8;
            if (i1 > j1)
            {
                i1 = j1;
            }
            for (j1 = 0; j1 < l3; j1++)
            {
                int l1 = j1 << 3;
                int j2 = j7 - 8;
                if (l1 > j2)
                {
                    l1 = j2;
                }
                int k4 = a(j1, 2, l3 - 3);
                int j5 = a(k, 2, i4 - 3);
                int k3 = 0;
                for (int k2 = -2; k2 <= 2; k2++)
                {
                    int ai1[] = ai[j5 + k2];
                    int l5 = ai1[k4 - 2];
                    int k6 = ai1[k4 - 1];
                    int i7 = ai1[k4];
                    int l7 = ai1[k4 + 1];
                    k3 += ai1[k4 + 2] + (l5 + k6 + i7 + l7);
                }

                j5 = k3 / 25;
                k3 = 0;
                for (int l2 = i1 * j7 + l1; k3 < 8; l2 += j7)
                {
                    for (int l4 = 0; l4 < 8; l4++)
                    {
                        if ((abyte0[l2 + l4] & 0xff) <= j5)
                        {
                            b1.b(l1 + l4, i1 + k3);
                        }
                    }

                    k3++;
                }

            }

        }

        a = b1;
_L13:
        return a;
_L2:
        a = super.b();
        if (true) goto _L13; else goto _L10
_L10:
        k = j1 >> 1;
          goto _L8
    }
}
