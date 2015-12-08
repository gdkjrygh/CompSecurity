// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            HashCode

private static final class hash extends HashCode
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final int hash;

    public byte[] asBytes()
    {
        return (new byte[] {
            (byte)hash, (byte)(hash >> 8), (byte)(hash >> 16), (byte)(hash >> 24)
        });
    }

    public int asInt()
    {
        return hash;
    }

    public long asLong()
    {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    public int bits()
    {
        return 32;
    }

    boolean equalsSameBits(HashCode hashcode)
    {
        return hash == hashcode.asInt();
    }

    public long padToLong()
    {
        return UnsignedInts.toLong(hash);
    }

    void writeBytesToImpl(byte abyte0[], int i, int j)
    {
        for (int k = 0; k < j; k++)
        {
            abyte0[i + k] = (byte)(hash >> k * 8);
        }

    }

    (int i)
    {
        hash = i;
    }
}
