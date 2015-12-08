// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;

// Referenced classes of package ch.boye.httpclientandroidlib.message:
//            AbstractHttpMessage, BasicRequestLine

public class BasicHttpRequest extends AbstractHttpMessage
    implements HttpRequest
{

    private final String method;
    private RequestLine requestline;
    private final String uri;

    public BasicHttpRequest(RequestLine requestline1)
    {
        if (requestline1 == null)
        {
            throw new IllegalArgumentException("Request line may not be null");
        } else
        {
            requestline = requestline1;
            method = requestline1.getMethod();
            uri = requestline1.getUri();
            return;
        }
    }

    public BasicHttpRequest(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Method name may not be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Request URI may not be null");
        } else
        {
            method = s;
            uri = s1;
            requestline = null;
            return;
        }
    }

    public BasicHttpRequest(String s, String s1, ProtocolVersion protocolversion)
    {
        this(((RequestLine) (new BasicRequestLine(s, s1, protocolversion))));
    }

    public ProtocolVersion getProtocolVersion()
    {
        return getRequestLine().getProtocolVersion();
    }

    public RequestLine getRequestLine()
    {
        if (requestline == null)
        {
            ProtocolVersion protocolversion = HttpProtocolParams.getVersion(getParams());
            requestline = new BasicRequestLine(method, uri, protocolversion);
        }
        return requestline;
    }

    public String toString()
    {
        return (new StringBuilder()).append(method).append(" ").append(uri).append(" ").append(headergroup).toString();
    }
}
