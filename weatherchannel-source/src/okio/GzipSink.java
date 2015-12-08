// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

// Referenced classes of package okio:
//            Sink, Okio, DeflaterSink, Buffer, 
//            Segment, BufferedSink, Util, Timeout

public final class GzipSink
    implements Sink
{

    private boolean closed;
    private final CRC32 crc = new CRC32();
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final BufferedSink sink;

    public GzipSink(Sink sink1)
    {
        if (sink1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        } else
        {
            deflater = new Deflater(-1, true);
            sink = Okio.buffer(sink1);
            deflaterSink = new DeflaterSink(sink, deflater);
            writeHeader();
            return;
        }
    }

    private void updateCrc(Buffer buffer, long l)
    {
        for (buffer = buffer.head; l > 0L; buffer = ((Segment) (buffer)).next)
        {
            int i = (int)Math.min(l, ((Segment) (buffer)).limit - ((Segment) (buffer)).pos);
            crc.update(((Segment) (buffer)).data, ((Segment) (buffer)).pos, i);
            l -= i;
        }

    }

    private void writeFooter()
        throws IOException
    {
        sink.writeIntLe((int)crc.getValue());
        sink.writeIntLe(deflater.getTotalIn());
    }

    private void writeHeader()
    {
        Buffer buffer = sink.buffer();
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
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
            deflaterSink.finishDeflate();
            writeFooter();
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

    public void flush()
        throws IOException
    {
        deflaterSink.flush();
    }

    public Timeout timeout()
    {
        return sink.timeout();
    }

    public void write(Buffer buffer, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l).toString());
        }
        if (l == 0L)
        {
            return;
        } else
        {
            updateCrc(buffer, l);
            deflaterSink.write(buffer, l);
            return;
        }
    }
}
