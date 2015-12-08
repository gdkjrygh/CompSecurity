// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.common.io:
//            ByteSource, ByteProcessor, BaseEncoding

private static class bytes extends ByteSource
{

    protected final byte bytes[];

    public long copyTo(OutputStream outputstream)
        throws IOException
    {
        outputstream.write(bytes);
        return (long)bytes.length;
    }

    public HashCode hash(HashFunction hashfunction)
        throws IOException
    {
        return hashfunction.hashBytes(bytes);
    }

    public boolean isEmpty()
    {
        return bytes.length == 0;
    }

    public InputStream openBufferedStream()
        throws IOException
    {
        return openStream();
    }

    public InputStream openStream()
    {
        return new ByteArrayInputStream(bytes);
    }

    public Object read(ByteProcessor byteprocessor)
        throws IOException
    {
        byteprocessor.processBytes(bytes, 0, bytes.length);
        return byteprocessor.getResult();
    }

    public byte[] read()
    {
        return (byte[])bytes.clone();
    }

    public long size()
    {
        return (long)bytes.length;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(Ascii.truncate(BaseEncoding.base16().encode(bytes), 30, "...")));
        return (new StringBuilder(s.length() + 17)).append("ByteSource.wrap(").append(s).append(")").toString();
    }

    protected _cls9(byte abyte0[])
    {
        bytes = (byte[])Preconditions.checkNotNull(abyte0);
    }
}
