// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.common.hash:
//            HashFunction, Hasher, HashCode

public final class HashingOutputStream extends FilterOutputStream
{

    private final Hasher hasher;

    public HashingOutputStream(HashFunction hashfunction, OutputStream outputstream)
    {
        super((OutputStream)Preconditions.checkNotNull(outputstream));
        hasher = (Hasher)Preconditions.checkNotNull(hashfunction.newHasher());
    }

    public void close()
        throws IOException
    {
        out.close();
    }

    public HashCode hash()
    {
        return hasher.hash();
    }

    public void write(int i)
        throws IOException
    {
        hasher.putByte((byte)i);
        out.write(i);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        hasher.putBytes(abyte0, i, j);
        out.write(abyte0, i, j);
    }
}
