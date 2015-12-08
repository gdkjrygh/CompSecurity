// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class MD4Digest extends GeneralDigest
{

    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int X[];
    private int xOff;

    public MD4Digest()
    {
        X = new int[16];
        reset();
    }

    public MD4Digest(MD4Digest md4digest)
    {
        super(md4digest);
        X = new int[16];
        H1 = md4digest.H1;
        H2 = md4digest.H2;
        H3 = md4digest.H3;
        H4 = md4digest.H4;
        System.arraycopy(md4digest.X, 0, X, 0, md4digest.X.length);
        xOff = md4digest.xOff;
    }

    private int F(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private int G(int i, int j, int k)
    {
        return i & j | i & k | j & k;
    }

    private int H(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    private int rotateLeft(int i, int j)
    {
        return i << j | i >>> 32 - j;
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
        unpackWord(H1, abyte0, i);
        unpackWord(H2, abyte0, i + 4);
        unpackWord(H3, abyte0, i + 8);
        unpackWord(H4, abyte0, i + 12);
        reset();
        return 16;
    }

    public String getAlgorithmName()
    {
        return "MD4";
    }

    public int getDigestSize()
    {
        return 16;
    }

    protected void processBlock()
    {
        int k = H1;
        int i = H2;
        int i1 = H3;
        int l = H4;
        k = rotateLeft(k + F(i, i1, l) + X[0], 3);
        l = rotateLeft(l + F(k, i, i1) + X[1], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + X[2], 11);
        i = rotateLeft(i + F(i1, l, k) + X[3], 19);
        k = rotateLeft(k + F(i, i1, l) + X[4], 3);
        l = rotateLeft(l + F(k, i, i1) + X[5], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + X[6], 11);
        i = rotateLeft(i + F(i1, l, k) + X[7], 19);
        k = rotateLeft(k + F(i, i1, l) + X[8], 3);
        l = rotateLeft(l + F(k, i, i1) + X[9], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + X[10], 11);
        i = rotateLeft(i + F(i1, l, k) + X[11], 19);
        k = rotateLeft(k + F(i, i1, l) + X[12], 3);
        l = rotateLeft(l + F(k, i, i1) + X[13], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + X[14], 11);
        i = rotateLeft(i + F(i1, l, k) + X[15], 19);
        k = rotateLeft(k + G(i, i1, l) + X[0] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + X[4] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + X[8] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + X[12] + 0x5a827999, 13);
        k = rotateLeft(k + G(i, i1, l) + X[1] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + X[5] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + X[9] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + X[13] + 0x5a827999, 13);
        k = rotateLeft(k + G(i, i1, l) + X[2] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + X[6] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + X[10] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + X[14] + 0x5a827999, 13);
        k = rotateLeft(k + G(i, i1, l) + X[3] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + X[7] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + X[11] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + X[15] + 0x5a827999, 13);
        k = rotateLeft(k + H(i, i1, l) + X[0] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + X[8] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + X[4] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + X[12] + 0x6ed9eba1, 15);
        k = rotateLeft(k + H(i, i1, l) + X[2] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + X[10] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + X[6] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + X[14] + 0x6ed9eba1, 15);
        k = rotateLeft(k + H(i, i1, l) + X[1] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + X[9] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + X[5] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + X[13] + 0x6ed9eba1, 15);
        k = rotateLeft(k + H(i, i1, l) + X[3] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + X[11] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + X[7] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + X[15] + 0x6ed9eba1, 15);
        H1 = k + H1;
        H2 = H2 + i;
        H3 = H3 + i1;
        H4 = H4 + l;
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
        H1 = 0x67452301;
        H2 = 0xefcdab89;
        H3 = 0x98badcfe;
        H4 = 0x10325476;
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

    }
}
