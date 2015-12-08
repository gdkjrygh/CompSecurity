// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            k

public final class h extends k
{

    static final int a[][];
    private static final int b[] = {
        48, 44, 24, 20, 18, 16, 14, 12, 10, 8, 
        6
    };
    private static final int d[] = {
        1, 1, 1, 1
    };
    private static final int e[] = {
        1, 1, 3
    };
    private int c;

    public h()
    {
        c = -1;
    }

    private static int a(a a1)
    {
        int i = a1.a();
        int j = a1.c(0);
        if (j == i)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return j;
        }
    }

    private static int a(int ai[])
    {
        int j = 107;
        int l = -1;
        int j1 = a.length;
        for (int i = 0; i < j1; i++)
        {
            int i1 = a(ai, a[i], 199);
            if (i1 < j)
            {
                l = i;
                j = i1;
            }
        }

        if (l >= 0)
        {
            return l;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private void a(a a1, int i)
    {
        int j = c * 10;
        if (j >= i)
        {
            j = i;
        }
        for (i--; j > 0 && i >= 0 && !a1.a(i); i--)
        {
            j--;
        }

        if (j != 0)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return;
        }
    }

    private static void a(a a1, int i, int j, StringBuilder stringbuilder)
    {
        int ai[] = new int[10];
        int ai1[] = new int[5];
        int ai2[] = new int[5];
        while (i < j) 
        {
            a(a1, i, ai);
            for (int l = 0; l < 5; l++)
            {
                int j1 = l << 1;
                ai1[l] = ai[j1];
                ai2[l] = ai[j1 + 1];
            }

            stringbuilder.append((char)(a(ai1) + 48));
            stringbuilder.append((char)(a(ai2) + 48));
            int k1 = ai.length;
            int i1 = 0;
            while (i1 < k1) 
            {
                i += ai[i1];
                i1++;
            }
        }
    }

    private int[] b(a a1)
    {
        a1.d();
        int ai[];
        ai = c(a1, a(a1), e);
        a(a1, ai[0]);
        int i = ai[0];
        ai[0] = a1.a() - ai[1];
        ai[1] = a1.a() - i;
        a1.d();
        return ai;
        Exception exception;
        exception;
        a1.d();
        throw exception;
    }

    private static int[] c(a a1, int i, int ai[])
    {
        int l1 = ai.length;
        int ai1[] = new int[l1];
        int i2 = a1.a();
        int j = i;
        int k1 = 0;
        int j1 = 0;
        int i1 = i;
        i = j;
        while (i1 < i2) 
        {
            int l;
            if ((a1.a(i1) ^ j1) != 0)
            {
                ai1[k1] = ai1[k1] + 1;
                l = j1;
                j1 = i;
            } else
            {
                if (k1 == l1 - 1)
                {
                    if (a(ai1, ai, 199) < 107)
                    {
                        return (new int[] {
                            i, i1
                        });
                    }
                    l = i + (ai1[0] + ai1[1]);
                    System.arraycopy(ai1, 2, ai1, 0, l1 - 2);
                    ai1[l1 - 2] = 0;
                    ai1[l1 - 1] = 0;
                    i = k1 - 1;
                } else
                {
                    k1++;
                    l = i;
                    i = k1;
                }
                ai1[i] = 1;
                if (j1 == 0)
                {
                    boolean flag = true;
                    j1 = l;
                    k1 = i;
                    l = ((flag) ? 1 : 0);
                } else
                {
                    boolean flag1 = false;
                    j1 = l;
                    k1 = i;
                    l = ((flag1) ? 1 : 0);
                }
            }
            i1++;
            i = j1;
            j1 = l;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final f a(int i, a a1, Map map)
    {
        int ai1[] = c(a1, a(a1), d);
        c = ai1[1] - ai1[0] >> 2;
        a(a1, ai1[0]);
        int ai[] = b(a1);
        Object obj = new StringBuilder(20);
        a(a1, ai1[1], ai[0], ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        BarcodeFormat barcodeformat;
        int j;
        int l;
        int i1;
        if (map != null)
        {
            a1 = (int[])map.get(DecodeHintType.ALLOWED_LENGTHS);
        } else
        {
            a1 = null;
        }
        map = a1;
        if (a1 == null)
        {
            map = b;
        }
        l = ((String) (obj)).length();
        i1 = map.length;
        j = 0;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        if (l != map[j]) goto _L2; else goto _L1
_L1:
        j = 1;
_L4:
        if (j == 0)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            a1 = new g(ai1[1], i);
            map = new g(ai[0], i);
            barcodeformat = BarcodeFormat.ITF;
            return new f(((String) (obj)), null, new g[] {
                a1, map
            }, barcodeformat);
        }
_L2:
        j++;
        break MISSING_BLOCK_LABEL_117;
        j = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        int ai[] = {
            3, 1, 1, 3, 1
        };
        a = (new int[][] {
            new int[] {
                1, 1, 3, 3, 1
            }, new int[] {
                3, 1, 1, 1, 3
            }, new int[] {
                1, 3, 1, 1, 3
            }, new int[] {
                3, 3, 1, 1, 1
            }, new int[] {
                1, 1, 3, 1, 3
            }, new int[] {
                3, 1, 3, 1, 1
            }, new int[] {
                1, 3, 3, 1, 1
            }, new int[] {
                1, 1, 1, 3, 3
            }, ai, new int[] {
                1, 3, 1, 3, 1
            }
        });
    }
}
