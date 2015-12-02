// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

// Referenced classes of package org.spongycastle.crypto.digests:
//            GeneralDigest, EncodableDigest

public class SHA1Digest extends GeneralDigest
    implements EncodableDigest
{

    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 0x5a827999;
    private static final int Y2 = 0x6ed9eba1;
    private static final int Y3 = 0x8f1bbcdc;
    private static final int Y4 = 0xca62c1d6;
    private static final String z;
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
        copyIn(sha1digest);
    }

    public SHA1Digest(byte abyte0[])
    {
        boolean flag = GeneralDigest.a;
        super(abyte0);
        X = new int[80];
        H1 = Pack.bigEndianToInt(abyte0, 16);
        H2 = Pack.bigEndianToInt(abyte0, 20);
        H3 = Pack.bigEndianToInt(abyte0, 24);
        H4 = Pack.bigEndianToInt(abyte0, 28);
        H5 = Pack.bigEndianToInt(abyte0, 32);
        xOff = Pack.bigEndianToInt(abyte0, 36);
        int i = 0;
        do
        {
            if (i == xOff)
            {
                break;
            }
            X[i] = Pack.bigEndianToInt(abyte0, i * 4 + 40);
            i++;
        } while (!flag);
    }

    private void copyIn(SHA1Digest sha1digest)
    {
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

    public Memoable copy()
    {
        return new SHA1Digest(this);
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
        return z;
    }

    public int getDigestSize()
    {
        return 20;
    }

    public byte[] getEncodedState()
    {
        boolean flag = GeneralDigest.a;
        byte abyte0[] = new byte[xOff * 4 + 40];
        super.populateState(abyte0);
        Pack.intToBigEndian(H1, abyte0, 16);
        Pack.intToBigEndian(H2, abyte0, 20);
        Pack.intToBigEndian(H3, abyte0, 24);
        Pack.intToBigEndian(H4, abyte0, 28);
        Pack.intToBigEndian(H5, abyte0, 32);
        Pack.intToBigEndian(xOff, abyte0, 36);
        int i = 0;
        do
        {
            if (i == xOff)
            {
                break;
            }
            Pack.intToBigEndian(X[i], abyte0, i * 4 + 40);
            i++;
        } while (!flag);
        return abyte0;
    }

    protected void processBlock()
    {
        boolean flag = GeneralDigest.a;
        int i = 16;
        do
        {
            if (i >= 80)
            {
                break;
            }
            int j = X[i - 3] ^ X[i - 8] ^ X[i - 14] ^ X[i - 16];
            X[i] = j >>> 31 | j << 1;
            i++;
        } while (!flag);
        int k = H1;
        int i1 = H2;
        i = H3;
        int l = H4;
        int j1 = H5;
        int k1 = 0;
        int j3 = 0;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        do
        {
            l1 = k1;
            i2 = j1;
            j2 = l;
            k2 = i;
            l2 = i1;
            i3 = k;
            if (j3 >= 4)
            {
                break;
            }
            i2 = f(i1, i, l);
            int ai[] = X;
            l1 = k1 + 1;
            j1 = ai[k1] + ((k << 5 | k >>> 27) + i2) + 0x5a827999 + j1;
            i1 = i1 >>> 2 | i1 << 30;
            i2 = f(k, i1, i);
            ai = X;
            k1 = l1 + 1;
            l += (j1 << 5 | j1 >>> 27) + i2 + ai[l1] + 0x5a827999;
            k = k >>> 2 | k << 30;
            i2 = f(j1, k, i1);
            ai = X;
            l1 = k1 + 1;
            i += (l << 5 | l >>> 27) + i2 + ai[k1] + 0x5a827999;
            i2 = j1 << 30 | j1 >>> 2;
            k1 = f(l, i2, k);
            ai = X;
            j1 = l1 + 1;
            l2 = i1 + ((i << 5 | i >>> 27) + k1 + ai[l1] + 0x5a827999);
            j2 = l >>> 2 | l << 30;
            l = f(i, j2, i2);
            ai = X;
            l1 = j1 + 1;
            i3 = k + (l + (l2 << 5 | l2 >>> 27) + ai[j1] + 0x5a827999);
            k2 = i >>> 2 | i << 30;
            j3++;
            k1 = l1;
            j1 = i2;
            l = j2;
            i = k2;
            i1 = l2;
            k = i3;
        } while (!flag);
        j3 = 0;
        k = i3;
        i1 = l2;
        i = k2;
        l = j2;
        j1 = i2;
        k1 = l1;
        do
        {
            l1 = k1;
            i2 = j1;
            j2 = l;
            k2 = i;
            l2 = i1;
            i3 = k;
            if (j3 >= 4)
            {
                break;
            }
            i2 = h(i1, i, l);
            int ai1[] = X;
            l1 = k1 + 1;
            j1 = ai1[k1] + ((k << 5 | k >>> 27) + i2) + 0x6ed9eba1 + j1;
            i1 = i1 >>> 2 | i1 << 30;
            i2 = h(k, i1, i);
            ai1 = X;
            k1 = l1 + 1;
            l += (j1 << 5 | j1 >>> 27) + i2 + ai1[l1] + 0x6ed9eba1;
            k = k >>> 2 | k << 30;
            i2 = h(j1, k, i1);
            ai1 = X;
            l1 = k1 + 1;
            i += (l << 5 | l >>> 27) + i2 + ai1[k1] + 0x6ed9eba1;
            i2 = j1 << 30 | j1 >>> 2;
            k1 = h(l, i2, k);
            ai1 = X;
            j1 = l1 + 1;
            l2 = i1 + ((i << 5 | i >>> 27) + k1 + ai1[l1] + 0x6ed9eba1);
            j2 = l >>> 2 | l << 30;
            l = h(i, j2, i2);
            ai1 = X;
            l1 = j1 + 1;
            i3 = k + (l + (l2 << 5 | l2 >>> 27) + ai1[j1] + 0x6ed9eba1);
            k2 = i >>> 2 | i << 30;
            j3++;
            k1 = l1;
            j1 = i2;
            l = j2;
            i = k2;
            i1 = l2;
            k = i3;
        } while (!flag);
        j3 = 0;
        k = i3;
        i1 = l2;
        i = k2;
        l = j2;
        j1 = i2;
        do
        {
            i3 = l1;
            l2 = j1;
            k2 = l;
            j2 = i;
            i2 = i1;
            k1 = k;
            if (j3 >= 4)
            {
                break;
            }
            i2 = g(i1, i, l);
            int ai2[] = X;
            k1 = l1 + 1;
            j1 = ((ai2[l1] + ((k << 5 | k >>> 27) + i2)) - 0x70e44324) + j1;
            i1 = i1 >>> 2 | i1 << 30;
            i2 = g(k, i1, i);
            ai2 = X;
            l1 = k1 + 1;
            l += ((j1 << 5 | j1 >>> 27) + i2 + ai2[k1]) - 0x70e44324;
            k = k >>> 2 | k << 30;
            i2 = g(j1, k, i1);
            ai2 = X;
            k1 = l1 + 1;
            i += ((l << 5 | l >>> 27) + i2 + ai2[l1]) - 0x70e44324;
            l2 = j1 << 30 | j1 >>> 2;
            l1 = g(l, l2, k);
            ai2 = X;
            j1 = k1 + 1;
            i2 = i1 + (((i << 5 | i >>> 27) + l1 + ai2[k1]) - 0x70e44324);
            k2 = l >>> 2 | l << 30;
            l = g(i, k2, l2);
            ai2 = X;
            i3 = j1 + 1;
            k1 = k + ((l + (i2 << 5 | i2 >>> 27) + ai2[j1]) - 0x70e44324);
            j2 = i >>> 2 | i << 30;
            j3++;
            l1 = i3;
            j1 = l2;
            l = k2;
            i = j2;
            i1 = i2;
            k = k1;
        } while (!flag);
        j1 = l2;
        l = k2;
        i = j2;
        i1 = i2;
        k = k1;
        k1 = 0;
        i2 = i3;
        do
        {
            l1 = j1;
            j2 = l;
            l2 = i;
            k2 = i1;
            i3 = k;
            if (k1 > 3)
            {
                break;
            }
            j2 = h(i1, i, l);
            int ai3[] = X;
            l1 = i2 + 1;
            j1 += (ai3[i2] + ((k << 5 | k >>> 27) + j2)) - 0x359d3e2a;
            i1 = i1 >>> 2 | i1 << 30;
            j2 = h(k, i1, i);
            ai3 = X;
            i2 = l1 + 1;
            l += ((j1 << 5 | j1 >>> 27) + j2 + ai3[l1]) - 0x359d3e2a;
            k = k >>> 2 | k << 30;
            l1 = h(j1, k, i1);
            ai3 = X;
            j2 = i2 + 1;
            i += ((l << 5 | l >>> 27) + l1 + ai3[i2]) - 0x359d3e2a;
            l1 = j1 >>> 2 | j1 << 30;
            i2 = h(l, l1, k);
            ai3 = X;
            j1 = j2 + 1;
            k2 = i1 + (((i << 5 | i >>> 27) + i2 + ai3[j2]) - 0x359d3e2a);
            j2 = l >>> 2 | l << 30;
            l = h(i, j2, l1);
            ai3 = X;
            i2 = j1 + 1;
            i3 = k + ((l + (k2 << 5 | k2 >>> 27) + ai3[j1]) - 0x359d3e2a);
            l2 = i >>> 2 | i << 30;
            k1++;
            j1 = l1;
            l = j2;
            i = l2;
            i1 = k2;
            k = i3;
        } while (!flag);
        H1 = i3 + H1;
        H2 = k2 + H2;
        H3 = l2 + H3;
        H4 = j2 + H4;
        H5 = l1 + H5;
        xOff = 0;
        i = 0;
        do
        {
            if (i >= 16)
            {
                break;
            }
            X[i] = 0;
            i++;
        } while (!flag);
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
        boolean flag = GeneralDigest.a;
        super.reset();
        H1 = 0x67452301;
        H2 = 0xefcdab89;
        H3 = 0x98badcfe;
        H4 = 0x10325476;
        H5 = 0xc3d2e1f0;
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
        memoable = (SHA1Digest)memoable;
        super.copyIn(memoable);
        copyIn(memoable);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "VF7y{".toCharArray();
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
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 74;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 5;
          goto _L8
_L3:
        byte0 = 14;
          goto _L8
_L4:
        byte0 = 118;
          goto _L8
        byte0 = 84;
          goto _L8
    }
}
