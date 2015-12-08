// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyStream, SpdyConnection, Settings, ErrorCode

private final class <init>
    implements Source
{

    static final boolean $assertionsDisabled;
    private boolean closed;
    private boolean finished;
    private final long maxByteCount;
    private final Buffer readBuffer;
    private final Buffer receiveBuffer;
    final SpdyStream this$0;

    private void checkNotClosed()
        throws IOException
    {
        if (closed)
        {
            throw new IOException("stream closed");
        }
        if (SpdyStream.access$800(SpdyStream.this) != null)
        {
            throw new IOException((new StringBuilder()).append("stream was reset: ").append(SpdyStream.access$800(SpdyStream.this)).toString());
        } else
        {
            return;
        }
    }

    private void waitUntilReadable()
        throws IOException
    {
        SpdyStream.access$700(SpdyStream.this).er();
        for (; readBuffer.size() == 0L && !finished && !closed && SpdyStream.access$800(SpdyStream.this) == null; SpdyStream.access$900(SpdyStream.this)) { }
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        SpdyStream.access$700(SpdyStream.this).tAndThrowIfTimedOut();
        throw exception;
        SpdyStream.access$700(SpdyStream.this).tAndThrowIfTimedOut();
        return;
    }

    public void close()
        throws IOException
    {
        synchronized (SpdyStream.this)
        {
            closed = true;
            readBuffer.clear();
            notifyAll();
        }
        SpdyStream.access$1000(SpdyStream.this);
        return;
        exception;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long read(Buffer buffer, long l)
        throws IOException
    {
label0:
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
            }
            synchronized (SpdyStream.this)
            {
                waitUntilReadable();
                checkNotClosed();
                if (readBuffer.size() != 0L)
                {
                    break label0;
                }
            }
            return -1L;
        }
        l = readBuffer.read(buffer, Math.min(l, readBuffer.size()));
        buffer = SpdyStream.this;
        buffer.unacknowledgedBytesRead = ((SpdyStream) (buffer)).unacknowledgedBytesRead + l;
        if (unacknowledgedBytesRead >= (long)(SpdyStream.access$500(SpdyStream.this).okHttpSettings.getInitialWindowSize(0x10000) / 2))
        {
            SpdyStream.access$500(SpdyStream.this).writeWindowUpdateLater(SpdyStream.access$600(SpdyStream.this), unacknowledgedBytesRead);
            unacknowledgedBytesRead = 0L;
        }
        obj;
        JVM INSTR monitorexit ;
        synchronized (SpdyStream.access$500(SpdyStream.this))
        {
            obj = SpdyStream.access$500(SpdyStream.this);
            obj.unacknowledgedBytesRead = ((SpdyConnection) (obj)).unacknowledgedBytesRead + l;
            if (SpdyStream.access$500(SpdyStream.this).unacknowledgedBytesRead >= (long)(SpdyStream.access$500(SpdyStream.this).okHttpSettings.getInitialWindowSize(0x10000) / 2))
            {
                SpdyStream.access$500(SpdyStream.this).writeWindowUpdateLater(0, SpdyStream.access$500(SpdyStream.this).unacknowledgedBytesRead);
                SpdyStream.access$500(SpdyStream.this).unacknowledgedBytesRead = 0L;
            }
        }
        return l;
        obj;
        buffer;
        JVM INSTR monitorexit ;
        throw obj;
        buffer;
        obj;
        JVM INSTR monitorexit ;
        throw buffer;
    }

    void receive(BufferedSource bufferedsource, long l)
        throws IOException
    {
        long l1;
        l1 = l;
        if (!$assertionsDisabled)
        {
            l1 = l;
            if (Thread.holdsLock(SpdyStream.this))
            {
                throw new AssertionError();
            }
        }
          goto _L1
_L3:
        l1 -= l;
        SpdyStream spdystream = SpdyStream.this;
        spdystream;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        if (readBuffer.size() == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        readBuffer.writeAll(receiveBuffer);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        notifyAll();
        spdystream;
        JVM INSTR monitorexit ;
_L1:
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        spdystream = SpdyStream.this;
        spdystream;
        JVM INSTR monitorenter ;
        flag1 = finished;
        if (readBuffer.size() + l1 > maxByteCount)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        spdystream;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        bufferedsource.skip(l1);
        closeLater(ErrorCode.FLOW_CONTROL_ERROR);
        return;
        bufferedsource;
        spdystream;
        JVM INSTR monitorexit ;
        throw bufferedsource;
        if (flag1)
        {
            bufferedsource.skip(l1);
            return;
        }
        l = bufferedsource.read(receiveBuffer, l1);
        if (l != -1L) goto _L3; else goto _L2
_L2:
        throw new EOFException();
        bufferedsource;
        spdystream;
        JVM INSTR monitorexit ;
        throw bufferedsource;
    }

    public Timeout timeout()
    {
        return SpdyStream.access$700(SpdyStream.this);
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/spdy/SpdyStream.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



/*
    static boolean access$102(A a, boolean flag)
    {
        a.finished = flag;
        return flag;
    }

*/


    private finished(long l)
    {
        this$0 = SpdyStream.this;
        super();
        receiveBuffer = new Buffer();
        readBuffer = new Buffer();
        maxByteCount = l;
    }

    maxByteCount(long l, maxByteCount maxbytecount)
    {
        this(l);
    }
}
