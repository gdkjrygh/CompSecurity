// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


public class M
{

    public static void a(byte abyte0[], int ai[])
    {
        int j2 = ai[0];
        int j = ai[1];
        int l = ai[2];
        int j1 = ai[3];
        int l1 = ai[4];
        int i2 = ai[5];
        int k1 = ai[6];
        int i1 = ai[7];
        int k = ai[8];
        int i = ai[9];
        int k2 = j2 + (((((((((((i * 19 + 0x1000000 >> 25) + j2 >> 26) + j >> 25) + l >> 26) + j1 >> 25) + l1 >> 26) + i2 >> 25) + k1 >> 26) + i1 >> 25) + k >> 26) + i >> 25) * 19;
        int l2 = k2 >> 26;
        j2 = j + l2;
        j = k2 - (l2 << 26);
        l2 = j2 >> 25;
        k2 = l + l2;
        l = j2 - (l2 << 25);
        l2 = k2 >> 26;
        j2 = j1 + l2;
        j1 = k2 - (l2 << 26);
        l2 = j2 >> 25;
        k2 = l1 + l2;
        l1 = j2 - (l2 << 25);
        l2 = k2 >> 26;
        j2 = i2 + l2;
        i2 = k2 - (l2 << 26);
        l2 = j2 >> 25;
        k2 = k1 + l2;
        k1 = j2 - (l2 << 25);
        l2 = k2 >> 26;
        j2 = i1 + l2;
        i1 = k2 - (l2 << 26);
        k2 = j2 >> 25;
        k += k2;
        j2 -= k2 << 25;
        k2 = k >> 26;
        i += k2;
        k -= k2 << 26;
        i -= (i >> 25) << 25;
        abyte0[0] = (byte)(j >> 0);
        abyte0[1] = (byte)(j >> 8);
        abyte0[2] = (byte)(j >> 16);
        abyte0[3] = (byte)(j >> 24 | l << 2);
        abyte0[4] = (byte)(l >> 6);
        abyte0[5] = (byte)(l >> 14);
        abyte0[6] = (byte)(l >> 22 | j1 << 3);
        abyte0[7] = (byte)(j1 >> 5);
        abyte0[8] = (byte)(j1 >> 13);
        abyte0[9] = (byte)(j1 >> 21 | l1 << 5);
        abyte0[10] = (byte)(l1 >> 3);
        abyte0[11] = (byte)(l1 >> 11);
        abyte0[12] = (byte)(l1 >> 19 | i2 << 6);
        abyte0[13] = (byte)(i2 >> 2);
        abyte0[14] = (byte)(i2 >> 10);
        abyte0[15] = (byte)(i2 >> 18);
        abyte0[16] = (byte)(k1 >> 0);
        abyte0[17] = (byte)(k1 >> 8);
        abyte0[18] = (byte)(k1 >> 16);
        abyte0[19] = (byte)(k1 >> 24 | i1 << 1);
        abyte0[20] = (byte)(i1 >> 7);
        abyte0[21] = (byte)(i1 >> 15);
        abyte0[22] = (byte)(i1 >> 23 | j2 << 3);
        abyte0[23] = (byte)(j2 >> 5);
        abyte0[24] = (byte)(j2 >> 13);
        abyte0[25] = (byte)(j2 >> 21 | k << 4);
        abyte0[26] = (byte)(k >> 4);
        abyte0[27] = (byte)(k >> 12);
        abyte0[28] = (byte)(k >> 20 | i << 6);
        abyte0[29] = (byte)(i >> 2);
        abyte0[30] = (byte)(i >> 10);
        abyte0[31] = (byte)(i >> 18);
    }
}
