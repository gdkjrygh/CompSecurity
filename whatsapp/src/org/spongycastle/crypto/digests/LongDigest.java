// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

// Referenced classes of package org.spongycastle.crypto.digests:
//            EncodableDigest, GeneralDigest

public abstract class LongDigest
    implements ExtendedDigest, Memoable, EncodableDigest
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
        xBuf = new byte[8];
        W = new long[80];
        xBufOff = 0;
        reset();
    }

    protected LongDigest(LongDigest longdigest)
    {
        xBuf = new byte[8];
        W = new long[80];
        copyIn(longdigest);
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

    protected void copyIn(LongDigest longdigest)
    {
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

    public void finish()
    {
        boolean flag = GeneralDigest.a;
        adjustByteCounts();
        long l = byteCount1;
        long l1 = byteCount2;
        update((byte)-128);
        do
        {
            if (xBufOff == 0)
            {
                break;
            }
            update((byte)0);
        } while (!flag);
        processLength(l << 3, l1);
        processBlock();
    }

    public int getByteLength()
    {
        return 128;
    }

    protected int getEncodedStateSize()
    {
        return wOff * 8 + 96;
    }

    protected void populateState(byte abyte0[])
    {
        int i = 0;
        boolean flag = GeneralDigest.a;
        System.arraycopy(xBuf, 0, abyte0, 0, xBufOff);
        Pack.intToBigEndian(xBufOff, abyte0, 8);
        Pack.longToBigEndian(byteCount1, abyte0, 12);
        Pack.longToBigEndian(byteCount2, abyte0, 20);
        Pack.longToBigEndian(H1, abyte0, 28);
        Pack.longToBigEndian(H2, abyte0, 36);
        Pack.longToBigEndian(H3, abyte0, 44);
        Pack.longToBigEndian(H4, abyte0, 52);
        Pack.longToBigEndian(H5, abyte0, 60);
        Pack.longToBigEndian(H6, abyte0, 68);
        Pack.longToBigEndian(H7, abyte0, 76);
        Pack.longToBigEndian(H8, abyte0, 84);
        Pack.intToBigEndian(wOff, abyte0, 92);
        do
        {
            if (i >= wOff)
            {
                break;
            }
            Pack.longToBigEndian(W[i], abyte0, i * 8 + 96);
            i++;
        } while (!flag);
    }

    protected void processBlock()
    {
        int i;
        int j;
        long l;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        boolean flag;
        flag = GeneralDigest.a;
        adjustByteCounts();
        i = 16;
        do
        {
            if (i > 79)
            {
                break;
            }
            W[i] = Sigma1(W[i - 2]) + W[i - 7] + Sigma0(W[i - 15]) + W[i - 16];
            i++;
        } while (!flag);
        l1 = H1;
        l3 = H2;
        l6 = H3;
        l4 = H4;
        l = H5;
        l2 = H6;
        l5 = H7;
        l7 = H8;
        i = 0;
        j = 0;
_L3:
        int k;
        long l8;
        if (i >= 10)
        {
            break MISSING_BLOCK_LABEL_997;
        }
        l8 = Sum1(l);
        long l9 = Ch(l, l2, l5);
        long l11 = K[j];
        long al[] = W;
        k = j + 1;
        l7 = al[j] + (l8 + l9 + l11) + l7;
        l4 += l7;
        l8 = Sum0(l1);
        l7 = Maj(l1, l3, l6) + l8 + l7;
        l8 = Sum1(l4);
        l9 = Ch(l4, l, l2);
        l11 = K[k];
        al = W;
        j = k + 1;
        l8 = l8 + l9 + l11 + al[k] + l5;
        l5 = l6 + l8;
        l6 = Sum0(l7);
        l6 = Maj(l7, l1, l3) + l6 + l8;
        l8 = Sum1(l5);
        l9 = Ch(l5, l4, l);
        l11 = K[j];
        al = W;
        k = j + 1;
        l8 = l8 + l9 + l11 + al[j] + l2;
        l2 = l3 + l8;
        l3 = Sum0(l6);
        l3 = Maj(l6, l7, l1) + l3 + l8;
        l8 = Sum1(l2);
        l9 = Ch(l2, l5, l4);
        l11 = K[k];
        al = W;
        j = k + 1;
        l = l8 + l9 + l11 + al[k] + l;
        l9 = l1 + l;
        l1 = Sum0(l3);
        l11 = Maj(l3, l6, l7) + l1 + l;
        l = Sum1(l9);
        l1 = Ch(l9, l2, l5);
        l8 = K[j];
        al = W;
        k = j + 1;
        l1 = l4 + (l + l1 + l8 + al[j]);
        l = l7 + l1;
        l4 = Sum0(l11);
        l4 = l1 + (Maj(l11, l3, l6) + l4);
        l1 = Sum1(l);
        l7 = Ch(l, l9, l2);
        l8 = K[k];
        al = W;
        j = k + 1;
        l5 = l1 + l7 + l8 + al[k] + l5;
        l1 = l6 + l5;
        l5 += Sum0(l4) + Maj(l4, l11, l3);
        l6 = Sum1(l1);
        l7 = Ch(l1, l, l9);
        l8 = K[j];
        al = W;
        k = j + 1;
        l6 = l6 + l7 + l8 + al[j] + l2;
        l2 = l3 + l6;
        l8 = l6 + (Sum0(l5) + Maj(l5, l4, l11));
        l6 = Sum1(l2) + Ch(l2, l1, l) + K[k] + W[k] + l9;
        l3 = l11 + l6;
        l7 = Sum0(l8);
        l6 += Maj(l8, l5, l4) + l7;
        if (!flag) goto _L2; else goto _L1
_L1:
        long l10;
        l10 = l5;
        l7 = l;
        l5 = l1;
        l = l3;
        l1 = l6;
_L4:
        H1 = l1 + H1;
        H2 = H2 + l8;
        H3 = H3 + l10;
        H4 = H4 + l4;
        H5 = H5 + l;
        H6 = H6 + l2;
        H7 = H7 + l5;
        H8 = H8 + l7;
        wOff = 0;
        i = 0;
        do
        {
            if (i >= 16)
            {
                break;
            }
            W[i] = 0L;
            i++;
        } while (!flag);
        return;
_L2:
        i++;
        l10 = l5;
        l7 = l;
        j = k + 1;
        l = l3;
        l5 = l1;
        l1 = l6;
        l3 = l8;
        l6 = l10;
          goto _L3
        l8 = l3;
        l10 = l6;
          goto _L4
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
        boolean flag1 = GeneralDigest.a;
        byteCount1 = 0L;
        byteCount2 = 0L;
        xBufOff = 0;
        int i = 0;
        do
        {
            if (i >= xBuf.length)
            {
                break;
            }
            xBuf[i] = 0;
            i++;
        } while (!flag1);
        wOff = 0;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i == W.length)
            {
                break;
            }
            W[i] = 0L;
            i++;
        } while (!flag1);
    }

    protected void restoreState(byte abyte0[])
    {
        int i = 0;
        boolean flag = GeneralDigest.a;
        xBufOff = Pack.bigEndianToInt(abyte0, 8);
        System.arraycopy(abyte0, 0, xBuf, 0, xBufOff);
        byteCount1 = Pack.bigEndianToLong(abyte0, 12);
        byteCount2 = Pack.bigEndianToLong(abyte0, 20);
        H1 = Pack.bigEndianToLong(abyte0, 28);
        H2 = Pack.bigEndianToLong(abyte0, 36);
        H3 = Pack.bigEndianToLong(abyte0, 44);
        H4 = Pack.bigEndianToLong(abyte0, 52);
        H5 = Pack.bigEndianToLong(abyte0, 60);
        H6 = Pack.bigEndianToLong(abyte0, 68);
        H7 = Pack.bigEndianToLong(abyte0, 76);
        H8 = Pack.bigEndianToLong(abyte0, 84);
        wOff = Pack.bigEndianToInt(abyte0, 92);
        do
        {
            if (i >= wOff)
            {
                break;
            }
            W[i] = Pack.bigEndianToLong(abyte0, i * 8 + 96);
            i++;
        } while (!flag);
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
        boolean flag = GeneralDigest.a;
        int k = j;
        int l = i;
        do
        {
            j = l;
            i = k;
            if (xBufOff == 0)
            {
                break;
            }
            j = l;
            i = k;
            if (k <= 0)
            {
                break;
            }
            update(abyte0[l]);
            j = l + 1;
            i = k - 1;
            l = j;
            k = i;
        } while (!flag);
        do
        {
            l = j;
            k = i;
            if (i <= xBuf.length)
            {
                break;
            }
            processWord(abyte0, j);
            l = j + xBuf.length;
            k = i - xBuf.length;
            byteCount1 = byteCount1 + (long)xBuf.length;
            j = l;
            i = k;
        } while (!flag);
        do
        {
            if (k <= 0)
            {
                break;
            }
            update(abyte0[l]);
            l++;
            k--;
        } while (!flag);
    }

}
