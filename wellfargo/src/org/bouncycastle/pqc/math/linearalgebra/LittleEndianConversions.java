// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


public final class LittleEndianConversions
{

    private LittleEndianConversions()
    {
    }

    public static void I2OSP(int i, byte abyte0[], int j)
    {
        int k = j + 1;
        abyte0[j] = (byte)i;
        j = k + 1;
        abyte0[k] = (byte)(i >>> 8);
        k = j + 1;
        abyte0[j] = (byte)(i >>> 16);
        abyte0[k] = (byte)(i >>> 24);
    }

    public static void I2OSP(int i, byte abyte0[], int j, int k)
    {
        for (k--; k >= 0; k--)
        {
            abyte0[j + k] = (byte)(i >>> k * 8);
        }

    }

    public static void I2OSP(long l, byte abyte0[], int i)
    {
        int j = i + 1;
        abyte0[i] = (byte)(int)l;
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 8);
        j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 16);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 24);
        j = i + 1;
        abyte0[i] = (byte)(int)(l >>> 32);
        i = j + 1;
        abyte0[j] = (byte)(int)(l >>> 40);
        abyte0[i] = (byte)(int)(l >>> 48);
        abyte0[i + 1] = (byte)(int)(l >>> 56);
    }

    public static byte[] I2OSP(int i)
    {
        return (new byte[] {
            (byte)i, (byte)(i >>> 8), (byte)(i >>> 16), (byte)(i >>> 24)
        });
    }

    public static byte[] I2OSP(long l)
    {
        return (new byte[] {
            (byte)(int)l, (byte)(int)(l >>> 8), (byte)(int)(l >>> 16), (byte)(int)(l >>> 24), (byte)(int)(l >>> 32), (byte)(int)(l >>> 40), (byte)(int)(l >>> 48), (byte)(int)(l >>> 56)
        });
    }

    public static int OS2IP(byte abyte0[])
    {
        return abyte0[0] & 0xff | (abyte0[1] & 0xff) << 8 | (abyte0[2] & 0xff) << 16 | (abyte0[3] & 0xff) << 24;
    }

    public static int OS2IP(byte abyte0[], int i)
    {
        int j = i + 1;
        i = abyte0[i];
        int k = j + 1;
        return (abyte0[j] & 0xff) << 8 | i & 0xff | (abyte0[k] & 0xff) << 16 | (abyte0[k + 1] & 0xff) << 24;
    }

    public static int OS2IP(byte abyte0[], int i, int j)
    {
        int k = 0;
        for (j--; j >= 0; j--)
        {
            k |= (abyte0[i + j] & 0xff) << j * 8;
        }

        return k;
    }

    public static long OS2LIP(byte abyte0[], int i)
    {
        int j = i + 1;
        long l = abyte0[i] & 0xff;
        i = j + 1;
        long l1 = (abyte0[j] & 0xff) << 8;
        j = i + 1;
        long l2 = (abyte0[i] & 0xff) << 16;
        i = j + 1;
        long l3 = abyte0[j];
        j = i + 1;
        long l4 = abyte0[i];
        i = j + 1;
        long l5 = abyte0[j];
        j = i + 1;
        long l6 = abyte0[i];
        return ((long)abyte0[j] & 255L) << 56 | (l | l1 | l2 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48);
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
