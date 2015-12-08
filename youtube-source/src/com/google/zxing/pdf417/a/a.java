// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.a;

import com.google.zxing.b;
import com.google.zxing.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.zxing.pdf417.a:
//            b

public final class a
{

    private static final int a[] = {
        0, 4, 1, 5
    };
    private static final int b[] = {
        6, 2, 7, 3
    };
    private static final int c[] = {
        8, 1, 1, 1, 1, 1, 1, 3
    };
    private static final int d[] = {
        7, 1, 1, 3, 1, 1, 1, 2, 1
    };

    private static int a(int ai[], int ai1[], int i)
    {
        int j;
        int k1;
        k1 = ai.length;
        int k = 0;
        i = 0;
        j = 0;
        while (k < k1) 
        {
            int i1 = ai[k];
            int l1 = ai1[k];
            k++;
            j = l1 + j;
            i = i1 + i;
        }
        if (i >= j) goto _L2; else goto _L1
_L1:
        return 0x7fffffff;
_L2:
        int l;
        int i2 = (i << 8) / j;
        j = 0;
        l = 0;
        do
        {
label0:
            {
                if (j >= k1)
                {
                    break label0;
                }
                int j1 = ai[j] << 8;
                int j2 = ai1[j] * i2;
                if (j1 > j2)
                {
                    j1 -= j2;
                } else
                {
                    j1 = j2 - j1;
                }
                if (j1 > i2 * 204 >> 8)
                {
                    continue; /* Loop/switch isn't completed */
                }
                l += j1;
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return l / i;
    }

    private static com.google.zxing.common.a a(com.google.zxing.common.a a1, com.google.zxing.common.a a2)
    {
        a2.b();
        int j = a1.a();
        for (int i = 0; i < j; i++)
        {
            if (a1.a(i))
            {
                a2.b(j - 1 - i);
            }
        }

        return a2;
    }

    public static com.google.zxing.pdf417.a.b a(b b1, boolean flag)
    {
        com.google.zxing.common.b b2 = b1.c();
        List list = a(flag, b2);
        b1 = list;
        if (list.isEmpty())
        {
            int i = b2.d();
            int k = b2.e();
            b1 = new com.google.zxing.common.a(i);
            com.google.zxing.common.a a1 = new com.google.zxing.common.a(i);
            com.google.zxing.common.a a2 = new com.google.zxing.common.a(i);
            for (int j = 0; j < k + 1 >> 1; j++)
            {
                b1 = b2.a(j, b1);
                b2.b(j, a(b2.a(k - 1 - j, a1), a2));
                b2.b(k - 1 - j, a(((com.google.zxing.common.a) (b1)), a2));
            }

            b1 = a(flag, b2);
        }
        return new com.google.zxing.pdf417.a.b(b2, b1);
    }

    private static List a(boolean flag, com.google.zxing.common.b b1)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        int j = 0;
        boolean flag1 = false;
        do
        {
            if (i >= b1.e())
            {
                break;
            }
            int l = b1.e();
            int i1 = b1.d();
            Object obj = new g[8];
            a(((g []) (obj)), a(b1, l, i1, i, j, c), a);
            int k;
            if (obj[4] != null)
            {
                k = (int)obj[4].a();
                j = (int)obj[4].b();
            } else
            {
                k = j;
                j = i;
            }
            a(((g []) (obj)), a(b1, l, i1, j, k, d), b);
            if (obj[0] == null && obj[3] == null)
            {
                if (!flag1)
                {
                    break;
                }
                flag1 = false;
                obj = arraylist.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    g ag[] = (g[])((Iterator) (obj)).next();
                    j = i;
                    if (ag[1] != null)
                    {
                        j = (int)Math.max(i, ag[1].b());
                    }
                    i = j;
                    if (ag[3] != null)
                    {
                        i = Math.max(j, (int)ag[3].b());
                    }
                } while (true);
                i += 5;
                k = 0;
                j = ((flag1) ? 1 : 0);
                flag1 = k;
                continue;
            }
            arraylist.add(obj);
            if (!flag)
            {
                break;
            }
            if (obj[2] != null)
            {
                j = (int)obj[2].a();
                i = (int)obj[2].b();
                flag1 = true;
            } else
            {
                j = (int)obj[4].a();
                i = (int)obj[4].b();
                flag1 = true;
            }
        } while (true);
        return arraylist;
    }

