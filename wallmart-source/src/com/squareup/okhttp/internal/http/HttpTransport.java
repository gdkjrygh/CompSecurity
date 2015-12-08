// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import java.io.IOException;
import java.net.Proxy;
import okio.Okio;
import okio.Sink;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            Transport, HttpEngine, HttpConnection, OkHeaders, 
//            RealResponseBody, RequestLine, RetryableSink

public final class HttpTransport
    implements Transport
{

    private final HttpConnection httpConnection;
    private final HttpEngine httpEngine;

    public HttpTransport(HttpEngine httpengine, HttpConnection httpconnection)
    {
        httpEngine = httpengine;
        httpConnection = httpconnection;
    }

    private Source getTransferStream(Response response)
        throws IOException
    {
        if (!HttpEngine.hasBody(response))
        {
            return httpConnection.newFixedLengthSource(0L);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding")))
        {
            return httpConnection.newChunkedSource(httpEngine);
        }
        long l = OkHeaders.contentLength(response);
        if (l != -1L)
        {
            return httpConnection.newFixedLengthSource(l);
        } else
        {
            return httpConnection.newUnknownLengthSource();
        }
    }

    public boolean canReuseConnection()
    {
        while ("close".equalsIgnoreCase(httpEngine.getRequest().header("Connection")) || "close".equalsIgnoreCase(httpEngine.getResponse().header("Connection")) || httpConnection.isClosed()) 
        {
            return false;
        }
        return true;
    }

    public Sink createRequestBody(Request request, long l)
        throws IOException
    {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding")))
        {
            return httpConnection.newChunkedSink();
        }
        if (l != -1L)
        {
            return httpConnection.newFixedLengthSink(l);
        } else
        {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void disconnect(HttpEngine httpengine)
        throws IOException
    {
        httpConnection.closeIfOwnedBy(httpengine);
    }

    public void finishRequest()
        throws IOException
    {
        httpConnection.flush();
    }

    public ResponseBody openResponseBody(Response response)
        throws IOException
    {
        Source source = getTransferStream(response);
        return new RealResponseBody(response.headers(), Okio.buffer(source));
    }

    public com.squareup.okhttp.Response.Builder readResponseHeaders()
        throws IOException
    {
        return httpConnection.readResponse();
    }

    public void releaseConnectionOnIdle()
        throws IOException
    {
        if (canReuseConnection())
        {
            httpConnection.poolOnIdle();
            return;
        } else
        {
            httpConnection.closeOnIdle();
            return;
        }
    }

    public void writeRequestBody(RetryableSink retryablesink)
        throws IOException
    {
        httpConnection.writeRequestBody(retryablesink);
    }

    public void writeRequestHeaders(Request request)
        throws IOException
    {
        httpEngine.writingRequestHeaders();
        String s = RequestLine.get(request, httpEngine.getConnection().getRoute().getProxy().type(), httpEngine.getConnection().getProtocol());
        httpConnection.writeRequest(request.headers(), s);
    }
}
