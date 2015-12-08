// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;


// Referenced classes of package com.google.zxing.qrcode.decoder:
//            ErrorCorrectionLevel

final class n
{

    private static final int a[][];
    private static final int b[] = {
        0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 
        2, 3, 2, 3, 3, 4
    };
    private final ErrorCorrectionLevel c;
    private final byte d;

    private n(int i)
    {
        c = ErrorCorrectionLevel.forBits(i >> 3 & 3);
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

    static n b(int i, int j)
    {
        n n1 = c(i, j);
        if (n1 != null)
        {
            return n1;
        } else
        {
            return c(i ^ 0x5412, j ^ 0x5412);
        }
    }

    private static n c(int i, int j)
    {
        int l = 0x7fffffff;
        int ai[][] = a;
        int k1 = ai.length;
        int i1 = 0;
        int k = 0;
        for (; i1 < k1; i1++)
        {
            int ai1[] = ai[i1];
            int l1 = ai1[0];
            if (l1 == i || l1 == j)
            {
                return new n(ai1[1]);
            }
            int j1 = a(i, l1);
            if (j1 < l)
            {
                k = ai1[1];
                l = j1;
            }
            if (i == j)
            {
                continue;
            }
            j1 = a(j, l1);
            if (j1 < l)
            {
                k = ai1[1];
                l = j1;
            }
        }

        if (l <= 3)
        {
            return new n(k);
        } else
        {
            return null;
        }
    }

    final ErrorCorrectionLevel a()
    {
        return c;
    }

    final byte b()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof n)
        {
            if (c == ((n) (obj = (n)obj)).c && d == ((n) (obj)).d)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return c.ordinal() << 3 | d;
    }

    static 
    {
        int ai[] = {
            21522, 0
        };
        int ai1[] = {
            23371, 3
        };
        int ai2[] = {
            17913, 4
        };
        int ai3[] = {
            16590, 5
        };
        int ai4[] = {
            19104, 7
        };
        int ai5[] = {
            30877, 11
        };
        int ai6[] = {
            26159, 12
        };
        int ai7[] = {
            5054, 17
        };
        int ai8[] = {
            6608, 19
        };
        int ai9[] = {
            13663, 24
        };
        int ai10[] = {
            12392, 25
        };
        int ai11[] = {
            16177, 26
        };
        int ai12[] = {
            14854, 27
        };
        a = (new int[][] {
            ai, new int[] {
                20773, 1
            }, new int[] {
                24188, 2
            }, ai1, ai2, ai3, new int[] {
                20375, 6
            }, ai4, new int[] {
                30660, 8
            }, new int[] {
                29427, 9
            }, 
            new int[] {
                32170, 10
            }, ai5, ai6, new int[] {
                25368, 13
            }, new int[] {
                27713, 14
            }, new int[] {
                26998, 15
            }, new int[] {
                5769, 16
            }, ai7, new int[] {
                7399, 18
            }, ai8, 
            new int[] {
                1890, 20
            }, new int[] {
                597, 21
            }, new int[] {
                3340, 22
            }, new int[] {
                2107, 23
            }, ai9, ai10, ai11, ai12, new int[] {
                9396, 28
            }, new int[] {
                8579, 29
            }, 
            new int[] {
                11994, 30
            }, new int[] {
                11245, 31
            }
        });
    }
}
