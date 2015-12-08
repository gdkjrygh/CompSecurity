// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.framing;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.mixpanel.android.java_websocket.framing:
//            FrameBuilder, Framedata

public class FramedataImpl1
    implements FrameBuilder
{

    protected static byte emptyarray[] = new byte[0];
    protected boolean fin;
    protected Framedata.Opcode optcode;
    protected boolean transferemasked;
    private ByteBuffer unmaskedpayload;

    public FramedataImpl1()
    {
    }

    public FramedataImpl1(Framedata.Opcode opcode)
    {
        optcode = opcode;
        unmaskedpayload = ByteBuffer.wrap(emptyarray);
    }

    public FramedataImpl1(Framedata framedata)
    {
        fin = framedata.isFin();
        optcode = framedata.getOpcode();
        unmaskedpayload = framedata.getPayloadData();
        transferemasked = framedata.getTransfereMasked();
    }

    public void append(Framedata framedata)
        throws InvalidFrameException
    {
        ByteBuffer bytebuffer = framedata.getPayloadData();
        if (unmaskedpayload == null)
        {
            unmaskedpayload = ByteBuffer.allocate(bytebuffer.remaining());
            bytebuffer.mark();
            unmaskedpayload.put(bytebuffer);
            bytebuffer.reset();
        } else
        {
            bytebuffer.mark();
            unmaskedpayload.position(unmaskedpayload.limit());
            unmaskedpayload.limit(unmaskedpayload.capacity());
            if (bytebuffer.remaining() > unmaskedpayload.remaining())
            {
                ByteBuffer bytebuffer1 = ByteBuffer.allocate(bytebuffer.remaining() + unmaskedpayload.capacity());
                unmaskedpayload.flip();
                bytebuffer1.put(unmaskedpayload);
                bytebuffer1.put(bytebuffer);
                unmaskedpayload = bytebuffer1;
            } else
            {
                unmaskedpayload.put(bytebuffer);
            }
            unmaskedpayload.rewind();
            bytebuffer.reset();
        }
        fin = framedata.isFin();
    }

    public Framedata.Opcode getOpcode()
    {
        return optcode;
    }

    public ByteBuffer getPayloadData()
    {
        return unmaskedpayload;
    }

    public boolean getTransfereMasked()
    {
        return transferemasked;
    }

    public boolean isFin()
    {
        return fin;
    }

    public void setFin(boolean flag)
    {
        fin = flag;
    }

    public void setOptcode(Framedata.Opcode opcode)
    {
        optcode = opcode;
    }

    public void setPayload(ByteBuffer bytebuffer)
        throws InvalidDataException
    {
        unmaskedpayload = bytebuffer;
    }

    public void setTransferemasked(boolean flag)
    {
        transferemasked = flag;
    }

    public String toString()
    {
        return (new StringBuilder("Framedata{ optcode:")).append(getOpcode()).append(", fin:").append(isFin()).append(", payloadlength:[pos:").append(unmaskedpayload.position()).append(", len:").append(unmaskedpayload.remaining()).append("], payload:").append(Arrays.toString(Charsetfunctions.utf8Bytes(new String(unmaskedpayload.array())))).append("}").toString();
    }

}
