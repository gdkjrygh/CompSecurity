// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.Serializable;

// Referenced classes of package ch.boye.httpclientandroidlib.message:
//            BasicLineFormatter

public class BasicStatusLine
    implements StatusLine, Serializable, Cloneable
{

    private static final long serialVersionUID = 0xde17a42b501ecf7bL;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public BasicStatusLine(ProtocolVersion protocolversion, int i, String s)
    {
        if (protocolversion == null)
        {
            throw new IllegalArgumentException("Protocol version may not be null.");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("Status code may not be negative.");
        } else
        {
            protoVersion = protocolversion;
            statusCode = i;
            reasonPhrase = s;
            return;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public ProtocolVersion getProtocolVersion()
    {
        return protoVersion;
    }

    public String getReasonPhrase()
    {
        return reasonPhrase;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public String toString()
    {
        return BasicLineFormatter.DEFAULT.formatStatusLine(null, this).toString();
    }
}
