// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

abstract class GCMUtil
{

    GCMUtil()
    {
    }

    static byte[] asBytes(int ai[])
    {
        byte abyte0[] = new byte[16];
        Pack.intToBigEndian(ai, abyte0, 0);
        return abyte0;
    }

    static void asInts(byte abyte0[], int ai[])
    {
        Pack.bigEndianToInt(abyte0, 0, ai);
    }

    static int[] asInts(byte abyte0[])
    {
        int ai[] = new int[4];
        Pack.bigEndianToInt(abyte0, 0, ai);
        return ai;
    }

    static void multiply(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = Arrays.clone(abyte0);
        byte abyte3[] = new byte[16];
        for (int i = 0; i < 16; i++)
        {
            byte byte0 = abyte1[i];
            int j = 7;
            while (j >= 0) 
            {
                if ((1 << j & byte0) != 0)
                {
                    xor(abyte3, abyte2);
                }
                boolean flag;
                if ((abyte2[15] & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                shiftRight(abyte2);
                if (flag)
                {
                    abyte2[0] = (byte)(abyte2[0] ^ 0xffffffe1);
                }
                j--;
            }
        }

        System.arraycopy(abyte3, 0, abyte0, 0, 16);
    }

    static void multiplyP(int ai[])
    {
        boolean flag;
        if ((ai[3] & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        shiftRight(ai);
        if (flag)
        {
            ai[0] = ai[0] ^ 0xe1000000;
        }
    }

    static void multiplyP(int ai[], int ai1[])
    {
        boolean flag;
        if ((ai[3] & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        shiftRight(ai, ai1);
        if (flag)
        {
            ai1[0] = ai1[0] ^ 0xe1000000;
        }
    }

    static void multiplyP8(int ai[])
    {
        int j = ai[3];
        shiftRightN(ai, 8);
        for (int i = 7; i >= 0; i--)
        {
            if ((1 << i & j) != 0)
            {
                ai[0] = ai[0] ^ 0xe1000000 >>> 7 - i;
            }
        }

    }

    static void multiplyP8(int ai[], int ai1[])
    {
        int j = ai[3];
        shiftRightN(ai, 8, ai1);
        for (int i = 7; i >= 0; i--)
        {
            if ((1 << i & j) != 0)
            {
                ai1[0] = ai1[0] ^ 0xe1000000 >>> 7 - i;
            }
        }

    }

    static byte[] oneAsBytes()
    {
        byte abyte0[] = new byte[16];
        abyte0[0] = -128;
        return abyte0;
    }

    static int[] oneAsInts()
    {
        int ai[] = new int[4];
        ai[0] = 0x80000000;
        return ai;
    }

    static void shiftRight(byte abyte0[])
    {
        int i = 0;
        int j = 0;
        do
        {
            int k = abyte0[j] & 0xff;
            abyte0[j] = (byte)(i | k >>> 1);
            j++;
            if (j == 16)
            {
                return;
            }
            i = (k & 1) << 7;
        } while (true);
    }

    static void shiftRight(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        int j = 0;
        do
        {
            int k = abyte0[j] & 0xff;
            abyte1[j] = (byte)(i | k >>> 1);
            j++;
            if (j == 16)
            {
                return;
            }
            i = (k & 1) << 7;
        } while (true);
    }

    static void shiftRight(int ai[])
    {
        int i = 0;
        int j = 0;
        do
        {
            int k = ai[j];
            ai[j] = i | k >>> 1;
            j++;
            if (j == 4)
            {
                return;
            }
            i = k << 31;
        } while (true);
    }

    static void shiftRight(int ai[], int ai1[])
    {
        int i = 0;
        int j = 0;
        do
        {
            int k = ai[j];
            ai1[j] = i | k >>> 1;
            j++;
            if (j == 4)
            {
                return;
            }
            i = k << 31;
        } while (true);
    }

    static void shiftRightN(int ai[], int i)
    {
        int j = 0;
        int k = 0;
        do
        {
            int l = ai[k];
            ai[k] = j | l >>> i;
            k++;
            if (k == 4)
            {
                return;
            }
            j = l << 32 - i;
        } while (true);
    }

    static void shiftRightN(int ai[], int i, int ai1[])
    {
        int j = 0;
        int k = 0;
        do
        {
            int l = ai[k];
            ai1[k] = j | l >>> i;
            k++;
            if (k == 4)
            {
                return;
            }
            j = l << 32 - i;
        } while (true);
    }

    static void xor(byte abyte0[], byte abyte1[])
    {
        for (int i = 15; i >= 0; i--)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
        }

    }

    static void xor(byte abyte0[], byte abyte1[], int i, int j)
    {
        do
        {
            int k = j - 1;
            if (j > 0)
            {
                abyte0[k] = (byte)(abyte0[k] ^ abyte1[i + k]);
                j = k;
            } else
            {
                return;
            }
        } while (true);
    }

    static void xor(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        for (int i = 15; i >= 0; i--)
        {
            abyte2[i] = (byte)(abyte0[i] ^ abyte1[i]);
        }

    }

    static void xor(int ai[], int ai1[])
    {
        for (int i = 3; i >= 0; i--)
        {
            ai[i] = ai[i] ^ ai1[i];
        }

    }

    static void xor(int ai[], int ai1[], int ai2[])
    {
        for (int i = 3; i >= 0; i--)
        {
            ai2[i] = ai[i] ^ ai1[i];
        }

    }
}
