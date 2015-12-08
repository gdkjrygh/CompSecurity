// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

public class GMSSRandom
{

    private Digest messDigestTree;

    public GMSSRandom(Digest digest)
    {
        messDigestTree = digest;
    }

    private void addByteArrays(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        int j = 0;
        for (; i < abyte0.length; i++)
        {
            j += (abyte0[i] & 0xff) + (abyte1[i] & 0xff);
            abyte0[i] = (byte)j;
            j = (byte)(j >> 8);
        }

    }

    private void addOne(byte abyte0[])
    {
        int j = 1;
        for (int i = 0; i < abyte0.length; i++)
        {
            j += abyte0[i] & 0xff;
            abyte0[i] = (byte)j;
            j = (byte)(j >> 8);
        }

    }

    public byte[] nextSeed(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        messDigestTree.update(abyte0, 0, abyte0.length);
        abyte1 = new byte[messDigestTree.getDigestSize()];
        messDigestTree.doFinal(abyte1, 0);
        addByteArrays(abyte0, abyte1);
        addOne(abyte0);
        return abyte1;
    }
}
