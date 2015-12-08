// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

public abstract class GeneralDigest
    implements ExtendedDigest
{

    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    private byte xBuf[];
    private int xBufOff;

    protected GeneralDigest()
    {
        xBuf = new byte[4];
        xBufOff = 0;
    }

    protected GeneralDigest(GeneralDigest generaldigest)
    {
        xBuf = new byte[generaldigest.xBuf.length];
        System.arraycopy(generaldigest.xBuf, 0, xBuf, 0, generaldigest.xBuf.length);
        xBufOff = generaldigest.xBufOff;
        byteCount = generaldigest.byteCount;
    }

    public void finish()
    {
        long l = byteCount;
        update((byte)-128);
        while (xBufOff != 0) 
        {
            update((byte)0);
        }
        processLength(l << 3);
        processBlock();
    }

    public int getByteLength()
    {
        return 64;
    }

    protected abstract void processBlock();

    protected abstract void processLength(long l);

    protected abstract void processWord(byte abyte0[], int i);

    public void reset()
    {
        byteCount = 0L;
        xBufOff = 0;
        for (int i = 0; i < xBuf.length; i++)
        {
            xBuf[i] = 0;
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
        byteCount = byteCount + 1L;
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
            byteCount = byteCount + (long)xBuf.length;
        } while (true);
        for (; l > 0; l--)
        {
            update(abyte0[k]);
            k++;
        }

    }
}
