// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;


// Referenced classes of package net.hockeyapp.android.utils:
//            Base64

static class value extends value
{

    private static final int DECODE[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
        -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };
    private static final int DECODE_WEBSAFE[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
        -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };
    private static final int EQUALS = -2;
    private static final int SKIP = -1;
    private final int alphabet[];
    private int state;
    private int value;

    public int maxOutputSize(int i)
    {
        return (i * 3) / 4 + 10;
    }

    public boolean process(byte abyte0[], int i, int j, boolean flag)
    {
        byte abyte1[];
        int ai[];
        int k;
        int l;
        int k1;
        int i2;
        if (state == 6)
        {
            return false;
        }
        l = i;
        i2 = j + i;
        k1 = state;
        j = value;
        k = 0;
        abyte1 = output;
        ai = alphabet;
_L12:
        int i1;
        int j1;
        int l1;
        if (l >= i2)
        {
            break MISSING_BLOCK_LABEL_806;
        }
        i1 = k;
        l1 = l;
        j1 = j;
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        i = j;
        do
        {
            if (l + 4 > i2)
            {
                break;
            }
            j = ai[abyte0[l] & 0xff] << 18 | ai[abyte0[l + 1] & 0xff] << 12 | ai[abyte0[l + 2] & 0xff] << 6 | ai[abyte0[l + 3] & 0xff];
            i = j;
            if (j < 0)
            {
                break;
            }
            abyte1[k + 2] = (byte)j;
            abyte1[k + 1] = (byte)(j >> 8);
            abyte1[k] = (byte)(j >> 16);
            k += 3;
            l += 4;
            i = j;
        } while (true);
        i1 = k;
        l1 = l;
        j1 = i;
        if (l < i2) goto _L2; else goto _L3
_L3:
        j = i;
        i = k;
_L25:
        if (!flag)
        {
            state = k1;
            value = j;
            op = i;
            return true;
        }
          goto _L4
_L2:
        l = ai[abyte0[l1] & 0xff];
        k1;
        JVM INSTR tableswitch 0 5: default 296
    //                   0 318
    //                   1 362
    //                   2 412
    //                   3 493
    //                   4 617
    //                   5 663;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
        j = j1;
        i = k1;
        k = i1;
_L13:
        l = l1 + 1;
        k1 = i;
          goto _L12
_L6:
label0:
        {
            if (l < 0)
            {
                break label0;
            }
            j = l;
            i = k1 + 1;
            k = i1;
        }
          goto _L13
        k = i1;
        i = k1;
        j = j1;
        if (l == -1) goto _L13; else goto _L14
_L14:
        state = 6;
        return false;
_L7:
label1:
        {
            if (l < 0)
            {
                break label1;
            }
            j = j1 << 6 | l;
            i = k1 + 1;
            k = i1;
        }
          goto _L13
        k = i1;
        i = k1;
        j = j1;
        if (l == -1) goto _L13; else goto _L15
_L15:
        state = 6;
        return false;
_L8:
        if (l >= 0)
        {
            j = j1 << 6 | l;
            i = k1 + 1;
            k = i1;
        } else
        {
label2:
            {
                if (l != -2)
                {
                    break label2;
                }
                abyte1[i1] = (byte)(j1 >> 4);
                i = 4;
                k = i1 + 1;
                j = j1;
            }
        }
          goto _L13
        k = i1;
        i = k1;
        j = j1;
        if (l == -1) goto _L13; else goto _L16
_L16:
        state = 6;
        return false;
_L9:
        if (l >= 0)
        {
            j = j1 << 6 | l;
            abyte1[i1 + 2] = (byte)j;
            abyte1[i1 + 1] = (byte)(j >> 8);
            abyte1[i1] = (byte)(j >> 16);
            k = i1 + 3;
            i = 0;
        } else
        {
label3:
            {
                if (l != -2)
                {
                    break label3;
                }
                abyte1[i1 + 1] = (byte)(j1 >> 2);
                abyte1[i1] = (byte)(j1 >> 10);
                k = i1 + 2;
                i = 5;
                j = j1;
            }
        }
          goto _L13
        k = i1;
        i = k1;
        j = j1;
        if (l == -1) goto _L13; else goto _L17
_L17:
        state = 6;
        return false;
_L10:
label4:
        {
            if (l != -2)
            {
                break label4;
            }
            i = k1 + 1;
            k = i1;
            j = j1;
        }
          goto _L13
        k = i1;
        i = k1;
        j = j1;
        if (l == -1) goto _L13; else goto _L18
_L18:
        state = 6;
        return false;
_L11:
        k = i1;
        i = k1;
        j = j1;
        if (l == -1) goto _L13; else goto _L19
_L19:
        state = 6;
        return false;
_L4:
        k1;
        JVM INSTR tableswitch 0 4: default 724
    //                   0 737
    //                   1 740
    //                   2 748
    //                   3 767
    //                   4 798;
           goto _L20 _L20 _L21 _L22 _L23 _L24
_L20:
        state = k1;
        op = i;
        return true;
_L21:
        state = 6;
        return false;
_L22:
        k = i + 1;
        abyte1[i] = (byte)(j >> 4);
        i = k;
        continue; /* Loop/switch isn't completed */
_L23:
        k = i + 1;
        abyte1[i] = (byte)(j >> 10);
        abyte1[k] = (byte)(j >> 2);
        i = k + 1;
        if (true) goto _L20; else goto _L24
_L24:
        state = 6;
        return false;
        i = k;
          goto _L25
    }


    public (int i, byte abyte0[])
    {
        output = abyte0;
        if ((i & 8) == 0)
        {
            abyte0 = DECODE;
        } else
        {
            abyte0 = DECODE_WEBSAFE;
        }
        alphabet = abyte0;
        state = 0;
        value = 0;
    }
}
