// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


public class v
{

    public static void a(int ai[], int ai1[])
    {
        int i = ai1[0];
        int j = ai1[1];
        int k = ai1[2];
        int l = ai1[3];
        int i1 = ai1[4];
        int j1 = ai1[5];
        int k1 = ai1[6];
        int l1 = ai1[7];
        int i2 = ai1[8];
        int j2 = ai1[9];
        long l8 = i;
        long l2 = (long)j * 0x1db42L;
        long l10 = k;
        long l3 = (long)l * 0x1db42L;
        long l12 = i1;
        long l4 = (long)j1 * 0x1db42L;
        long l14 = k1;
        long l5 = (long)l1 * 0x1db42L;
        long l16 = i2;
        long l6 = (long)j2 * 0x1db42L;
        long l7 = 0x1000000L + l6 >> 25;
        l8 = l8 * 0x1db42L + 19L * l7;
        long l9 = 0x1000000L + l2 >> 25;
        l10 = l10 * 0x1db42L + l9;
        long l11 = 0x1000000L + l3 >> 25;
        l12 = l12 * 0x1db42L + l11;
        long l13 = 0x1000000L + l4 >> 25;
        l14 = l14 * 0x1db42L + l13;
        long l15 = 0x1000000L + l5 >> 25;
        l16 = l16 * 0x1db42L + l15;
        long l17 = 0x2000000L + l8 >> 26;
        long l18 = 0x2000000L + l10 >> 26;
        long l19 = 0x2000000L + l12 >> 26;
        long l20 = 0x2000000L + l14 >> 26;
        long l21 = 0x2000000L + l16 >> 26;
        ai[0] = (int)(l8 - (l17 << 26));
        ai[1] = (int)((l2 - (l9 << 25)) + l17);
        ai[2] = (int)(l10 - (l18 << 26));
        ai[3] = (int)((l3 - (l11 << 25)) + l18);
        ai[4] = (int)(l12 - (l19 << 26));
        ai[5] = (int)((l4 - (l13 << 25)) + l19);
        ai[6] = (int)(l14 - (l20 << 26));
        ai[7] = (int)((l5 - (l15 << 25)) + l20);
        ai[8] = (int)(l16 - (l21 << 26));
        ai[9] = (int)((l6 - (l7 << 25)) + l21);
    }
}
