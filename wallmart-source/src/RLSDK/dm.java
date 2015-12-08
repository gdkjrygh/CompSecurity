// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            dl

final class dm
{

    private static final int a[][];
    private static final int b[] = {
        0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 
        2, 3, 2, 3, 3, 4
    };
    private final dl c;
    private final byte d;

    private dm(int i)
    {
        c = dl.a(i >> 3 & 3);
        d = (byte)(i & 7);
    }

    static int a(int i, int j)
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

    static dm b(int i, int j)
    {
        dm dm1 = c(i, j);
        if (dm1 != null)
        {
            return dm1;
        } else
        {
            return c(i ^ 0x5412, j ^ 0x5412);
        }
    }

    private static dm c(int i, int j)
    {
        int k = 0;
        int l = 0x7fffffff;
        for (int i1 = 0; i1 < a.length; i1++)
        {
            int ai[] = a[i1];
            int k1 = ai[0];
            if (k1 == i || k1 == j)
            {
                return new dm(ai[1]);
            }
            int j1 = a(i, k1);
            if (j1 < l)
            {
                k = ai[1];
                l = j1;
            }
            if (i == j)
            {
                continue;
            }
            j1 = a(j, k1);
            if (j1 < l)
            {
                k = ai[1];
                l = j1;
            }
        }

        if (l <= 3)
        {
            return new dm(k);
        } else
        {
            return null;
        }
    }

    final dl a()
    {
        return c;
    }

    final byte b()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof dm)
        {
            if (c == ((dm) (obj = (dm)obj)).c && d == ((dm) (obj)).d)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return c.a() << 3 | d;
    }

    static 
    {
        int ai[] = {
            25368, 13
        };
        a = (new int[][] {
            new int[] {
                21522, 0
            }, new int[] {
                20773, 1
            }, new int[] {
                24188, 2
            }, new int[] {
                23371, 3
            }, new int[] {
                17913, 4
            }, new int[] {
                16590, 5
            }, new int[] {
                20375, 6
            }, new int[] {
                19104, 7
            }, new int[] {
                30660, 8
            }, new int[] {
                29427, 9
            }, new int[] {
                32170, 10
            }, new int[] {
                30877, 11
            }, new int[] {
                26159, 12
            }, ai, new int[] {
                27713, 14
            }, new int[] {
                26998, 15
            }, new int[] {
                5769, 16
            }, new int[] {
                5054, 17
            }, new int[] {
                7399, 18
            }, new int[] {
                6608, 19
            }, new int[] {
                1890, 20
            }, new int[] {
                597, 21
            }, new int[] {
                3340, 22
            }, new int[] {
                2107, 23
            }, new int[] {
                13663, 24
            }, new int[] {
                12392, 25
            }, new int[] {
                16177, 26
            }, new int[] {
                14854, 27
            }, new int[] {
                9396, 28
            }, new int[] {
                8579, 29
            }, new int[] {
                11994, 30
            }, new int[] {
                11245, 31
            }
        });
    }
}
