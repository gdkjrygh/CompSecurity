// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.d;


public class a
{

    private static final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte b[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9
    };

    public static String a(byte abyte0[])
    {
        return a(abyte0, true);
    }

    public static String a(byte abyte0[], int i, int j, boolean flag)
    {
        int i1 = (j * 4) / 3;
        byte abyte1[];
        int k;
        int l;
        if (j % 3 > 0)
        {
            k = 4;
        } else
        {
            k = 0;
        }
        if (flag)
        {
            l = i1 / 76;
        } else
        {
            l = 0;
        }
        abyte1 = new byte[l + (i1 + k)];
        l = 0;
        k = 0;
        for (i1 = 0; i1 < j - 2;)
        {
            a(abyte0, i1 + i, 3, abyte1, k);
            int k1 = l + 4;
            l = k1;
            int j1 = k;
            if (flag)
            {
                l = k1;
                j1 = k;
                if (k1 == 76)
                {
                    abyte1[k + 4] = 10;
                    j1 = k + 1;
                    l = 0;
                }
            }
            i1 += 3;
            k = j1 + 4;
        }

        l = k;
        if (i1 < j)
        {
            a(abyte0, i1 + i, j - i1, abyte1, k);
            l = k + 4;
        }
        return new String(abyte1, 0, l, "iso-8859-1");
    }

    private static String a(byte abyte0[], boolean flag)
    {
        return a(abyte0, 0, abyte0.length, flag);
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1 = 0;
        int l;
        int i1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = j1 | (i1 | l);
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = a[i >>> 18];
            abyte1[k + 1] = a[i >>> 12 & 0x3f];
            abyte1[k + 2] = a[i >>> 6 & 0x3f];
            abyte1[k + 3] = a[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = a[i >>> 18];
            abyte1[k + 1] = a[i >>> 12 & 0x3f];
            abyte1[k + 2] = a[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = a[i >>> 18];
            abyte1[k + 1] = a[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

}
