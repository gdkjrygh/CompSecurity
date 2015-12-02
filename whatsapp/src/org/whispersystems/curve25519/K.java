// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            p, T

public class K
{

    public static long a(byte abyte0[], int i)
    {
        return (long)abyte0[i + 0] & 255L | (long)abyte0[i + 1] << 8 & 65280L | (long)abyte0[i + 2] << 16 & 0xff0000L;
    }

    public static void a(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[])
    {
        boolean flag = p.d;
        long l19 = 0x1fffffL & a(abyte1, 0);
        long l30 = 0x1fffffL & b(abyte1, 2) >>> 5;
        long l24 = 0x1fffffL & a(abyte1, 5) >>> 2;
        long l32 = 0x1fffffL & b(abyte1, 7) >>> 7;
        long l26 = 0x1fffffL & b(abyte1, 10) >>> 4;
        long l40 = 0x1fffffL & a(abyte1, 13) >>> 1;
        long l28 = 0x1fffffL & b(abyte1, 15) >>> 6;
        long l37 = 0x1fffffL & a(abyte1, 18) >>> 3;
        long l33 = 0x1fffffL & a(abyte1, 21);
        long l34 = 0x1fffffL & b(abyte1, 23) >>> 5;
        long l9 = 0x1fffffL & a(abyte1, 26) >>> 2;
        long l10 = b(abyte1, 28) >>> 7;
        long l45 = 0x1fffffL & a(abyte2, 0);
        long l46 = 0x1fffffL & b(abyte2, 2) >>> 5;
        long l43 = 0x1fffffL & a(abyte2, 5) >>> 2;
        long l44 = 0x1fffffL & b(abyte2, 7) >>> 7;
        long l41 = 0x1fffffL & b(abyte2, 10) >>> 4;
        long l42 = 0x1fffffL & a(abyte2, 13) >>> 1;
        long l38 = 0x1fffffL & b(abyte2, 15) >>> 6;
        long l39 = 0x1fffffL & a(abyte2, 18) >>> 3;
        long l35 = 0x1fffffL & a(abyte2, 21);
        long l36 = 0x1fffffL & b(abyte2, 23) >>> 5;
        long l14 = 0x1fffffL & a(abyte2, 26) >>> 2;
        long l31 = b(abyte2, 28) >>> 7;
        long l = a(abyte3, 0);
        long l5 = b(abyte3, 2);
        long l1 = a(abyte3, 5);
        long l4 = b(abyte3, 7);
        long l2 = b(abyte3, 10);
        long l3 = a(abyte3, 13);
        long l8 = b(abyte3, 15);
        long l16 = a(abyte3, 18);
        long l7 = a(abyte3, 21);
        long l15 = b(abyte3, 23);
        long l6 = a(abyte3, 26);
        long l47 = b(abyte3, 28);
        l = (0x1fffffL & l) + l19 * l45;
        l1 = (0x1fffffL & l1 >>> 2) + l19 * l43 + l30 * l46 + l24 * l45;
        l2 = (0x1fffffL & l2 >>> 4) + l19 * l41 + l30 * l44 + l24 * l43 + l32 * l46 + l26 * l45;
        long l11 = (0x1fffffL & l8 >>> 6) + l19 * l38 + l30 * l42 + l24 * l41 + l32 * l44 + l26 * l43 + l40 * l46 + l28 * l45;
        long l12 = (0x1fffffL & l7) + l19 * l35 + l30 * l39 + l24 * l38 + l32 * l42 + l26 * l41 + l40 * l44 + l28 * l43 + l37 * l46 + l33 * l45;
        long l13 = (0x1fffffL & l6 >>> 2) + l19 * l14 + l30 * l36 + l24 * l35 + l32 * l39 + l26 * l38 + l40 * l42 + l28 * l41 + l37 * l44 + l33 * l43 + l34 * l46 + l9 * l45;
        long l17 = l30 * l31 + l24 * l14 + l32 * l36 + l26 * l35 + l40 * l39 + l28 * l38 + l37 * l42 + l33 * l41 + l34 * l44 + l9 * l43 + l10 * l46;
        long l18 = l32 * l31 + l26 * l14 + l40 * l36 + l28 * l35 + l37 * l39 + l33 * l38 + l34 * l42 + l9 * l41 + l10 * l44;
        long l20 = l40 * l31 + l28 * l14 + l37 * l36 + l33 * l35 + l34 * l39 + l9 * l38 + l10 * l42;
        long l29 = l37 * l31 + l33 * l14 + l34 * l36 + l9 * l35 + l10 * l39;
        long l27 = l34 * l31 + l9 * l14 + l10 * l36;
        long l25 = l10 * l31;
        l6 = 0x100000L + l >> 21;
        l5 = (0x1fffffL & l5 >>> 5) + l19 * l46 + l30 * l45 + l6;
        l7 = 0x100000L + l1 >> 21;
        l4 = (0x1fffffL & l4 >>> 7) + l19 * l44 + l30 * l43 + l24 * l46 + l32 * l45 + l7;
        l8 = 0x100000L + l2 >> 21;
        l3 = (0x1fffffL & l3 >>> 1) + l19 * l42 + l30 * l41 + l24 * l44 + l32 * l43 + l26 * l46 + l40 * l45 + l8;
        long l21 = 0x100000L + l11 >> 21;
        l16 = (0x1fffffL & l16 >>> 3) + l19 * l39 + l30 * l38 + l24 * l42 + l32 * l41 + l26 * l44 + l40 * l43 + l28 * l46 + l37 * l45 + l21;
        long l22 = 0x100000L + l12 >> 21;
        l15 = (0x1fffffL & l15 >>> 5) + l19 * l36 + l30 * l35 + l24 * l39 + l32 * l38 + l26 * l42 + l40 * l41 + l28 * l44 + l37 * l43 + l33 * l46 + l34 * l45 + l22;
        long l23 = 0x100000L + l13 >> 21;
        l19 = l19 * l31 + (l47 >>> 7) + l30 * l14 + l24 * l36 + l32 * l35 + l26 * l39 + l40 * l38 + l28 * l42 + l37 * l41 + l33 * l44 + l34 * l43 + l9 * l46 + l45 * l10 + l23;
        l30 = 0x100000L + l17 >> 21;
        l24 = l24 * l31 + l32 * l14 + l26 * l36 + l40 * l35 + l28 * l39 + l37 * l38 + l33 * l42 + l34 * l41 + l9 * l44 + l10 * l43 + l30;
        l32 = 0x100000L + l18 >> 21;
        l26 = l26 * l31 + l40 * l14 + l28 * l36 + l37 * l35 + l33 * l39 + l34 * l38 + l9 * l42 + l10 * l41 + l32;
        l40 = 0x100000L + l20 >> 21;
        l28 = l28 * l31 + l37 * l14 + l33 * l36 + l34 * l35 + l9 * l39 + l10 * l38 + l40;
        l39 = 0x100000L + l29 >> 21;
        l41 = l33 * l31 + l34 * l14 + l9 * l36 + l10 * l35 + l39;
        l42 = 0x100000L + l27 >> 21;
        l43 = l9 * l31 + l10 * l14 + l42;
        l44 = 0x100000L + l25 >> 21;
        l33 = 0L + l44;
        l14 = 0x100000L + l5 >> 21;
        l10 = 0x100000L + l4 >> 21;
        l9 = 0x100000L + l3 >> 21;
        l38 = 0x100000L + l16 >> 21;
        l37 = 0x100000L + l15 >> 21;
        l36 = 0x100000L + l19 >> 21;
        l35 = 0x100000L + l24 >> 21;
        l34 = 0x100000L + l26 >> 21;
        l31 = 0x100000L + l28 >> 21;
        l29 = (l29 - (l39 << 21)) + l31;
        l39 = 0x100000L + l41 >> 21;
        l27 = (l27 - (l42 << 21)) + l39;
        l39 = l41 - (l39 << 21);
        l41 = 0x100000L + l43 >> 21;
        l25 = (l25 - (l44 << 21)) + l41;
        l41 = l43 - (l41 << 21);
        l20 = ((l20 - (l40 << 21)) + l34) - l33 * 0xa6f7dL;
        l18 = ((((l18 - (l32 << 21)) + l35) - 0xf39adL * l33) + 0x215d1L * l25) - l41 * 0xa6f7dL;
        l30 = ((((l17 - (l30 << 21)) + l36 + 0x72d18L * l33 + 0x9fb67L * l25) - 0xf39adL * l41) + 0x215d1L * l27) - l39 * 0xa6f7dL;
        l17 = 0xa2c13L * l29 + ((l11 - (l21 << 21)) + l9);
        l21 = 0xa2c13L * l27 + ((l12 - (l22 << 21)) + l38) + 0x72d18L * l39 + 0x9fb67L * l29;
        l11 = ((0xa2c13L * l25 + ((l13 - (l23 << 21)) + l37) + 0x72d18L * l41 + 0x9fb67L * l27) - 0xf39adL * l39) + 0x215d1L * l29;
        l22 = 0x100000L + l17 >> 21;
        l12 = 0xa2c13L * l39 + (l16 - (l38 << 21)) + 0x72d18L * l29 + l22;
        l16 = 0x100000L + l21 >> 21;
        l13 = ((0xa2c13L * l41 + (l15 - (l37 << 21)) + 0x72d18L * l27 + 0x9fb67L * l39) - 0xf39adL * l29) + l16;
        l32 = 0x100000L + l11 >> 21;
        l15 = (((((l19 - (l36 << 21)) + 0xa2c13L * l33 + 0x72d18L * l25 + 0x9fb67L * l41) - 0xf39adL * l27) + 0x215d1L * l39) - l29 * 0xa6f7dL) + l32;
        l29 = 0x100000L + l30 >> 21;
        l27 = (((((l24 - (l35 << 21)) + 0x9fb67L * l33) - 0xf39adL * l25) + 0x215d1L * l41) - l27 * 0xa6f7dL) + l29;
        l35 = 0x100000L + l18 >> 21;
        l33 = (((l26 - (l34 << 21)) + 0x215d1L * l33) - l25 * 0xa6f7dL) + l35;
        l34 = 0x100000L + l20 >> 21;
        l23 = (l28 - (l31 << 21)) + l34;
        l25 = 0x100000L + l12 >> 21;
        l24 = 0x100000L + l13 >> 21;
        l19 = 0x100000L + l15 >> 21;
        l26 = (l30 - (l29 << 21)) + l19;
        l28 = 0x100000L + l27 >> 21;
        l18 = (l18 - (l35 << 21)) + l28;
        l27 -= l28 << 21;
        l28 = 0x100000L + l33 >> 21;
        l20 = (l20 - (l34 << 21)) + l28;
        l28 = l33 - (l28 << 21);
        l11 = ((l11 - (l32 << 21)) + l24) - l23 * 0xa6f7dL;
        l16 = ((((l21 - (l16 << 21)) + l25) - 0xf39adL * l23) + 0x215d1L * l20) - l28 * 0xa6f7dL;
        l17 = ((((l17 - (l22 << 21)) + 0x72d18L * l23 + 0x9fb67L * l20) - 0xf39adL * l28) + 0x215d1L * l18) - l27 * 0xa6f7dL;
        l6 = 0xa2c13L * l26 + (l - (l6 << 21));
        l1 = 0xa2c13L * l18 + ((l1 - (l7 << 21)) + l14) + 0x72d18L * l27 + 0x9fb67L * l26;
        l = ((0xa2c13L * l20 + ((l2 - (l8 << 21)) + l10) + 0x72d18L * l28 + 0x9fb67L * l18) - 0xf39adL * l27) + 0x215d1L * l26;
        l21 = 0x100000L + l6 >> 21;
        l14 = 0xa2c13L * l27 + (l5 - (l14 << 21)) + 0x72d18L * l26 + l21;
        l7 = 0x100000L + l1 >> 21;
        l8 = ((0xa2c13L * l28 + (l4 - (l10 << 21)) + 0x72d18L * l18 + 0x9fb67L * l27) - 0xf39adL * l26) + l7;
        l2 = 0x100000L + l >> 21;
        l9 = ((((0xa2c13L * l23 + (l3 - (l9 << 21)) + 0x72d18L * l20 + 0x9fb67L * l28) - 0xf39adL * l18) + 0x215d1L * l27) - l26 * 0xa6f7dL) + l2;
        l3 = 0x100000L + l17 >> 21;
        l29 = (((((l12 - (l25 << 21)) + 0x9fb67L * l23) - 0xf39adL * l20) + 0x215d1L * l28) - l18 * 0xa6f7dL) + l3;
        l4 = 0x100000L + l16 >> 21;
        l30 = (((l13 - (l24 << 21)) + 0x215d1L * l23) - l20 * 0xa6f7dL) + l4;
        l5 = 0x100000L + l11 >> 21;
        l27 = (l15 - (l19 << 21)) + l5;
        l18 = 0x100000L + l14 >> 21;
        l13 = 0x100000L + l8 >> 21;
        l15 = 0x100000L + l9 >> 21;
        l32 = 0x100000L + l29 >> 21;
        l31 = 0x100000L + l30 >> 21;
        l28 = 0x100000L + l27 >> 21;
        l12 = 0L + l28;
        l25 = (l6 - (l21 << 21)) + 0xa2c13L * l12;
        l26 = l25 >> 21;
        l10 = (l14 - (l18 << 21)) + 0x72d18L * l12 + l26;
        l22 = l10 >> 21;
        l23 = (l1 - (l7 << 21)) + l18 + 0x9fb67L * l12 + l22;
        l24 = l23 >> 21;
        l18 = (l8 - (l13 << 21) - 0xf39adL * l12) + l24;
        l19 = l18 >> 21;
        l20 = (l - (l2 << 21)) + l13 + 0x215d1L * l12 + l19;
        l21 = l20 >> 21;
        l12 = (l9 - (l15 << 21) - l12 * 0xa6f7dL) + l21;
        l13 = l12 >> 21;
        l14 = (l17 - (l3 << 21)) + l15 + l13;
        l15 = l14 >> 21;
        l6 = (l29 - (l32 << 21)) + l15;
        l7 = l6 >> 21;
        l8 = (l16 - (l4 << 21)) + l32 + l7;
        l9 = l8 >> 21;
        l2 = (l30 - (l31 << 21)) + l9;
        l3 = l2 >> 21;
        l4 = (l11 - (l5 << 21)) + l31 + l3;
        l5 = l4 >> 21;
        l = (l27 - (l28 << 21)) + l5;
        l1 = l >> 21;
        l27 = 0L + l1;
        l16 = (l25 - (l26 << 21)) + 0xa2c13L * l27;
        l17 = l16 >> 21;
        l11 = (l10 - (l22 << 21)) + 0x72d18L * l27 + l17;
        l10 = l16 - (l17 << 21);
        l17 = l11 >> 21;
        l16 = (l23 - (l24 << 21)) + 0x9fb67L * l27 + l17;
        l11 -= l17 << 21;
        l22 = l16 >> 21;
        l17 = (l18 - (l19 << 21) - 0xf39adL * l27) + l22;
        l16 -= l22 << 21;
        l19 = l17 >> 21;
        l18 = (l20 - (l21 << 21)) + 0x215d1L * l27 + l19;
        l17 -= l19 << 21;
        l19 = l18 >> 21;
        l13 = (l12 - (l13 << 21) - l27 * 0xa6f7dL) + l19;
        l12 = l18 - (l19 << 21);
        l18 = l13 >> 21;
        l14 = (l14 - (l15 << 21)) + l18;
        l13 -= l18 << 21;
        l15 = l14 >> 21;
        l7 = (l6 - (l7 << 21)) + l15;
        l6 = l14 - (l15 << 21);
        l14 = l7 >> 21;
        l8 = (l8 - (l9 << 21)) + l14;
        l7 -= l14 << 21;
        l9 = l8 >> 21;
        l3 = (l2 - (l3 << 21)) + l9;
        l2 = l8 - (l9 << 21);
        l8 = l3 >> 21;
        l4 = (l4 - (l5 << 21)) + l8;
        l3 -= l8 << 21;
        l5 = l4 >> 21;
        l = (l - (l1 << 21)) + l5;
        l1 = l4 - (l5 << 21);
        abyte0[0] = (byte)(int)(l10 >> 0);
        abyte0[1] = (byte)(int)(l10 >> 8);
        abyte0[2] = (byte)(int)(l10 >> 16 | l11 << 5);
        abyte0[3] = (byte)(int)(l11 >> 3);
        abyte0[4] = (byte)(int)(l11 >> 11);
        abyte0[5] = (byte)(int)(l11 >> 19 | l16 << 2);
        abyte0[6] = (byte)(int)(l16 >> 6);
        abyte0[7] = (byte)(int)(l16 >> 14 | l17 << 7);
        abyte0[8] = (byte)(int)(l17 >> 1);
        abyte0[9] = (byte)(int)(l17 >> 9);
        abyte0[10] = (byte)(int)(l17 >> 17 | l12 << 4);
        abyte0[11] = (byte)(int)(l12 >> 4);
        abyte0[12] = (byte)(int)(l12 >> 12);
        abyte0[13] = (byte)(int)(l12 >> 20 | l13 << 1);
        abyte0[14] = (byte)(int)(l13 >> 7);
        abyte0[15] = (byte)(int)(l13 >> 15 | l6 << 6);
        abyte0[16] = (byte)(int)(l6 >> 2);
        abyte0[17] = (byte)(int)(l6 >> 10);
        abyte0[18] = (byte)(int)(l6 >> 18 | l7 << 3);
        abyte0[19] = (byte)(int)(l7 >> 5);
        abyte0[20] = (byte)(int)(l7 >> 13);
        abyte0[21] = (byte)(int)(l2 >> 0);
        abyte0[22] = (byte)(int)(l2 >> 8);
        abyte0[23] = (byte)(int)(l2 >> 16 | l3 << 5);
        abyte0[24] = (byte)(int)(l3 >> 3);
        abyte0[25] = (byte)(int)(l3 >> 11);
        abyte0[26] = (byte)(int)(l3 >> 19 | l1 << 2);
        abyte0[27] = (byte)(int)(l1 >> 6);
        abyte0[28] = (byte)(int)(l1 >> 14 | l << 7);
        abyte0[29] = (byte)(int)(l >> 1);
        abyte0[30] = (byte)(int)(l >> 9);
        abyte0[31] = (byte)(int)(l >> 17);
        if (flag)
        {
            boolean flag1;
            if (T.b)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            T.b = flag1;
        }
    }

    public static long b(byte abyte0[], int i)
    {
        return (long)abyte0[i + 0] & 255L | (long)abyte0[i + 1] << 8 & 65280L | (long)abyte0[i + 2] << 16 & 0xff0000L | (long)abyte0[i + 3] << 24 & 0xff000000L;
    }
}
