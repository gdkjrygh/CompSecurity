// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;
import java.util.Random;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            IntUtils, IntegerFunctions

public class GF2Polynomial
{

    private static final int bitMask[] = {
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 
        1024, 2048, 4096, 8192, 16384, 32768, 0x10000, 0x20000, 0x40000, 0x80000, 
        0x100000, 0x200000, 0x400000, 0x800000, 0x1000000, 0x2000000, 0x4000000, 0x8000000, 0x10000000, 0x20000000, 
        0x40000000, 0x80000000, 0
    };
    private static final boolean parity[] = {
        0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 
        0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 
        0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 
        0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 
        0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 
        1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 
        0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 
        1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 
        0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 
        0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 
        1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 
        1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 
        0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 
        0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 
        1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 
        0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 
        0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 
        0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 
        0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 
        0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 
        1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 
        0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 
        1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 
        1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 
        0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 
        0, 1, 0, 1, 1, 0
    };
    private static Random rand = new Random();
    private static final int reverseRightMask[] = {
        0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
        1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff, 
        0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff, 
        0x3fffffff, 0x7fffffff, -1
    };
    private static final short squaringTable[] = {
        0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 
        68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 
        272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 
        340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 
        1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 
        1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 
        1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 
        4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 
        4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 
        4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 
        5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 
        5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 
        5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 
        16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 
        16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 
        16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 
        17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 
        17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 
        17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 
        17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 
        20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 
        20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 
        20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 
        21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 
        21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 
        21828, 21829, 21840, 21841, 21844, 21845
    };
    private int blocks;
    private int len;
    private int value[];

    public GF2Polynomial(int i)
    {
        int j = i;
        if (i < 1)
        {
            j = 1;
        }
        blocks = (j - 1 >> 5) + 1;
        value = new int[blocks];
        len = j;
    }

    public GF2Polynomial(int i, String s)
    {
        int j = i;
        if (i < 1)
        {
            j = 1;
        }
        blocks = (j - 1 >> 5) + 1;
        value = new int[blocks];
        len = j;
        if (s.equalsIgnoreCase("ZERO"))
        {
            assignZero();
            return;
        }
        if (s.equalsIgnoreCase("ONE"))
        {
            assignOne();
            return;
        }
        if (s.equalsIgnoreCase("RANDOM"))
        {
            randomize();
            return;
        }
        if (s.equalsIgnoreCase("X"))
        {
            assignX();
            return;
        }
        if (s.equalsIgnoreCase("ALL"))
        {
            assignAll();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error: GF2Polynomial was called using ").append(s).append(" as value!").toString());
        }
    }

