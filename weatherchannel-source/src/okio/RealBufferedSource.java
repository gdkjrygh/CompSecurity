// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// Referenced classes of package okio:
//            BufferedSource, Buffer, Source, Util, 
//            Sink, ByteString, Timeout

final class RealBufferedSource
    implements BufferedSource
{

    public final Buffer buffer;
    private boolean closed;
    public final Source source;

    public RealBufferedSource(Source source1)
    {
        this(source1, new Buffer());
    }

    public RealBufferedSource(Source source1, Buffer buffer1)
    {
        if (source1 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            buffer = buffer1;
            source = source1;
            return;
        }
    }

    public Buffer buffer()
    {
        return buffer;
    }

    public void close()
        throws IOException
    {
        if (closed)
        {
            return;
        } else
        {
            closed = true;
            source.close();
            buffer.clear();
            return;
        }
    }

    public boolean exhausted()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        return buffer.exhausted() && source.read(buffer, 2048L) == -1L;
    }

    public long indexOf(byte byte0)
        throws IOException
    {
        return indexOf(byte0, 0L);
    }

    public long indexOf(byte byte0, long l)
        throws IOException
    {
        long l1;
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            l1 = l;
            if (l < buffer.size)
            {
                do
                {
                    l1 = buffer.indexOf(byte0, l1);
                    l = l1;
                    if (l1 != -1L)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    l1 = buffer.size;
                    if (source.read(buffer, 2048L) == -1L)
                    {
                        return -1L;
                    }
                } while (true);
            }
        } while (source.read(buffer, 2048L) != -1L);
        l = -1L;
