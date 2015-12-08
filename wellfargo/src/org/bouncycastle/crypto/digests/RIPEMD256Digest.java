// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class RIPEMD256Digest extends GeneralDigest
{

    private static final int DIGEST_LENGTH = 32;
    private int H0;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int X[];
    private int xOff;

    public RIPEMD256Digest()
    {
        X = new int[16];
        reset();
    }

    public RIPEMD256Digest(RIPEMD256Digest ripemd256digest)
    {
        super(ripemd256digest);
        X = new int[16];
        H0 = ripemd256digest.H0;
        H1 = ripemd256digest.H1;
        H2 = ripemd256digest.H2;
        H3 = ripemd256digest.H3;
        H4 = ripemd256digest.H4;
        H5 = ripemd256digest.H5;
        H6 = ripemd256digest.H6;
        H7 = ripemd256digest.H7;
        System.arraycopy(ripemd256digest.X, 0, X, 0, ripemd256digest.X.length);
        xOff = ripemd256digest.xOff;
    }

    private int F1(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f1(j, k, l) + i + i1, j1);
    }

    private int F2(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f2(j, k, l) + i + i1 + 0x5a827999, j1);
    }

    private int F3(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f3(j, k, l) + i + i1 + 0x6ed9eba1, j1);
    }

    private int F4(int i, int j, int k, int l, int i1, int j1)
    {
        return RL((f4(j, k, l) + i + i1) - 0x70e44324, j1);
    }

    private int FF1(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f1(j, k, l) + i + i1, j1);
    }

    private int FF2(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f2(j, k, l) + i + i1 + 0x6d703ef3, j1);
    }

    private int FF3(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f3(j, k, l) + i + i1 + 0x5c4dd124, j1);
    }

    private int FF4(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f4(j, k, l) + i + i1 + 0x50a28be6, j1);
    }

    private int RL(int i, int j)
    {
        return i << j | i >>> 32 - j;
    }

    private int f1(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    private int f2(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private int f3(int i, int j, int k)
    {
        return (~j | i) ^ k;
    }

    private int f4(int i, int j, int k)
    {
        return i & k | ~k & j;
    }

    private void unpackWord(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        abyte0[j + 1] = (byte)(i >>> 8);
        abyte0[j + 2] = (byte)(i >>> 16);
        abyte0[j + 3] = (byte)(i >>> 24);
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        unpackWord(H0, abyte0, i);
        unpackWord(H1, abyte0, i + 4);
        unpackWord(H2, abyte0, i + 8);
        unpackWord(H3, abyte0, i + 12);
        unpackWord(H4, abyte0, i + 16);
        unpackWord(H5, abyte0, i + 20);
        unpackWord(H6, abyte0, i + 24);
        unpackWord(H7, abyte0, i + 28);
        reset();
        return 32;
    }

    public String getAlgorithmName()
    {
        return "RIPEMD256";
    }

    public int getDigestSize()
    {
        return 32;
    }

    protected void processBlock()
    {
        int l = H0;
        int i = H1;
        int j1 = H2;
        int i1 = H3;
        int i2 = H4;
        int k = H5;
        int k1 = H6;
        int l1 = H7;
        l = F1(l, i, j1, i1, X[0], 11);
        i1 = F1(i1, l, i, j1, X[1], 14);
        j1 = F1(j1, i1, l, i, X[2], 15);
        i = F1(i, j1, i1, l, X[3], 12);
        l = F1(l, i, j1, i1, X[4], 5);
        i1 = F1(i1, l, i, j1, X[5], 8);
        j1 = F1(j1, i1, l, i, X[6], 7);
        i = F1(i, j1, i1, l, X[7], 9);
        l = F1(l, i, j1, i1, X[8], 11);
        i1 = F1(i1, l, i, j1, X[9], 13);
        j1 = F1(j1, i1, l, i, X[10], 14);
        int j2 = F1(i, j1, i1, l, X[11], 15);
        i = F1(l, j2, j1, i1, X[12], 6);
        l = F1(i1, i, j2, j1, X[13], 7);
        i1 = F1(j1, l, i, j2, X[14], 9);
        j1 = F1(j2, i1, l, i, X[15], 8);
        i2 = FF4(i2, k, k1, l1, X[5], 8);
        l1 = FF4(l1, i2, k, k1, X[14], 9);
        k1 = FF4(k1, l1, i2, k, X[7], 9);
        k = FF4(k, k1, l1, i2, X[0], 11);
        i2 = FF4(i2, k, k1, l1, X[9], 13);
        l1 = FF4(l1, i2, k, k1, X[2], 15);
        k1 = FF4(k1, l1, i2, k, X[11], 15);
        k = FF4(k, k1, l1, i2, X[4], 5);
        i2 = FF4(i2, k, k1, l1, X[13], 7);
        l1 = FF4(l1, i2, k, k1, X[6], 7);
        j2 = FF4(k1, l1, i2, k, X[15], 8);
        k = FF4(k, j2, l1, i2, X[8], 11);
        int k2 = FF4(i2, k, j2, l1, X[1], 14);
        k1 = FF4(l1, k2, k, j2, X[10], 14);
        l1 = FF4(j2, k1, k2, k, X[3], 12);
        i2 = FF4(k, l1, k1, k2, X[12], 6);
        k = F2(k2, j1, i1, l, X[7], 7);
        l = F2(l, k, j1, i1, X[4], 6);
        i1 = F2(i1, l, k, j1, X[13], 8);
        j1 = F2(j1, i1, l, k, X[1], 13);
        k = F2(k, j1, i1, l, X[10], 11);
        l = F2(l, k, j1, i1, X[6], 9);
        i1 = F2(i1, l, k, j1, X[15], 7);
        j1 = F2(j1, i1, l, k, X[3], 15);
        k = F2(k, j1, i1, l, X[12], 7);
        j2 = F2(l, k, j1, i1, X[0], 12);
        k2 = F2(i1, j2, k, j1, X[9], 15);
        int l2 = F2(j1, k2, j2, k, X[5], 9);
        l = F2(k, l2, k2, j2, X[2], 11);
        i1 = F2(j2, l, l2, k2, X[14], 7);
        j1 = F2(k2, i1, l, l2, X[11], 13);
        k = F2(l2, j1, i1, l, X[8], 12);
        i = FF3(i, i2, l1, k1, X[6], 9);
        k1 = FF3(k1, i, i2, l1, X[11], 13);
        l1 = FF3(l1, k1, i, i2, X[3], 15);
        i2 = FF3(i2, l1, k1, i, X[7], 7);
        i = FF3(i, i2, l1, k1, X[0], 12);
        k1 = FF3(k1, i, i2, l1, X[13], 8);
        l1 = FF3(l1, k1, i, i2, X[5], 9);
        i2 = FF3(i2, l1, k1, i, X[10], 11);
        i = FF3(i, i2, l1, k1, X[14], 7);
        j2 = FF3(k1, i, i2, l1, X[15], 7);
        k2 = FF3(l1, j2, i, i2, X[8], 12);
        l2 = FF3(i2, k2, j2, i, X[12], 7);
        k1 = FF3(i, l2, k2, j2, X[4], 6);
        l1 = FF3(j2, k1, l2, k2, X[9], 15);
        i2 = FF3(k2, l1, k1, l2, X[1], 13);
        i = FF3(l2, i2, l1, k1, X[2], 11);
        l = F3(l, i, j1, i1, X[3], 11);
        i1 = F3(i1, l, i, j1, X[10], 13);
        j1 = F3(j1, i1, l, i, X[14], 6);
        i = F3(i, j1, i1, l, X[4], 7);
        l = F3(l, i, j1, i1, X[9], 14);
        i1 = F3(i1, l, i, j1, X[15], 9);
        j1 = F3(j1, i1, l, i, X[8], 13);
        i = F3(i, j1, i1, l, X[1], 15);
        l = F3(l, i, j1, i1, X[2], 14);
        i1 = F3(i1, l, i, j1, X[7], 8);
        j1 = F3(j1, i1, l, i, X[0], 13);
        j2 = F3(i, j1, i1, l, X[6], 6);
        l = F3(l, j2, j1, i1, X[13], 5);
        i1 = F3(i1, l, j2, j1, X[11], 12);
        i = F3(j1, i1, l, j2, X[5], 7);
        j1 = F3(j2, i, i1, l, X[12], 5);
        k1 = FF2(k1, k, i2, l1, X[15], 9);
        l1 = FF2(l1, k1, k, i2, X[5], 7);
        i2 = FF2(i2, l1, k1, k, X[1], 15);
        k = FF2(k, i2, l1, k1, X[3], 11);
        k1 = FF2(k1, k, i2, l1, X[7], 8);
        l1 = FF2(l1, k1, k, i2, X[14], 6);
        i2 = FF2(i2, l1, k1, k, X[6], 6);
        k = FF2(k, i2, l1, k1, X[9], 14);
        k1 = FF2(k1, k, i2, l1, X[11], 12);
        l1 = FF2(l1, k1, k, i2, X[8], 13);
        i2 = FF2(i2, l1, k1, k, X[12], 5);
        j2 = FF2(k, i2, l1, k1, X[2], 14);
        k = FF2(k1, j2, i2, l1, X[10], 13);
        k1 = FF2(l1, k, j2, i2, X[0], 13);
        i2 = FF2(i2, k1, k, j2, X[4], 7);
        l1 = FF2(j2, i2, k1, k, X[13], 5);
        l = F4(l, j1, i2, i1, X[1], 11);
        i1 = F4(i1, l, j1, i2, X[9], 12);
        i2 = F4(i2, i1, l, j1, X[11], 14);
        j1 = F4(j1, i2, i1, l, X[10], 15);
        l = F4(l, j1, i2, i1, X[0], 14);
        i1 = F4(i1, l, j1, i2, X[8], 15);
        i2 = F4(i2, i1, l, j1, X[12], 9);
        j1 = F4(j1, i2, i1, l, X[4], 8);
        l = F4(l, j1, i2, i1, X[13], 9);
        i1 = F4(i1, l, j1, i2, X[3], 14);
        i2 = F4(i2, i1, l, j1, X[7], 5);
        j2 = F4(j1, i2, i1, l, X[15], 6);
        l = F4(l, j2, i2, i1, X[14], 8);
        i1 = F4(i1, l, j2, i2, X[5], 6);
        j1 = F4(i2, i1, l, j2, X[6], 5);
        i2 = F4(j2, j1, i1, l, X[2], 12);
        k = FF1(k, l1, i, k1, X[8], 15);
        k1 = FF1(k1, k, l1, i, X[6], 5);
        i = FF1(i, k1, k, l1, X[4], 8);
        l1 = FF1(l1, i, k1, k, X[1], 11);
        k = FF1(k, l1, i, k1, X[3], 14);
        k1 = FF1(k1, k, l1, i, X[11], 14);
        i = FF1(i, k1, k, l1, X[15], 6);
        l1 = FF1(l1, i, k1, k, X[0], 14);
        k = FF1(k, l1, i, k1, X[5], 6);
        k1 = FF1(k1, k, l1, i, X[12], 9);
        i = FF1(i, k1, k, l1, X[2], 12);
        l1 = FF1(l1, i, k1, k, X[13], 9);
        k = FF1(k, l1, i, k1, X[9], 12);
        k1 = FF1(k1, k, l1, i, X[7], 5);
        i = FF1(i, k1, k, l1, X[10], 15);
        l1 = FF1(l1, i, k1, k, X[14], 8);
        H0 = H0 + l;
        H1 = i2 + H1;
        H2 = H2 + j1;
        H3 = H3 + k1;
        H4 = H4 + k;
        H5 = H5 + l1;
        H6 = H6 + i;
        H7 = H7 + i1;
        xOff = 0;
        for (int j = 0; j != X.length; j++)
        {
            X[j] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (xOff > 14)
        {
            processBlock();
        }
        X[14] = (int)(-1L & l);
        X[15] = (int)(l >>> 32);
    }

    protected void processWord(byte abyte0[], int i)
    {
        int ai[] = X;
        int j = xOff;
        xOff = j + 1;
        ai[j] = abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
        if (xOff == 16)
        {
            processBlock();
        }
    }

    public void reset()
    {
        super.reset();
        H0 = 0x67452301;
        H1 = 0xefcdab89;
        H2 = 0x98badcfe;
        H3 = 0x10325476;
        H4 = 0x76543210;
        H5 = 0xfedcba98;
        H6 = 0x89abcdef;
        H7 = 0x1234567;
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

    }
}
