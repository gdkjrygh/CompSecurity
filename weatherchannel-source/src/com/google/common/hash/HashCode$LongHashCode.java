// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            HashCode

private static final class hash extends HashCode
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final long hash;

    public byte[] asBytes()
    {
        return (new byte[] {
            (byte)(int)hash, (byte)(int)(hash >> 8), (byte)(int)(hash >> 16), (byte)(int)(hash >> 24), (byte)(int)(hash >> 32), (byte)(int)(hash >> 40), (byte)(int)(hash >> 48), (byte)(int)(hash >> 56)
        });
    }

    public int asInt()
    {
        return (int)hash;
    }

    public long asLong()
    {
        return hash;
    }

    public int bits()
    {
        return 64;
    }

    boolean equalsSameBits(HashCode hashcode)
    {
        return hash == hashcode.asLong();
    }

    public long padToLong()
    {
        return hash;
    }

    void writeBytesToImpl(byte abyte0[], int i, int j)
    {
        for (int k = 0; k < j; k++)
        {
            abyte0[i + k] = (byte)(int)(hash >> k * 8);
        }

    }

    (long l)
    {
        hash = l;
    }
}
