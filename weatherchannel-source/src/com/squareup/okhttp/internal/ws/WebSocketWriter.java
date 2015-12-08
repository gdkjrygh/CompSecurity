// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            Protocol

public final class WebSocketWriter
{
    private final class FrameSink
        implements Sink
    {

        private boolean isFirstFrame;
        private WebSocket.PayloadType payloadType;
        final WebSocketWriter this$0;

        public void close()
            throws IOException
        {
            BufferedSink bufferedsink = sink;
            bufferedsink;
            JVM INSTR monitorenter ;
            sink.writeByte(128);
            if (!isClient)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            sink.writeByte(128);
            random.nextBytes(maskKey);
            sink.write(maskKey);
_L1:
            sink.flush();
            activeWriter = false;
            return;
            sink.writeByte(0);
              goto _L1
            Exception exception;
            exception;
            bufferedsink;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void flush()
            throws IOException
        {
            synchronized (sink)
            {
                sink.flush();
            }
            return;
            exception;
            bufferedsink;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Timeout timeout()
        {
            return sink.timeout();
        }

        public void write(Buffer buffer, long l)
            throws IOException
        {
            writeFrame(payloadType, buffer, l, isFirstFrame, false);
            isFirstFrame = false;
        }


/*
        static WebSocket.PayloadType access$102(FrameSink framesink, WebSocket.PayloadType payloadtype)
        {
            framesink.payloadType = payloadtype;
            return payloadtype;
        }

*/


/*
        static boolean access$202(FrameSink framesink, boolean flag)
        {
            framesink.isFirstFrame = flag;
            return flag;
        }

*/

        private FrameSink()
        {
            this$0 = WebSocketWriter.this;
            super();
        }

    }


    private boolean activeWriter;
    private boolean closed;
    private final FrameSink frameSink = new FrameSink(null);
    private final boolean isClient;
    private final byte maskBuffer[] = new byte[2048];
    private final byte maskKey[] = new byte[4];
    private final Random random;
    private final BufferedSink sink;

    public WebSocketWriter(boolean flag, BufferedSink bufferedsink, Random random1)
    {
        if (bufferedsink == null)
        {
            throw new NullPointerException("sink");
        }
        if (random1 == null)
        {
            throw new NullPointerException("random");
        } else
        {
            isClient = flag;
            sink = bufferedsink;
            random = random1;
            return;
        }
    }

    private void writeAllMasked(BufferedSource bufferedsource, long l)
        throws IOException
    {
        int i;
        for (long l1 = 0L; l1 < l; l1 += i)
        {
            i = (int)Math.min(l, maskBuffer.length);
            i = bufferedsource.read(maskBuffer, 0, i);
            if (i == -1)
            {
                throw new AssertionError();
            }
            Protocol.toggleMask(maskBuffer, i, maskKey, l1);
            sink.write(maskBuffer, 0, i);
        }

    }

    private void writeControlFrame(int i, Buffer buffer)
        throws IOException
    {
        int j;
        j = 0;
        if (buffer != null)
        {
            int k = (int)buffer.size();
            j = k;
            if (k > 125)
            {
                throw new IllegalArgumentException("Control frame payload must be less than 125B.");
            }
        }
        sink.writeByte(i | 0x80);
        if (!isClient) goto _L2; else goto _L1
_L1:
        sink.writeByte(j | 0x80);
        random.nextBytes(maskKey);
        sink.write(maskKey);
        if (buffer != null)
        {
            writeAllMasked(buffer, j);
        }
_L4:
        sink.flush();
        return;
_L2:
        sink.writeByte(j);
        if (buffer != null)
        {
            sink.writeAll(buffer);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeFrame(WebSocket.PayloadType payloadtype, Buffer buffer, long l, boolean flag, boolean flag1)
        throws IOException
    {
        int i = 0;
        if (!flag) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType[];

            static 
            {
                $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType = new int[WebSocket.PayloadType.values().length];
                try
                {
                    $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType[WebSocket.PayloadType.TEXT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$squareup$okhttp$internal$ws$WebSocket$PayloadType[WebSocket.PayloadType.BINARY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.squareup.okhttp.internal.ws.WebSocket.PayloadType[payloadtype.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 67
    //                   2 286;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalStateException((new StringBuilder()).append("Unknown payload type: ").append(payloadtype).toString());
_L4:
        i = 1;
_L2:
        payloadtype = sink;
        payloadtype;
        JVM INSTR monitorenter ;
        int j;
        j = i;
        if (flag1)
        {
            j = i | 0x80;
        }
        sink.writeByte(j);
        i = 0;
        if (!isClient)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        i = 0 | 0x80;
        random.nextBytes(maskKey);
        if (l > 125L) goto _L7; else goto _L6
_L6:
        j = (int)l;
        sink.writeByte(i | j);
_L8:
        if (!isClient)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        sink.write(maskKey);
        writeAllMasked(buffer, l);
_L9:
        sink.flush();
        payloadtype;
        JVM INSTR monitorexit ;
        return;
_L7:
        if (l > 32767L)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        sink.writeByte(i | 0x7e);
        sink.writeShort((int)l);
          goto _L8
        buffer;
        payloadtype;
        JVM INSTR monitorexit ;
        throw buffer;
        sink.writeByte(i | 0x7f);
        sink.writeLong(l);
          goto _L8
        sink.write(buffer, l);
          goto _L9
_L5:
        i = 2;
        if (true) goto _L2; else goto _L10
_L10:
    }

    public boolean isClosed()
    {
        return closed;
    }

    public BufferedSink newMessageSink(WebSocket.PayloadType payloadtype)
    {
        if (payloadtype == null)
        {
            throw new NullPointerException("type == null");
        }
        if (closed)
        {
            throw new IllegalStateException("Closed");
        }
        if (activeWriter)
        {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        } else
        {
            activeWriter = true;
            frameSink.payloadType = payloadtype;
            frameSink.isFirstFrame = true;
            return Okio.buffer(frameSink);
        }
    }

    public void sendMessage(WebSocket.PayloadType payloadtype, Buffer buffer)
        throws IOException
    {
        if (payloadtype == null)
        {
            throw new NullPointerException("type == null");
        }
        if (buffer == null)
        {
            throw new NullPointerException("payload == null");
        }
        if (closed)
        {
            throw new IllegalStateException("Closed");
        }
        if (activeWriter)
        {
            throw new IllegalStateException("A message writer is active. Did you call close()?");
        } else
        {
            writeFrame(payloadtype, buffer, buffer.size(), true, true);
            return;
        }
    }

    public void writeClose(int i, String s)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("Closed");
        }
        Buffer buffer = null;
        if (i != 0)
        {
            if (i < 1000 || i >= 5000)
            {
                throw new IllegalArgumentException("Code must be in range [1000,5000).");
            }
            Buffer buffer1 = new Buffer();
            buffer1.writeShort(i);
            buffer = buffer1;
            if (s != null)
            {
                buffer1.writeUtf8(s);
                buffer = buffer1;
            }
        } else
        if (s != null)
        {
            throw new IllegalArgumentException("Code required to include reason.");
        }
        writeClose(buffer);
    }

    public void writeClose(Buffer buffer)
        throws IOException
    {
        synchronized (sink)
        {
            writeControlFrame(8, buffer);
            closed = true;
        }
        return;
        buffer;
        bufferedsink;
        JVM INSTR monitorexit ;
        throw buffer;
    }

    public void writePing(Buffer buffer)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("Closed");
        }
        synchronized (sink)
        {
            writeControlFrame(9, buffer);
        }
        return;
        buffer;
        bufferedsink;
        JVM INSTR monitorexit ;
        throw buffer;
    }

    public void writePong(Buffer buffer)
        throws IOException
    {
        if (closed)
        {
            throw new IllegalStateException("Closed");
        }
        synchronized (sink)
        {
            writeControlFrame(10, buffer);
        }
        return;
        buffer;
        bufferedsink;
        JVM INSTR monitorexit ;
        throw buffer;
    }







/*
    static boolean access$802(WebSocketWriter websocketwriter, boolean flag)
    {
        websocketwriter.activeWriter = flag;
        return flag;
    }

*/
}
