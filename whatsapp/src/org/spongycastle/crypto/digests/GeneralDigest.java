// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

public abstract class GeneralDigest
    implements ExtendedDigest, Memoable
{

    private static final int BYTE_LENGTH = 64;
    public static boolean a;
    private long byteCount;
    private final byte xBuf[];
    private int xBufOff;

    protected GeneralDigest()
    {
        xBuf = new byte[4];
        xBufOff = 0;
    }

    protected GeneralDigest(GeneralDigest generaldigest)
    {
        xBuf = new byte[4];
        copyIn(generaldigest);
    }

    protected GeneralDigest(byte abyte0[])
    {
        xBuf = new byte[4];
        System.arraycopy(abyte0, 0, xBuf, 0, xBuf.length);
        xBufOff = Pack.bigEndianToInt(abyte0, 4);
        byteCount = Pack.bigEndianToLong(abyte0, 8);
    }

    protected void copyIn(GeneralDigest generaldigest)
    {
        System.arraycopy(generaldigest.xBuf, 0, xBuf, 0, generaldigest.xBuf.length);
        xBufOff = generaldigest.xBufOff;
        byteCount = generaldigest.byteCount;
    }

    public void finish()
    {
        boolean flag = a;
        long l = byteCount;
        update((byte)-128);
        do
        {
            if (xBufOff == 0)
            {
                break;
            }
            update((byte)0);
        } while (!flag);
        processLength(l << 3);
        processBlock();
    }

    public int getByteLength()
    {
        return 64;
    }

    protected void populateState(byte abyte0[])
    {
        System.arraycopy(xBuf, 0, abyte0, 0, xBufOff);
        Pack.intToBigEndian(xBufOff, abyte0, 4);
        Pack.longToBigEndian(byteCount, abyte0, 8);
    }

    protected abstract void processBlock();

    protected abstract void processLength(long l);

    protected abstract void processWord(byte abyte0[], int i);

    public void reset()
    {
        boolean flag = a;
        byteCount = 0L;
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
        byteCount = byteCount + 1L;
    }

    public void update(byte abyte0[], int i, int j)
    {
        boolean flag = a;
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
            byteCount = byteCount + (long)xBuf.length;
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
