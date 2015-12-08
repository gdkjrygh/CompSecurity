// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.ConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpRequestInterceptor;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.auth.AuthSchemeRegistry;
import ch.boye.httpclientandroidlib.auth.AuthScope;
import ch.boye.httpclientandroidlib.auth.AuthState;
import ch.boye.httpclientandroidlib.auth.Credentials;
import ch.boye.httpclientandroidlib.client.params.HttpClientParams;
import ch.boye.httpclientandroidlib.client.protocol.RequestClientConnControl;
import ch.boye.httpclientandroidlib.client.protocol.RequestProxyAuthentication;
import ch.boye.httpclientandroidlib.conn.HttpRoutedConnection;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.entity.BufferedHttpEntity;
import ch.boye.httpclientandroidlib.impl.DefaultConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.impl.DefaultHttpClientConnection;
import ch.boye.httpclientandroidlib.impl.auth.BasicSchemeFactory;
import ch.boye.httpclientandroidlib.impl.auth.DigestSchemeFactory;
import ch.boye.httpclientandroidlib.impl.auth.NTLMSchemeFactory;
import ch.boye.httpclientandroidlib.message.BasicHttpRequest;
import ch.boye.httpclientandroidlib.params.BasicHttpParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;
import ch.boye.httpclientandroidlib.protocol.BasicHttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpProcessor;
import ch.boye.httpclientandroidlib.protocol.HttpRequestExecutor;
import ch.boye.httpclientandroidlib.protocol.ImmutableHttpProcessor;
import ch.boye.httpclientandroidlib.protocol.RequestContent;
import ch.boye.httpclientandroidlib.protocol.RequestTargetHost;
import ch.boye.httpclientandroidlib.protocol.RequestUserAgent;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSession;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            ProxyAuthenticationStrategy, HttpAuthenticator, BasicCredentialsProvider, TunnelRefusedException

public class ProxyClient
{
    static class ProxyConnection extends DefaultHttpClientConnection
        implements HttpRoutedConnection
    {

        private final HttpRoute route;

        public HttpRoute getRoute()
        {
            return route;
        }

        public SSLSession getSSLSession()
        {
            return null;
        }

        public Socket getSocket()
        {
            return super.getSocket();
        }

        public boolean isSecure()
        {
            return false;
        }

        ProxyConnection(HttpRoute httproute)
        {
            route = httproute;
        }
    }


    private final AuthSchemeRegistry authSchemeRegistry;
    private final HttpAuthenticator authenticator;
    private final HttpProcessor httpProcessor;
    private final HttpParams params;
    private final AuthState proxyAuthState;
    private final ProxyAuthenticationStrategy proxyAuthStrategy;
    private final HttpRequestExecutor requestExec;
    private final ConnectionReuseStrategy reuseStrategy;

    public ProxyClient()
    {
        this(((HttpParams) (new BasicHttpParams())));
    }

    public ProxyClient(HttpParams httpparams)
    {
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else
        {
            httpProcessor = new ImmutableHttpProcessor(new HttpRequestInterceptor[] {
                new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(), new RequestProxyAuthentication()
            });
            requestExec = new HttpRequestExecutor();
            proxyAuthStrategy = new ProxyAuthenticationStrategy();
            authenticator = new HttpAuthenticator();
            proxyAuthState = new AuthState();
            authSchemeRegistry = new AuthSchemeRegistry();
            authSchemeRegistry.register("Basic", new BasicSchemeFactory());
            authSchemeRegistry.register("Digest", new DigestSchemeFactory());
            authSchemeRegistry.register("NTLM", new NTLMSchemeFactory());
            reuseStrategy = new DefaultConnectionReuseStrategy();
            params = httpparams;
            return;
        }
    }

    public AuthSchemeRegistry getAuthSchemeRegistry()
    {
        return authSchemeRegistry;
    }

    public HttpParams getParams()
    {
        return params;
    }

    public Socket tunnel(HttpHost httphost, HttpHost httphost1, Credentials credentials)
        throws IOException, HttpException
    {
        ProxyConnection proxyconnection = new ProxyConnection(new HttpRoute(httphost));
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        Object obj;
        do
        {
            do
            {
                if (!proxyconnection.isOpen())
                {
                    proxyconnection.bind(new Socket(httphost.getHostName(), httphost.getPort()), params);
                }
                obj = httphost1.getHostName();
                int j = httphost1.getPort();
                int i = j;
                if (j < 0)
                {
                    i = 80;
                }
                Object obj1 = new StringBuilder(((String) (obj)).length() + 6);
                ((StringBuilder) (obj1)).append(((String) (obj)));
                ((StringBuilder) (obj1)).append(':');
                ((StringBuilder) (obj1)).append(Integer.toString(i));
                obj = new BasicHttpRequest("CONNECT", ((StringBuilder) (obj1)).toString(), HttpProtocolParams.getVersion(params));
                ((HttpRequest) (obj)).setParams(params);
                obj1 = new BasicCredentialsProvider();
                ((BasicCredentialsProvider) (obj1)).setCredentials(new AuthScope(httphost), credentials);
                basichttpcontext.setAttribute("http.target_host", httphost1);
                basichttpcontext.setAttribute("http.proxy_host", httphost);
                basichttpcontext.setAttribute("http.connection", proxyconnection);
                basichttpcontext.setAttribute("http.request", obj);
                basichttpcontext.setAttribute("http.auth.proxy-scope", proxyAuthState);
                basichttpcontext.setAttribute("http.auth.credentials-provider", obj1);
                basichttpcontext.setAttribute("http.authscheme-registry", authSchemeRegistry);
                requestExec.preProcess(((HttpRequest) (obj)), httpProcessor, basichttpcontext);
                obj = requestExec.execute(((HttpRequest) (obj)), proxyconnection, basichttpcontext);
                ((HttpResponse) (obj)).setParams(params);
                requestExec.postProcess(((HttpResponse) (obj)), httpProcessor, basichttpcontext);
                if (((HttpResponse) (obj)).getStatusLine().getStatusCode() < 200)
                {
                    throw new HttpException((new StringBuilder()).append("Unexpected response to CONNECT request: ").append(((HttpResponse) (obj)).getStatusLine()).toString());
                }
            } while (!HttpClientParams.isAuthenticating(params));
            if (!authenticator.isAuthenticationRequested(httphost, ((HttpResponse) (obj)), proxyAuthStrategy, proxyAuthState, basichttpcontext) || !authenticator.authenticate(httphost, ((HttpResponse) (obj)), proxyAuthStrategy, proxyAuthState, basichttpcontext))
            {
                break;
            }
            if (reuseStrategy.keepAlive(((HttpResponse) (obj)), basichttpcontext))
            {
                EntityUtils.consume(((HttpResponse) (obj)).getEntity());
            } else
            {
                proxyconnection.close();
            }
        } while (true);
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() > 299)
        {
            httphost = ((HttpResponse) (obj)).getEntity();
            if (httphost != null)
            {
                ((HttpResponse) (obj)).setEntity(new BufferedHttpEntity(httphost));
            }
            proxyconnection.close();
            throw new TunnelRefusedException((new StringBuilder()).append("CONNECT refused by proxy: ").append(((HttpResponse) (obj)).getStatusLine()).toString(), ((HttpResponse) (obj)));
        } else
        {
            return proxyconnection.getSocket();
        }
    }
}
