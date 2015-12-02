// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Memoable;

// Referenced classes of package org.spongycastle.crypto.digests:
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
    private static final String z;
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
        copyIn(md4digest);
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

    private void copyIn(MD4Digest md4digest)
    {
        super.copyIn(md4digest);
        H1 = md4digest.H1;
        H2 = md4digest.H2;
        H3 = md4digest.H3;
        H4 = md4digest.H4;
        System.arraycopy(md4digest.X, 0, X, 0, md4digest.X.length);
        xOff = md4digest.xOff;
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

    public Memoable copy()
    {
        return new MD4Digest(this);
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
        return z;
    }

    public int getDigestSize()
    {
        return 16;
    }

    protected void processBlock()
    {
        boolean flag = GeneralDigest.a;
        int j = H1;
        int i = H2;
        int l = H3;
        int k = H4;
        j = rotateLeft(j + F(i, l, k) + X[0], 3);
        k = rotateLeft(k + F(j, i, l) + X[1], 7);
        l = rotateLeft(l + F(k, j, i) + X[2], 11);
        i = rotateLeft(i + F(l, k, j) + X[3], 19);
        j = rotateLeft(j + F(i, l, k) + X[4], 3);
        k = rotateLeft(k + F(j, i, l) + X[5], 7);
        l = rotateLeft(l + F(k, j, i) + X[6], 11);
        i = rotateLeft(i + F(l, k, j) + X[7], 19);
        j = rotateLeft(j + F(i, l, k) + X[8], 3);
        k = rotateLeft(k + F(j, i, l) + X[9], 7);
        l = rotateLeft(l + F(k, j, i) + X[10], 11);
        i = rotateLeft(i + F(l, k, j) + X[11], 19);
        j = rotateLeft(j + F(i, l, k) + X[12], 3);
        k = rotateLeft(k + F(j, i, l) + X[13], 7);
        l = rotateLeft(l + F(k, j, i) + X[14], 11);
        i = rotateLeft(i + F(l, k, j) + X[15], 19);
        j = rotateLeft(j + G(i, l, k) + X[0] + 0x5a827999, 3);
        k = rotateLeft(k + G(j, i, l) + X[4] + 0x5a827999, 5);
        l = rotateLeft(l + G(k, j, i) + X[8] + 0x5a827999, 9);
        i = rotateLeft(i + G(l, k, j) + X[12] + 0x5a827999, 13);
        j = rotateLeft(j + G(i, l, k) + X[1] + 0x5a827999, 3);
        k = rotateLeft(k + G(j, i, l) + X[5] + 0x5a827999, 5);
        l = rotateLeft(l + G(k, j, i) + X[9] + 0x5a827999, 9);
        i = rotateLeft(i + G(l, k, j) + X[13] + 0x5a827999, 13);
        j = rotateLeft(j + G(i, l, k) + X[2] + 0x5a827999, 3);
        k = rotateLeft(k + G(j, i, l) + X[6] + 0x5a827999, 5);
        l = rotateLeft(l + G(k, j, i) + X[10] + 0x5a827999, 9);
        i = rotateLeft(i + G(l, k, j) + X[14] + 0x5a827999, 13);
        j = rotateLeft(j + G(i, l, k) + X[3] + 0x5a827999, 3);
        k = rotateLeft(k + G(j, i, l) + X[7] + 0x5a827999, 5);
        l = rotateLeft(l + G(k, j, i) + X[11] + 0x5a827999, 9);
        i = rotateLeft(i + G(l, k, j) + X[15] + 0x5a827999, 13);
        j = rotateLeft(j + H(i, l, k) + X[0] + 0x6ed9eba1, 3);
        k = rotateLeft(k + H(j, i, l) + X[8] + 0x6ed9eba1, 9);
        l = rotateLeft(l + H(k, j, i) + X[4] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(l, k, j) + X[12] + 0x6ed9eba1, 15);
        j = rotateLeft(j + H(i, l, k) + X[2] + 0x6ed9eba1, 3);
        k = rotateLeft(k + H(j, i, l) + X[10] + 0x6ed9eba1, 9);
        l = rotateLeft(l + H(k, j, i) + X[6] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(l, k, j) + X[14] + 0x6ed9eba1, 15);
        j = rotateLeft(j + H(i, l, k) + X[1] + 0x6ed9eba1, 3);
        k = rotateLeft(k + H(j, i, l) + X[9] + 0x6ed9eba1, 9);
        l = rotateLeft(l + H(k, j, i) + X[5] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(l, k, j) + X[13] + 0x6ed9eba1, 15);
        j = rotateLeft(j + H(i, l, k) + X[3] + 0x6ed9eba1, 3);
        k = rotateLeft(k + H(j, i, l) + X[11] + 0x6ed9eba1, 9);
        l = rotateLeft(l + H(k, j, i) + X[7] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(l, k, j) + X[15] + 0x6ed9eba1, 15);
        H1 = j + H1;
        H2 = H2 + i;
        H3 = H3 + l;
        H4 = H4 + k;
        xOff = 0;
        i = 0;
        do
        {
            if (i == X.length)
            {
                break;
            }
            X[i] = 0;
            i++;
        } while (!flag);
        if (BaseKeyGenerator.a)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            GeneralDigest.a = flag;
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
        boolean flag = GeneralDigest.a;
        super.reset();
        H1 = 0x67452301;
        H2 = 0xefcdab89;
        H3 = 0x98badcfe;
        H4 = 0x10325476;
        xOff = 0;
        int i = 0;
        do
        {
            if (i == X.length)
            {
                break;
            }
            X[i] = 0;
            i++;
        } while (!flag);
    }

    public void reset(Memoable memoable)
    {
        copyIn((MD4Digest)memoable);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ";q0".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 127;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 118;
          goto _L8
_L3:
        byte0 = 53;
          goto _L8
_L4:
        byte0 = 4;
          goto _L8
        byte0 = 55;
          goto _L8
    }
}
