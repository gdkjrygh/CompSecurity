// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            dQ, c2

final class fJ
{

    private static final int b[] = {
        0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 
        2, 3, 2, 3, 3, 4
    };
    private static final int d[][];
    private final dQ a;
    private final byte c;

    private fJ(int i)
    {
        a = dQ.forBits(i >> 3 & 3);
        c = (byte)(i & 7);
    }

    static fJ a(int i, int j)
    {
        fJ fj = c(i, j);
        if (fj != null)
        {
            return fj;
        } else
        {
            return c(i ^ 0x5412, j ^ 0x5412);
        }
    }

    static int b(int i, int j)
    {
        i ^= j;
        j = b[i & 0xf];
        int k = b[i >>> 4 & 0xf];
        int l = b[i >>> 8 & 0xf];
        int i1 = b[i >>> 12 & 0xf];
        int j1 = b[i >>> 16 & 0xf];
        int k1 = b[i >>> 20 & 0xf];
        int l1 = b[i >>> 24 & 0xf];
        return b[i >>> 28 & 0xf] + (j + k + l + i1 + j1 + k1 + l1);
    }

    private static fJ c(int i, int j)
    {
        boolean flag = c2.g;
        int l = 0x7fffffff;
        int ai[][] = d;
        int l1 = ai.length;
        int i1 = 0;
        int k = 0;
        do
        {
label0:
            {
                int k1 = k;
                int j1 = l;
                if (i1 < l1)
                {
                    int ai1[] = ai[i1];
                    k1 = ai1[0];
                    if (k1 == i || k1 == j)
                    {
                        return new fJ(ai1[1]);
                    }
                    j1 = b(i, k1);
                    if (j1 < l)
                    {
                        k = ai1[1];
                        l = j1;
                    }
                    if (i != j)
                    {
                        j1 = b(j, k1);
                        if (j1 < l)
                        {
                            k = ai1[1];
                            l = j1;
                        }
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    j1 = l;
                    k1 = k;
                }
                if (j1 <= 3)
                {
                    return new fJ(k1);
                } else
                {
                    return null;
                }
            }
            i1++;
        } while (true);
    }

    dQ a()
    {
        return a;
    }

    byte b()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof fJ)
        {
            if (a == ((fJ) (obj = (fJ)obj)).a && c == ((fJ) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a.ordinal() << 3 | c;
    }

    static 
    {
        int ai[] = {
            21522, 0
        };
        int ai1[] = {
            20773, 1
        };
        int ai2[] = {
            24188, 2
        };
        int ai3[] = {
            23371, 3
        };
        int ai4[] = {
            17913, 4
        };
        int ai5[] = {
            20375, 6
        };
        int ai6[] = {
            19104, 7
        };
        int ai7[] = {
            30660, 8
        };
        int ai8[] = {
            29427, 9
        };
        int ai9[] = {
            30877, 11
        };
        int ai10[] = {
            25368, 13
        };
        int ai11[] = {
            27713, 14
        };
        int ai12[] = {
            26998, 15
        };
        int ai13[] = {
            5769, 16
        };
        int ai14[] = {
            5054, 17
        };
        int ai15[] = {
            7399, 18
        };
        int ai16[] = {
            6608, 19
        };
        int ai17[] = {
            1890, 20
        };
        int ai18[] = {
            597, 21
        };
        int ai19[] = {
            3340, 22
        };
        int ai20[] = {
            2107, 23
        };
        int ai21[] = {
            13663, 24
        };
        int ai22[] = {
            12392, 25
        };
        int ai23[] = {
            16177, 26
        };
        int ai24[] = {
            14854, 27
        };
        int ai25[] = {
            9396, 28
        };
        int ai26[] = {
            8579, 29
        };
        int ai27[] = {
            11994, 30
        };
        int ai28[] = {
            11245, 31
        };
        d = (new int[][] {
            ai, ai1, ai2, ai3, ai4, new int[] {
                16590, 5
            }, ai5, ai6, ai7, ai8, 
            new int[] {
                32170, 10
            }, ai9, new int[] {
                26159, 12
            }, ai10, ai11, ai12, ai13, ai14, ai15, ai16, 
            ai17, ai18, ai19, ai20, ai21, ai22, ai23, ai24, ai25, ai26, 
            ai27, ai28
        });
    }
}
