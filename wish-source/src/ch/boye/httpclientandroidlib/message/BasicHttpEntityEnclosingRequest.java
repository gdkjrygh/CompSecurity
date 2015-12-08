// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;

// Referenced classes of package ch.boye.httpclientandroidlib.message:
//            BasicHttpRequest

public class BasicHttpEntityEnclosingRequest extends BasicHttpRequest
    implements HttpEntityEnclosingRequest
{

    private HttpEntity entity;

    public BasicHttpEntityEnclosingRequest(RequestLine requestline)
    {
        super(requestline);
    }

    public BasicHttpEntityEnclosingRequest(String s, String s1)
    {
        super(s, s1);
    }

    public BasicHttpEntityEnclosingRequest(String s, String s1, ProtocolVersion protocolversion)
    {
        super(s, s1, protocolversion);
    }

    public boolean expectContinue()
    {
        Header header = getFirstHeader("Expect");
        return header != null && "100-continue".equalsIgnoreCase(header.getValue());
    }

    public HttpEntity getEntity()
    {
        return entity;
    }

    public void setEntity(HttpEntity httpentity)
    {
        entity = httpentity;
    }
}
