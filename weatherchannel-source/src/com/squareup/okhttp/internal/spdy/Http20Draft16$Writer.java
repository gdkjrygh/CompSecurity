// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameWriter, Http20Draft16, Settings, ErrorCode

static final class maxFrameSize
    implements FrameWriter
{

    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer = new Buffer();
    private final sink hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    private void writeContinuationFrames(int i, long l)
        throws IOException
    {
        while (l > 0L) 
        {
            int j = (int)Math.min(maxFrameSize, l);
            l -= j;
            byte byte0;
            if (l == 0L)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            frameHeader(i, j, (byte)9, byte0);
            sink.write(hpackBuffer, j);
        }
    }

    public void ackSettings(Settings settings1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        settings1;
        this;
        JVM INSTR monitorexit ;
        throw settings1;
        maxFrameSize = settings1.getMaxFrameSize(maxFrameSize);
        frameHeader(0, 0, (byte)4, (byte)1);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        closed = true;
        sink.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void connectionPreface()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag = client;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        if (Http20Draft16.access$100().isLoggable(Level.FINE))
        {
            Http20Draft16.access$100().fine(String.format(">> CONNECTION %s", new Object[] {
                Http20Draft16.access$000().hex()
            }));
        }
        sink.write(Http20Draft16.access$000().toByteArray());
        sink.flush();
          goto _L1
    }

    public void data(boolean flag, int i, Buffer buffer, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        buffer;
        this;
        JVM INSTR monitorexit ;
        throw buffer;
        byte byte0;
        byte0 = 0;
        if (flag)
        {
            byte0 = (byte)1;
        }
        dataFrame(i, byte0, buffer, j);
        this;
        JVM INSTR monitorexit ;
    }

    void dataFrame(int i, byte byte0, Buffer buffer, int j)
        throws IOException
    {
        frameHeader(i, j, (byte)0, byte0);
        if (j > 0)
        {
            sink.write(buffer, j);
        }
    }

    public void flush()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    void frameHeader(int i, int j, byte byte0, byte byte1)
        throws IOException
    {
        if (Http20Draft16.access$100().isLoggable(Level.FINE))
        {
            Http20Draft16.access$100().fine(gger.formatHeader(false, i, j, byte0, byte1));
        }
        if (j > maxFrameSize)
        {
            throw Http20Draft16.access$500("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                Integer.valueOf(maxFrameSize), Integer.valueOf(j)
            });
        }
        if ((0x80000000 & i) != 0)
        {
            throw Http20Draft16.access$500("reserved bit set: %s", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            Http20Draft16.access$600(sink, j);
            sink.writeByte(byte0 & 0xff);
            sink.writeByte(byte1 & 0xff);
            sink.writeInt(0x7fffffff & i);
            return;
        }
    }

    public void goAway(int i, ErrorCode errorcode, byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        if (errorcode.httpCode == -1)
        {
            throw Http20Draft16.access$500("errorCode.httpCode == -1", new Object[0]);
        }
        frameHeader(0, abyte0.length + 8, (byte)7, (byte)0);
        sink.writeInt(i);
        sink.writeInt(errorcode.httpCode);
        if (abyte0.length > 0)
        {
            sink.write(abyte0);
        }
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void headers(int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        headers(false, i, list);
        this;
        JVM INSTR monitorexit ;
    }

    void headers(boolean flag, int i, List list)
        throws IOException
    {
        if (closed)
        {
            throw new IOException("closed");
        }
        if (hpackBuffer.size() != 0L)
        {
            throw new IllegalStateException();
        }
        hpackWriter.riteHeaders(list);
        long l = hpackBuffer.size();
        int j = (int)Math.min(maxFrameSize, l);
        byte byte0;
        byte byte1;
        if (l == (long)j)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        byte1 = byte0;
        if (flag)
        {
            byte1 = (byte)(byte0 | 1);
        }
        frameHeader(i, j, (byte)1, byte1);
        sink.write(hpackBuffer, j);
        if (l > (long)j)
        {
            writeContinuationFrames(i, l - (long)j);
        }
    }

    public int maxDataLength()
    {
        return maxFrameSize;
    }

    public void ping(boolean flag, int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        byte byte0;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        frameHeader(0, 8, (byte)6, byte0);
        sink.writeInt(i);
        sink.writeInt(j);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void pushPromise(int i, int j, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int k;
        long l;
        if (hpackBuffer.size() != 0L)
        {
            throw new IllegalStateException();
        }
        hpackWriter.riteHeaders(list);
        l = hpackBuffer.size();
        k = (int)Math.min(maxFrameSize - 4, l);
        byte byte0;
        if (l == (long)k)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        frameHeader(i, k + 4, (byte)5, byte0);
        sink.writeInt(0x7fffffff & j);
        sink.write(hpackBuffer, k);
        if (l <= (long)k)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        writeContinuationFrames(i, l - (long)k);
        this;
        JVM INSTR monitorexit ;
    }

    public void rstStream(int i, ErrorCode errorcode)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        if (errorcode.spdyRstCode == -1)
        {
            throw new IllegalArgumentException();
        }
        frameHeader(i, 4, (byte)3, (byte)0);
        sink.writeInt(errorcode.httpCode);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public void settings(Settings settings1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        settings1;
        this;
        JVM INSTR monitorexit ;
        throw settings1;
        frameHeader(0, settings1.size() * 6, (byte)4, (byte)0);
        int i = 0;
_L4:
        if (i >= 10) goto _L2; else goto _L1
_L1:
        if (settings1.isSet(i))
        {
            break MISSING_BLOCK_LABEL_105;
        }
          goto _L3
_L5:
        int j;
        sink.writeShort(j);
        sink.writeInt(settings1.get(i));
          goto _L3
_L2:
        sink.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        i++;
          goto _L4
        int k = i;
        if (k == 4)
        {
            j = 3;
        } else
        {
            j = k;
            if (k == 7)
            {
                j = 4;
            }
        }
          goto _L5
    }

    public void synReply(boolean flag, int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        headers(flag, i, list);
        this;
        JVM INSTR monitorexit ;
    }

    public void synStream(boolean flag, boolean flag1, int i, int j, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new UnsupportedOperationException();
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        if (closed)
        {
            throw new IOException("closed");
        }
        headers(flag, i, list);
        this;
        JVM INSTR monitorexit ;
    }

    public void windowUpdate(int i, long l)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (closed)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (l != 0L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw Http20Draft16.access$500("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] {
            Long.valueOf(l)
        });
        frameHeader(i, 4, (byte)8, (byte)0);
        sink.writeInt((int)l);
        sink.flush();
        this;
        JVM INSTR monitorexit ;
    }

    gger(BufferedSink bufferedsink, boolean flag)
    {
        sink = bufferedsink;
        client = flag;
        hpackWriter = new init>(hpackBuffer);
        maxFrameSize = 16384;
    }
}
