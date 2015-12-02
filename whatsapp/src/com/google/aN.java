// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            d9

final class aN
{

    private static int a(int i)
    {
        int j = i;
        if (i > -12)
        {
            j = -1;
        }
        return j;
    }

    private static int a(int i, int j)
    {
        if (i > -12 || j > -65)
        {
            return -1;
        } else
        {
            return j << 8 ^ i;
        }
    }

    private static int a(int i, int j, int k)
    {
        if (i > -12 || j > -65 || k > -65)
        {
            return -1;
        } else
        {
            return j << 8 ^ i ^ k << 16;
        }
    }

    public static int a(int i, byte abyte0[], int j, int k)
    {
        int l = j;
        if (i == 0) goto _L2; else goto _L1
_L1:
        byte byte2;
        if (j >= k)
        {
            return i;
        }
        byte2 = (byte)i;
        if (byte2 >= -32) goto _L4; else goto _L3
_L4:
        l = j;
        if (byte2 >= -16) goto _L6; else goto _L5
_L5:
        int j1;
label0:
        {
            l = (byte)(~(i >> 8));
            if (l == 0)
            {
                int i1 = j + 1;
                byte byte0 = abyte0[j];
                l = byte0;
                j = i1;
                if (i1 >= k)
                {
                    return a(byte2, byte0);
                }
            }
            if (l <= -65 && (byte2 != -32 || l >= -96) && (byte2 != -19 || l < -96))
            {
                j1 = j + 1;
                if (abyte0[j] <= -65)
                {
                    break label0;
                }
            }
            return -1;
        }
        l = j1;
        if (d9.c == 0) goto _L2; else goto _L7
_L7:
        l = j1;
_L6:
        j1 = (byte)(~(i >> 8));
        j = 0;
        if (j1 != 0) goto _L9; else goto _L8
_L8:
        j1 = l + 1;
        l = abyte0[l];
        byte byte1;
        if (j1 >= k)
        {
            return a(byte2, l);
        }
        i = j;
        j = j1;
          goto _L10
_L9:
        i = (byte)(i >> 16);
        j = l;
        l = j1;
_L14:
        if (i == 0)
        {
            j1 = j + 1;
            byte1 = abyte0[j];
            i = byte1;
            j = j1;
            if (j1 >= k)
            {
                return a(byte2, l, byte1);
            }
        }
        if (l > -65 || (byte2 << 28) + (l + 112) >> 30 != 0 || i > -65) goto _L12; else goto _L11
_L11:
        l = j + 1;
        if (abyte0[j] <= -65) goto _L2; else goto _L12
_L12:
        return -1;
_L3:
        if (byte2 < -62 || abyte0[j] > -65)
        {
            return -1;
        }
        l = j + 1;
_L2:
        return b(abyte0, l, k);
_L10:
        if (true) goto _L14; else goto _L13
_L13:
    }

    private static int a(byte abyte0[], int i, int j)
    {
        byte byte0 = abyte0[i - 1];
        switch (j - i)
        {
        default:
            throw new AssertionError();

        case 0: // '\0'
            return a(byte0);

        case 1: // '\001'
            return a(byte0, abyte0[i]);

        case 2: // '\002'
            return a(byte0, abyte0[i], abyte0[i + 1]);
        }
    }

    public static int b(byte abyte0[], int i, int j)
    {
        int l = d9.c;
        int k;
        do
        {
            k = i;
            if (i >= j)
            {
                break;
            }
            k = i;
            if (abyte0[i] < 0)
            {
                break;
            }
            k = i + 1;
            i = k;
        } while (l == 0);
        if (k >= j)
        {
            return 0;
        } else
        {
            return c(abyte0, k, j);
        }
    }

    private static int c(byte abyte0[], int i, int j)
    {
_L6:
        if (i < j) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        return i;
_L2:
        int k;
        k = i + 1;
        byte byte0 = abyte0[i];
        if (byte0 >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (byte0 < -32)
        {
            i = byte0;
            if (k < j)
            {
                if (byte0 >= -62)
                {
                    i = k + 1;
                    if (abyte0[k] <= -65)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
                return -1;
            }
        } else
        {
            if (byte0 < -16)
            {
                if (k >= j - 1)
                {
                    return a(abyte0, k, j);
                }
                int l = k + 1;
                i = abyte0[k];
                if (i <= -65 && (byte0 != -32 || i >= -96) && (byte0 != -19 || i < -96))
                {
                    i = l + 1;
                    if (abyte0[l] <= -65)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
                return -1;
            }
            if (k >= j - 2)
            {
                return a(abyte0, k, j);
            }
            i = k + 1;
            k = abyte0[k];
            if (k <= -65 && (byte0 << 28) + (k + 112) >> 30 == 0)
            {
                k = i + 1;
                if (abyte0[i] <= -65)
                {
                    i = k + 1;
                    if (abyte0[k] <= -65)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
            }
            return -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean d(byte abyte0[], int i, int j)
    {
        return b(abyte0, i, j) == 0;
    }
}
