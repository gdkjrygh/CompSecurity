// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class SHA256Digest extends GeneralDigest
{

    private static final int DIGEST_LENGTH = 32;
    static final int K[] = {
        0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5, 0xd807aa98, 0x12835b01, 
        0x243185be, 0x550c7dc3, 0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174, 0xe49b69c1, 0xefbe4786, 0xfc19dc6, 0x240ca1cc, 
        0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da, 0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, 
        0x6ca6351, 0x14292967, 0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, 0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85, 
        0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070, 0x19a4c116, 0x1e376c08, 
        0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, 0x5b9cca4f, 0x682e6ff3, 0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, 
        0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2
    };
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int X[];
    private int xOff;

    public SHA256Digest()
    {
        X = new int[64];
        reset();
    }

    public SHA256Digest(SHA256Digest sha256digest)
    {
        super(sha256digest);
        X = new int[64];
        H1 = sha256digest.H1;
        H2 = sha256digest.H2;
        H3 = sha256digest.H3;
        H4 = sha256digest.H4;
        H5 = sha256digest.H5;
        H6 = sha256digest.H6;
        H7 = sha256digest.H7;
        H8 = sha256digest.H8;
        System.arraycopy(sha256digest.X, 0, X, 0, sha256digest.X.length);
        xOff = sha256digest.xOff;
    }

    private int Ch(int i, int j, int k)
    {
        return i & j ^ ~i & k;
    }

    private int Maj(int i, int j, int k)
    {
        return i & j ^ i & k ^ j & k;
    }

    private int Sum0(int i)
    {
        return (i >>> 2 | i << 30) ^ (i >>> 13 | i << 19) ^ (i >>> 22 | i << 10);
    }

    private int Sum1(int i)
    {
        return (i >>> 6 | i << 26) ^ (i >>> 11 | i << 21) ^ (i >>> 25 | i << 7);
    }

    private int Theta0(int i)
    {
        return (i >>> 7 | i << 25) ^ (i >>> 18 | i << 14) ^ i >>> 3;
    }

    private int Theta1(int i)
    {
        return (i >>> 17 | i << 15) ^ (i >>> 19 | i << 13) ^ i >>> 10;
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        Pack.intToBigEndian(H1, abyte0, i);
        Pack.intToBigEndian(H2, abyte0, i + 4);
        Pack.intToBigEndian(H3, abyte0, i + 8);
        Pack.intToBigEndian(H4, abyte0, i + 12);
        Pack.intToBigEndian(H5, abyte0, i + 16);
        Pack.intToBigEndian(H6, abyte0, i + 20);
        Pack.intToBigEndian(H7, abyte0, i + 24);
        Pack.intToBigEndian(H8, abyte0, i + 28);
        reset();
        return 32;
    }

    public String getAlgorithmName()
    {
        return "SHA-256";
    }

    public int getDigestSize()
    {
        return 32;
    }

    protected void processBlock()
    {
        for (int i = 16; i <= 63; i++)
        {
            X[i] = Theta1(X[i - 2]) + X[i - 7] + Theta0(X[i - 15]) + X[i - 16];
        }

        int l = H1;
        int j1 = H2;
        int l1 = H3;
        int k2 = H4;
        int i1 = H5;
        int k1 = H6;
        int i2 = H7;
        int l2 = H8;
        int j = 0;
        int j2 = 0;
        for (; j < 8; j++)
        {
            l2 += Sum1(i1) + Ch(i1, k1, i2) + K[j2] + X[j2];
            k2 += l2;
            l2 += Sum0(l) + Maj(l, j1, l1);
            j2++;
            i2 += Sum1(k2) + Ch(k2, i1, k1) + K[j2] + X[j2];
            l1 += i2;
            i2 += Sum0(l2) + Maj(l2, l, j1);
            j2++;
            k1 += Sum1(l1) + Ch(l1, k2, i1) + K[j2] + X[j2];
            j1 += k1;
            k1 += Sum0(i2) + Maj(i2, l2, l);
            j2++;
            i1 += Sum1(j1) + Ch(j1, l1, k2) + K[j2] + X[j2];
            l += i1;
            i1 += Sum0(k1) + Maj(k1, i2, l2);
            j2++;
            k2 += Sum1(l) + Ch(l, j1, l1) + K[j2] + X[j2];
            l2 += k2;
            k2 += Sum0(i1) + Maj(i1, k1, i2);
            j2++;
            l1 += Sum1(l2) + Ch(l2, l, j1) + K[j2] + X[j2];
            i2 += l1;
            l1 += Sum0(k2) + Maj(k2, i1, k1);
            j2++;
            j1 += Sum1(i2) + Ch(i2, l2, l) + K[j2] + X[j2];
            k1 += j1;
            j1 += Sum0(l1) + Maj(l1, k2, i1);
            j2++;
            l += Sum1(k1) + Ch(k1, i2, l2) + K[j2] + X[j2];
            i1 += l;
            l += Sum0(j1) + Maj(j1, l1, k2);
            j2++;
        }

        H1 = H1 + l;
        H2 = H2 + j1;
        H3 = H3 + l1;
        H4 = H4 + k2;
        H5 = H5 + i1;
        H6 = H6 + k1;
        H7 = H7 + i2;
        H8 = H8 + l2;
        xOff = 0;
        for (int k = 0; k < 16; k++)
        {
            X[k] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (xOff > 14)
        {
            processBlock();
        }
        X[14] = (int)(l >>> 32);
        X[15] = (int)(-1L & l);
    }

    protected void processWord(byte abyte0[], int i)
    {
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        int k = j + 1;
        j = abyte0[k];
        k = abyte0[k + 1];
        X[xOff] = byte0 << 24 | (i & 0xff) << 16 | (j & 0xff) << 8 | k & 0xff;
        i = xOff + 1;
        xOff = i;
        if (i == 16)
        {
            processBlock();
        }
    }

    public void reset()
    {
        super.reset();
        H1 = 0x6a09e667;
        H2 = 0xbb67ae85;
        H3 = 0x3c6ef372;
        H4 = 0xa54ff53a;
        H5 = 0x510e527f;
        H6 = 0x9b05688c;
        H7 = 0x1f83d9ab;
        H8 = 0x5be0cd19;
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

    }

}
