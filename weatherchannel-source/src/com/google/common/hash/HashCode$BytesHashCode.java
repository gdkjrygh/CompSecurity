// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.security.MessageDigest;

// Referenced classes of package com.google.common.hash:
//            HashCode

private static final class ull extends HashCode
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final byte bytes[];

    public byte[] asBytes()
    {
        return (byte[])bytes.clone();
    }

    public int asInt()
    {
        boolean flag;
        if (bytes.length >= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[] {
            Integer.valueOf(bytes.length)
        });
        return bytes[0] & 0xff | (bytes[1] & 0xff) << 8 | (bytes[2] & 0xff) << 16 | (bytes[3] & 0xff) << 24;
    }

    public long asLong()
    {
        boolean flag;
        if (bytes.length >= 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", new Object[] {
            Integer.valueOf(bytes.length)
        });
        return padToLong();
    }

    public int bits()
    {
        return bytes.length * 8;
    }

    boolean equalsSameBits(HashCode hashcode)
    {
        return MessageDigest.isEqual(bytes, hashcode.getBytesInternal());
    }

    byte[] getBytesInternal()
    {
        return bytes;
    }

    public long padToLong()
    {
        long l = bytes[0] & 0xff;
        for (int i = 1; i < Math.min(bytes.length, 8); i++)
        {
            l |= ((long)bytes[i] & 255L) << i * 8;
        }

        return l;
    }

    void writeBytesToImpl(byte abyte0[], int i, int j)
    {
        System.arraycopy(bytes, 0, abyte0, i, j);
    }

    (byte abyte0[])
    {
        bytes = (byte[])Preconditions.checkNotNull(abyte0);
    }
}