_L2:
        return l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public long indexOfElement(ByteString bytestring)
        throws IOException
    {
        return indexOfElement(bytestring, 0L);
    }

    public long indexOfElement(ByteString bytestring, long l)
        throws IOException
    {
        long l1;
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        do
        {
            l1 = l;
            if (l < buffer.size)
            {
                do
                {
                    l1 = buffer.indexOfElement(bytestring, l1);
                    l = l1;
                    if (l1 != -1L)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    l1 = buffer.size;
                    if (source.read(buffer, 2048L) == -1L)
                    {
                        return -1L;
                    }
                } while (true);
            }
        } while (source.read(buffer, 2048L) != -1L);
        l = -1L;
_L2:
        return l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public InputStream inputStream()
    {
        return new InputStream() {

            final RealBufferedSource this$0;

            public int available()
                throws IOException
            {
                if (closed)
                {
                    throw new IOException("closed");
                } else
                {
                    return (int)Math.min(buffer.size, 0x7fffffffL);
                }
            }

            public void close()
                throws IOException
            {
                RealBufferedSource.this.close();
            }

            public int read()
                throws IOException
            {
                if (closed)
                {
                    throw new IOException("closed");
                }
                if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
                {
                    return -1;
                } else
                {
                    return buffer.readByte() & 0xff;
                }
            }

            public int read(byte abyte0[], int i, int j)
                throws IOException
            {
                if (closed)
                {
                    throw new IOException("closed");
                }
                Util.checkOffsetAndCount(abyte0.length, i, j);
                if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
                {
                    return -1;
                } else
                {
                    return buffer.read(abyte0, i, j);
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append(RealBufferedSource.this).append(".inputStream()").toString();
            }

            
            {
                this$0 = RealBufferedSource.this;
                super();
            }
        };
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        Util.checkOffsetAndCount(abyte0.length, i, j);
        if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
        {
            return -1;
        } else
        {
            j = (int)Math.min(j, buffer.size);
            return buffer.read(abyte0, i, j);
        }
    }

    public long read(Buffer buffer1, long l)
        throws IOException
    {
        if (buffer1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
        {
            return -1L;
        } else
        {
            l = Math.min(l, buffer.size);
            return buffer.read(buffer1, l);
        }
    }

    public long readAll(Sink sink)
        throws IOException
    {
        if (sink == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        long l = 0L;
        do
        {
            if (source.read(buffer, 2048L) == -1L)
            {
                break;
            }
            long l1 = buffer.completeSegmentByteCount();
            if (l1 > 0L)
            {
                l += l1;
                sink.write(buffer, l1);
            }
        } while (true);
        long l2 = l;
        if (buffer.size() > 0L)
        {
            l2 = l + buffer.size();
            sink.write(buffer, buffer.size());
        }
        return l2;
    }

    public byte readByte()
        throws IOException
    {
        require(1L);
        return buffer.readByte();
    }

    public byte[] readByteArray()
        throws IOException
    {
        buffer.writeAll(source);
        return buffer.readByteArray();
    }

    public byte[] readByteArray(long l)
        throws IOException
    {
        require(l);
        return buffer.readByteArray(l);
    }

    public ByteString readByteString()
        throws IOException
    {
        buffer.writeAll(source);
        return buffer.readByteString();
    }

    public ByteString readByteString(long l)
        throws IOException
    {
        require(l);
        return buffer.readByteString(l);
    }

    public void readFully(Buffer buffer1, long l)
        throws IOException
    {
        try
        {
            require(l);
        }
        catch (EOFException eofexception)
        {
            buffer1.writeAll(buffer);
            throw eofexception;
        }
        buffer.readFully(buffer1, l);
    }

    public void readFully(byte abyte0[])
        throws IOException
    {
        try
        {
            require(abyte0.length);
        }
        catch (EOFException eofexception)
        {
            int j;
            for (int i = 0; buffer.size > 0L; i += j)
            {
                j = buffer.read(abyte0, i, (int)buffer.size - i);
                if (j == -1)
                {
                    throw new AssertionError();
                }
            }

            throw eofexception;
        }
        buffer.readFully(abyte0);
    }

    public int readInt()
        throws IOException
    {
        require(4L);
        return buffer.readInt();
    }

    public int readIntLe()
        throws IOException
    {
        require(4L);
        return buffer.readIntLe();
    }

    public long readLong()
        throws IOException
    {
        require(8L);
        return buffer.readLong();
    }

    public long readLongLe()
        throws IOException
    {
        require(8L);
        return buffer.readLongLe();
    }

    public short readShort()
        throws IOException
    {
        require(2L);
        return buffer.readShort();
    }

    public short readShortLe()
        throws IOException
    {
        require(2L);
        return buffer.readShortLe();
    }

    public String readString(long l, Charset charset)
        throws IOException
    {
        require(l);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        } else
        {
            return buffer.readString(l, charset);
        }
    }

    public String readString(Charset charset)
        throws IOException
    {
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        } else
        {
            buffer.writeAll(source);
            return buffer.readString(charset);
        }
    }

    public String readUtf8()
        throws IOException
    {
        buffer.writeAll(source);
        return buffer.readUtf8();
    }

    public String readUtf8(long l)
        throws IOException
    {
        require(l);
        return buffer.readUtf8(l);
    }

    public String readUtf8Line()
        throws IOException
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            if (buffer.size != 0L)
            {
                return readUtf8(buffer.size);
            } else
            {
                return null;
            }
        } else
        {
            return buffer.readUtf8Line(l);
        }
    }

    public String readUtf8LineStrict()
        throws IOException
    {
        long l = indexOf((byte)10);
        if (l == -1L)
        {
            Buffer buffer1 = new Buffer();
            buffer.copyTo(buffer1, 0L, Math.min(32L, buffer.size()));
            throw new EOFException((new StringBuilder()).append("\\n not found: size=").append(buffer.size()).append(" content=").append(buffer1.readByteString().hex()).append("...").toString());
        } else
        {
            return buffer.readUtf8Line(l);
        }
    }

    public boolean request(long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        while (buffer.size < l) 
        {
            if (source.read(buffer, 2048L) == -1L)
            {
                return false;
            }
        }
        return true;
    }

    public void require(long l)
        throws IOException
    {
        if (!request(l))
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public void skip(long l)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
_L3:
        if (l > 0L)
        {
            if (buffer.size == 0L && source.read(buffer, 2048L) == -1L)
            {
                throw new EOFException();
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        long l1 = Math.min(l, buffer.size());
        buffer.skip(l1);
        l -= l1;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public Timeout timeout()
    {
        return source.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append("buffer(").append(source).append(")").toString();
    }

}
