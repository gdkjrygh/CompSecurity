// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;


public final class h
{

    private static final char a[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final char b[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    private static final byte c[] = {
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
        49, 50, 51, -9, -9, -9, -9, -9
    };
    private static final byte d[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9
    };

    public static String a(byte abyte0[], boolean flag)
    {
        char ac[];
        char ac1[];
        int i;
        int j;
        int k;
        int l1;
        l1 = abyte0.length;
        ac = b;
        i = ((l1 + 2) / 3) * 4;
        ac1 = new char[i + i / 0x7fffffff];
        j = 0;
        i = 0;
        for (k = 0; k < l1 - 2;)
        {
            int l = (abyte0[k + 0] << 24) >>> 8 | (abyte0[k + 1 + 0] << 24) >>> 16 | (abyte0[k + 2 + 0] << 24) >>> 24;
            ac1[i] = ac[l >>> 18];
            ac1[i + 1] = ac[l >>> 12 & 0x3f];
            ac1[i + 2] = ac[l >>> 6 & 0x3f];
            ac1[i + 3] = ac[l & 0x3f];
            int j1 = j + 4;
            j = j1;
            l = i;
            if (j1 == 0x7fffffff)
            {
                ac1[i + 4] = '\n';
                l = i + 1;
                j = 0;
            }
            k += 3;
            i = l + 4;
        }

        if (k >= l1) goto _L2; else goto _L1
_L1:
        int k1 = k + 0;
        l1 -= k;
        int i1;
        if (l1 > 0)
        {
            k = (abyte0[k1] << 24) >>> 8;
        } else
        {
            k = 0;
        }
        if (l1 > 1)
        {
            i1 = (abyte0[k1 + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (l1 > 2)
        {
            k1 = (abyte0[k1 + 2] << 24) >>> 24;
        } else
        {
            k1 = 0;
        }
        k = k1 | (k | i1);
        l1;
        JVM INSTR tableswitch 1 3: default 316
    //                   1 493
    //                   2 439
    //                   3 380;
           goto _L3 _L4 _L5 _L6
_L3:
        if (j + 4 == 0x7fffffff)
        {
            ac1[i + 4] = '\n';
        }
_L2:
        for (i = ac1.length; i > 0 && ac1[i - 1] == '='; i--) { }
        break; /* Loop/switch isn't completed */
_L6:
        ac1[i] = ac[k >>> 18];
        ac1[i + 1] = ac[k >>> 12 & 0x3f];
        ac1[i + 2] = ac[k >>> 6 & 0x3f];
        ac1[i + 3] = ac[k & 0x3f];
        continue; /* Loop/switch isn't completed */
_L5:
        ac1[i] = ac[k >>> 18];
        ac1[i + 1] = ac[k >>> 12 & 0x3f];
        ac1[i + 2] = ac[k >>> 6 & 0x3f];
        ac1[i + 3] = '=';
        continue; /* Loop/switch isn't completed */
_L4:
        ac1[i] = ac[k >>> 18];
        ac1[i + 1] = ac[k >>> 12 & 0x3f];
        ac1[i + 2] = '=';
        ac1[i + 3] = '=';
        if (true) goto _L3; else goto _L7
_L7:
        return new String(ac1, 0, i);
    }

}
