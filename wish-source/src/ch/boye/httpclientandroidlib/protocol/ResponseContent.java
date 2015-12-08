// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseInterceptor;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.StatusLine;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpContext

public class ResponseContent
    implements HttpResponseInterceptor
{

    private final boolean overwrite;

    public ResponseContent()
    {
        this(false);
    }

    public ResponseContent(boolean flag)
    {
        overwrite = flag;
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException
    {
        HttpEntity httpentity;
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (overwrite)
        {
            httpresponse.removeHeaders("Transfer-Encoding");
            httpresponse.removeHeaders("Content-Length");
        } else
        {
            if (httpresponse.containsHeader("Transfer-Encoding"))
            {
                throw new ProtocolException("Transfer-encoding header already present");
            }
            if (httpresponse.containsHeader("Content-Length"))
            {
                throw new ProtocolException("Content-Length header already present");
            }
        }
        httpcontext = httpresponse.getStatusLine().getProtocolVersion();
        httpentity = httpresponse.getEntity();
        if (httpentity == null) goto _L2; else goto _L1
_L1:
        long l = httpentity.getContentLength();
        if (httpentity.isChunked() && !httpcontext.lessEquals(HttpVersion.HTTP_1_0))
        {
            httpresponse.addHeader("Transfer-Encoding", "chunked");
        } else
        if (l >= 0L)
        {
            httpresponse.addHeader("Content-Length", Long.toString(httpentity.getContentLength()));
        }
_L6:
        if (httpentity.getContentType() != null && !httpresponse.containsHeader("Content-Type"))
        {
            httpresponse.addHeader(httpentity.getContentType());
        }
        if (httpentity.getContentEncoding() != null && !httpresponse.containsHeader("Content-Encoding"))
        {
            httpresponse.addHeader(httpentity.getContentEncoding());
        }
_L4:
        return;
_L2:
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 204 || i == 304 || i == 205) goto _L4; else goto _L3
_L3:
        httpresponse.addHeader("Content-Length", "0");
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
