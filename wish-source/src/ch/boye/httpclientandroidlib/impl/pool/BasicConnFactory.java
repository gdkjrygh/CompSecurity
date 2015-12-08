// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.pool;

import ch.boye.httpclientandroidlib.HttpClientConnection;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.impl.DefaultHttpClientConnection;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.pool.ConnFactory;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

public class BasicConnFactory
    implements ConnFactory
{

    private final HttpParams params;
    private final SSLSocketFactory sslfactory;

    public BasicConnFactory(HttpParams httpparams)
    {
        this(null, httpparams);
    }

    public BasicConnFactory(SSLSocketFactory sslsocketfactory, HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP params may not be null");
        } else
        {
            sslfactory = sslsocketfactory;
            params = httpparams;
            return;
        }
    }

    public HttpClientConnection create(HttpHost httphost)
        throws IOException
    {
        String s = httphost.getSchemeName();
        Socket socket = null;
        if ("http".equalsIgnoreCase(s))
        {
            socket = new Socket();
        }
        Socket socket1 = socket;
        if ("https".equalsIgnoreCase(s))
        {
            socket1 = socket;
            if (sslfactory != null)
            {
                socket1 = sslfactory.createSocket();
            }
        }
        if (socket1 == null)
        {
            throw new IOException((new StringBuilder()).append(s).append(" scheme is not supported").toString());
        } else
        {
            int i = HttpConnectionParams.getConnectionTimeout(params);
            socket1.setSoTimeout(HttpConnectionParams.getSoTimeout(params));
            socket1.connect(new InetSocketAddress(httphost.getHostName(), httphost.getPort()), i);
            return create(socket1, params);
        }
    }

    protected HttpClientConnection create(Socket socket, HttpParams httpparams)
        throws IOException
    {
        DefaultHttpClientConnection defaulthttpclientconnection = new DefaultHttpClientConnection();
        defaulthttpclientconnection.bind(socket, httpparams);
        return defaulthttpclientconnection;
    }

    public volatile Object create(Object obj)
        throws IOException
    {
        return create((HttpHost)obj);
    }
}
