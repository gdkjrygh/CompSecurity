// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.hash:
//            HashFunction, Hasher, HashCode

public final class HashingInputStream extends FilterInputStream
{

    private final Hasher hasher;

    public HashingInputStream(HashFunction hashfunction, InputStream inputstream)
    {
        super((InputStream)Preconditions.checkNotNull(inputstream));
        hasher = (Hasher)Preconditions.checkNotNull(hashfunction.newHasher());
    }

    public HashCode hash()
    {
        return hasher.hash();
    }

    public void mark(int i)
    {
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
        throws IOException
    {
        int i = in.read();
        if (i != -1)
        {
            hasher.putByte((byte)i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = in.read(abyte0, i, j);
        if (j != -1)
        {
            hasher.putBytes(abyte0, i, j);
        }
        return j;
    }

    public void reset()
        throws IOException
    {
        throw new IOException("reset not supported");
    }
}
