// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

// Referenced classes of package org.spongycastle.crypto.modes.gcm:
//            Tables8kGCMMultiplier

abstract class GCMUtil
{

    private static final int E1 = 0xe1000000;
    private static final byte E1B = -31;
    private static final long E1L = 0xe1000000000000L;
    private static final int LOOKUP[] = generateLookup();

    GCMUtil()
    {
    }

    static void asBytes(int ai[], byte abyte0[])
    {
        Pack.intToBigEndian(ai, abyte0, 0);
    }

    static void asBytes(long al[], byte abyte0[])
    {
        Pack.longToBigEndian(al, abyte0, 0);
    }

    static byte[] asBytes(int ai[])
    {
        byte abyte0[] = new byte[16];
        Pack.intToBigEndian(ai, abyte0, 0);
        return abyte0;
    }

    static byte[] asBytes(long al[])
    {
        byte abyte0[] = new byte[16];
        Pack.longToBigEndian(al, abyte0, 0);
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

    static void asLongs(byte abyte0[], long al[])
    {
        Pack.bigEndianToLong(abyte0, 0, al);
    }

    static long[] asLongs(byte abyte0[])
    {
        long al[] = new long[2];
        Pack.bigEndianToLong(abyte0, 0, al);
        return al;
    }

    private static int[] generateLookup()
    {
        int ai[] = new int[256];
        for (int i = 0; i < 256; i++)
        {
            int j = 7;
            int k;
            int l;
            for (k = 0; j >= 0; k = l)
            {
                l = k;
                if ((1 << j & i) != 0)
                {
                    l = k ^ 0xe1000000 >>> 7 - j;
                }
                j--;
            }

            ai[i] = k;
        }

        return ai;
    }

    static void multiply(byte abyte0[], byte abyte1[])
    {
        boolean flag = Tables8kGCMMultiplier.a;
        byte abyte2[] = Arrays.clone(abyte0);
        byte abyte3[] = new byte[16];
        int i = 0;
        do
        {
label0:
            {
                if (i < 16)
                {
                    byte byte0 = abyte1[i];
                    int j = 7;
                    do
                    {
                        if (j < 0)
                        {
                            break;
                        }
                        if ((1 << j & byte0) != 0)
                        {
                            xor(abyte3, abyte2);
                        }
                        if (shiftRight(abyte2) != 0)
                        {
                            abyte2[0] = (byte)(abyte2[0] ^ 0xffffffe1);
                        }
                        j--;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                System.arraycopy(abyte3, 0, abyte0, 0, 16);
                return;
            }
            i++;
        } while (true);
    }

    static void multiply(int ai[], int ai1[])
    {
        boolean flag = Tables8kGCMMultiplier.a;
        int ai2[] = Arrays.clone(ai);
        int ai3[] = new int[4];
        int i = 0;
        do
        {
label0:
            {
                if (i < 4)
                {
                    int k = ai1[i];
                    int j = 31;
                    do
                    {
                        if (j < 0)
                        {
                            break;
                        }
                        if ((1 << j & k) != 0)
                        {
                            xor(ai3, ai2);
                        }
                        if (shiftRight(ai2) != 0)
                        {
                            ai2[0] = ai2[0] ^ 0xe1000000;
                        }
                        j--;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                System.arraycopy(ai3, 0, ai, 0, 4);
                return;
            }
            i++;
        } while (true);
    }

    static void multiply(long al[], long al1[])
    {
        boolean flag = Tables8kGCMMultiplier.a;
        long al2[] = new long[2];
        al2[0] = al[0];
        al2[1] = al[1];
        long al3[] = new long[2];
        int i = 0;
        do
        {
label0:
            {
                if (i < 2)
                {
                    long l = al1[i];
                    int j = 63;
                    do
                    {
                        if (j < 0)
                        {
                            break;
                        }
                        if ((1L << j & l) != 0L)
                        {
                            xor(al3, al2);
                        }
                        if (shiftRight(al2) != 0L)
                        {
                            al2[0] = al2[0] ^ 0xe1000000000000L;
                        }
                        j--;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                al[0] = al3[0];
                al[1] = al3[1];
                return;
            }
            i++;
        } while (true);
    }

    static void multiplyP(int ai[])
    {
        if (shiftRight(ai) != 0)
        {
            ai[0] = ai[0] ^ 0xe1000000;
        }
    }

    static void multiplyP(int ai[], int ai1[])
    {
        if (shiftRight(ai, ai1) != 0)
        {
            ai1[0] = ai1[0] ^ 0xe1000000;
        }
    }

    static void multiplyP8(int ai[])
    {
        int i = shiftRightN(ai, 8);
        int j = ai[0];
        ai[0] = LOOKUP[i >>> 24] ^ j;
    }

    static void multiplyP8(int ai[], int ai1[])
    {
        int i = shiftRightN(ai, 8, ai1);
        int j = ai1[0];
        ai1[0] = LOOKUP[i >>> 24] ^ j;
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

    static long[] oneAsLongs()
    {
        long al[] = new long[2];
        al[0] = 0x8000000000000000L;
        return al;
    }

    static byte shiftRight(byte abyte0[])
    {
        boolean flag = false;
        boolean flag1 = Tables8kGCMMultiplier.a;
        int j = 0;
        int i = 0;
        int k;
        int l;
        do
        {
            k = abyte0[i] & 0xff;
            l = i + 1;
            abyte0[i] = (byte)(j | k >>> 1);
            i = abyte0[l] & 0xff;
            j = l + 1;
            abyte0[l] = (byte)((k & 1) << 7 | i >>> 1);
            l = abyte0[j] & 0xff;
            int i1 = j + 1;
            abyte0[j] = (byte)((i & 1) << 7 | l >>> 1);
            i = abyte0[i1] & 0xff;
            k = i1 + 1;
            abyte0[i1] = (byte)((l & 1) << 7 | i >>> 1);
            l = (i & 1) << 7;
            j = l;
            i = k;
        } while (k < 16);
        byte byte0 = (byte)l;
        if (BaseKeyGenerator.a)
        {
            if (!flag1)
            {
                flag = true;
            }
            Tables8kGCMMultiplier.a = flag;
        }
        return byte0;
    }

    static byte shiftRight(byte abyte0[], byte abyte1[])
    {
        boolean flag = false;
        boolean flag1 = Tables8kGCMMultiplier.a;
        int j = 0;
        int i = 0;
        int k;
        int l;
        do
        {
            k = abyte0[i] & 0xff;
            l = i + 1;
            abyte1[i] = (byte)(j | k >>> 1);
            i = abyte0[l] & 0xff;
            j = l + 1;
            abyte1[l] = (byte)((k & 1) << 7 | i >>> 1);
            l = abyte0[j] & 0xff;
            int i1 = j + 1;
            abyte1[j] = (byte)((i & 1) << 7 | l >>> 1);
            i = abyte0[i1] & 0xff;
            k = i1 + 1;
            abyte1[i1] = (byte)((l & 1) << 7 | i >>> 1);
            l = (i & 1) << 7;
            j = l;
            i = k;
        } while (k < 16);
        byte byte0 = (byte)l;
        if (flag1)
        {
            if (!BaseKeyGenerator.a)
            {
                flag = true;
            }
            BaseKeyGenerator.a = flag;
        }
        return byte0;
    }

    static int shiftRight(int ai[])
    {
        int j = ai[0];
        ai[0] = j >>> 1;
        int i = ai[1];
        ai[1] = j << 31 | i >>> 1;
        j = ai[2];
        ai[2] = i << 31 | j >>> 1;
        i = ai[3];
        ai[3] = j << 31 | i >>> 1;
        return i << 31;
    }

    static int shiftRight(int ai[], int ai1[])
    {
        int j = ai[0];
        ai1[0] = j >>> 1;
        int i = ai[1];
        ai1[1] = j << 31 | i >>> 1;
        j = ai[2];
        ai1[2] = i << 31 | j >>> 1;
        i = ai[3];
        ai1[3] = j << 31 | i >>> 1;
        return i << 31;
    }

    static long shiftRight(long al[])
    {
        long l = al[0];
        al[0] = l >>> 1;
        long l1 = al[1];
        al[1] = l << 63 | l1 >>> 1;
        return l1 << 63;
    }

    static long shiftRight(long al[], long al1[])
    {
        long l = al[0];
        al1[0] = l >>> 1;
        long l1 = al[1];
        al1[1] = l << 63 | l1 >>> 1;
        return l1 << 63;
    }

    static int shiftRightN(int ai[], int i)
    {
        int l = ai[0];
        int j = 32 - i;
        ai[0] = l >>> i;
        int k = ai[1];
        ai[1] = l << j | k >>> i;
        l = ai[2];
        ai[2] = k << j | l >>> i;
        k = ai[3];
        ai[3] = l << j | k >>> i;
        return k << j;
    }

    static int shiftRightN(int ai[], int i, int ai1[])
    {
        int l = ai[0];
        int j = 32 - i;
        ai1[0] = l >>> i;
        int k = ai[1];
        ai1[1] = l << j | k >>> i;
        l = ai[2];
        ai1[2] = k << j | l >>> i;
        k = ai[3];
        ai1[3] = l << j | k >>> i;
        return k << j;
    }

    static void xor(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        int j;
        do
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i++;
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i++;
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i++;
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
            j = i + 1;
            i = j;
        } while (j < 16);
    }

    static void xor(byte abyte0[], byte abyte1[], int i, int j)
    {
        boolean flag = Tables8kGCMMultiplier.a;
        do
        {
            int k;
label0:
            {
                k = j - 1;
                if (j > 0)
                {
                    abyte0[k] = (byte)(abyte0[k] ^ abyte1[i + k]);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            j = k;
        } while (true);
    }

    static void xor(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        int i = 0;
        int j;
        do
        {
            abyte2[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i++;
            abyte2[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i++;
            abyte2[i] = (byte)(abyte0[i] ^ abyte1[i]);
            i++;
            abyte2[i] = (byte)(abyte0[i] ^ abyte1[i]);
            j = i + 1;
            i = j;
        } while (j < 16);
    }

    static void xor(int ai[], int ai1[])
    {
        ai[0] = ai[0] ^ ai1[0];
        ai[1] = ai[1] ^ ai1[1];
        ai[2] = ai[2] ^ ai1[2];
        ai[3] = ai[3] ^ ai1[3];
    }

    static void xor(int ai[], int ai1[], int ai2[])
    {
        ai2[0] = ai[0] ^ ai1[0];
        ai2[1] = ai[1] ^ ai1[1];
        ai2[2] = ai[2] ^ ai1[2];
        ai2[3] = ai[3] ^ ai1[3];
    }

    static void xor(long al[], long al1[])
    {
        al[0] = al[0] ^ al1[0];
        al[1] = al[1] ^ al1[1];
    }

    static void xor(long al[], long al1[], long al2[])
    {
        al2[0] = al[0] ^ al1[0];
        al2[1] = al[1] ^ al1[1];
    }

}
