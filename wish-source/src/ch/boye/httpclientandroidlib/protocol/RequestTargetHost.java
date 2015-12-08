// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import ch.boye.httpclientandroidlib.HttpConnection;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpInetConnection;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.ProtocolVersion;
import ch.boye.httpclientandroidlib.RequestLine;
import java.io.IOException;
import java.net.InetAddress;

// Referenced classes of package ch.boye.httpclientandroidlib.protocol:
//            HttpContext

public class RequestTargetHost
    implements HttpRequestInterceptor
{

    public RequestTargetHost()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        ProtocolVersion protocolversion;
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        protocolversion = httprequest.getRequestLine().getProtocolVersion();
        break MISSING_BLOCK_LABEL_41;
        Object obj;
        while (true) 
        {
            do
            {
                return;
            } while (httprequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") && protocolversion.lessEquals(HttpVersion.HTTP_1_0) || httprequest.containsHeader("Host"));
            HttpHost httphost = (HttpHost)httpcontext.getAttribute("http.target_host");
            obj = httphost;
            if (httphost != null)
            {
                break;
            }
            obj = (HttpConnection)httpcontext.getAttribute("http.connection");
            httpcontext = httphost;
            if (obj instanceof HttpInetConnection)
            {
                InetAddress inetaddress = ((HttpInetConnection)obj).getRemoteAddress();
                int i = ((HttpInetConnection)obj).getRemotePort();
                httpcontext = httphost;
                if (inetaddress != null)
                {
                    httpcontext = new HttpHost(inetaddress.getHostName(), i);
                }
            }
            obj = httpcontext;
            if (httpcontext != null)
            {
                break;
            }
            if (!protocolversion.lessEquals(HttpVersion.HTTP_1_0))
            {
                throw new ProtocolException("Target host missing");
            }
        }
        httprequest.addHeader("Host", ((HttpHost) (obj)).toHostString());
        return;
    }
}
