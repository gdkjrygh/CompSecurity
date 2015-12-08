// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.Consts;
import ch.boye.httpclientandroidlib.io.EofSensor;
import ch.boye.httpclientandroidlib.io.HttpTransportMetrics;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.IOException;
import java.nio.charset.Charset;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            Wire

public class LoggingSessionInputBuffer
    implements EofSensor, SessionInputBuffer
{

    private final String charset;
    private final EofSensor eofSensor;
    private final SessionInputBuffer in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessioninputbuffer, Wire wire1)
    {
        this(sessioninputbuffer, wire1, null);
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessioninputbuffer, Wire wire1, String s)
    {
        in = sessioninputbuffer;
        if (sessioninputbuffer instanceof EofSensor)
        {
            sessioninputbuffer = (EofSensor)sessioninputbuffer;
        } else
        {
            sessioninputbuffer = null;
        }
        eofSensor = sessioninputbuffer;
        wire = wire1;
        if (s == null)
        {
            s = Consts.ASCII.name();
        }
        charset = s;
    }

    public HttpTransportMetrics getMetrics()
    {
        return in.getMetrics();
    }

    public boolean isDataAvailable(int i)
        throws IOException
    {
        return in.isDataAvailable(i);
    }

    public boolean isEof()
    {
        if (eofSensor != null)
        {
            return eofSensor.isEof();
        } else
        {
            return false;
        }
    }

    public int read()
        throws IOException
    {
        int i = in.read();
        if (wire.enabled() && i != -1)
        {
            wire.input(i);
        }
        return i;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        int i = in.read(abyte0);
        if (wire.enabled() && i > 0)
        {
            wire.input(abyte0, 0, i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = in.read(abyte0, i, j);
        if (wire.enabled() && j > 0)
        {
            wire.input(abyte0, i, j);
        }
        return j;
    }

    public int readLine(CharArrayBuffer chararraybuffer)
        throws IOException
    {
        int i = in.readLine(chararraybuffer);
        if (wire.enabled() && i >= 0)
        {
            int j = chararraybuffer.length();
            chararraybuffer = new String(chararraybuffer.buffer(), j - i, i);
            chararraybuffer = (new StringBuilder()).append(chararraybuffer).append("\r\n").toString();
            wire.input(chararraybuffer.getBytes(charset));
        }
        return i;
    }

    public String readLine()
        throws IOException
    {
        String s = in.readLine();
        if (wire.enabled() && s != null)
        {
            String s1 = (new StringBuilder()).append(s).append("\r\n").toString();
            wire.input(s1.getBytes(charset));
        }
        return s;
    }
}
