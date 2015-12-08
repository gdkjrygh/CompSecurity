// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            k

public final class a extends k
{

    static final char a[] = "0123456789-$:/.+ABCD".toCharArray();
    static final int b[] = {
        3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 
        12, 24, 69, 81, 84, 21, 26, 41, 11, 14
    };
    private static final char c[] = {
        'A', 'B', 'C', 'D'
    };
    private final StringBuilder d = new StringBuilder(20);
    private int e[];
    private int f;

    public a()
    {
        e = new int[80];
        f = 0;
    }

    private void a(int i)
    {
        e[f] = i;
        f = f + 1;
        if (f >= e.length)
        {
            int ai[] = new int[f * 2];
            System.arraycopy(e, 0, ai, 0, f);
            e = ai;
        }
    }

    private static boolean a(char ac[], char c1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (ac == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = ac.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (ac[i] != c1) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int b(int i)
    {
        int j3;
        int k3;
        j3 = 0x7fffffff;
        k3 = i + 7;
        if (k3 < f) goto _L2; else goto _L1
_L1:
        int l = -1;
_L4:
        return l;
_L2:
        int ai[] = e;
        l = i;
        int l1 = 0x7fffffff;
        int j = 0;
        while (l < k3) 
        {
            int j2 = ai[l];
            int i1 = l1;
            if (j2 < l1)
            {
                i1 = j2;
            }
            if (j2 > j)
            {
                j = j2;
            }
            l += 2;
            l1 = i1;
        }
        int i3 = (l1 + j) / 2;
        j = 0;
        l = i + 1;
        int j1;
        for (l1 = j3; l < k3; l1 = j1)
        {
            int k2 = ai[l];
            j1 = l1;
            if (k2 < l1)
            {
                j1 = k2;
            }
            if (k2 > j)
            {
                j = k2;
            }
            l += 2;
        }

        int l2 = (l1 + j) / 2;
        int k1 = 128;
        l = 0;
        j = 0;
        while (l < 7) 
        {
            int i2;
            if ((l & 1) == 0)
            {
                i2 = i3;
            } else
            {
                i2 = l2;
            }
            k1 >>= 1;
            if (ai[i + l] > i2)
            {
                j |= k1;
            }
            l++;
        }
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= b.length)
                {
                    break label1;
                }
                l = i;
                if (b[i] == j)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public final f a(int i, com.google.zxing.common.a a1, Map map)
    {
        int j;
        Arrays.fill(e, 0);
        f = 0;
        int l1 = a1.d(0);
        int k4 = a1.a();
        if (l1 >= k4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        j = 1;
        int l = 0;
        while (l1 < k4) 
        {
            int j3;
            if ((a1.a(l1) ^ j) != 0)
            {
                int i3 = l + 1;
                l = j;
                j = i3;
            } else
            {
                a(l);
                if (j == 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                l = j;
                j = 1;
            }
            j3 = l1 + 1;
            l1 = l;
            l = j;
            j = l1;
            l1 = j3;
        }
        a(l);
        j = 1;
_L3:
        if (j >= f) goto _L2; else goto _L1
_L1:
        int i1;
        i1 = b(j);
        if (i1 == -1 || !a(c, a[i1]))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i2 = 0;
        for (i1 = j; i1 < j + 7; i1++)
        {
            i2 += e[i1];
        }

        if (j != 1 && e[j - 1] < i2 / 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        d.setLength(0);
        i1 = j;
_L5:
        int j5;
        int j2 = b(i1);
        if (j2 == -1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        d.append((char)j2);
        j5 = i1 + 8;
        if (d.length() > 1 && a(c, a[j2]))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j5;
        continue; /* Loop/switch isn't completed */
        j += 2;
          goto _L3
_L2:
        throw NotFoundException.getNotFoundInstance();
        if (j5 < f) goto _L5; else goto _L4
_L4:
        int k3 = e[j5 - 1];
        int k2 = 0;
        for (int j1 = -8; j1 < -1; j1++)
        {
            k2 += e[j5 + j1];
        }

        if (j5 < f && k3 < k2 / 2)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        a1 = new int[4];
        a1;
        a1[0] = 0;
        a1[1] = 0;
        a1[2] = 0;
        a1[3] = 0;
        int ai[] = new int[4];
        ai;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int k5 = d.length() - 1;
        int k1 = 0;
        k2 = j;
        do
        {
            int l4 = b[d.charAt(k1)];
            for (int l3 = 6; l3 >= 0; l3--)
            {
                int l5 = (l3 & 1) + (l4 & 1) * 2;
                a1[l5] = a1[l5] + e[k2 + l3];
                ai[l5] = ai[l5] + 1;
                l4 >>= 1;
            }

            if (k1 >= k5)
            {
                break;
            }
            k2 += 8;
            k1++;
        } while (true);
        int ai1[] = new int[4];
        int ai2[] = new int[4];
        for (k1 = 0; k1 < 2; k1++)
        {
            ai2[k1] = 0;
            ai2[k1 + 2] = (a1[k1] << 8) / ai[k1] + (a1[k1 + 2] << 8) / ai[k1 + 2] >> 1;
            ai1[k1] = ai2[k1 + 2];
            ai1[k1 + 2] = (a1[k1 + 2] * 512 + 384) / ai[k1 + 2];
        }

        k1 = 0;
        k2 = j;
        do
        {
            int i5 = b[d.charAt(k1)];
            for (int i4 = 6; i4 >= 0; i4--)
            {
                int i6 = (i4 & 1) + (i5 & 1) * 2;
                int j6 = e[k2 + i4] << 8;
                if (j6 < ai2[i6] || j6 > ai1[i6])
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                i5 >>= 1;
            }

            if (k1 >= k5)
            {
                break;
            }
            k2 += 8;
            k1++;
        } while (true);
        for (k1 = 0; k1 < d.length(); k1++)
        {
            d.setCharAt(k1, a[d.charAt(k1)]);
        }

        char c1 = d.charAt(0);
        if (!a(c, c1))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        c1 = d.charAt(d.length() - 1);
        if (!a(c, c1))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (d.length() <= 3)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END))
        {
            d.deleteCharAt(d.length() - 1);
            d.deleteCharAt(0);
        }
        k1 = 0;
        for (int l2 = 0; l2 < j;)
        {
            int j4 = e[l2];
            l2++;
            k1 = j4 + k1;
        }

        float f1 = k1;
        for (; j < j5 - 1; j++)
        {
            k1 += e[j];
        }

        float f2 = k1;
        a1 = d.toString();
        map = new g(f1, i);
        g g1 = new g(f2, i);
        BarcodeFormat barcodeformat = BarcodeFormat.CODABAR;
        return new f(a1, null, new g[] {
            map, g1
        }, barcodeformat);
    }

}
