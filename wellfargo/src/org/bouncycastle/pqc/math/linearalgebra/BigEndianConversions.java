// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            IntegerFunctions

public final class BigEndianConversions
{

    private BigEndianConversions()
    {
    }

    public static void I2OSP(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = (byte)(i >>> 24);
        j = k + 1;
        abyte0[k] = (byte)(i >>> 16);
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    public static void I2OSP(int i, byte abyte0[], int j, int k)
    {
        for (int l = k - 1; l >= 0; l--)
        {
            abyte0[j + l] = (byte)(i >>> (k - 1 - l) * 8);
        }

    }

    public static void I2OSP(long l, byte abyte0[], int i)
    {
        int j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 56);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 48);
        j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 40);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 32);
        j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 24);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 16);
        abyte0[i] = (byte)(int)(l >>> 8);
        abyte0[i + 1] = (byte)(int)l;
    }

    public static byte[] I2OSP(int i)
    {
        return (new byte[] {
            (byte)(i >>> 24), (byte)(i >>> 16), (byte)(i >>> 8), (byte)i
        });
    }

    public static byte[] I2OSP(int i, int j)
    {
        if (i >= 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = null;
_L4:
        return abyte0;
_L2:
        int l = IntegerFunctions.ceilLog256(i);
        if (l > j)
        {
            throw new ArithmeticException("Cannot encode given integer into specified number of octets.");
        }
        byte abyte1[] = new byte[j];
        int k = j - 1;
        do
        {
            abyte0 = abyte1;
            if (k < j - l)
            {
                continue;
            }
            abyte1[k] = (byte)(i >>> (j - 1 - k) * 8);
            k--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] I2OSP(long l)
    {
        return (new byte[] {
            (byte)(int)(l >>> 56), (byte)(int)(l >>> 48), (byte)(int)(l >>> 40), (byte)(int)(l >>> 32), (byte)(int)(l >>> 24), (byte)(int)(l >>> 16), (byte)(int)(l >>> 8), (byte)(int)l
        });
    }

    public static int OS2IP(byte abyte0[])
    {
        int i = 0;
        if (abyte0.length > 4)
        {
            throw new ArithmeticException("invalid input length");
        }
        if (abyte0.length == 0)
        {
            return 0;
        }
        int j = 0;
        for (; i < abyte0.length; i++)
        {
            j |= (abyte0[i] & 0xff) << (abyte0.length - 1 - i) * 8;
        }

        return j;
    }

    public static int OS2IP(byte abyte0[], int i)
    {
        int j = i + 1;
        i = abyte0[i];
        int k = j + 1;
        return (abyte0[j] & 0xff) << 16 | (i & 0xff) << 24 | (abyte0[k] & 0xff) << 8 | abyte0[k + 1] & 0xff;
    }

    public static int OS2IP(byte abyte0[], int i, int j)
    {
        int k;
        int l;
        boolean flag;
        k = 0;
        flag = false;
        l = ((flag) ? 1 : 0);
        if (abyte0.length == 0) goto _L2; else goto _L1
_L1:
        if (abyte0.length >= (i + j) - 1) goto _L4; else goto _L3
_L3:
        l = ((flag) ? 1 : 0);
_L2:
        return l;
_L4:
        l = 0;
        do
        {
            int i1 = l;
            l = k;
            if (i1 >= j)
            {
                continue;
            }
            byte byte0 = abyte0[i + i1];
            l = i1 + 1;
            k = (byte0 & 0xff) << (j - i1 - 1) * 8 | k;
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static long OS2LIP(byte abyte0[], int i)
    {
        int j = i + 1;
        long l = abyte0[i];
        i = j + 1;
        long l1 = abyte0[j];
        j = i + 1;
        long l2 = abyte0[i];
        i = j + 1;
        long l3 = abyte0[j];
        j = i + 1;
        long l4 = abyte0[i];
        i = j + 1;
        long l5 = (abyte0[j] & 0xff) << 16;
        long l6 = (abyte0[i] & 0xff) << 8;
        return (long)(abyte0[i + 1] & 0xff) | ((l & 255L) << 56 | (l1 & 255L) << 48 | (l2 & 255L) << 40 | (l3 & 255L) << 32 | (l4 & 255L) << 24 | l5 | l6);
    }

    public static byte[] toByteArray(int ai[])
    {
        byte abyte0[] = new byte[ai.length << 2];
        for (int i = 0; i < ai.length; i++)
        {
            I2OSP(ai[i], abyte0, i << 2);
        }

        return abyte0;
    }

    public static byte[] toByteArray(int ai[], int i)
    {
        int k = 0;
        int l = ai.length;
        byte abyte0[] = new byte[i];
        int j;
        for (j = 0; k <= l - 2; j += 4)
        {
            I2OSP(ai[k], abyte0, j);
            k++;
        }

        I2OSP(ai[l - 1], abyte0, j, i - j);
        return abyte0;
    }

    public static int[] toIntArray(byte abyte0[])
    {
        int j = 0;
        int k = (abyte0.length + 3) / 4;
        int l = abyte0.length & 3;
        int ai[] = new int[k];
        int i;
        for (i = 0; j <= k - 2; i += 4)
        {
            ai[j] = OS2IP(abyte0, i);
            j++;
        }

        if (l != 0)
        {
            ai[k - 1] = OS2IP(abyte0, i, l);
            return ai;
        } else
        {
            ai[k - 1] = OS2IP(abyte0, i);
            return ai;
        }
    }
}
