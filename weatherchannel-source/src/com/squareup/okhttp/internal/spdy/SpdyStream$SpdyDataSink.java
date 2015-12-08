// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyStream, SpdyConnection

final class this._cls0
    implements Sink
{

    static final boolean $assertionsDisabled;
    private boolean closed;
    private boolean finished;
    final SpdyStream this$0;

    public void close()
        throws IOException
    {
label0:
        {
            if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
            {
                throw new AssertionError();
            }
            synchronized (SpdyStream.this)
            {
                if (!closed)
                {
                    break label0;
                }
            }
            return;
        }
        spdystream;
        JVM INSTR monitorexit ;
        if (!sink.finished)
        {
            SpdyStream.access$500(SpdyStream.this).writeData(SpdyStream.access$600(SpdyStream.this), true, null, 0L);
        }
        synchronized (SpdyStream.this)
        {
            closed = true;
        }
        SpdyStream.access$500(SpdyStream.this).flush();
        SpdyStream.access$1000(SpdyStream.this);
        return;
        exception;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void flush()
        throws IOException
    {
        if (!$assertionsDisabled && Thread.holdsLock(SpdyStream.this))
        {
            throw new AssertionError();
        }
        synchronized (SpdyStream.this)
        {
            SpdyStream.access$1200(SpdyStream.this);
        }
        SpdyStream.access$500(SpdyStream.this).flush();
        return;
        exception;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Timeout timeout()
    {
        return SpdyStream.access$1100(SpdyStream.this);
    }

    public void write(Buffer buffer, long l)
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
        SpdyStream.access$1100(SpdyStream.this).xitAndThrowIfTimedOut();
        SpdyStream.access$1200(SpdyStream.this);
        l = Math.min(bytesLeftInWriteWindow, l1);
        SpdyStream spdystream1 = SpdyStream.this;
        spdystream1.bytesLeftInWriteWindow = spdystream1.bytesLeftInWriteWindow - l;
        SpdyStream spdystream;
        spdystream;
        JVM INSTR monitorexit ;
        l1 -= l;
        SpdyStream.access$500(SpdyStream.this).writeData(SpdyStream.access$600(SpdyStream.this), false, buffer, l);
_L1:
        if (l1 <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        spdystream = SpdyStream.this;
        spdystream;
        JVM INSTR monitorenter ;
        SpdyStream.access$1100(SpdyStream.this).nter();
        while (bytesLeftInWriteWindow <= 0L && !finished && !closed && SpdyStream.access$800(SpdyStream.this) == null) 
        {
            SpdyStream.access$900(SpdyStream.this);
        }
        if (true) goto _L3; else goto _L2
        buffer;
        SpdyStream.access$1100(SpdyStream.this).xitAndThrowIfTimedOut();
        throw buffer;
        buffer;
        spdystream;
        JVM INSTR monitorexit ;
        throw buffer;
_L2:
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
    static boolean access$202( , boolean flag)
    {
        .finished = flag;
        return flag;
    }

*/


    finished()
    {
        this$0 = SpdyStream.this;
        super();
    }
}
