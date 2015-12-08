// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// Referenced classes of package okio:
//            Sink, Buffer, ByteString, Source

public interface BufferedSink
    extends Sink
{

    public abstract Buffer buffer();

    public abstract BufferedSink emit()
        throws IOException;

    public abstract BufferedSink emitCompleteSegments()
        throws IOException;

    public abstract OutputStream outputStream();

    public abstract BufferedSink write(ByteString bytestring)
        throws IOException;

    public abstract BufferedSink write(Source source, long l)
        throws IOException;

    public abstract BufferedSink write(byte abyte0[])
        throws IOException;

    public abstract BufferedSink write(byte abyte0[], int i, int j)
        throws IOException;

    public abstract long writeAll(Source source)
        throws IOException;

    public abstract BufferedSink writeByte(int i)
        throws IOException;

    public abstract BufferedSink writeInt(int i)
        throws IOException;

    public abstract BufferedSink writeIntLe(int i)
        throws IOException;

    public abstract BufferedSink writeLong(long l)
        throws IOException;

    public abstract BufferedSink writeLongLe(long l)
        throws IOException;

    public abstract BufferedSink writeShort(int i)
        throws IOException;

    public abstract BufferedSink writeShortLe(int i)
        throws IOException;

    public abstract BufferedSink writeString(String s, Charset charset)
        throws IOException;

    public abstract BufferedSink writeUtf8(String s)
        throws IOException;
}
