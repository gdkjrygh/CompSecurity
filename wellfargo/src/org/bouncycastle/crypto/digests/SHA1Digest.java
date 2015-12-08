// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class SHA1Digest extends GeneralDigest
{

    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 0x5a827999;
    private static final int Y2 = 0x6ed9eba1;
    private static final int Y3 = 0x8f1bbcdc;
    private static final int Y4 = 0xca62c1d6;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int X[];
    private int xOff;

    public SHA1Digest()
    {
        X = new int[80];
        reset();
    }

    public SHA1Digest(SHA1Digest sha1digest)
    {
        super(sha1digest);
        X = new int[80];
        H1 = sha1digest.H1;
        H2 = sha1digest.H2;
        H3 = sha1digest.H3;
        H4 = sha1digest.H4;
        H5 = sha1digest.H5;
        System.arraycopy(sha1digest.X, 0, X, 0, sha1digest.X.length);
        xOff = sha1digest.xOff;
    }

    private int f(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private int g(int i, int j, int k)
    {
        return i & j | i & k | j & k;
    }

    private int h(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        Pack.intToBigEndian(H1, abyte0, i);
        Pack.intToBigEndian(H2, abyte0, i + 4);
        Pack.intToBigEndian(H3, abyte0, i + 8);
        Pack.intToBigEndian(H4, abyte0, i + 12);
        Pack.intToBigEndian(H5, abyte0, i + 16);
        reset();
        return 20;
    }

    public String getAlgorithmName()
    {
        return "SHA-1";
    }

    public int getDigestSize()
    {
        return 20;
    }

    protected void processBlock()
    {
        for (int i = 16; i < 80; i++)
        {
            int i1 = X[i - 3] ^ X[i - 8] ^ X[i - 14] ^ X[i - 16];
            X[i] = i1 >>> 31 | i1 << 1;
        }

        int l1 = H1;
        int j2 = H2;
        int j = H3;
        int j1 = H4;
        int i2 = H5;
        int k1 = 0;
        for (int k2 = 0; k2 < 4; k2++)
        {
            int k4 = f(j2, j, j1);
            int ai[] = X;
            int k3 = k1 + 1;
            i2 = ai[k1] + ((l1 << 5 | l1 >>> 27) + k4) + 0x5a827999 + i2;
            k1 = j2 >>> 2 | j2 << 30;
            k4 = f(l1, k1, j);
            ai = X;
            j2 = k3 + 1;
            j1 += (i2 << 5 | i2 >>> 27) + k4 + ai[k3] + 0x5a827999;
            l1 = l1 >>> 2 | l1 << 30;
            k4 = f(i2, l1, k1);
            ai = X;
            k3 = j2 + 1;
            j += (j1 << 5 | j1 >>> 27) + k4 + ai[j2] + 0x5a827999;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = f(j1, i2, l1);
            ai = X;
            k4 = k3 + 1;
            j2 = k1 + ((j << 5 | j >>> 27) + j2 + ai[k3] + 0x5a827999);
            j1 = j1 >>> 2 | j1 << 30;
            k3 = f(j, j1, i2);
            ai = X;
            k1 = k4 + 1;
            l1 += k3 + (j2 << 5 | j2 >>> 27) + ai[k4] + 0x5a827999;
            j = j >>> 2 | j << 30;
        }

        for (int l2 = 0; l2 < 4; l2++)
        {
            int l4 = h(j2, j, j1);
            int ai1[] = X;
            int l3 = k1 + 1;
            i2 = ai1[k1] + ((l1 << 5 | l1 >>> 27) + l4) + 0x6ed9eba1 + i2;
            k1 = j2 >>> 2 | j2 << 30;
            l4 = h(l1, k1, j);
            ai1 = X;
            j2 = l3 + 1;
            j1 += (i2 << 5 | i2 >>> 27) + l4 + ai1[l3] + 0x6ed9eba1;
            l1 = l1 >>> 2 | l1 << 30;
            l4 = h(i2, l1, k1);
            ai1 = X;
            l3 = j2 + 1;
            j += (j1 << 5 | j1 >>> 27) + l4 + ai1[j2] + 0x6ed9eba1;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = h(j1, i2, l1);
            ai1 = X;
            l4 = l3 + 1;
            j2 = k1 + ((j << 5 | j >>> 27) + j2 + ai1[l3] + 0x6ed9eba1);
            j1 = j1 >>> 2 | j1 << 30;
            l3 = h(j, j1, i2);
            ai1 = X;
            k1 = l4 + 1;
            l1 += l3 + (j2 << 5 | j2 >>> 27) + ai1[l4] + 0x6ed9eba1;
            j = j >>> 2 | j << 30;
        }

        for (int i3 = 0; i3 < 4; i3++)
        {
            int i5 = g(j2, j, j1);
            int ai2[] = X;
            int i4 = k1 + 1;
            i2 = ((ai2[k1] + ((l1 << 5 | l1 >>> 27) + i5)) - 0x70e44324) + i2;
            k1 = j2 >>> 2 | j2 << 30;
            i5 = g(l1, k1, j);
            ai2 = X;
            j2 = i4 + 1;
            j1 += ((i2 << 5 | i2 >>> 27) + i5 + ai2[i4]) - 0x70e44324;
            l1 = l1 >>> 2 | l1 << 30;
            i5 = g(i2, l1, k1);
            ai2 = X;
            i4 = j2 + 1;
            j += ((j1 << 5 | j1 >>> 27) + i5 + ai2[j2]) - 0x70e44324;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = g(j1, i2, l1);
            ai2 = X;
            i5 = i4 + 1;
            j2 = k1 + (((j << 5 | j >>> 27) + j2 + ai2[i4]) - 0x70e44324);
            j1 = j1 >>> 2 | j1 << 30;
            i4 = g(j, j1, i2);
            ai2 = X;
            k1 = i5 + 1;
            l1 += (i4 + (j2 << 5 | j2 >>> 27) + ai2[i5]) - 0x70e44324;
            j = j >>> 2 | j << 30;
        }

        boolean flag = false;
        int j3 = l1;
        l1 = j;
        for (int k = ((flag) ? 1 : 0); k <= 3; k++)
        {
            int j5 = h(j2, l1, j1);
            int ai3[] = X;
            int j4 = k1 + 1;
            i2 = ((ai3[k1] + ((j3 << 5 | j3 >>> 27) + j5)) - 0x359d3e2a) + i2;
            k1 = j2 >>> 2 | j2 << 30;
            j5 = h(j3, k1, l1);
            ai3 = X;
            j2 = j4 + 1;
            j1 += ((i2 << 5 | i2 >>> 27) + j5 + ai3[j4]) - 0x359d3e2a;
            j3 = j3 >>> 2 | j3 << 30;
            j5 = h(i2, j3, k1);
            ai3 = X;
            j4 = j2 + 1;
            l1 += ((j1 << 5 | j1 >>> 27) + j5 + ai3[j2]) - 0x359d3e2a;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = h(j1, i2, j3);
            ai3 = X;
            j5 = j4 + 1;
            j2 = k1 + (((l1 << 5 | l1 >>> 27) + j2 + ai3[j4]) - 0x359d3e2a);
            j1 = j1 >>> 2 | j1 << 30;
            j4 = h(l1, j1, i2);
            ai3 = X;
            k1 = j5 + 1;
            j3 += (j4 + (j2 << 5 | j2 >>> 27) + ai3[j5]) - 0x359d3e2a;
            l1 = l1 >>> 2 | l1 << 30;
        }

        H1 = H1 + j3;
        H2 = H2 + j2;
        H3 = H3 + l1;
        H4 = H4 + j1;
        H5 = H5 + i2;
        xOff = 0;
        for (int l = 0; l < 16; l++)
        {
            X[l] = 0;
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
        H1 = 0x67452301;
        H2 = 0xefcdab89;
        H3 = 0x98badcfe;
        H4 = 0x10325476;
        H5 = 0xc3d2e1f0;
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

    }
}
