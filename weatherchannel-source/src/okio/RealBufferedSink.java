// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// Referenced classes of package okio:
//            BufferedSink, Buffer, Sink, Util, 
//            Source, Timeout, ByteString

final class RealBufferedSink
    implements BufferedSink
{

    public final Buffer buffer;
    private boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink1)
    {
        this(sink1, new Buffer());
    }

    public RealBufferedSink(Sink sink1, Buffer buffer1)
    {
        if (sink1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            buffer = buffer1;
            sink = sink1;
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
        if (!closed) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Throwable throwable;
        Throwable throwable1;
        throwable1 = null;
        throwable = throwable1;
        if (buffer.size <= 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        sink.write(buffer, buffer.size);
        throwable = throwable1;
_L3:
        sink.close();
        throwable1 = throwable;
_L4:
        closed = true;
        if (throwable1 != null)
        {
            Util.sneakyRethrow(throwable1);
            return;
        }
          goto _L1
        throwable;
          goto _L3
        Throwable throwable2;
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L4
    }

    public BufferedSink emit()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        long l = buffer.size();
        if (l > 0L)
        {
            sink.write(buffer, l);
        }
        return this;
    }

    public BufferedSink emitCompleteSegments()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        long l = buffer.completeSegmentByteCount();
        if (l > 0L)
        {
            sink.write(buffer, l);
        }
        return this;
    }

    public void flush()
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        }
        if (buffer.size > 0L)
        {
            sink.write(buffer, buffer.size);
        }
        sink.flush();
    }

    public OutputStream outputStream()
    {
        return new OutputStream() {

            final RealBufferedSink this$0;

            public void close()
                throws IOException
            {
                RealBufferedSink.this.close();
            }

            public void flush()
                throws IOException
            {
                if (!closed)
                {
                    RealBufferedSink.this.flush();
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append(RealBufferedSink.this).append(".outputStream()").toString();
            }

            public void write(int i)
                throws IOException
            {
                if (closed)
                {
                    throw new IOException("closed");
                } else
                {
                    buffer.writeByte((byte)i);
                    emitCompleteSegments();
                    return;
                }
            }

            public void write(byte abyte0[], int i, int j)
                throws IOException
            {
                if (closed)
                {
                    throw new IOException("closed");
                } else
                {
                    buffer.write(abyte0, i, j);
                    emitCompleteSegments();
                    return;
                }
            }

            
            {
                this$0 = RealBufferedSink.this;
                super();
            }
        };
    }

    public Timeout timeout()
    {
        return sink.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append("buffer(").append(sink).append(")").toString();
    }

    public BufferedSink write(ByteString bytestring)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(bytestring);
            return emitCompleteSegments();
        }
    }

    public BufferedSink write(Source source, long l)
        throws IOException
    {
        if (l > 0L)
        {
            source.read(buffer, l);
        }
        return this;
    }

    public BufferedSink write(byte abyte0[])
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(abyte0);
            return emitCompleteSegments();
        }
    }

    public BufferedSink write(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(abyte0, i, j);
            return emitCompleteSegments();
        }
    }

    public void write(Buffer buffer1, long l)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.write(buffer1, l);
            emitCompleteSegments();
            return;
        }
    }

    public long writeAll(Source source)
        throws IOException
    {
        if (source == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l = 0L;
        do
        {
            long l1 = source.read(buffer, 2048L);
            if (l1 != -1L)
            {
                l += l1;
                emitCompleteSegments();
            } else
            {
                return l;
            }
        } while (true);
    }

    public BufferedSink writeByte(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeByte(i);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeInt(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeInt(i);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeIntLe(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeIntLe(i);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeLong(long l)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeLong(l);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeLongLe(long l)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeLongLe(l);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeShort(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeShort(i);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeShortLe(int i)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeShortLe(i);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeString(String s, Charset charset)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeString(s, charset);
            return emitCompleteSegments();
        }
    }

    public BufferedSink writeUtf8(String s)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("closed");
        } else
        {
            buffer.writeUtf8(s);
            return emitCompleteSegments();
        }
    }

}
