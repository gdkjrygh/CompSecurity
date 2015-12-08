// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.util.Pack;

public abstract class LongDigest
    implements ExtendedDigest
{

    private static final int BYTE_LENGTH = 128;
    static final long K[] = {
        0x428a2f98d728ae22L, 0x7137449123ef65cdL, 0xb5c0fbcfec4d3b2fL, 0xe9b5dba58189dbbcL, 0x3956c25bf348b538L, 0x59f111f1b605d019L, 0x923f82a4af194f9bL, 0xab1c5ed5da6d8118L, 0xd807aa98a3030242L, 0x12835b0145706fbeL, 
        0x243185be4ee4b28cL, 0x550c7dc3d5ffb4e2L, 0x72be5d74f27b896fL, 0x80deb1fe3b1696b1L, 0x9bdc06a725c71235L, 0xc19bf174cf692694L, 0xe49b69c19ef14ad2L, 0xefbe4786384f25e3L, 0xfc19dc68b8cd5b5L, 0x240ca1cc77ac9c65L, 
        0x2de92c6f592b0275L, 0x4a7484aa6ea6e483L, 0x5cb0a9dcbd41fbd4L, 0x76f988da831153b5L, 0x983e5152ee66dfabL, 0xa831c66d2db43210L, 0xb00327c898fb213fL, 0xbf597fc7beef0ee4L, 0xc6e00bf33da88fc2L, 0xd5a79147930aa725L, 
        0x6ca6351e003826fL, 0x142929670a0e6e70L, 0x27b70a8546d22ffcL, 0x2e1b21385c26c926L, 0x4d2c6dfc5ac42aedL, 0x53380d139d95b3dfL, 0x650a73548baf63deL, 0x766a0abb3c77b2a8L, 0x81c2c92e47edaee6L, 0x92722c851482353bL, 
        0xa2bfe8a14cf10364L, 0xa81a664bbc423001L, 0xc24b8b70d0f89791L, 0xc76c51a30654be30L, 0xd192e819d6ef5218L, 0xd69906245565a910L, 0xf40e35855771202aL, 0x106aa07032bbd1b8L, 0x19a4c116b8d2d0c8L, 0x1e376c085141ab53L, 
        0x2748774cdf8eeb99L, 0x34b0bcb5e19b48a8L, 0x391c0cb3c5c95a63L, 0x4ed8aa4ae3418acbL, 0x5b9cca4f7763e373L, 0x682e6ff3d6b2b8a3L, 0x748f82ee5defb2fcL, 0x78a5636f43172f60L, 0x84c87814a1f0ab72L, 0x8cc702081a6439ecL, 
        0x90befffa23631e28L, 0xa4506cebde82bde9L, 0xbef9a3f7b2c67915L, 0xc67178f2e372532bL, 0xca273eceea26619cL, 0xd186b8c721c0c207L, 0xeada7dd6cde0eb1eL, 0xf57d4f7fee6ed178L, 0x6f067aa72176fbaL, 0xa637dc5a2c898a6L, 
        0x113f9804bef90daeL, 0x1b710b35131c471bL, 0x28db77f523047d84L, 0x32caab7b40c72493L, 0x3c9ebe0a15c9bebcL, 0x431d67c49c100d4cL, 0x4cc5d4becb3e42b6L, 0x597f299cfc657e2aL, 0x5fcb6fab3ad6faecL, 0x6c44198c4a475817L
    };
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private long W[];
    private long byteCount1;
    private long byteCount2;
    private int wOff;
    private byte xBuf[];
    private int xBufOff;

    protected LongDigest()
    {
        W = new long[80];
        xBuf = new byte[8];
        xBufOff = 0;
        reset();
    }

    protected LongDigest(LongDigest longdigest)
    {
        W = new long[80];
        xBuf = new byte[longdigest.xBuf.length];
        System.arraycopy(longdigest.xBuf, 0, xBuf, 0, longdigest.xBuf.length);
        xBufOff = longdigest.xBufOff;
        byteCount1 = longdigest.byteCount1;
        byteCount2 = longdigest.byteCount2;
        H1 = longdigest.H1;
        H2 = longdigest.H2;
        H3 = longdigest.H3;
        H4 = longdigest.H4;
        H5 = longdigest.H5;
        H6 = longdigest.H6;
        H7 = longdigest.H7;
        H8 = longdigest.H8;
        System.arraycopy(longdigest.W, 0, W, 0, longdigest.W.length);
        wOff = longdigest.wOff;
    }

    private long Ch(long l, long l1, long l2)
    {
        return l & l1 ^ (-1L ^ l) & l2;
    }

    private long Maj(long l, long l1, long l2)
    {
        return l & l1 ^ l & l2 ^ l1 & l2;
    }

    private long Sigma0(long l)
    {
        return (l << 63 | l >>> 1) ^ (l << 56 | l >>> 8) ^ l >>> 7;
    }

    private long Sigma1(long l)
    {
        return (l << 45 | l >>> 19) ^ (l << 3 | l >>> 61) ^ l >>> 6;
    }

    private long Sum0(long l)
    {
        return (l << 36 | l >>> 28) ^ (l << 30 | l >>> 34) ^ (l << 25 | l >>> 39);
    }

    private long Sum1(long l)
    {
        return (l << 50 | l >>> 14) ^ (l << 46 | l >>> 18) ^ (l << 23 | l >>> 41);
    }

    private void adjustByteCounts()
    {
        if (byteCount1 > 0x1fffffffffffffffL)
        {
            byteCount2 = byteCount2 + (byteCount1 >>> 61);
            byteCount1 = byteCount1 & 0x1fffffffffffffffL;
        }
    }

    public void finish()
    {
        adjustByteCounts();
        long l = byteCount1;
        long l1 = byteCount2;
        update((byte)-128);
        while (xBufOff != 0) 
        {
            update((byte)0);
        }
        processLength(l << 3, l1);
        processBlock();
    }

    public int getByteLength()
    {
        return 128;
    }

    protected void processBlock()
    {
        adjustByteCounts();
        for (int i = 16; i <= 79; i++)
        {
            W[i] = Sigma1(W[i - 2]) + W[i - 7] + Sigma0(W[i - 15]) + W[i - 16];
        }

        long l1 = H1;
        long l3 = H2;
        long l5 = H3;
        long l7 = H4;
        long l2 = H5;
        long l4 = H6;
        long l6 = H7;
        long l8 = H8;
        int j = 0;
        int l = 0;
        while (j < 10) 
        {
            long l9 = Sum1(l2);
            long l10 = Ch(l2, l4, l6);
            long l11 = K[l];
            long al[] = W;
            int i1 = l + 1;
            l8 += al[l] + (l9 + l10 + l11);
            l7 += l8;
            l9 = Sum0(l1);
            l8 = Maj(l1, l3, l5) + l9 + l8;
            l9 = Sum1(l7);
            l10 = Ch(l7, l2, l4);
            l11 = K[i1];
            al = W;
            l = i1 + 1;
            l6 += l10 + l9 + l11 + al[i1];
            l5 += l6;
            l9 = Sum0(l8);
            l6 = Maj(l8, l1, l3) + l9 + l6;
            l9 = Sum1(l5);
            l10 = Ch(l5, l7, l2);
            l11 = K[l];
            al = W;
            i1 = l + 1;
            l4 += l10 + l9 + l11 + al[l];
            l3 += l4;
            l9 = Sum0(l6);
            l4 = Maj(l6, l8, l1) + l9 + l4;
            l9 = Sum1(l3);
            l10 = Ch(l3, l5, l7);
            l11 = K[i1];
            al = W;
            l = i1 + 1;
            l2 += l10 + l9 + l11 + al[i1];
            l1 += l2;
            l9 = Sum0(l4);
            l2 = Maj(l4, l6, l8) + l9 + l2;
            l9 = Sum1(l1);
            l10 = Ch(l1, l3, l5);
            l11 = K[l];
            al = W;
            i1 = l + 1;
            l9 = l7 + (l10 + l9 + l11 + al[l]);
            l7 = l8 + l9;
            l9 += Sum0(l2) + Maj(l2, l4, l6);
            l8 = Sum1(l7);
            l10 = Ch(l7, l1, l3);
            l11 = K[i1];
            al = W;
            l = i1 + 1;
            l5 += l10 + l8 + l11 + al[i1];
            l6 += l5;
            l5 += Sum0(l9) + Maj(l9, l2, l4);
            l8 = Sum1(l6);
            l10 = Ch(l6, l7, l1);
            l11 = K[l];
            al = W;
            i1 = l + 1;
            l3 += l10 + l8 + l11 + al[l];
            l4 += l3;
            l3 += Sum0(l5) + Maj(l5, l9, l2);
            l8 = Sum1(l4);
            l1 = Ch(l4, l6, l7) + l8 + K[i1] + W[i1] + l1;
            l2 += l1;
            l8 = Sum0(l3);
            l10 = Maj(l3, l5, l9);
            j++;
            l1 += l10 + l8;
            l = i1 + 1;
            l8 = l7;
            l7 = l9;
        }
        H1 = H1 + l1;
        H2 = H2 + l3;
        H3 = H3 + l5;
        H4 = H4 + l7;
        H5 = H5 + l2;
        H6 = H6 + l4;
        H7 = H7 + l6;
        H8 = H8 + l8;
        wOff = 0;
        for (int k = 0; k < 16; k++)
        {
            W[k] = 0L;
        }

    }

    protected void processLength(long l, long l1)
    {
        if (wOff > 14)
        {
            processBlock();
        }
        W[14] = l1;
        W[15] = l;
    }

    protected void processWord(byte abyte0[], int i)
    {
        W[wOff] = Pack.bigEndianToLong(abyte0, i);
        i = wOff + 1;
        wOff = i;
        if (i == 16)
        {
            processBlock();
        }
    }

    public void reset()
    {
        boolean flag = false;
        byteCount1 = 0L;
        byteCount2 = 0L;
        xBufOff = 0;
        for (int i = 0; i < xBuf.length; i++)
        {
            xBuf[i] = 0;
        }

        wOff = 0;
        for (int j = ((flag) ? 1 : 0); j != W.length; j++)
        {
            W[j] = 0L;
        }

    }

    public void update(byte byte0)
    {
        byte abyte0[] = xBuf;
        int i = xBufOff;
        xBufOff = i + 1;
        abyte0[i] = byte0;
        if (xBufOff == xBuf.length)
        {
            processWord(xBuf, 0);
            xBufOff = 0;
        }
        byteCount1 = byteCount1 + 1L;
    }

    public void update(byte abyte0[], int i, int j)
    {
        int k = j;
        int l = i;
        do
        {
            i = l;
            j = k;
            if (xBufOff == 0)
            {
                break;
            }
            i = l;
            j = k;
            if (k <= 0)
            {
                break;
            }
            update(abyte0[l]);
            l++;
            k--;
        } while (true);
        do
        {
            k = i;
            l = j;
            if (j <= xBuf.length)
            {
                break;
            }
            processWord(abyte0, i);
            i += xBuf.length;
            j -= xBuf.length;
            byteCount1 = byteCount1 + (long)xBuf.length;
        } while (true);
        for (; l > 0; l--)
        {
            update(abyte0[k]);
            k++;
        }

    }

}