    private static void a(g ag[], g ag1[], int ai[])
    {
        for (int i = 0; i < ai.length; i++)
        {
            ag[ai[i]] = ag1[i];
        }

    }

    private static int[] a(com.google.zxing.common.b b1, int i, int j, int k, boolean flag, int ai[], int ai1[])
    {
        Arrays.fill(ai1, 0, ai1.length, 0);
        int i2 = ai.length;
        boolean flag1 = false;
        for (int l = 0; b1.a(i, j) && i > 0 && l < 3; l++)
        {
            i--;
        }

        int l1 = 0;
        int i1 = i;
        int k1 = i;
        i = i1;
        while (k1 < k) 
        {
            int j1;
            if (b1.a(k1, j) ^ flag1)
            {
                ai1[l1] = ai1[l1] + 1;
                j1 = ((flag1) ? 1 : 0);
            } else
            {
                if (l1 == i2 - 1)
                {
                    if (a(ai1, ai, 204) < 107)
                    {
                        return (new int[] {
                            i, k1
                        });
                    }
                    i += ai1[0] + ai1[1];
                    System.arraycopy(ai1, 2, ai1, 0, i2 - 2);
                    ai1[i2 - 2] = 0;
                    ai1[i2 - 1] = 0;
                    j1 = l1 - 1;
                } else
                {
                    j1 = l1 + 1;
                }
                ai1[j1] = 1;
                if (!flag1)
                {
                    boolean flag2 = true;
                    l1 = j1;
                    j1 = ((flag2) ? 1 : 0);
                } else
                {
                    boolean flag3 = false;
                    l1 = j1;
                    j1 = ((flag3) ? 1 : 0);
                }
            }
            k1++;
            flag1 = j1;
        }
        if (l1 == i2 - 1 && a(ai1, ai, 204) < 107)
        {
            return (new int[] {
                i, k1 - 1
            });
        } else
        {
            return null;
        }
    }

    private static g[] a(com.google.zxing.common.b b1, int i, int j, int k, int l, int ai[])
    {
        g ag[];
        int ai4[];
        ag = new g[4];
        ai4 = new int[ai.length];
_L10:
        int ai1[];
        if (k >= i)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        ai1 = a(b1, l, k, j, false, ai, ai4);
        if (ai1 == null) goto _L2; else goto _L1
_L1:
label0:
        {
            int i1 = k;
            do
            {
                k = i1;
                if (i1 <= 0)
                {
                    break label0;
                }
                i1--;
                int ai2[] = a(b1, l, i1, j, false, ai, ai4);
                if (ai2 == null)
                {
                    break;
                }
                ai1 = ai2;
            } while (true);
            k = i1 + 1;
        }
        ag[0] = new g(ai1[0], k);
        ag[1] = new g(ai1[1], k);
        boolean flag = true;
        l = k;
        k = ((flag) ? 1 : 0);
_L13:
        int j1;
        int k1;
        j1 = l + 1;
        k1 = j1;
        if (k == 0) goto _L4; else goto _L3
_L3:
        ai1 = new int[2];
        ai1[0] = (int)ag[0].a();
        ai1[1] = (int)ag[1].a();
        k = 0;
_L9:
        if (j1 >= i) goto _L6; else goto _L5
_L5:
        int ai3[] = a(b1, ai1[0], j1, j, false, ai, ai4);
        if (ai3 == null || Math.abs(ai1[0] - ai3[0]) >= 5 || Math.abs(ai1[1] - ai3[1]) >= 5) goto _L8; else goto _L7
_L7:
        k = 0;
        ai1 = ai3;
_L12:
        j1++;
          goto _L9
_L2:
        k += 5;
          goto _L10
_L8:
        if (k > 25) goto _L6; else goto _L11
_L11:
        k++;
          goto _L12
_L6:
        k1 = j1 - (k + 1);
        ag[2] = new g(ai1[0], k1);
        ag[3] = new g(ai1[1], k1);
_L4:
        if (k1 - l < 10)
        {
            for (i = 0; i < ag.length; i++)
            {
                ag[i] = null;
            }

        }
        return ag;
        boolean flag1 = false;
        l = k;
        k = ((flag1) ? 1 : 0);
          goto _L13
    }

}
