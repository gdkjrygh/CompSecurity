// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthState;
import ch.boye.httpclientandroidlib.conn.HttpRoutedConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import java.io.IOException;

// Referenced classes of package ch.boye.httpclientandroidlib.client.protocol:
//            RequestAuthenticationBase

public class RequestProxyAuthentication extends RequestAuthenticationBase
{

    public RequestProxyAuthentication()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        if (!httprequest.containsHeader("Proxy-Authorization"))
        {
            HttpRoutedConnection httproutedconnection = (HttpRoutedConnection)httpcontext.getAttribute("http.connection");
            if (httproutedconnection == null)
            {
                log.debug("HTTP connection not set in the context");
                return;
            }
            if (!httproutedconnection.getRoute().isTunnelled())
            {
                AuthState authstate = (AuthState)httpcontext.getAttribute("http.auth.proxy-scope");
                if (authstate == null)
                {
                    log.debug("Proxy auth state not set in the context");
                    return;
                }
                if (log.isDebugEnabled())
                {
                    log.debug((new StringBuilder()).append("Proxy auth state: ").append(authstate.getState()).toString());
                }
                process(authstate, httprequest, httpcontext);
                return;
            }
        }
    }
}
