// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            Protocol, WebSocketListener

public final class WebSocketReader
{
    public static interface FrameCallback
    {

        public abstract void onClose(Buffer buffer)
            throws IOException;

        public abstract void onPing(Buffer buffer);
    }

    private final class FramedMessageSource
        implements Source
    {

        final WebSocketReader this$0;

        public void close()
            throws IOException
        {
            if (!messageClosed) goto _L2; else goto _L1
_L1:
            return;
_L2:
            messageClosed = true;
            if (!closed)
            {
                source.skip(frameLength - frameBytesRead);
                while (!isFinalFrame) 
                {
                    readUntilNonControlFrame();
                    source.skip(frameLength);
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public long read(Buffer buffer, long l)
            throws IOException
        {
            if (closed)
            {
                throw new IOException("Closed");
            }
            if (messageClosed)
            {
                throw new IllegalStateException("Closed");
            }
            if (frameBytesRead == frameLength)
            {
                if (isFinalFrame)
                {
                    return -1L;
                }
                readUntilNonControlFrame();
                if (opcode != 0)
                {
                    throw new ProtocolException((new StringBuilder()).append("Expected continuation opcode. Got: ").append(Integer.toHexString(opcode)).toString());
                }
            }
            l = Math.min(l, frameLength - frameBytesRead);
            if (isMasked)
            {
                l = Math.min(l, maskBuffer.length);
                l = source.read(maskBuffer, 0, (int)l);
                if (l == -1L)
                {
                    throw new EOFException();
                }
                Protocol.toggleMask(maskBuffer, l, maskKey, frameBytesRead);
                buffer.write(maskBuffer, 0, (int)l);
            } else
            {
                long l1 = source.read(buffer, l);
                l = l1;
                if (l1 == -1L)
                {
                    throw new EOFException();
                }
            }
            frameBytesRead = frameBytesRead + l;
            return l;
        }

        public Timeout timeout()
        {
            return source.timeout();
        }

        private FramedMessageSource()
        {
            this$0 = WebSocketReader.this;
            super();
        }

    }


    private boolean closed;
    private long frameBytesRead;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final Source framedMessageSource = new FramedMessageSource();
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private boolean isMasked;
    private final WebSocketListener listener;
    private final byte maskBuffer[] = new byte[2048];
    private final byte maskKey[] = new byte[4];
    private boolean messageClosed;
    private int opcode;
    private final BufferedSource source;

    public WebSocketReader(boolean flag, BufferedSource bufferedsource, WebSocketListener websocketlistener, FrameCallback framecallback)
    {
        if (bufferedsource == null)
        {
            throw new NullPointerException("source");
        }
        if (websocketlistener == null)
        {
            throw new NullPointerException("listener");
        }
        if (framecallback == null)
        {
            throw new NullPointerException("frameCallback");
        } else
        {
            isClient = flag;
            source = bufferedsource;
            listener = websocketlistener;
            frameCallback = framecallback;
            return;
        }
    }

    private void readControlFrame()
        throws IOException
    {
        Buffer buffer = null;
        if (frameBytesRead >= frameLength) goto _L2; else goto _L1
_L1:
        Buffer buffer1 = new Buffer();
        if (!isClient) goto _L4; else goto _L3
_L3:
        source.readFully(buffer1, frameLength);
        buffer = buffer1;
_L2:
        FrameCallback framecallback;
        int i;
        switch (opcode)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown control opcode: ").append(Integer.toHexString(opcode)).toString());

        case 9: // '\t'
            frameCallback.onPing(buffer);
            // fall through

        case 10: // '\n'
            return;

        case 8: // '\b'
            framecallback = frameCallback;
            break;
        }
        break MISSING_BLOCK_LABEL_234;
_L6:
        Protocol.toggleMask(maskBuffer, i, maskKey, frameBytesRead);
        buffer1.write(maskBuffer, 0, i);
        frameBytesRead = frameBytesRead + (long)i;
_L4:
        buffer = buffer1;
        if (frameBytesRead >= frameLength)
        {
            break; /* Loop/switch isn't completed */
        }
        i = (int)Math.min(frameLength - frameBytesRead, maskBuffer.length);
        i = source.read(maskBuffer, 0, i);
        if (i == -1)
        {
            throw new EOFException();
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L2; else goto _L7
_L7:
        Object obj;
        short word0;
        if (buffer != null)
        {
            obj = buffer.clone();
        } else
        {
            obj = null;
        }
        framecallback.onClose(((Buffer) (obj)));
        closed = true;
        word0 = 0;
        obj = "";
        if (buffer != null)
        {
            word0 = buffer.readShort();
            obj = buffer.readUtf8();
        }
        listener.onClose(word0, ((String) (obj)));
        return;
    }

    private void readHeader()
        throws IOException
    {
        boolean flag3 = true;
        if (closed)
        {
            throw new IllegalStateException("Closed");
        }
        int j = source.readByte() & 0xff;
        opcode = j & 0xf;
        boolean flag2;
        if ((j & 0x80) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        isFinalFrame = flag2;
        if ((j & 8) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        isControlFrame = flag2;
        if (isControlFrame && !isFinalFrame)
        {
            throw new ProtocolException("Control frames must be final.");
        }
        boolean flag;
        boolean flag1;
        if ((j & 0x40) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((j & 0x20) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((j & 0x10) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (flag || flag1 || j)
        {
            throw new ProtocolException("Reserved flags are unsupported.");
        }
        int i = source.readByte() & 0xff;
        if ((i & 0x80) != 0)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        isMasked = flag2;
        if (isMasked == isClient)
        {
            throw new ProtocolException("Client-sent frames must be masked. Server sent must not.");
        }
        frameLength = i & 0x7f;
        if (frameLength != 126L) goto _L2; else goto _L1
_L1:
        frameLength = source.readShort();
_L4:
        frameBytesRead = 0L;
        if (isControlFrame && frameLength > 125L)
        {
            throw new ProtocolException("Control frame must be less than 125B.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (frameLength == 127L)
        {
            frameLength = source.readLong();
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (isMasked)
        {
            source.readFully(maskKey);
        }
        return;
    }

    private void readUntilNonControlFrame()
        throws IOException
    {
        do
        {
label0:
            {
                if (!closed)
                {
                    readHeader();
                    if (isControlFrame)
                    {
                        break label0;
                    }
                }
                return;
            }
            readControlFrame();
        } while (true);
    }

    public void readMessage()
        throws IOException
    {
        readUntilNonControlFrame();
        if (!closed) goto _L2; else goto _L1
_L1:
        return;
_L2:
        WebSocket.PayloadType payloadtype;
        switch (opcode)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown opcode: ").append(Integer.toHexString(opcode)).toString());

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            payloadtype = WebSocket.PayloadType.TEXT;
            break;
        }
_L4:
        messageClosed = false;
        listener.onMessage(Okio.buffer(framedMessageSource), payloadtype);
        if (!messageClosed)
        {
            throw new IllegalStateException("Listener failed to call close on message payload.");
        }
        if (true) goto _L1; else goto _L3
_L3:
        payloadtype = WebSocket.PayloadType.BINARY;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }






/*
    static boolean access$202(WebSocketReader websocketreader, boolean flag)
    {
        websocketreader.messageClosed = flag;
        return flag;
    }

*/



/*
    static long access$302(WebSocketReader websocketreader, long l)
    {
        websocketreader.frameBytesRead = l;
        return l;
    }

*/






}
