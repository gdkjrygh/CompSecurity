// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class RIPEMD128Digest extends GeneralDigest
{

    private static final int DIGEST_LENGTH = 16;
    private int H0;
    private int H1;
    private int H2;
    private int H3;
    private int X[];
    private int xOff;

    public RIPEMD128Digest()
    {
        X = new int[16];
        reset();
    }

    public RIPEMD128Digest(RIPEMD128Digest ripemd128digest)
    {
        super(ripemd128digest);
        X = new int[16];
        H0 = ripemd128digest.H0;
        H1 = ripemd128digest.H1;
        H2 = ripemd128digest.H2;
        H3 = ripemd128digest.H3;
        System.arraycopy(ripemd128digest.X, 0, X, 0, ripemd128digest.X.length);
        xOff = ripemd128digest.xOff;
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
        reset();
        return 16;
    }

    public String getAlgorithmName()
    {
        return "RIPEMD128";
    }

    public int getDigestSize()
    {
        return 16;
    }

    protected void processBlock()
    {
        int i2 = H0;
        int j1 = H1;
        int k1 = H2;
        int l1 = H3;
        int k = F1(i2, j1, k1, l1, X[0], 11);
        int l = F1(l1, k, j1, k1, X[1], 14);
        int i1 = F1(k1, l, k, j1, X[2], 15);
        int i = F1(j1, i1, l, k, X[3], 12);
        k = F1(k, i, i1, l, X[4], 5);
        l = F1(l, k, i, i1, X[5], 8);
        i1 = F1(i1, l, k, i, X[6], 7);
        i = F1(i, i1, l, k, X[7], 9);
        k = F1(k, i, i1, l, X[8], 11);
        l = F1(l, k, i, i1, X[9], 13);
        i1 = F1(i1, l, k, i, X[10], 14);
        i = F1(i, i1, l, k, X[11], 15);
        k = F1(k, i, i1, l, X[12], 6);
        l = F1(l, k, i, i1, X[13], 7);
        i1 = F1(i1, l, k, i, X[14], 9);
        i = F1(i, i1, l, k, X[15], 8);
        k = F2(k, i, i1, l, X[7], 7);
        l = F2(l, k, i, i1, X[4], 6);
        i1 = F2(i1, l, k, i, X[13], 8);
        i = F2(i, i1, l, k, X[1], 13);
        k = F2(k, i, i1, l, X[10], 11);
        l = F2(l, k, i, i1, X[6], 9);
        i1 = F2(i1, l, k, i, X[15], 7);
        i = F2(i, i1, l, k, X[3], 15);
        k = F2(k, i, i1, l, X[12], 7);
        l = F2(l, k, i, i1, X[0], 12);
        i1 = F2(i1, l, k, i, X[9], 15);
        i = F2(i, i1, l, k, X[5], 9);
        k = F2(k, i, i1, l, X[2], 11);
        l = F2(l, k, i, i1, X[14], 7);
        i1 = F2(i1, l, k, i, X[11], 13);
        i = F2(i, i1, l, k, X[8], 12);
        k = F3(k, i, i1, l, X[3], 11);
        l = F3(l, k, i, i1, X[10], 13);
        i1 = F3(i1, l, k, i, X[14], 6);
        i = F3(i, i1, l, k, X[4], 7);
        k = F3(k, i, i1, l, X[9], 14);
        l = F3(l, k, i, i1, X[15], 9);
        i1 = F3(i1, l, k, i, X[8], 13);
        i = F3(i, i1, l, k, X[1], 15);
        k = F3(k, i, i1, l, X[2], 14);
        l = F3(l, k, i, i1, X[7], 8);
        i1 = F3(i1, l, k, i, X[0], 13);
        i = F3(i, i1, l, k, X[6], 6);
        k = F3(k, i, i1, l, X[13], 5);
        l = F3(l, k, i, i1, X[11], 12);
        i1 = F3(i1, l, k, i, X[5], 7);
        i = F3(i, i1, l, k, X[12], 5);
        k = F4(k, i, i1, l, X[1], 11);
        l = F4(l, k, i, i1, X[9], 12);
        i1 = F4(i1, l, k, i, X[11], 14);
        i = F4(i, i1, l, k, X[10], 15);
        k = F4(k, i, i1, l, X[0], 14);
        l = F4(l, k, i, i1, X[8], 15);
        i1 = F4(i1, l, k, i, X[12], 9);
        i = F4(i, i1, l, k, X[4], 8);
        k = F4(k, i, i1, l, X[13], 9);
        l = F4(l, k, i, i1, X[3], 14);
        i1 = F4(i1, l, k, i, X[7], 5);
        int j2 = F4(i, i1, l, k, X[15], 6);
        i = F4(k, j2, i1, l, X[14], 8);
        k = F4(l, i, j2, i1, X[5], 6);
        l = F4(i1, k, i, j2, X[6], 5);
        i1 = F4(j2, l, k, i, X[2], 12);
        i2 = FF4(i2, j1, k1, l1, X[5], 8);
        l1 = FF4(l1, i2, j1, k1, X[14], 9);
        k1 = FF4(k1, l1, i2, j1, X[7], 9);
        j1 = FF4(j1, k1, l1, i2, X[0], 11);
        i2 = FF4(i2, j1, k1, l1, X[9], 13);
        l1 = FF4(l1, i2, j1, k1, X[2], 15);
        k1 = FF4(k1, l1, i2, j1, X[11], 15);
        j1 = FF4(j1, k1, l1, i2, X[4], 5);
        i2 = FF4(i2, j1, k1, l1, X[13], 7);
        l1 = FF4(l1, i2, j1, k1, X[6], 7);
        k1 = FF4(k1, l1, i2, j1, X[15], 8);
        j1 = FF4(j1, k1, l1, i2, X[8], 11);
        i2 = FF4(i2, j1, k1, l1, X[1], 14);
        l1 = FF4(l1, i2, j1, k1, X[10], 14);
        k1 = FF4(k1, l1, i2, j1, X[3], 12);
        j1 = FF4(j1, k1, l1, i2, X[12], 6);
        i2 = FF3(i2, j1, k1, l1, X[6], 9);
        l1 = FF3(l1, i2, j1, k1, X[11], 13);
        k1 = FF3(k1, l1, i2, j1, X[3], 15);
        j1 = FF3(j1, k1, l1, i2, X[7], 7);
        i2 = FF3(i2, j1, k1, l1, X[0], 12);
        l1 = FF3(l1, i2, j1, k1, X[13], 8);
        k1 = FF3(k1, l1, i2, j1, X[5], 9);
        j1 = FF3(j1, k1, l1, i2, X[10], 11);
        i2 = FF3(i2, j1, k1, l1, X[14], 7);
        l1 = FF3(l1, i2, j1, k1, X[15], 7);
        k1 = FF3(k1, l1, i2, j1, X[8], 12);
        j1 = FF3(j1, k1, l1, i2, X[12], 7);
        i2 = FF3(i2, j1, k1, l1, X[4], 6);
        l1 = FF3(l1, i2, j1, k1, X[9], 15);
        k1 = FF3(k1, l1, i2, j1, X[1], 13);
        j1 = FF3(j1, k1, l1, i2, X[2], 11);
        i2 = FF2(i2, j1, k1, l1, X[15], 9);
        l1 = FF2(l1, i2, j1, k1, X[5], 7);
        k1 = FF2(k1, l1, i2, j1, X[1], 15);
        j1 = FF2(j1, k1, l1, i2, X[3], 11);
        i2 = FF2(i2, j1, k1, l1, X[7], 8);
        l1 = FF2(l1, i2, j1, k1, X[14], 6);
        k1 = FF2(k1, l1, i2, j1, X[6], 6);
        j1 = FF2(j1, k1, l1, i2, X[9], 14);
        i2 = FF2(i2, j1, k1, l1, X[11], 12);
        l1 = FF2(l1, i2, j1, k1, X[8], 13);
        k1 = FF2(k1, l1, i2, j1, X[12], 5);
        j1 = FF2(j1, k1, l1, i2, X[2], 14);
        i2 = FF2(i2, j1, k1, l1, X[10], 13);
        l1 = FF2(l1, i2, j1, k1, X[0], 13);
        k1 = FF2(k1, l1, i2, j1, X[4], 7);
        j1 = FF2(j1, k1, l1, i2, X[13], 5);
        i2 = FF1(i2, j1, k1, l1, X[8], 15);
        l1 = FF1(l1, i2, j1, k1, X[6], 5);
        k1 = FF1(k1, l1, i2, j1, X[4], 8);
        j1 = FF1(j1, k1, l1, i2, X[1], 11);
        i2 = FF1(i2, j1, k1, l1, X[3], 14);
        l1 = FF1(l1, i2, j1, k1, X[11], 14);
        k1 = FF1(k1, l1, i2, j1, X[15], 6);
        j1 = FF1(j1, k1, l1, i2, X[0], 14);
        i2 = FF1(i2, j1, k1, l1, X[5], 6);
        l1 = FF1(l1, i2, j1, k1, X[12], 9);
        k1 = FF1(k1, l1, i2, j1, X[2], 12);
        j2 = FF1(j1, k1, l1, i2, X[13], 9);
        j1 = FF1(i2, j2, k1, l1, X[9], 12);
        l1 = FF1(l1, j1, j2, k1, X[7], 5);
        k1 = FF1(k1, l1, j1, j2, X[10], 15);
        i2 = FF1(j2, k1, l1, j1, X[14], 8);
        j2 = H1;
        H1 = H2 + k + j1;
        H2 = i2 + (H3 + i);
        H3 = H0 + i1 + k1;
        H0 = j2 + l + l1;
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
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

    }
}
