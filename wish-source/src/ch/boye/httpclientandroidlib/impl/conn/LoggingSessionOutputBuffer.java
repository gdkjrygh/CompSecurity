// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.Consts;
import ch.boye.httpclientandroidlib.io.HttpTransportMetrics;
import ch.boye.httpclientandroidlib.io.SessionOutputBuffer;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.IOException;
import java.nio.charset.Charset;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            Wire

public class LoggingSessionOutputBuffer
    implements SessionOutputBuffer
{

    private final String charset;
    private final SessionOutputBuffer out;
    private final Wire wire;

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionoutputbuffer, Wire wire1)
    {
        this(sessionoutputbuffer, wire1, null);
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionoutputbuffer, Wire wire1, String s)
    {
        out = sessionoutputbuffer;
        wire = wire1;
        if (s == null)
        {
            s = Consts.ASCII.name();
        }
        charset = s;
    }

    public void flush()
        throws IOException
    {
        out.flush();
    }

    public HttpTransportMetrics getMetrics()
    {
        return out.getMetrics();
    }

    public void write(int i)
        throws IOException
    {
        out.write(i);
        if (wire.enabled())
        {
            wire.output(i);
        }
    }

    public void write(byte abyte0[])
        throws IOException
    {
        out.write(abyte0);
        if (wire.enabled())
        {
            wire.output(abyte0);
        }
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        out.write(abyte0, i, j);
        if (wire.enabled())
        {
            wire.output(abyte0, i, j);
        }
    }

    public void writeLine(CharArrayBuffer chararraybuffer)
        throws IOException
    {
        out.writeLine(chararraybuffer);
        if (wire.enabled())
        {
            chararraybuffer = new String(chararraybuffer.buffer(), 0, chararraybuffer.length());
            chararraybuffer = (new StringBuilder()).append(chararraybuffer).append("\r\n").toString();
            wire.output(chararraybuffer.getBytes(charset));
        }
    }

    public void writeLine(String s)
        throws IOException
    {
        out.writeLine(s);
        if (wire.enabled())
        {
            s = (new StringBuilder()).append(s).append("\r\n").toString();
            wire.output(s.getBytes(charset));
        }
    }
}