    public GF2Polynomial(int i, BigInteger biginteger)
    {
        int j = i;
        if (i < 1)
        {
            j = 1;
        }
        blocks = (j - 1 >> 5) + 1;
        value = new int[blocks];
        len = j;
        biginteger = biginteger.toByteArray();
        if (biginteger[0] == 0)
        {
            byte abyte0[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
            biginteger = abyte0;
        }
        j = biginteger.length & 3;
        int l = biginteger.length;
        for (i = 0; i < j; i++)
        {
            int ai[] = value;
            int j1 = ((l - 1 >> 2) + 1) - 1;
            ai[j1] = ai[j1] | (biginteger[i] & 0xff) << (j - 1 - i << 3);
        }

        for (i = 0; i <= biginteger.length - 4 >> 2; i++)
        {
            int k = biginteger.length - 1 - (i << 2);
            value[i] = biginteger[k] & 0xff;
            int ai1[] = value;
            ai1[i] = ai1[i] | biginteger[k - 1] << 8 & 0xff00;
            ai1 = value;
            ai1[i] = ai1[i] | biginteger[k - 2] << 16 & 0xff0000;
            ai1 = value;
            int i1 = ai1[i];
            ai1[i] = biginteger[k - 3] << 24 & 0xff000000 | i1;
        }

        if ((len & 0x1f) != 0)
        {
            biginteger = value;
            i = blocks - 1;
            biginteger[i] = biginteger[i] & reverseRightMask[len & 0x1f];
        }
        reduceN();
    }

    public GF2Polynomial(int i, Random random)
    {
        int j = i;
        if (i < 1)
        {
            j = 1;
        }
        blocks = (j - 1 >> 5) + 1;
        value = new int[blocks];
        len = j;
        randomize(random);
    }

    public GF2Polynomial(int i, byte abyte0[])
    {
        int j = i;
        if (i < 1)
        {
            j = 1;
        }
        blocks = (j - 1 >> 5) + 1;
        value = new int[blocks];
        len = j;
        j = Math.min((abyte0.length - 1 >> 2) + 1, blocks);
        for (i = 0; i < j - 1; i++)
        {
            int k = abyte0.length - (i << 2) - 1;
            value[i] = abyte0[k] & 0xff;
            int ai[] = value;
            ai[i] = ai[i] | abyte0[k - 1] << 8 & 0xff00;
            ai = value;
            ai[i] = ai[i] | abyte0[k - 2] << 16 & 0xff0000;
            ai = value;
            int i1 = ai[i];
            ai[i] = abyte0[k - 3] << 24 & 0xff000000 | i1;
        }

        i = j - 1;
        j = abyte0.length - (i << 2) - 1;
        value[i] = abyte0[j] & 0xff;
        if (j > 0)
        {
            int ai1[] = value;
            ai1[i] = ai1[i] | abyte0[j - 1] << 8 & 0xff00;
        }
        if (j > 1)
        {
            int ai2[] = value;
            ai2[i] = ai2[i] | abyte0[j - 2] << 16 & 0xff0000;
        }
        if (j > 2)
        {
            int ai3[] = value;
            int l = ai3[i];
            ai3[i] = abyte0[j - 3] << 24 & 0xff000000 | l;
        }
        zeroUnusedBits();
        reduceN();
    }

    public GF2Polynomial(int i, int ai[])
    {
        int j = i;
        if (i < 1)
        {
            j = 1;
        }
        blocks = (j - 1 >> 5) + 1;
        value = new int[blocks];
        len = j;
        i = Math.min(blocks, ai.length);
        System.arraycopy(ai, 0, value, 0, i);
        zeroUnusedBits();
    }

    public GF2Polynomial(GF2Polynomial gf2polynomial)
    {
        len = gf2polynomial.len;
        blocks = gf2polynomial.blocks;
        value = IntUtils.clone(gf2polynomial.value);
    }

    private void doShiftBlocksLeft(int i)
    {
        if (blocks <= value.length)
        {
            for (int j = blocks - 1; j >= i; j--)
            {
                value[j] = value[j - i];
            }

            for (int k = 0; k < i; k++)
            {
                value[k] = 0;
            }

        } else
        {
            int ai[] = new int[blocks];
            System.arraycopy(value, 0, ai, i, blocks - i);
            value = null;
            value = ai;
        }
    }

    private GF2Polynomial karaMult(GF2Polynomial gf2polynomial)
    {
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(len << 1);
        if (len <= 32)
        {
            gf2polynomial1.value = mult32(value[0], gf2polynomial.value[0]);
            return gf2polynomial1;
        }
        if (len <= 64)
        {
            gf2polynomial1.value = mult64(value, gf2polynomial.value);
            return gf2polynomial1;
        }
        if (len <= 128)
        {
            gf2polynomial1.value = mult128(value, gf2polynomial.value);
            return gf2polynomial1;
        }
        if (len <= 256)
        {
            gf2polynomial1.value = mult256(value, gf2polynomial.value);
            return gf2polynomial1;
        }
        if (len <= 512)
        {
            gf2polynomial1.value = mult512(value, gf2polynomial.value);
            return gf2polynomial1;
        } else
        {
            int i = IntegerFunctions.floorLog(len - 1);
            i = bitMask[i];
            GF2Polynomial gf2polynomial2 = lower((i - 1 >> 5) + 1);
            GF2Polynomial gf2polynomial3 = upper((i - 1 >> 5) + 1);
            GF2Polynomial gf2polynomial4 = gf2polynomial.lower((i - 1 >> 5) + 1);
            GF2Polynomial gf2polynomial6 = gf2polynomial.upper((i - 1 >> 5) + 1);
            gf2polynomial = gf2polynomial3.karaMult(gf2polynomial6);
            GF2Polynomial gf2polynomial5 = gf2polynomial2.karaMult(gf2polynomial4);
            gf2polynomial2.addToThis(gf2polynomial3);
            gf2polynomial4.addToThis(gf2polynomial6);
            gf2polynomial2 = gf2polynomial2.karaMult(gf2polynomial4);
            gf2polynomial1.shiftLeftAddThis(gf2polynomial, i << 1);
            gf2polynomial1.shiftLeftAddThis(gf2polynomial, i);
            gf2polynomial1.shiftLeftAddThis(gf2polynomial2, i);
            gf2polynomial1.shiftLeftAddThis(gf2polynomial5, i);
            gf2polynomial1.addToThis(gf2polynomial5);
            return gf2polynomial1;
        }
    }

    private GF2Polynomial lower(int i)
    {
        GF2Polynomial gf2polynomial = new GF2Polynomial(i << 5);
        System.arraycopy(value, 0, gf2polynomial.value, 0, Math.min(i, blocks));
        return gf2polynomial;
    }

    private static int[] mult128(int ai[], int ai1[])
    {
        int ai2[] = new int[8];
        int ai3[] = new int[2];
        System.arraycopy(ai, 0, ai3, 0, Math.min(2, ai.length));
        int ai4[] = new int[2];
        if (ai.length > 2)
        {
            System.arraycopy(ai, 2, ai4, 0, Math.min(2, ai.length - 2));
        }
        ai = new int[2];
        System.arraycopy(ai1, 0, ai, 0, Math.min(2, ai1.length));
        int ai5[] = new int[2];
        if (ai1.length > 2)
        {
            System.arraycopy(ai1, 2, ai5, 0, Math.min(2, ai1.length - 2));
        }
        if (ai4[1] == 0 && ai5[1] == 0)
        {
            if (ai4[0] != 0 || ai5[0] != 0)
            {
                ai1 = mult32(ai4[0], ai5[0]);
                ai2[5] = ai2[5] ^ ai1[1];
                ai2[4] = ai2[4] ^ ai1[0];
                ai2[3] = ai2[3] ^ ai1[1];
                int i = ai2[2];
                ai2[2] = ai1[0] ^ i;
            }
        } else
        {
            ai1 = mult64(ai4, ai5);
            ai2[7] = ai2[7] ^ ai1[3];
            ai2[6] = ai2[6] ^ ai1[2];
            ai2[5] = ai2[5] ^ (ai1[1] ^ ai1[3]);
            ai2[4] = ai2[4] ^ (ai1[0] ^ ai1[2]);
            ai2[3] = ai2[3] ^ ai1[1];
            int l = ai2[2];
            ai2[2] = ai1[0] ^ l;
        }
        ai4[0] = ai4[0] ^ ai3[0];
        ai4[1] = ai4[1] ^ ai3[1];
        ai5[0] = ai5[0] ^ ai[0];
        ai5[1] = ai5[1] ^ ai[1];
        if (ai4[1] == 0 && ai5[1] == 0)
        {
            ai1 = mult32(ai4[0], ai5[0]);
            ai2[3] = ai2[3] ^ ai1[1];
            int j = ai2[2];
            ai2[2] = ai1[0] ^ j;
        } else
        {
            ai1 = mult64(ai4, ai5);
            ai2[5] = ai2[5] ^ ai1[3];
            ai2[4] = ai2[4] ^ ai1[2];
            ai2[3] = ai2[3] ^ ai1[1];
            int i1 = ai2[2];
            ai2[2] = ai1[0] ^ i1;
        }
        if (ai3[1] == 0 && ai[1] == 0)
        {
            ai = mult32(ai3[0], ai[0]);
            ai2[3] = ai2[3] ^ ai[1];
            ai2[2] = ai2[2] ^ ai[0];
            ai2[1] = ai2[1] ^ ai[1];
            int k = ai2[0];
            ai2[0] = ai[0] ^ k;
            return ai2;
        } else
        {
            ai = mult64(ai3, ai);
            ai2[5] = ai2[5] ^ ai[3];
            ai2[4] = ai2[4] ^ ai[2];
            ai2[3] = ai2[3] ^ (ai[1] ^ ai[3]);
            ai2[2] = ai2[2] ^ (ai[0] ^ ai[2]);
            ai2[1] = ai2[1] ^ ai[1];
            int j1 = ai2[0];
            ai2[0] = ai[0] ^ j1;
            return ai2;
        }
    }

    private static int[] mult256(int ai[], int ai1[])
    {
        int ai2[] = new int[16];
        int ai3[] = new int[4];
        System.arraycopy(ai, 0, ai3, 0, Math.min(4, ai.length));
        int ai4[] = new int[4];
        if (ai.length > 4)
        {
            System.arraycopy(ai, 4, ai4, 0, Math.min(4, ai.length - 4));
        }
        ai = new int[4];
        System.arraycopy(ai1, 0, ai, 0, Math.min(4, ai1.length));
        int ai5[] = new int[4];
        if (ai1.length > 4)
        {
            System.arraycopy(ai1, 4, ai5, 0, Math.min(4, ai1.length - 4));
        }
        int j;
        if (ai4[3] == 0 && ai4[2] == 0 && ai5[3] == 0 && ai5[2] == 0)
        {
            if (ai4[1] == 0 && ai5[1] == 0)
            {
                if (ai4[0] != 0 || ai5[0] != 0)
                {
                    ai1 = mult32(ai4[0], ai5[0]);
                    ai2[9] = ai2[9] ^ ai1[1];
                    ai2[8] = ai2[8] ^ ai1[0];
                    ai2[5] = ai2[5] ^ ai1[1];
                    int i = ai2[4];
                    ai2[4] = ai1[0] ^ i;
                }
            } else
            {
                ai1 = mult64(ai4, ai5);
                ai2[11] = ai2[11] ^ ai1[3];
                ai2[10] = ai2[10] ^ ai1[2];
                ai2[9] = ai2[9] ^ ai1[1];
                ai2[8] = ai2[8] ^ ai1[0];
                ai2[7] = ai2[7] ^ ai1[3];
                ai2[6] = ai2[6] ^ ai1[2];
                ai2[5] = ai2[5] ^ ai1[1];
                int k = ai2[4];
                ai2[4] = ai1[0] ^ k;
            }
        } else
        {
            ai1 = mult128(ai4, ai5);
            ai2[15] = ai2[15] ^ ai1[7];
            ai2[14] = ai2[14] ^ ai1[6];
            ai2[13] = ai2[13] ^ ai1[5];
            ai2[12] = ai2[12] ^ ai1[4];
            ai2[11] = ai2[11] ^ (ai1[3] ^ ai1[7]);
            ai2[10] = ai2[10] ^ (ai1[2] ^ ai1[6]);
            ai2[9] = ai2[9] ^ (ai1[1] ^ ai1[5]);
            ai2[8] = ai2[8] ^ (ai1[0] ^ ai1[4]);
            ai2[7] = ai2[7] ^ ai1[3];
            ai2[6] = ai2[6] ^ ai1[2];
            ai2[5] = ai2[5] ^ ai1[1];
            int l = ai2[4];
            ai2[4] = ai1[0] ^ l;
        }
        ai4[0] = ai4[0] ^ ai3[0];
        ai4[1] = ai4[1] ^ ai3[1];
        ai4[2] = ai4[2] ^ ai3[2];
        ai4[3] = ai4[3] ^ ai3[3];
        ai5[0] = ai5[0] ^ ai[0];
        ai5[1] = ai5[1] ^ ai[1];
        ai5[2] = ai5[2] ^ ai[2];
        ai5[3] = ai5[3] ^ ai[3];
        ai1 = mult128(ai4, ai5);
        ai2[11] = ai2[11] ^ ai1[7];
        ai2[10] = ai2[10] ^ ai1[6];
        ai2[9] = ai2[9] ^ ai1[5];
        ai2[8] = ai2[8] ^ ai1[4];
        ai2[7] = ai2[7] ^ ai1[3];
        ai2[6] = ai2[6] ^ ai1[2];
        ai2[5] = ai2[5] ^ ai1[1];
        j = ai2[4];
        ai2[4] = ai1[0] ^ j;
        ai = mult128(ai3, ai);
        ai2[11] = ai2[11] ^ ai[7];
        ai2[10] = ai2[10] ^ ai[6];
        ai2[9] = ai2[9] ^ ai[5];
        ai2[8] = ai2[8] ^ ai[4];
        ai2[7] = ai2[7] ^ (ai[3] ^ ai[7]);
        ai2[6] = ai2[6] ^ (ai[2] ^ ai[6]);
        ai2[5] = ai2[5] ^ (ai[1] ^ ai[5]);
        ai2[4] = ai2[4] ^ (ai[0] ^ ai[4]);
        ai2[3] = ai2[3] ^ ai[3];
        ai2[2] = ai2[2] ^ ai[2];
        ai2[1] = ai2[1] ^ ai[1];
        j = ai2[0];
        ai2[0] = ai[0] ^ j;
        return ai2;
    }

    private static int[] mult32(int i, int j)
    {
        int ai[] = new int[2];
        if (i == 0 || j == 0)
        {
            return ai;
        }
        long l = (long)j & 0xffffffffL;
        long l1 = 0L;
        for (j = 1; j <= 32;)
        {
            long l2 = l1;
            if ((bitMask[j - 1] & i) != 0)
            {
                l2 = l1 ^ l;
            }
            l <<= 1;
            j++;
            l1 = l2;
        }

        ai[1] = (int)(l1 >>> 32);
        ai[0] = (int)(l1 & 0xffffffffL);
        return ai;
    }

    private static int[] mult512(int ai[], int ai1[])
    {
        int ai2[] = new int[32];
        int ai3[] = new int[8];
        System.arraycopy(ai, 0, ai3, 0, Math.min(8, ai.length));
        int ai4[] = new int[8];
        if (ai.length > 8)
        {
            System.arraycopy(ai, 8, ai4, 0, Math.min(8, ai.length - 8));
        }
        ai = new int[8];
        System.arraycopy(ai1, 0, ai, 0, Math.min(8, ai1.length));
        int ai5[] = new int[8];
        if (ai1.length > 8)
        {
            System.arraycopy(ai1, 8, ai5, 0, Math.min(8, ai1.length - 8));
        }
        ai1 = mult256(ai4, ai5);
        ai2[31] = ai2[31] ^ ai1[15];
        ai2[30] = ai2[30] ^ ai1[14];
        ai2[29] = ai2[29] ^ ai1[13];
        ai2[28] = ai2[28] ^ ai1[12];
        ai2[27] = ai2[27] ^ ai1[11];
        ai2[26] = ai2[26] ^ ai1[10];
        ai2[25] = ai2[25] ^ ai1[9];
        ai2[24] = ai2[24] ^ ai1[8];
        ai2[23] = ai2[23] ^ (ai1[7] ^ ai1[15]);
        ai2[22] = ai2[22] ^ (ai1[6] ^ ai1[14]);
        ai2[21] = ai2[21] ^ (ai1[5] ^ ai1[13]);
        ai2[20] = ai2[20] ^ (ai1[4] ^ ai1[12]);
        ai2[19] = ai2[19] ^ (ai1[3] ^ ai1[11]);
        ai2[18] = ai2[18] ^ (ai1[2] ^ ai1[10]);
        ai2[17] = ai2[17] ^ (ai1[1] ^ ai1[9]);
        ai2[16] = ai2[16] ^ (ai1[0] ^ ai1[8]);
        ai2[15] = ai2[15] ^ ai1[7];
        ai2[14] = ai2[14] ^ ai1[6];
        ai2[13] = ai2[13] ^ ai1[5];
        ai2[12] = ai2[12] ^ ai1[4];
        ai2[11] = ai2[11] ^ ai1[3];
        ai2[10] = ai2[10] ^ ai1[2];
        ai2[9] = ai2[9] ^ ai1[1];
        int i = ai2[8];
        ai2[8] = ai1[0] ^ i;
        ai4[0] = ai4[0] ^ ai3[0];
        ai4[1] = ai4[1] ^ ai3[1];
        ai4[2] = ai4[2] ^ ai3[2];
        ai4[3] = ai4[3] ^ ai3[3];
        ai4[4] = ai4[4] ^ ai3[4];
        ai4[5] = ai4[5] ^ ai3[5];
        ai4[6] = ai4[6] ^ ai3[6];
        ai4[7] = ai4[7] ^ ai3[7];
        ai5[0] = ai5[0] ^ ai[0];
        ai5[1] = ai5[1] ^ ai[1];
        ai5[2] = ai5[2] ^ ai[2];
        ai5[3] = ai5[3] ^ ai[3];
        ai5[4] = ai5[4] ^ ai[4];
        ai5[5] = ai5[5] ^ ai[5];
        ai5[6] = ai5[6] ^ ai[6];
        ai5[7] = ai5[7] ^ ai[7];
        ai1 = mult256(ai4, ai5);
        ai2[23] = ai2[23] ^ ai1[15];
        ai2[22] = ai2[22] ^ ai1[14];
        ai2[21] = ai2[21] ^ ai1[13];
        ai2[20] = ai2[20] ^ ai1[12];
        ai2[19] = ai2[19] ^ ai1[11];
        ai2[18] = ai2[18] ^ ai1[10];
        ai2[17] = ai2[17] ^ ai1[9];
        ai2[16] = ai2[16] ^ ai1[8];
        ai2[15] = ai2[15] ^ ai1[7];
        ai2[14] = ai2[14] ^ ai1[6];
        ai2[13] = ai2[13] ^ ai1[5];
        ai2[12] = ai2[12] ^ ai1[4];
        ai2[11] = ai2[11] ^ ai1[3];
        ai2[10] = ai2[10] ^ ai1[2];
        ai2[9] = ai2[9] ^ ai1[1];
        i = ai2[8];
        ai2[8] = ai1[0] ^ i;
        ai = mult256(ai3, ai);
        ai2[23] = ai2[23] ^ ai[15];
        ai2[22] = ai2[22] ^ ai[14];
        ai2[21] = ai2[21] ^ ai[13];
        ai2[20] = ai2[20] ^ ai[12];
        ai2[19] = ai2[19] ^ ai[11];
        ai2[18] = ai2[18] ^ ai[10];
        ai2[17] = ai2[17] ^ ai[9];
        ai2[16] = ai2[16] ^ ai[8];
        ai2[15] = ai2[15] ^ (ai[7] ^ ai[15]);
        ai2[14] = ai2[14] ^ (ai[6] ^ ai[14]);
        ai2[13] = ai2[13] ^ (ai[5] ^ ai[13]);
        ai2[12] = ai2[12] ^ (ai[4] ^ ai[12]);
        ai2[11] = ai2[11] ^ (ai[3] ^ ai[11]);
        ai2[10] = ai2[10] ^ (ai[2] ^ ai[10]);
        ai2[9] = ai2[9] ^ (ai[1] ^ ai[9]);
        ai2[8] = ai2[8] ^ (ai[0] ^ ai[8]);
        ai2[7] = ai2[7] ^ ai[7];
        ai2[6] = ai2[6] ^ ai[6];
        ai2[5] = ai2[5] ^ ai[5];
        ai2[4] = ai2[4] ^ ai[4];
        ai2[3] = ai2[3] ^ ai[3];
        ai2[2] = ai2[2] ^ ai[2];
        ai2[1] = ai2[1] ^ ai[1];
        i = ai2[0];
        ai2[0] = ai[0] ^ i;
        return ai2;
    }

    private static int[] mult64(int ai[], int ai1[])
    {
        int ai2[] = new int[4];
        int k = ai[0];
        int i;
        int j;
        int l;
        if (ai.length > 1)
        {
            i = ai[1];
        } else
        {
            i = 0;
        }
        l = ai1[0];
        if (ai1.length > 1)
        {
            j = ai1[1];
        } else
        {
            j = 0;
        }
        if (i != 0 || j != 0)
        {
            ai = mult32(i, j);
            ai2[3] = ai2[3] ^ ai[1];
            ai2[2] = ai2[2] ^ (ai[0] ^ ai[1]);
            int i1 = ai2[1];
            ai2[1] = ai[0] ^ i1;
        }
        ai = mult32(i ^ k, j ^ l);
        ai2[2] = ai2[2] ^ ai[1];
        i = ai2[1];
        ai2[1] = ai[0] ^ i;
        ai = mult32(k, l);
        ai2[2] = ai2[2] ^ ai[1];
        ai2[1] = ai2[1] ^ (ai[0] ^ ai[1]);
        i = ai2[0];
        ai2[0] = ai[0] ^ i;
        return ai2;
    }

    private GF2Polynomial upper(int i)
    {
        int j = Math.min(i, blocks - i);
        GF2Polynomial gf2polynomial = new GF2Polynomial(j << 5);
        if (blocks >= i)
        {
            System.arraycopy(value, i, gf2polynomial.value, 0, j);
        }
        return gf2polynomial;
    }

    private void zeroUnusedBits()
    {
        if ((len & 0x1f) != 0)
        {
            int ai[] = value;
            int i = blocks - 1;
            ai[i] = ai[i] & reverseRightMask[len & 0x1f];
        }
    }

    public GF2Polynomial add(GF2Polynomial gf2polynomial)
    {
        return xor(gf2polynomial);
    }

    public void addToThis(GF2Polynomial gf2polynomial)
    {
        expandN(gf2polynomial.len);
        xorThisBy(gf2polynomial);
    }

    public void assignAll()
    {
        for (int i = 0; i < blocks; i++)
        {
            value[i] = -1;
        }

        zeroUnusedBits();
    }

    public void assignOne()
    {
        for (int i = 1; i < blocks; i++)
        {
            value[i] = 0;
        }

        value[0] = 1;
    }

    public void assignX()
    {
        for (int i = 1; i < blocks; i++)
        {
            value[i] = 0;
        }

        value[0] = 2;
    }

    public void assignZero()
    {
        for (int i = 0; i < blocks; i++)
        {
            value[i] = 0;
        }

    }

    public Object clone()
    {
        return new GF2Polynomial(this);
    }

    public GF2Polynomial[] divide(GF2Polynomial gf2polynomial)
    {
        GF2Polynomial agf2polynomial[] = new GF2Polynomial[2];
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(len);
        GF2Polynomial gf2polynomial2 = new GF2Polynomial(this);
        gf2polynomial = new GF2Polynomial(gf2polynomial);
        if (gf2polynomial.isZero())
        {
            throw new RuntimeException();
        }
        gf2polynomial2.reduceN();
        gf2polynomial.reduceN();
        if (gf2polynomial2.len < gf2polynomial.len)
        {
            agf2polynomial[0] = new GF2Polynomial(0);
            agf2polynomial[1] = gf2polynomial2;
            return agf2polynomial;
        }
        int i = gf2polynomial2.len - gf2polynomial.len;
        gf2polynomial1.expandN(i + 1);
        for (; i >= 0; i = gf2polynomial2.len - gf2polynomial.len)
        {
            gf2polynomial2.subtractFromThis(gf2polynomial.shiftLeft(i));
            gf2polynomial2.reduceN();
            gf2polynomial1.xorBit(i);
        }

        agf2polynomial[0] = gf2polynomial1;
        agf2polynomial[1] = gf2polynomial2;
        return agf2polynomial;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof GF2Polynomial)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (len == ((GF2Polynomial) (obj = (GF2Polynomial)obj)).len)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= blocks)
                    {
                        break label1;
                    }
                    if (value[i] != ((GF2Polynomial) (obj)).value[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public void expandN(int i)
    {
        if (len < i)
        {
            len = i;
            int j = (i - 1 >>> 5) + 1;
            if (blocks < j)
            {
                if (value.length >= j)
                {
                    for (i = blocks; i < j; i++)
                    {
                        value[i] = 0;
                    }

                    blocks = j;
                    return;
                } else
                {
                    int ai[] = new int[j];
                    System.arraycopy(value, 0, ai, 0, blocks);
                    blocks = j;
                    value = null;
                    value = ai;
                    return;
                }
            }
        }
    }

    public GF2Polynomial gcd(GF2Polynomial gf2polynomial)
    {
        if (isZero() && gf2polynomial.isZero())
        {
            throw new ArithmeticException("Both operands of gcd equal zero.");
        }
        if (!isZero()) goto _L2; else goto _L1
_L1:
        GF2Polynomial gf2polynomial2 = new GF2Polynomial(gf2polynomial);
_L4:
        return gf2polynomial2;
_L2:
        if (gf2polynomial.isZero())
        {
            return new GF2Polynomial(this);
        }
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(this);
        gf2polynomial = new GF2Polynomial(gf2polynomial);
        do
        {
            gf2polynomial2 = gf2polynomial1;
            if (gf2polynomial.isZero())
            {
                continue;
            }
            gf2polynomial2 = gf2polynomial1.remainder(gf2polynomial);
            gf2polynomial1 = gf2polynomial;
            gf2polynomial = gf2polynomial2;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getBit(int i)
    {
        while (i < 0 || i > len - 1 || (value[i >>> 5] & bitMask[i & 0x1f]) == 0) 
        {
            return 0;
        }
        return 1;
    }

    public int getLength()
    {
        return len;
    }

    public int hashCode()
    {
        return len + value.hashCode();
    }

    public GF2Polynomial increase()
    {
        GF2Polynomial gf2polynomial = new GF2Polynomial(this);
        gf2polynomial.increaseThis();
        return gf2polynomial;
    }

    public void increaseThis()
    {
        xorBit(0);
    }

    public boolean isIrreducible()
    {
        if (!isZero()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(this);
        gf2polynomial1.reduceN();
        int j = gf2polynomial1.len;
        GF2Polynomial gf2polynomial = new GF2Polynomial(gf2polynomial1.len, "X");
        int i = 1;
label0:
        do
        {
label1:
            {
                if (i > j - 1 >> 1)
                {
                    break label1;
                }
                gf2polynomial.squareThisPreCalc();
                gf2polynomial = gf2polynomial.remainder(gf2polynomial1);
                GF2Polynomial gf2polynomial2 = gf2polynomial.add(new GF2Polynomial(32, "X"));
                if (gf2polynomial2.isZero() || !gf2polynomial1.gcd(gf2polynomial2).isOne())
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public boolean isOne()
    {
        int i;
        boolean flag;
        flag = true;
        i = 1;
_L8:
        if (i >= blocks) goto _L2; else goto _L1
_L1:
        if (value[i] == 0) goto _L4; else goto _L3
_L3:
        flag = false;
_L6:
        return flag;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (value[0] == 1) goto _L6; else goto _L5
_L5:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean isZero()
    {
        boolean flag1 = false;
        if (len != 0) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= blocks)
                {
                    break label1;
                }
                flag = flag1;
                if (value[i] != 0)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public GF2Polynomial multiply(GF2Polynomial gf2polynomial)
    {
        int i = Math.max(len, gf2polynomial.len);
        expandN(i);
        gf2polynomial.expandN(i);
        return karaMult(gf2polynomial);
    }

    public GF2Polynomial multiplyClassic(GF2Polynomial gf2polynomial)
    {
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(Math.max(len, gf2polynomial.len) << 1);
        GF2Polynomial agf2polynomial[] = new GF2Polynomial[32];
        agf2polynomial[0] = new GF2Polynomial(this);
        for (int i = 1; i <= 31; i++)
        {
            agf2polynomial[i] = agf2polynomial[i - 1].shiftLeft();
        }

        for (int j = 0; j < gf2polynomial.blocks; j++)
        {
            for (int k = 0; k <= 31; k++)
            {
                if ((gf2polynomial.value[j] & bitMask[k]) != 0)
                {
                    gf2polynomial1.xorThisBy(agf2polynomial[k]);
                }
            }

            for (int l = 0; l <= 31; l++)
            {
                agf2polynomial[l].shiftBlocksLeft();
            }

        }

        return gf2polynomial1;
    }

    public GF2Polynomial quotient(GF2Polynomial gf2polynomial)
    {
        GF2Polynomial gf2polynomial1;
        GF2Polynomial gf2polynomial2;
        GF2Polynomial gf2polynomial3;
        gf2polynomial1 = new GF2Polynomial(len);
        gf2polynomial2 = new GF2Polynomial(this);
        gf2polynomial3 = new GF2Polynomial(gf2polynomial);
        if (gf2polynomial3.isZero())
        {
            throw new RuntimeException();
        }
        gf2polynomial2.reduceN();
        gf2polynomial3.reduceN();
        if (gf2polynomial2.len >= gf2polynomial3.len) goto _L2; else goto _L1
_L1:
        gf2polynomial = new GF2Polynomial(0);
_L4:
        return gf2polynomial;
_L2:
        int i = gf2polynomial2.len - gf2polynomial3.len;
        gf2polynomial1.expandN(i + 1);
        do
        {
            gf2polynomial = gf2polynomial1;
            if (i < 0)
            {
                continue;
            }
            gf2polynomial2.subtractFromThis(gf2polynomial3.shiftLeft(i));
            gf2polynomial2.reduceN();
            gf2polynomial1.xorBit(i);
            i = gf2polynomial2.len - gf2polynomial3.len;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void randomize()
    {
        for (int i = 0; i < blocks; i++)
        {
            value[i] = rand.nextInt();
        }

        zeroUnusedBits();
    }

    public void randomize(Random random)
    {
        for (int i = 0; i < blocks; i++)
        {
            value[i] = random.nextInt();
        }

        zeroUnusedBits();
    }

    public void reduceN()
    {
        int i;
        for (i = blocks - 1; value[i] == 0 && i > 0; i--) { }
        int k = value[i];
        int j;
        for (j = 0; k != 0; j++)
        {
            k >>>= 1;
        }

        len = (i << 5) + j;
        blocks = i + 1;
    }

    void reducePentanomial(int i, int ai[])
    {
        int i1 = i >>> 5;
        int l2 = 32 - (i & 0x1f);
        int k2 = i - ai[0] >>> 5;
        int j2 = 32 - (i - ai[0] & 0x1f);
        int i2 = i - ai[1] >>> 5;
        int l1 = 32 - (i - ai[1] & 0x1f);
        int k1 = i - ai[2] >>> 5;
        int j1 = 32 - (i - ai[2] & 0x1f);
        for (int j = (i << 1) - 2 >>> 5; j > i1; j--)
        {
            long l3 = (long)value[j] & 0xffffffffL;
            ai = value;
            int i3 = j - i1 - 1;
            ai[i3] = ai[i3] ^ (int)(l3 << l2);
            ai = value;
            i3 = j - i1;
            ai[i3] = (int)((long)ai[i3] ^ l3 >>> 32 - l2);
            ai = value;
            i3 = j - k2 - 1;
            ai[i3] = ai[i3] ^ (int)(l3 << j2);
            ai = value;
            i3 = j - k2;
            ai[i3] = (int)((long)ai[i3] ^ l3 >>> 32 - j2);
            ai = value;
            i3 = j - i2 - 1;
            ai[i3] = ai[i3] ^ (int)(l3 << l1);
            ai = value;
            i3 = j - i2;
            ai[i3] = (int)((long)ai[i3] ^ l3 >>> 32 - l1);
            ai = value;
            i3 = j - k1 - 1;
            ai[i3] = ai[i3] ^ (int)(l3 << j1);
            ai = value;
            i3 = j - k1;
            ai[i3] = (int)(l3 >>> 32 - j1 ^ (long)ai[i3]);
            value[j] = 0;
        }

        long l4 = (long)value[i1] & 0xffffffffL & 0xffffffffL << (i & 0x1f);
        ai = value;
        ai[0] = (int)((long)ai[0] ^ l4 >>> 32 - l2);
        if (i1 - k2 - 1 >= 0)
        {
            ai = value;
            int k = i1 - k2 - 1;
            ai[k] = ai[k] ^ (int)(l4 << j2);
        }
        ai = value;
        int l = i1 - k2;
        ai[l] = (int)((long)ai[l] ^ l4 >>> 32 - j2);
        if (i1 - i2 - 1 >= 0)
        {
            ai = value;
            l = i1 - i2 - 1;
            ai[l] = ai[l] ^ (int)(l4 << l1);
        }
        ai = value;
        l = i1 - i2;
        ai[l] = (int)((long)ai[l] ^ l4 >>> 32 - l1);
        if (i1 - k1 - 1 >= 0)
        {
            ai = value;
            l = i1 - k1 - 1;
            ai[l] = ai[l] ^ (int)(l4 << j1);
        }
        ai = value;
        l = i1 - k1;
        ai[l] = (int)((long)ai[l] ^ l4 >>> 32 - j1);
        ai = value;
        ai[i1] = ai[i1] & reverseRightMask[i & 0x1f];
        blocks = (i - 1 >>> 5) + 1;
        len = i;
    }

    void reduceTrinomial(int i, int j)
    {
        int k = i >>> 5;
        int j1 = 32 - (i & 0x1f);
        int l = i - j >>> 5;
        int i1 = 32 - (i - j & 0x1f);
        for (j = (i << 1) - 2 >>> 5; j > k; j--)
        {
            long l1 = (long)value[j] & 0xffffffffL;
            int ai[] = value;
            int k1 = j - k - 1;
            ai[k1] = ai[k1] ^ (int)(l1 << j1);
            ai = value;
            k1 = j - k;
            ai[k1] = (int)((long)ai[k1] ^ l1 >>> 32 - j1);
            ai = value;
            k1 = j - l - 1;
            ai[k1] = ai[k1] ^ (int)(l1 << i1);
            ai = value;
            k1 = j - l;
            ai[k1] = (int)(l1 >>> 32 - i1 ^ (long)ai[k1]);
            value[j] = 0;
        }

        long l2 = (long)value[k] & 0xffffffffL & 0xffffffffL << (i & 0x1f);
        int ai1[] = value;
        ai1[0] = (int)((long)ai1[0] ^ l2 >>> 32 - j1);
        if (k - l - 1 >= 0)
        {
            ai1 = value;
            j = k - l - 1;
            ai1[j] = ai1[j] ^ (int)(l2 << i1);
        }
        ai1 = value;
        j = k - l;
        ai1[j] = (int)(l2 >>> 32 - i1 ^ (long)ai1[j]);
        ai1 = value;
        ai1[k] = ai1[k] & reverseRightMask[i & 0x1f];
        blocks = (i - 1 >>> 5) + 1;
        len = i;
    }

    public GF2Polynomial remainder(GF2Polynomial gf2polynomial)
    {
        GF2Polynomial gf2polynomial1 = new GF2Polynomial(this);
        gf2polynomial = new GF2Polynomial(gf2polynomial);
        if (gf2polynomial.isZero())
        {
            throw new RuntimeException();
        }
        gf2polynomial1.reduceN();
        gf2polynomial.reduceN();
        if (gf2polynomial1.len >= gf2polynomial.len)
        {
            int i = gf2polynomial1.len - gf2polynomial.len;
            while (i >= 0) 
            {
                gf2polynomial1.subtractFromThis(gf2polynomial.shiftLeft(i));
                gf2polynomial1.reduceN();
                i = gf2polynomial1.len - gf2polynomial.len;
            }
        }
        return gf2polynomial1;
    }

    public void resetBit(int i)
    {
        if (i < 0 || i > len - 1)
        {
            throw new RuntimeException();
        }
        if (i > len - 1)
        {
            return;
        } else
        {
            int ai[] = value;
            int j = i >>> 5;
            ai[j] = ai[j] & ~bitMask[i & 0x1f];
            return;
        }
    }

    public void setBit(int i)
    {
        if (i < 0 || i > len - 1)
        {
            throw new RuntimeException();
        }
        if (i > len - 1)
        {
            return;
        } else
        {
            int ai[] = value;
            int j = i >>> 5;
            ai[j] = ai[j] | bitMask[i & 0x1f];
            return;
        }
    }

    void shiftBlocksLeft()
    {
        blocks = blocks + 1;
        len = len + 32;
        if (blocks <= value.length)
        {
            for (int i = blocks - 1; i >= 1; i--)
            {
                value[i] = value[i - 1];
            }

            value[0] = 0;
            return;
        } else
        {
            int ai[] = new int[blocks];
            System.arraycopy(value, 0, ai, 1, blocks - 1);
            value = null;
            value = ai;
            return;
        }
    }

    public GF2Polynomial shiftLeft()
    {
        GF2Polynomial gf2polynomial = new GF2Polynomial(len + 1, value);
        for (int i = gf2polynomial.blocks - 1; i >= 1; i--)
        {
            int ai[] = gf2polynomial.value;
            ai[i] = ai[i] << 1;
            ai = gf2polynomial.value;
            ai[i] = ai[i] | gf2polynomial.value[i - 1] >>> 31;
        }

        int ai1[] = gf2polynomial.value;
        ai1[0] = ai1[0] << 1;
        return gf2polynomial;
    }

    public GF2Polynomial shiftLeft(int i)
    {
        GF2Polynomial gf2polynomial = new GF2Polynomial(len + i, value);
        if (i >= 32)
        {
            gf2polynomial.doShiftBlocksLeft(i >>> 5);
        }
        int j = i & 0x1f;
        if (j != 0)
        {
            for (i = gf2polynomial.blocks - 1; i >= 1; i--)
            {
                int ai[] = gf2polynomial.value;
                ai[i] = ai[i] << j;
                ai = gf2polynomial.value;
                ai[i] = ai[i] | gf2polynomial.value[i - 1] >>> 32 - j;
            }

            int ai1[] = gf2polynomial.value;
            ai1[0] = ai1[0] << j;
        }
        return gf2polynomial;
    }

    public void shiftLeftAddThis(GF2Polynomial gf2polynomial, int i)
    {
        if (i == 0)
        {
            addToThis(gf2polynomial);
        } else
        {
            expandN(gf2polynomial.len + i);
            int k = i >>> 5;
            int j = gf2polynomial.blocks - 1;
            while (j >= 0) 
            {
                if (j + k + 1 < blocks && (i & 0x1f) != 0)
                {
                    int ai[] = value;
                    int l = j + k + 1;
                    ai[l] = ai[l] ^ gf2polynomial.value[j] >>> 32 - (i & 0x1f);
                }
                int ai1[] = value;
                int i1 = j + k;
                ai1[i1] = ai1[i1] ^ gf2polynomial.value[j] << (i & 0x1f);
                j--;
            }
        }
    }

    public void shiftLeftThis()
    {
        if ((len & 0x1f) == 0)
        {
            len = len + 1;
            blocks = blocks + 1;
            if (blocks > value.length)
            {
                int ai[] = new int[blocks];
                System.arraycopy(value, 0, ai, 0, value.length);
                value = null;
                value = ai;
            }
            for (int i = blocks - 1; i >= 1; i--)
            {
                int ai1[] = value;
                ai1[i] = ai1[i] | value[i - 1] >>> 31;
                ai1 = value;
                int k = i - 1;
                ai1[k] = ai1[k] << 1;
            }

        } else
        {
            len = len + 1;
            for (int j = blocks - 1; j >= 1; j--)
            {
                int ai2[] = value;
                ai2[j] = ai2[j] << 1;
                ai2 = value;
                ai2[j] = ai2[j] | value[j - 1] >>> 31;
            }

            int ai3[] = value;
            ai3[0] = ai3[0] << 1;
        }
    }

    public GF2Polynomial shiftRight()
    {
        int i = 0;
        GF2Polynomial gf2polynomial = new GF2Polynomial(len - 1);
        System.arraycopy(value, 0, gf2polynomial.value, 0, gf2polynomial.blocks);
        for (; i <= gf2polynomial.blocks - 2; i++)
        {
            int ai[] = gf2polynomial.value;
            ai[i] = ai[i] >>> 1;
            ai = gf2polynomial.value;
            ai[i] = ai[i] | gf2polynomial.value[i + 1] << 31;
        }

        int ai1[] = gf2polynomial.value;
        i = gf2polynomial.blocks - 1;
        ai1[i] = ai1[i] >>> 1;
        if (gf2polynomial.blocks < blocks)
        {
            int ai2[] = gf2polynomial.value;
            int j = gf2polynomial.blocks - 1;
            ai2[j] = ai2[j] | value[gf2polynomial.blocks] << 31;
        }
        return gf2polynomial;
    }

    public void shiftRightThis()
    {
        len = len - 1;
        blocks = (len - 1 >>> 5) + 1;
        for (int i = 0; i <= blocks - 2; i++)
        {
            int ai[] = value;
            ai[i] = ai[i] >>> 1;
            ai = value;
            ai[i] = ai[i] | value[i + 1] << 31;
        }

        int ai1[] = value;
        int j = blocks - 1;
        ai1[j] = ai1[j] >>> 1;
        if ((len & 0x1f) == 0)
        {
            int ai2[] = value;
            int k = blocks - 1;
            ai2[k] = ai2[k] | value[blocks] << 31;
        }
    }

    public void squareThisBitwise()
    {
        if (isZero())
        {
            return;
        }
        int ai[] = new int[blocks << 1];
        for (int i = blocks - 1; i >= 0; i--)
        {
            int j = value[i];
            int l = 1;
            for (int k = 0; k < 16; k++)
            {
                if ((j & 1) != 0)
                {
                    int i1 = i << 1;
                    ai[i1] = ai[i1] | l;
                }
                if ((0x10000 & j) != 0)
                {
                    int j1 = (i << 1) + 1;
                    ai[j1] = ai[j1] | l;
                }
                l <<= 2;
                j >>>= 1;
            }

        }

        value = null;
        value = ai;
        blocks = ai.length;
        len = (len << 1) - 1;
    }

    public void squareThisPreCalc()
    {
        if (isZero())
        {
            return;
        }
        if (value.length >= blocks << 1)
        {
            for (int i = blocks - 1; i >= 0; i--)
            {
                value[(i << 1) + 1] = squaringTable[(value[i] & 0xff0000) >>> 16] | squaringTable[(value[i] & 0xff000000) >>> 24] << 16;
                value[i << 1] = squaringTable[value[i] & 0xff] | squaringTable[(value[i] & 0xff00) >>> 8] << 16;
            }

            blocks = blocks << 1;
            len = (len << 1) - 1;
            return;
        }
        int ai[] = new int[blocks << 1];
        for (int j = 0; j < blocks; j++)
        {
            ai[j << 1] = squaringTable[value[j] & 0xff] | squaringTable[(value[j] & 0xff00) >>> 8] << 16;
            ai[(j << 1) + 1] = squaringTable[(value[j] & 0xff0000) >>> 16] | squaringTable[(value[j] & 0xff000000) >>> 24] << 16;
        }

        value = null;
        value = ai;
        blocks = blocks << 1;
        len = (len << 1) - 1;
    }

    public GF2Polynomial subtract(GF2Polynomial gf2polynomial)
    {
        return xor(gf2polynomial);
    }

    public void subtractFromThis(GF2Polynomial gf2polynomial)
    {
        expandN(gf2polynomial.len);
        xorThisBy(gf2polynomial);
    }

    public boolean testBit(int i)
    {
        while (i < 0 || i > len - 1 || (value[i >>> 5] & bitMask[i & 0x1f]) == 0) 
        {
            return false;
        }
        return true;
    }

    public byte[] toByteArray()
    {
        boolean flag = false;
        int i1 = (len - 1 >> 3) + 1;
        int l = i1 & 3;
        byte abyte0[] = new byte[i1];
        int i = 0;
        int k;
        do
        {
            k = ((flag) ? 1 : 0);
            if (i >= i1 >> 2)
            {
                break;
            }
            k = i1 - (i << 2) - 1;
            abyte0[k] = (byte)(value[i] & 0xff);
            abyte0[k - 1] = (byte)((value[i] & 0xff00) >>> 8);
            abyte0[k - 2] = (byte)((value[i] & 0xff0000) >>> 16);
            abyte0[k - 3] = (byte)((value[i] & 0xff000000) >>> 24);
            i++;
        } while (true);
        for (; k < l; k++)
        {
            int j = l - k - 1 << 3;
            abyte0[k] = (byte)((value[blocks - 1] & 255 << j) >>> j);
        }

        return abyte0;
    }

    public BigInteger toFlexiBigInt()
    {
        if (len == 0 || isZero())
        {
            return new BigInteger(0, new byte[0]);
        } else
        {
            return new BigInteger(1, toByteArray());
        }
    }

    public int[] toIntegerArray()
    {
        int ai[] = new int[blocks];
        System.arraycopy(value, 0, ai, 0, blocks);
        return ai;
    }

    public String toString(int i)
    {
        char ac[] = new char[16];
        char[] _tmp = ac;
        ac[0] = '0';
        ac[1] = '1';
        ac[2] = '2';
        ac[3] = '3';
        ac[4] = '4';
        ac[5] = '5';
        ac[6] = '6';
        ac[7] = '7';
        ac[8] = '8';
        ac[9] = '9';
        ac[10] = 'a';
        ac[11] = 'b';
        ac[12] = 'c';
        ac[13] = 'd';
        ac[14] = 'e';
        ac[15] = 'f';
        String as[] = new String[16];
        as[0] = "0000";
        as[1] = "0001";
        as[2] = "0010";
        as[3] = "0011";
        as[4] = "0100";
        as[5] = "0101";
        as[6] = "0110";
        as[7] = "0111";
        as[8] = "1000";
        as[9] = "1001";
        as[10] = "1010";
        as[11] = "1011";
        as[12] = "1100";
        as[13] = "1101";
        as[14] = "1110";
        as[15] = "1111";
        String s = new String();
        String s1;
        if (i == 16)
        {
            i = blocks;
            i--;
            do
            {
                s1 = s;
                if (i < 0)
                {
                    break;
                }
                s = (new StringBuilder()).append(s).append(ac[value[i] >>> 28 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(ac[value[i] >>> 24 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(ac[value[i] >>> 20 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(ac[value[i] >>> 16 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(ac[value[i] >>> 12 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(ac[value[i] >>> 8 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(ac[value[i] >>> 4 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(ac[value[i] & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(" ").toString();
                i--;
            } while (true);
        } else
        {
            i = blocks;
            i--;
            do
            {
                s1 = s;
                if (i < 0)
                {
                    break;
                }
                s = (new StringBuilder()).append(s).append(as[value[i] >>> 28 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(as[value[i] >>> 24 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(as[value[i] >>> 20 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(as[value[i] >>> 16 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(as[value[i] >>> 12 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(as[value[i] >>> 8 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(as[value[i] >>> 4 & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(as[value[i] & 0xf]).toString();
                s = (new StringBuilder()).append(s).append(" ").toString();
                i--;
            } while (true);
        }
        return s1;
    }

    public boolean vectorMult(GF2Polynomial gf2polynomial)
    {
        boolean flag = false;
        if (len != gf2polynomial.len)
        {
            throw new RuntimeException();
        }
        for (int i = 0; i < blocks; i++)
        {
            int j = value[i] & gf2polynomial.value[i];
            flag = flag ^ parity[j & 0xff] ^ parity[j >>> 8 & 0xff] ^ parity[j >>> 16 & 0xff] ^ parity[j >>> 24 & 0xff];
        }

        return flag;
    }

    public GF2Polynomial xor(GF2Polynomial gf2polynomial)
    {
        boolean flag = false;
        int i = 0;
        int k = Math.min(blocks, gf2polynomial.blocks);
        Object obj;
        if (len >= gf2polynomial.len)
        {
            GF2Polynomial gf2polynomial1 = new GF2Polynomial(this);
            do
            {
                obj = gf2polynomial1;
                if (i >= k)
                {
                    break;
                }
                obj = gf2polynomial1.value;
                obj[i] = obj[i] ^ gf2polynomial.value[i];
                i++;
            } while (true);
        } else
        {
            gf2polynomial = new GF2Polynomial(gf2polynomial);
            int j = ((flag) ? 1 : 0);
            do
            {
                obj = gf2polynomial;
                if (j >= k)
                {
                    break;
                }
                obj = gf2polynomial.value;
                obj[j] = obj[j] ^ value[j];
                j++;
            } while (true);
        }
        ((GF2Polynomial) (obj)).zeroUnusedBits();
        return ((GF2Polynomial) (obj));
    }

    public void xorBit(int i)
    {
        if (i < 0 || i > len - 1)
        {
            throw new RuntimeException();
        }
        if (i > len - 1)
        {
            return;
        } else
        {
            int ai[] = value;
            int j = i >>> 5;
            ai[j] = ai[j] ^ bitMask[i & 0x1f];
            return;
        }
    }

    public void xorThisBy(GF2Polynomial gf2polynomial)
    {
        for (int i = 0; i < Math.min(blocks, gf2polynomial.blocks); i++)
        {
            int ai[] = value;
            ai[i] = ai[i] ^ gf2polynomial.value[i];
        }

        zeroUnusedBits();
    }

}
