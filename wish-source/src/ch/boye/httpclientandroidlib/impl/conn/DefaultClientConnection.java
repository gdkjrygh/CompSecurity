// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.HttpResponseFactory;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.conn.OperatedClientConnection;
import ch.boye.httpclientandroidlib.impl.SocketHttpClientConnection;
import ch.boye.httpclientandroidlib.io.HttpMessageParser;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.io.SessionOutputBuffer;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            DefaultHttpResponseParser, LoggingSessionInputBuffer, Wire, LoggingSessionOutputBuffer

public class DefaultClientConnection extends SocketHttpClientConnection
    implements OperatedClientConnection, HttpContext
{

    private final Map attributes = new HashMap();
    private boolean connSecure;
    public HttpClientAndroidLog headerLog;
    public HttpClientAndroidLog log;
    private volatile boolean shutdown;
    private volatile Socket socket;
    private HttpHost targetHost;
    public HttpClientAndroidLog wireLog;

    public DefaultClientConnection()
    {
        log = new HttpClientAndroidLog(getClass());
        headerLog = new HttpClientAndroidLog("ch.boye.httpclientandroidlib.headers");
        wireLog = new HttpClientAndroidLog("ch.boye.httpclientandroidlib.wire");
    }

    public void close()
        throws IOException
    {
        try
        {
            super.close();
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Connection ").append(this).append(" closed").toString());
            }
            return;
        }
        catch (IOException ioexception)
        {
            log.debug("I/O error closing connection", ioexception);
        }
    }

    protected HttpMessageParser createResponseParser(SessionInputBuffer sessioninputbuffer, HttpResponseFactory httpresponsefactory, HttpParams httpparams)
    {
        return new DefaultHttpResponseParser(sessioninputbuffer, null, httpresponsefactory, httpparams);
    }

    protected SessionInputBuffer createSessionInputBuffer(Socket socket1, int i, HttpParams httpparams)
        throws IOException
    {
        int j = i;
        if (i == -1)
        {
            j = 8192;
        }
        SessionInputBuffer sessioninputbuffer = super.createSessionInputBuffer(socket1, j, httpparams);
        socket1 = sessioninputbuffer;
        if (wireLog.isDebugEnabled())
        {
            socket1 = new LoggingSessionInputBuffer(sessioninputbuffer, new Wire(wireLog), HttpProtocolParams.getHttpElementCharset(httpparams));
        }
        return socket1;
    }

    protected SessionOutputBuffer createSessionOutputBuffer(Socket socket1, int i, HttpParams httpparams)
        throws IOException
    {
        int j = i;
        if (i == -1)
        {
            j = 8192;
        }
        SessionOutputBuffer sessionoutputbuffer = super.createSessionOutputBuffer(socket1, j, httpparams);
        socket1 = sessionoutputbuffer;
        if (wireLog.isDebugEnabled())
        {
            socket1 = new LoggingSessionOutputBuffer(sessionoutputbuffer, new Wire(wireLog), HttpProtocolParams.getHttpElementCharset(httpparams));
        }
        return socket1;
    }

    public Object getAttribute(String s)
    {
        return attributes.get(s);
    }

    public final Socket getSocket()
    {
        return socket;
    }

    public final HttpHost getTargetHost()
    {
        return targetHost;
    }

    public final boolean isSecure()
    {
        return connSecure;
    }

    public void openCompleted(boolean flag, HttpParams httpparams)
        throws IOException
    {
        assertNotOpen();
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else
        {
            connSecure = flag;
            bind(socket, httpparams);
            return;
        }
    }

    public void opening(Socket socket1, HttpHost httphost)
        throws IOException
    {
        assertNotOpen();
        socket = socket1;
        targetHost = httphost;
        if (!shutdown) goto _L2; else goto _L1
_L1:
        if (socket1 == null) goto _L4; else goto _L3
_L3:
        try
        {
            socket1.shutdownOutput();
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost) { }
        try
        {
            socket1.shutdownInput();
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost) { }
_L6:
        socket1.close();
_L4:
        throw new InterruptedIOException("Connection already shutdown");
        httphost;
        socket1.close();
        throw httphost;
_L2:
        return;
        httphost;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public HttpResponse receiveResponseHeader()
        throws HttpException, IOException
    {
        HttpResponse httpresponse = super.receiveResponseHeader();
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Receiving response: ").append(httpresponse.getStatusLine()).toString());
        }
        if (headerLog.isDebugEnabled())
        {
            headerLog.debug((new StringBuilder()).append("<< ").append(httpresponse.getStatusLine().toString()).toString());
            ch.boye.httpclientandroidlib.Header aheader[] = httpresponse.getAllHeaders();
            int j = aheader.length;
            for (int i = 0; i < j; i++)
            {
                ch.boye.httpclientandroidlib.Header header = aheader[i];
                headerLog.debug((new StringBuilder()).append("<< ").append(header.toString()).toString());
            }

        }
        return httpresponse;
    }

    public Object removeAttribute(String s)
    {
        return attributes.remove(s);
    }

    public void sendRequestHeader(HttpRequest httprequest)
        throws HttpException, IOException
    {
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Sending request: ").append(httprequest.getRequestLine()).toString());
        }
        super.sendRequestHeader(httprequest);
        if (headerLog.isDebugEnabled())
        {
            headerLog.debug((new StringBuilder()).append(">> ").append(httprequest.getRequestLine().toString()).toString());
            httprequest = httprequest.getAllHeaders();
            int j = httprequest.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = httprequest[i];
                headerLog.debug((new StringBuilder()).append(">> ").append(obj.toString()).toString());
            }

        }
    }

    public void setAttribute(String s, Object obj)
    {
        attributes.put(s, obj);
    }

    public void shutdown()
        throws IOException
    {
        shutdown = true;
        try
        {
            super.shutdown();
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Connection ").append(this).append(" shut down").toString());
            }
            return;
        }
        catch (IOException ioexception)
        {
            log.debug("I/O error shutting down connection", ioexception);
        }
    }

    public void update(Socket socket1, HttpHost httphost, boolean flag, HttpParams httpparams)
        throws IOException
    {
        assertOpen();
        if (httphost == null)
        {
            throw new IllegalArgumentException("Target host must not be null.");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (socket1 != null)
        {
            socket = socket1;
            bind(socket1, httpparams);
        }
        targetHost = httphost;
        connSecure = flag;
    }
}
