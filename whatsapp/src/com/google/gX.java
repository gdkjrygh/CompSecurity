// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.lang.reflect.Array;

// Referenced classes of package com.google:
//            gx, bQ, d6, gZ, 
//            gt

public final class gX extends gx
{

    private d6 e;

    public gX(gZ gz)
    {
        super(gz);
    }

    private static int a(int i, int j, int k)
    {
        if (i < j)
        {
            return j;
        }
        if (i > k)
        {
            return k;
        } else
        {
            return i;
        }
    }

    private static void a(byte abyte0[], int i, int j, int k, int l, d6 d6_1)
    {
        boolean flag = bQ.a;
        int i1 = j * l + i;
        int j1 = 0;
        do
        {
label0:
            {
                if (j1 < 8)
                {
                    int k1 = 0;
                    do
                    {
                        if (k1 >= 8)
                        {
                            break;
                        }
                        if ((abyte0[i1 + k1] & 0xff) <= k)
                        {
                            d6_1.c(i + k1, j + j1);
                        }
                        k1++;
                    } while (!flag);
                    j1++;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            i1 += l;
        } while (true);
    }

    private static void a(byte abyte0[], int i, int j, int k, int l, int ai[][], d6 d6_1)
    {
        int k1;
        boolean flag;
        flag = bQ.a;
        k1 = 0;
_L4:
        if (k1 >= j) goto _L2; else goto _L1
_L1:
        int l1;
        int i2;
        l1 = k1 << 3;
        int i1 = l - 8;
        if (l1 > i1)
        {
            l1 = i1;
        }
        i2 = 0;
_L5:
        if (i2 < i)
        {
            int j2 = i2 << 3;
            int j1 = k - 8;
            if (j2 > j1)
            {
                j2 = j1;
            }
            int i3 = a(i2, 2, i - 3);
            int j3 = a(k1, 2, j - 3);
            j1 = 0;
            int k2 = -2;
            int l2;
            do
            {
                l2 = j1;
                if (k2 > 2)
                {
                    break;
                }
                int ai1[] = ai[j3 + k2];
                l2 = ai1[i3 - 2];
                int k3 = ai1[i3 - 1];
                int l3 = ai1[i3];
                int i4 = ai1[i3 + 1];
                l2 = j1 + (ai1[i3 + 2] + (l2 + k3 + l3 + i4));
                k2++;
                j1 = l2;
            } while (!flag);
            a(abyte0, j2, l1, l2 / 25, k, d6_1);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_228;
            }
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        return;
_L3:
        k1++;
          goto _L4
        i2++;
          goto _L5
    }

    private static int[][] a(byte abyte0[], int i, int j, int k, int l)
    {
        int ai[][];
        int l3;
        boolean flag;
        flag = bQ.a;
        ai = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j, i
        });
        l3 = 0;
_L11:
        if (l3 >= j) goto _L2; else goto _L1
_L1:
        int i4;
        int j4;
        i4 = l3 << 3;
        int i1 = l - 8;
        if (i4 > i1)
        {
            i4 = i1;
        }
        j4 = 0;
_L12:
        if (j4 >= i) goto _L4; else goto _L3
_L3:
        int j2;
        int k2;
        int l2;
        int j3;
        int k3;
        int j1 = j4 << 3;
        int l1 = k - 8;
        if (j1 > l1)
        {
            j1 = l1;
        }
        k3 = 0;
        j3 = i4 * k + j1;
        j2 = 0;
        k2 = 255;
        l2 = 0;
_L8:
        int i2;
        int i3;
        int k4;
        i3 = j2;
        i2 = k2;
        k4 = l2;
        if (k3 >= 8) goto _L6; else goto _L5
_L5:
        k4 = 0;
        i3 = l2;
        l2 = k2;
        k2 = j2;
_L13:
        int k1;
        k1 = k2;
        i2 = l2;
        j2 = i3;
        if (k4 < 8)
        {
            int l4 = abyte0[j3 + k4] & 0xff;
            j2 = i3 + l4;
            i2 = l2;
            if (l4 < l2)
            {
                i2 = l4;
            }
            k1 = k2;
            if (l4 > k2)
            {
                k1 = l4;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_531;
            }
        }
        i3 = j2;
        k2 = j3;
        l2 = k3;
        if (k1 - i2 > 24)
        {
            l2 = k3 + 1;
            i3 = j3 + k;
            do
            {
                k2 = i3;
                j3 = l2;
                k3 = j2;
                if (l2 >= 8)
                {
                    break;
                }
                j3 = 0;
                do
                {
                    k2 = j2;
                    if (j3 >= 8)
                    {
                        break;
                    }
                    k2 = j2 + (abyte0[i3 + j3] & 0xff);
                    j3++;
                    j2 = k2;
                } while (!flag);
                j3 = l2 + 1;
                k4 = i3 + k;
                i3 = k4;
                l2 = j3;
                j2 = k2;
                if (!flag)
                {
                    continue;
                }
                k3 = k2;
                k2 = k4;
                break;
            } while (true);
            i3 = k3;
            l2 = j3;
        }
        k3 = l2 + 1;
        j3 = k2 + k;
        j2 = k1;
        k2 = i2;
        l2 = i3;
        if (!flag) goto _L8; else goto _L7
_L7:
        k4 = i3;
        i3 = k1;
_L6:
        k1 = k4 >> 6;
        if (i3 - i2 <= 24)
        {
            k1 = i2 / 2;
            if (l3 > 0 && j4 > 0)
            {
                j2 = (ai[l3 - 1][j4] + ai[l3][j4 - 1] * 2 + ai[l3 - 1][j4 - 1]) / 4;
                if (i2 < j2)
                {
                    k1 = j2;
                }
            }
        }
        ai[l3][j4] = k1;
        if (!flag) goto _L9; else goto _L4
_L4:
        if (!flag) goto _L10; else goto _L2
_L2:
        return ai;
_L10:
        l3++;
          goto _L11
_L9:
        j4++;
          goto _L12
        k4++;
        k2 = k1;
        l2 = i2;
        i3 = j2;
          goto _L13
    }

    public gt a(gZ gz)
    {
        return new gX(gz);
    }

    public d6 b()
    {
label0:
        {
            if (e != null)
            {
                return e;
            }
            gZ gz = d();
            int l = gz.e();
            int i1 = gz.d();
            if (l >= 40 && i1 >= 40)
            {
                byte abyte0[] = gz.c();
                int j = l >> 3;
                int i = j;
                if ((l & 7) != 0)
                {
                    i = j + 1;
                }
                int k = i1 >> 3;
                j = k;
                if ((i1 & 7) != 0)
                {
                    j = k + 1;
                }
                int ai[][] = a(abyte0, i, j, l, i1);
                d6 d6_1 = new d6(l, i1);
                a(abyte0, i, j, l, i1, ai, d6_1);
                e = d6_1;
                if (!bQ.a)
                {
                    break label0;
                }
            }
            e = super.b();
        }
        return e;
    }
}
