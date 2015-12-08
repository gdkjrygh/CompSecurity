// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.framing;

import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.util.Charsetfunctions;
import java.nio.ByteBuffer;

// Referenced classes of package com.mixpanel.android.java_websocket.framing:
//            FramedataImpl1, CloseFrame

public class CloseFrameBuilder extends FramedataImpl1
    implements CloseFrame
{

    static final ByteBuffer emptybytebuffer = ByteBuffer.allocate(0);
    private int code;
    private String reason;

    public CloseFrameBuilder()
    {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
    }

    public CloseFrameBuilder(int i)
        throws InvalidDataException
    {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        setCodeAndMessage(i, "");
    }

    public CloseFrameBuilder(int i, String s)
        throws InvalidDataException
    {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        setCodeAndMessage(i, s);
    }

    private void initCloseCode()
        throws InvalidFrameException
    {
        code = 1005;
        ByteBuffer bytebuffer = super.getPayloadData();
        bytebuffer.mark();
        if (bytebuffer.remaining() >= 2)
        {
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(4);
            bytebuffer1.position(2);
            bytebuffer1.putShort(bytebuffer.getShort());
            bytebuffer1.position(0);
            code = bytebuffer1.getInt();
            if (code == 1006 || code == 1015 || code == 1005 || code > 4999 || code < 1000 || code == 1004)
            {
                throw new InvalidFrameException((new StringBuilder("closecode must not be sent over the wire: ")).append(code).toString());
            }
        }
        bytebuffer.reset();
    }

    private void initMessage()
        throws InvalidDataException
    {
        ByteBuffer bytebuffer;
        int i;
        if (code == 1005)
        {
            reason = Charsetfunctions.stringUtf8(super.getPayloadData());
            return;
        }
        bytebuffer = super.getPayloadData();
        i = bytebuffer.position();
        bytebuffer.position(bytebuffer.position() + 2);
        reason = Charsetfunctions.stringUtf8(bytebuffer);
        bytebuffer.position(i);
        return;
        Object obj;
        obj;
        throw new InvalidFrameException(((Throwable) (obj)));
        obj;
        bytebuffer.position(i);
        throw obj;
    }

    private void setCodeAndMessage(int i, String s)
        throws InvalidDataException
    {
        Object obj = s;
        if (s == null)
        {
            obj = "";
        }
        int j = i;
        if (i == 1015)
        {
            j = 1005;
            obj = "";
        }
        if (j == 1005)
        {
            if (((String) (obj)).length() > 0)
            {
                throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
            }
        } else
        {
            s = Charsetfunctions.utf8Bytes(((String) (obj)));
            obj = ByteBuffer.allocate(4);
            ((ByteBuffer) (obj)).putInt(j);
            ((ByteBuffer) (obj)).position(2);
            ByteBuffer bytebuffer = ByteBuffer.allocate(s.length + 2);
            bytebuffer.put(((ByteBuffer) (obj)));
            bytebuffer.put(s);
            bytebuffer.rewind();
            setPayload(bytebuffer);
        }
    }

    public int getCloseCode()
    {
        return code;
    }

    public String getMessage()
    {
        return reason;
    }

    public ByteBuffer getPayloadData()
    {
        if (code == 1005)
        {
            return emptybytebuffer;
        } else
        {
            return super.getPayloadData();
        }
    }

    public void setPayload(ByteBuffer bytebuffer)
        throws InvalidDataException
    {
        super.setPayload(bytebuffer);
        initCloseCode();
        initMessage();
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(super.toString()))).append("code: ").append(code).toString();
    }

}
