// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Referenced classes of package okio:
//            Source, Buffer, ByteString, Sink

public interface BufferedSource
    extends Source
{

    public abstract Buffer buffer();

    public abstract boolean exhausted()
        throws IOException;

    public abstract long indexOf(byte byte0)
        throws IOException;

    public abstract long indexOf(byte byte0, long l)
        throws IOException;

    public abstract long indexOfElement(ByteString bytestring)
        throws IOException;

    public abstract long indexOfElement(ByteString bytestring, long l)
        throws IOException;

    public abstract InputStream inputStream();

    public abstract int read(byte abyte0[])
        throws IOException;

    public abstract int read(byte abyte0[], int i, int j)
        throws IOException;

    public abstract long readAll(Sink sink)
        throws IOException;

    public abstract byte readByte()
        throws IOException;

    public abstract byte[] readByteArray()
        throws IOException;

    public abstract byte[] readByteArray(long l)
        throws IOException;

    public abstract ByteString readByteString()
        throws IOException;

    public abstract ByteString readByteString(long l)
        throws IOException;

    public abstract void readFully(Buffer buffer1, long l)
        throws IOException;

    public abstract void readFully(byte abyte0[])
        throws IOException;

    public abstract int readInt()
        throws IOException;

    public abstract int readIntLe()
        throws IOException;

    public abstract long readLong()
        throws IOException;

    public abstract long readLongLe()
        throws IOException;

    public abstract short readShort()
        throws IOException;

    public abstract short readShortLe()
        throws IOException;

    public abstract String readString(long l, Charset charset)
        throws IOException;

    public abstract String readString(Charset charset)
        throws IOException;

    public abstract String readUtf8()
        throws IOException;

    public abstract String readUtf8(long l)
        throws IOException;

    public abstract String readUtf8Line()
        throws IOException;

    public abstract String readUtf8LineStrict()
        throws IOException;

    public abstract boolean request(long l)
        throws IOException;

    public abstract void require(long l)
        throws IOException;

    public abstract void skip(long l)
        throws IOException;
}
