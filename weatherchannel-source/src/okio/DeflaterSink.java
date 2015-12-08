// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.util.zip.Deflater;

// Referenced classes of package okio:
//            Sink, Okio, BufferedSink, Buffer, 
//            Segment, Util, SegmentPool, Timeout

public final class DeflaterSink
    implements Sink
{

    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    DeflaterSink(BufferedSink bufferedsink, Deflater deflater1)
    {
        if (bufferedsink == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater1 == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            sink = bufferedsink;
            deflater = deflater1;
            return;
        }
    }

    public DeflaterSink(Sink sink1, Deflater deflater1)
    {
        this(Okio.buffer(sink1), deflater1);
    }

    private void deflate(boolean flag)
        throws IOException
    {
        Buffer buffer = sink.buffer();
label0:
        do
        {
            do
            {
                Segment segment = buffer.writableSegment(1);
                int i;
                if (flag)
                {
                    i = deflater.deflate(segment.data, segment.limit, 2048 - segment.limit, 2);
                } else
                {
                    i = deflater.deflate(segment.data, segment.limit, 2048 - segment.limit);
                }
                if (i <= 0)
                {
                    continue label0;
                }
                segment.limit = segment.limit + i;
                buffer.size = buffer.size + (long)i;
                sink.emitCompleteSegments();
            } while (true);
        } while (!deflater.needsInput());
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
        try
        {
            finishDeflate();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable1) { }
        deflater.end();
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
        Throwable throwable2;
        throwable2;
        throwable = throwable1;
        if (throwable1 == null)
        {
            throwable = throwable2;
        }
          goto _L3
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L4
    }

    void finishDeflate()
        throws IOException
    {
        deflater.finish();
        deflate(false);
    }

    public void flush()
        throws IOException
    {
        deflate(true);
        sink.flush();
    }

    public Timeout timeout()
    {
        return sink.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append("DeflaterSink(").append(sink).append(")").toString();
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        Util.checkOffsetAndCount(buffer.size, 0L, l);
        int i;
        for (; l > 0L; l -= i)
        {
            Segment segment = buffer.head;
            i = (int)Math.min(l, segment.limit - segment.pos);
            deflater.setInput(segment.data, segment.pos, i);
            deflate(false);
            buffer.size = buffer.size - (long)i;
            segment.pos = segment.pos + i;
            if (segment.pos == segment.limit)
            {
                buffer.head = segment.pop();
                SegmentPool.INSTANCE.recycle(segment);
            }
        }

    }
}
