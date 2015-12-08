// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.ConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpEntityEnclosingRequest;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.ProtocolException;
import ch.boye.httpclientandroidlib.RequestLine;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthProtocolState;
import ch.boye.httpclientandroidlib.auth.AuthScheme;
import ch.boye.httpclientandroidlib.auth.AuthState;
import ch.boye.httpclientandroidlib.auth.UsernamePasswordCredentials;
import ch.boye.httpclientandroidlib.client.AuthenticationHandler;
import ch.boye.httpclientandroidlib.client.AuthenticationStrategy;
import ch.boye.httpclientandroidlib.client.HttpRequestRetryHandler;
import ch.boye.httpclientandroidlib.client.NonRepeatableRequestException;
import ch.boye.httpclientandroidlib.client.RedirectException;
import ch.boye.httpclientandroidlib.client.RedirectHandler;
import ch.boye.httpclientandroidlib.client.RedirectStrategy;
import ch.boye.httpclientandroidlib.client.RequestDirector;
import ch.boye.httpclientandroidlib.client.UserTokenHandler;
import ch.boye.httpclientandroidlib.client.methods.AbortableHttpRequest;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.client.params.HttpClientParams;
import ch.boye.httpclientandroidlib.client.utils.URIUtils;
import ch.boye.httpclientandroidlib.conn.BasicManagedEntity;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.conn.ClientConnectionRequest;
import ch.boye.httpclientandroidlib.conn.ConnectionKeepAliveStrategy;
import ch.boye.httpclientandroidlib.conn.ManagedClientConnection;
import ch.boye.httpclientandroidlib.conn.routing.BasicRouteDirector;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.conn.routing.HttpRouteDirector;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoutePlanner;
import ch.boye.httpclientandroidlib.conn.scheme.Scheme;
import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import ch.boye.httpclientandroidlib.entity.BufferedHttpEntity;
import ch.boye.httpclientandroidlib.impl.auth.BasicScheme;
import ch.boye.httpclientandroidlib.impl.conn.ConnectionShutdownException;
import ch.boye.httpclientandroidlib.message.BasicHttpRequest;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpProcessor;
import ch.boye.httpclientandroidlib.protocol.HttpRequestExecutor;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            AuthenticationStrategyAdaptor, HttpAuthenticator, DefaultRedirectStrategyAdaptor, RoutedRequest, 
//            RequestWrapper, EntityEnclosingRequestWrapper, TunnelRefusedException

public class DefaultRequestDirector
    implements RequestDirector
{

    private final HttpAuthenticator authenticator;
    protected final ClientConnectionManager connManager;
    private int execCount;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    public HttpClientAndroidLog log;
    protected ManagedClientConnection managedConn;
    private int maxRedirects;
    protected final HttpParams params;
    protected final AuthenticationHandler proxyAuthHandler;
    protected final AuthState proxyAuthState;
    protected final AuthenticationStrategy proxyAuthStrategy;
    private int redirectCount;
    protected final RedirectHandler redirectHandler;
    protected final RedirectStrategy redirectStrategy;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    protected final AuthenticationHandler targetAuthHandler;
    protected final AuthState targetAuthState;
    protected final AuthenticationStrategy targetAuthStrategy;
    protected final UserTokenHandler userTokenHandler;
    private HttpHost virtualHost;

    public DefaultRequestDirector(HttpClientAndroidLog httpclientandroidlog, HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, 
            HttpRequestRetryHandler httprequestretryhandler, RedirectStrategy redirectstrategy, AuthenticationHandler authenticationhandler, AuthenticationHandler authenticationhandler1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        this(new HttpClientAndroidLog(ch/boye/httpclientandroidlib/impl/client/DefaultRequestDirector), httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, redirectstrategy, ((AuthenticationStrategy) (new AuthenticationStrategyAdaptor(authenticationhandler))), ((AuthenticationStrategy) (new AuthenticationStrategyAdaptor(authenticationhandler1))), usertokenhandler, httpparams);
    }

    public DefaultRequestDirector(HttpClientAndroidLog httpclientandroidlog, HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, 
            HttpRequestRetryHandler httprequestretryhandler, RedirectStrategy redirectstrategy, AuthenticationStrategy authenticationstrategy, AuthenticationStrategy authenticationstrategy1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        if (httpclientandroidlog == null)
        {
            throw new IllegalArgumentException("Log may not be null.");
        }
        if (httprequestexecutor == null)
        {
            throw new IllegalArgumentException("Request executor may not be null.");
        }
        if (clientconnectionmanager == null)
        {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        }
        if (connectionreusestrategy == null)
        {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        }
        if (connectionkeepalivestrategy == null)
        {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        }
        if (httprouteplanner == null)
        {
            throw new IllegalArgumentException("Route planner may not be null.");
        }
        if (httpprocessor == null)
        {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        }
        if (httprequestretryhandler == null)
        {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        }
        if (redirectstrategy == null)
        {
            throw new IllegalArgumentException("Redirect strategy may not be null.");
        }
        if (authenticationstrategy == null)
        {
            throw new IllegalArgumentException("Target authentication strategy may not be null.");
        }
        if (authenticationstrategy1 == null)
        {
            throw new IllegalArgumentException("Proxy authentication strategy may not be null.");
        }
        if (usertokenhandler == null)
        {
            throw new IllegalArgumentException("User token handler may not be null.");
        }
        if (httpparams == null)
        {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        log = httpclientandroidlog;
        authenticator = new HttpAuthenticator(httpclientandroidlog);
        requestExec = httprequestexecutor;
        connManager = clientconnectionmanager;
        reuseStrategy = connectionreusestrategy;
        keepAliveStrategy = connectionkeepalivestrategy;
        routePlanner = httprouteplanner;
        httpProcessor = httpprocessor;
        retryHandler = httprequestretryhandler;
        redirectStrategy = redirectstrategy;
        targetAuthStrategy = authenticationstrategy;
        proxyAuthStrategy = authenticationstrategy1;
        userTokenHandler = usertokenhandler;
        params = httpparams;
        if (redirectstrategy instanceof DefaultRedirectStrategyAdaptor)
        {
            redirectHandler = ((DefaultRedirectStrategyAdaptor)redirectstrategy).getHandler();
        } else
        {
            redirectHandler = null;
        }
        if (authenticationstrategy instanceof AuthenticationStrategyAdaptor)
        {
            targetAuthHandler = ((AuthenticationStrategyAdaptor)authenticationstrategy).getHandler();
        } else
        {
            targetAuthHandler = null;
        }
        if (authenticationstrategy1 instanceof AuthenticationStrategyAdaptor)
        {
            proxyAuthHandler = ((AuthenticationStrategyAdaptor)authenticationstrategy1).getHandler();
        } else
        {
            proxyAuthHandler = null;
        }
        managedConn = null;
        execCount = 0;
        redirectCount = 0;
        targetAuthState = new AuthState();
        proxyAuthState = new AuthState();
        maxRedirects = params.getIntParameter("http.protocol.max-redirects", 100);
    }

    public DefaultRequestDirector(HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, HttpRequestRetryHandler httprequestretryhandler, 
            RedirectHandler redirecthandler, AuthenticationHandler authenticationhandler, AuthenticationHandler authenticationhandler1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        this(new HttpClientAndroidLog(ch/boye/httpclientandroidlib/impl/client/DefaultRequestDirector), httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, ((RedirectStrategy) (new DefaultRedirectStrategyAdaptor(redirecthandler))), ((AuthenticationStrategy) (new AuthenticationStrategyAdaptor(authenticationhandler))), ((AuthenticationStrategy) (new AuthenticationStrategyAdaptor(authenticationhandler1))), usertokenhandler, httpparams);
    }

    private void abortConnection()
    {
        ManagedClientConnection managedclientconnection = managedConn;
        if (managedclientconnection == null) goto _L2; else goto _L1
_L1:
        managedConn = null;
        managedclientconnection.abortConnection();
_L4:
        managedclientconnection.releaseConnection();
_L2:
        return;
        IOException ioexception1;
        ioexception1;
        if (log.isDebugEnabled())
        {
            log.debug(ioexception1.getMessage(), ioexception1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        log.debug("Error releasing connection", ioexception);
        return;
    }

    private void tryConnect(RoutedRequest routedrequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        HttpRoute httproute;
        int i;
        httproute = routedrequest.getRoute();
        routedrequest = routedrequest.getRequest();
        i = 0;
_L4:
        int j;
        httpcontext.setAttribute("http.request", routedrequest);
        j = i + 1;
        if (managedConn.isOpen())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        managedConn.open(httproute, httpcontext, params);
_L2:
        establishRoute(httproute, httpcontext);
        return;
        managedConn.setSocketTimeout(HttpConnectionParams.getSoTimeout(params));
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        ioexception;
        try
        {
            managedConn.close();
        }
        catch (IOException ioexception1) { }
        if (!retryHandler.retryRequest(ioexception, j, httpcontext))
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (log.isInfoEnabled())
        {
            log.info((new StringBuilder()).append("I/O exception (").append(ioexception.getClass().getName()).append(") caught when connecting to the target host: ").append(ioexception.getMessage()).toString());
            if (log.isDebugEnabled())
            {
                log.debug(ioexception.getMessage(), ioexception);
            }
            log.info("Retrying connect");
            i = j;
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw ioexception;
    }

    private HttpResponse tryExecute(RoutedRequest routedrequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        RequestWrapper requestwrapper;
        HttpRoute httproute;
        requestwrapper = routedrequest.getRequest();
        httproute = routedrequest.getRoute();
        routedrequest = null;
_L2:
        execCount = execCount + 1;
        requestwrapper.incrementExecCount();
        if (!requestwrapper.isRepeatable())
        {
            log.debug("Cannot retry non-repeatable request");
            if (routedrequest != null)
            {
                throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", routedrequest);
            } else
            {
                throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
            }
        }
label0:
        {
            if (!managedConn.isOpen())
            {
                if (httproute.isTunnelled())
                {
                    break label0;
                }
                log.debug("Reopening the direct connection.");
                managedConn.open(httproute, httpcontext, params);
            }
            if (log.isDebugEnabled())
            {
                log.debug((new StringBuilder()).append("Attempt ").append(execCount).append(" to execute request").toString());
            }
            return requestExec.execute(requestwrapper, managedConn, httpcontext);
        }
        log.debug("Proxied connection. Need to start over.");
        return null;
        routedrequest;
        log.debug("Closing the connection.");
        try
        {
            managedConn.close();
        }
        catch (IOException ioexception) { }
        if (retryHandler.retryRequest(routedrequest, requestwrapper.getExecCount(), httpcontext))
        {
            if (log.isInfoEnabled())
            {
                log.info((new StringBuilder()).append("I/O exception (").append(routedrequest.getClass().getName()).append(") caught when processing request: ").append(routedrequest.getMessage()).toString());
            }
            if (log.isDebugEnabled())
            {
                log.debug(routedrequest.getMessage(), routedrequest);
            }
            log.info("Retrying request");
        } else
        {
            throw routedrequest;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private RequestWrapper wrapRequest(HttpRequest httprequest)
        throws ProtocolException
    {
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            return new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)httprequest);
        } else
        {
            return new RequestWrapper(httprequest);
        }
    }

    protected HttpRequest createConnectRequest(HttpRoute httproute, HttpContext httpcontext)
    {
        httpcontext = httproute.getTargetHost();
        httproute = httpcontext.getHostName();
        int j = httpcontext.getPort();
        int i = j;
        if (j < 0)
        {
            i = connManager.getSchemeRegistry().getScheme(httpcontext.getSchemeName()).getDefaultPort();
        }
        httpcontext = new StringBuilder(httproute.length() + 6);
        httpcontext.append(httproute);
        httpcontext.append(':');
        httpcontext.append(Integer.toString(i));
        return new BasicHttpRequest("CONNECT", httpcontext.toString(), HttpProtocolParams.getVersion(params));
    }

    protected boolean createTunnelToProxy(HttpRoute httproute, int i, HttpContext httpcontext)
        throws HttpException, IOException
    {
        throw new HttpException("Proxy chains are not supported.");
    }

    protected boolean createTunnelToTarget(HttpRoute httproute, HttpContext httpcontext)
        throws HttpException, IOException
    {
        HttpHost httphost = httproute.getProxyHost();
        HttpHost httphost1 = httproute.getTargetHost();
        Object obj;
        do
        {
            do
            {
                if (!managedConn.isOpen())
                {
                    managedConn.open(httproute, httpcontext, params);
                }
                obj = createConnectRequest(httproute, httpcontext);
                ((HttpRequest) (obj)).setParams(params);
                httpcontext.setAttribute("http.target_host", httphost1);
                httpcontext.setAttribute("http.proxy_host", httphost);
                httpcontext.setAttribute("http.connection", managedConn);
                httpcontext.setAttribute("http.request", obj);
                requestExec.preProcess(((HttpRequest) (obj)), httpProcessor, httpcontext);
                obj = requestExec.execute(((HttpRequest) (obj)), managedConn, httpcontext);
                ((HttpResponse) (obj)).setParams(params);
                requestExec.postProcess(((HttpResponse) (obj)), httpProcessor, httpcontext);
                if (((HttpResponse) (obj)).getStatusLine().getStatusCode() < 200)
                {
                    throw new HttpException((new StringBuilder()).append("Unexpected response to CONNECT request: ").append(((HttpResponse) (obj)).getStatusLine()).toString());
                }
            } while (!HttpClientParams.isAuthenticating(params));
            if (!authenticator.isAuthenticationRequested(httphost, ((HttpResponse) (obj)), proxyAuthStrategy, proxyAuthState, httpcontext) || !authenticator.authenticate(httphost, ((HttpResponse) (obj)), proxyAuthStrategy, proxyAuthState, httpcontext))
            {
                break;
            }
            if (reuseStrategy.keepAlive(((HttpResponse) (obj)), httpcontext))
            {
                log.debug("Connection kept alive");
                EntityUtils.consume(((HttpResponse) (obj)).getEntity());
            } else
            {
                managedConn.close();
            }
        } while (true);
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() > 299)
        {
            httproute = ((HttpResponse) (obj)).getEntity();
            if (httproute != null)
            {
                ((HttpResponse) (obj)).setEntity(new BufferedHttpEntity(httproute));
            }
            managedConn.close();
            throw new TunnelRefusedException((new StringBuilder()).append("CONNECT refused by proxy: ").append(((HttpResponse) (obj)).getStatusLine()).toString(), ((HttpResponse) (obj)));
        } else
        {
            managedConn.markReusable();
            return false;
        }
    }

    protected HttpRoute determineRoute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException
    {
        HttpHost httphost1 = httphost;
        if (httphost == null)
        {
            httphost1 = (HttpHost)httprequest.getParams().getParameter("http.default-host");
        }
        if (httphost1 == null)
        {
            throw new IllegalStateException("Target host must not be null, or set in parameters.");
        } else
        {
            return routePlanner.determineRoute(httphost1, httprequest, httpcontext);
        }
    }

    protected void establishRoute(HttpRoute httproute, HttpContext httpcontext)
        throws HttpException, IOException
    {
        BasicRouteDirector basicroutedirector = new BasicRouteDirector();
_L9:
        HttpRoute httproute1;
        int i;
        httproute1 = managedConn.getRoute();
        i = basicroutedirector.nextStep(httproute, httproute1);
        i;
        JVM INSTR tableswitch -1 5: default 76
    //                   -1 238
    //                   0 126
    //                   1 111
    //                   2 111
    //                   3 132
    //                   4 168
    //                   5 221;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L6 _L7
_L1:
        throw new IllegalStateException((new StringBuilder()).append("Unknown step indicator ").append(i).append(" from RouteDirector.").toString());
_L4:
        managedConn.open(httproute, httpcontext, params);
_L3:
        if (i > 0) goto _L9; else goto _L8
_L8:
        return;
_L5:
        boolean flag = createTunnelToTarget(httproute, httpcontext);
        log.debug("Tunnel to target created.");
        managedConn.tunnelTarget(flag, params);
          goto _L3
_L6:
        int j = httproute1.getHopCount() - 1;
        boolean flag1 = createTunnelToProxy(httproute, j, httpcontext);
        log.debug("Tunnel to proxy created.");
        managedConn.tunnelProxy(httproute.getHopTarget(j), flag1, params);
          goto _L3
_L7:
        managedConn.layerProtocol(httpcontext, params);
          goto _L3
          goto _L9
_L2:
        throw new HttpException((new StringBuilder()).append("Unable to establish route: planned = ").append(httproute).append("; current = ").append(httproute1).toString());
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        Object obj;
        boolean flag;
        boolean flag2;
        httpcontext.setAttribute("http.auth.target-scope", targetAuthState);
        httpcontext.setAttribute("http.auth.proxy-scope", proxyAuthState);
        obj = wrapRequest(httprequest);
        ((RequestWrapper) (obj)).setParams(params);
        HttpRoute httproute = determineRoute(httphost, ((HttpRequest) (obj)), httpcontext);
        virtualHost = (HttpHost)((RequestWrapper) (obj)).getParams().getParameter("http.virtual-host");
        if (virtualHost != null && virtualHost.getPort() == -1)
        {
            int i = httphost.getPort();
            if (i != -1)
            {
                virtualHost = new HttpHost(virtualHost.getHostName(), i, virtualHost.getSchemeName());
            }
        }
        obj = new RoutedRequest(((RequestWrapper) (obj)), httproute);
        flag2 = false;
        flag = false;
        httphost = null;
_L4:
        if (flag) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj3;
        Object obj4;
        long l;
        obj2 = ((RoutedRequest) (obj)).getRequest();
        obj4 = ((RoutedRequest) (obj)).getRoute();
        obj3 = httpcontext.getAttribute("http.user-token");
        if (managedConn != null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        httphost = connManager.requestConnection(((HttpRoute) (obj4)), obj3);
        if (httprequest instanceof AbortableHttpRequest)
        {
            ((AbortableHttpRequest)httprequest).setConnectionRequest(httphost);
        }
        l = HttpClientParams.getConnectionManagerTimeout(params);
        Object obj1;
        boolean flag1;
        boolean flag3;
        try
        {
            managedConn = httphost.getConnection(l, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (HttpHost httphost)
        {
            try
            {
                httprequest = new InterruptedIOException();
                httprequest.initCause(httphost);
                throw httprequest;
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                httprequest = new InterruptedIOException("Connection has been shut down");
                httprequest.initCause(httphost);
                throw httprequest;
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                abortConnection();
                throw httphost;
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                abortConnection();
                throw httphost;
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                abortConnection();
            }
            throw httphost;
        }
        if (HttpConnectionParams.isStaleCheckingEnabled(params) && managedConn.isOpen())
        {
            log.debug("Stale connection check");
            if (managedConn.isStale())
            {
                log.debug("Stale connection detected");
                managedConn.close();
            }
        }
        if (httprequest instanceof AbortableHttpRequest)
        {
            ((AbortableHttpRequest)httprequest).setReleaseTrigger(managedConn);
        }
        tryConnect(((RoutedRequest) (obj)), httpcontext);
        httphost = ((RequestWrapper) (obj2)).getURI().getUserInfo();
        if (httphost == null)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        targetAuthState.update(new BasicScheme(), new UsernamePasswordCredentials(httphost));
        ((RequestWrapper) (obj2)).resetHeaders();
        rewriteRequestURI(((RequestWrapper) (obj2)), ((HttpRoute) (obj4)));
        obj1 = virtualHost;
        httphost = ((HttpHost) (obj1));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        httphost = ((HttpRoute) (obj4)).getTargetHost();
        obj1 = ((HttpRoute) (obj4)).getProxyHost();
        httpcontext.setAttribute("http.target_host", httphost);
        httpcontext.setAttribute("http.proxy_host", obj1);
        httpcontext.setAttribute("http.connection", managedConn);
        requestExec.preProcess(((HttpRequest) (obj2)), httpProcessor, httpcontext);
        obj4 = tryExecute(((RoutedRequest) (obj)), httpcontext);
        httphost = ((HttpHost) (obj4));
        if (obj4 == null) goto _L4; else goto _L3
_L3:
        ((HttpResponse) (obj4)).setParams(params);
        requestExec.postProcess(((HttpResponse) (obj4)), httpProcessor, httpcontext);
        flag3 = reuseStrategy.keepAlive(((HttpResponse) (obj4)), httpcontext);
        if (!flag3) goto _L6; else goto _L5
_L5:
        l = keepAliveStrategy.getKeepAliveDuration(((HttpResponse) (obj4)), httpcontext);
        if (!log.isDebugEnabled()) goto _L8; else goto _L7
_L7:
        if (l <= 0L) goto _L10; else goto _L9
_L9:
        httphost = (new StringBuilder()).append("for ").append(l).append(" ").append(TimeUnit.MILLISECONDS).toString();
_L19:
        log.debug((new StringBuilder()).append("Connection can be kept alive ").append(httphost).toString());
_L8:
        managedConn.setIdleDuration(l, TimeUnit.MILLISECONDS);
_L6:
        obj1 = handleResponse(((RoutedRequest) (obj)), ((HttpResponse) (obj4)), httpcontext);
        if (obj1 != null) goto _L12; else goto _L11
_L11:
        flag1 = true;
        obj1 = obj;
_L20:
        flag = flag1;
        httphost = ((HttpHost) (obj4));
        flag2 = flag3;
        obj = obj1;
        if (managedConn == null) goto _L4; else goto _L13
_L13:
        obj2 = obj3;
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_699;
        }
        obj2 = userTokenHandler.getUserToken(httpcontext);
        httpcontext.setAttribute("http.user-token", obj2);
        flag = flag1;
        httphost = ((HttpHost) (obj4));
        flag2 = flag3;
        obj = obj1;
        if (obj2 == null) goto _L4; else goto _L14
_L14:
        managedConn.setState(obj2);
        flag = flag1;
        httphost = ((HttpHost) (obj4));
        flag2 = flag3;
        obj = obj1;
          goto _L4
        httphost;
        if (log.isDebugEnabled())
        {
            log.debug(httphost.getMessage());
        }
        httphost = httphost.getResponse();
_L2:
        if (httphost == null) goto _L16; else goto _L15
_L15:
        if (httphost.getEntity() != null && httphost.getEntity().isStreaming()) goto _L17; else goto _L16
_L16:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_860;
        }
        managedConn.markReusable();
        releaseConnection();
        return httphost;
_L12:
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_913;
        }
        EntityUtils.consume(((HttpResponse) (obj4)).getEntity());
        managedConn.markReusable();
_L18:
        if (!((RoutedRequest) (obj1)).getRoute().equals(((RoutedRequest) (obj)).getRoute()))
        {
            releaseConnection();
        }
        break MISSING_BLOCK_LABEL_1083;
        managedConn.close();
        if (proxyAuthState.getState() == AuthProtocolState.SUCCESS && proxyAuthState.getAuthScheme() != null && proxyAuthState.getAuthScheme().isConnectionBased())
        {
            log.debug("Resetting proxy auth state");
            proxyAuthState.reset();
        }
        if (targetAuthState.getState() == AuthProtocolState.SUCCESS && targetAuthState.getAuthScheme() != null && targetAuthState.getAuthScheme().isConnectionBased())
        {
            log.debug("Resetting target auth state");
            targetAuthState.reset();
        }
          goto _L18
_L17:
        httphost.setEntity(new BasicManagedEntity(httphost.getEntity(), managedConn, flag2));
        return httphost;
_L10:
        httphost = "indefinitely";
          goto _L19
        flag1 = flag;
          goto _L20
    }

    protected RoutedRequest handleResponse(RoutedRequest routedrequest, HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj3 = routedrequest.getRoute();
        obj1 = routedrequest.getRequest();
        obj = ((RequestWrapper) (obj1)).getParams();
        if (!HttpClientParams.isRedirecting(((HttpParams) (obj))) || !redirectStrategy.isRedirected(((HttpRequest) (obj1)), httpresponse, httpcontext)) goto _L2; else goto _L1
_L1:
        if (redirectCount >= maxRedirects)
        {
            throw new RedirectException((new StringBuilder()).append("Maximum redirects (").append(maxRedirects).append(") exceeded").toString());
        }
        redirectCount = redirectCount + 1;
        virtualHost = null;
        routedrequest = redirectStrategy.getRedirect(((HttpRequest) (obj1)), httpresponse, httpcontext);
        routedrequest.setHeaders(((RequestWrapper) (obj1)).getOriginal().getAllHeaders());
        httpresponse = routedrequest.getURI();
        if (httpresponse.getHost() == null)
        {
            throw new ProtocolException((new StringBuilder()).append("Redirect URI does not specify a valid host name: ").append(httpresponse).toString());
        }
        obj1 = new HttpHost(httpresponse.getHost(), httpresponse.getPort(), httpresponse.getScheme());
        if (!((HttpRoute) (obj3)).getTargetHost().equals(obj1))
        {
            log.debug("Resetting target auth state");
            targetAuthState.reset();
            obj3 = proxyAuthState.getAuthScheme();
            if (obj3 != null && ((AuthScheme) (obj3)).isConnectionBased())
            {
                log.debug("Resetting proxy auth state");
                proxyAuthState.reset();
            }
        }
        routedrequest = wrapRequest(routedrequest);
        routedrequest.setParams(((HttpParams) (obj)));
        httpcontext = determineRoute(((HttpHost) (obj1)), routedrequest, httpcontext);
        routedrequest = new RoutedRequest(routedrequest, httpcontext);
        if (log.isDebugEnabled())
        {
            log.debug((new StringBuilder()).append("Redirecting to '").append(httpresponse).append("' via ").append(httpcontext).toString());
        }
_L4:
        return routedrequest;
_L2:
        if (!HttpClientParams.isAuthenticating(((HttpParams) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = (HttpHost)httpcontext.getAttribute("http.target_host");
        obj = obj2;
        if (obj2 == null)
        {
            obj = ((HttpRoute) (obj3)).getTargetHost();
        }
        obj2 = obj;
        if (((HttpHost) (obj)).getPort() < 0)
        {
            obj2 = connManager.getSchemeRegistry().getScheme(((HttpHost) (obj)));
            obj2 = new HttpHost(((HttpHost) (obj)).getHostName(), ((Scheme) (obj2)).getDefaultPort(), ((HttpHost) (obj)).getSchemeName());
        }
        if (authenticator.isAuthenticationRequested(((HttpHost) (obj2)), httpresponse, targetAuthStrategy, targetAuthState, httpcontext))
        {
            if (!authenticator.authenticate(((HttpHost) (obj2)), httpresponse, targetAuthStrategy, targetAuthState, httpcontext))
            {
                return null;
            }
            continue; /* Loop/switch isn't completed */
        }
        obj = ((HttpRoute) (obj3)).getProxyHost();
        if (!authenticator.isAuthenticationRequested(((HttpHost) (obj)), httpresponse, proxyAuthStrategy, proxyAuthState, httpcontext))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!authenticator.authenticate(((HttpHost) (obj)), httpresponse, proxyAuthStrategy, proxyAuthState, httpcontext))
        {
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    protected void releaseConnection()
    {
        try
        {
            managedConn.releaseConnection();
        }
        catch (IOException ioexception)
        {
            log.debug("IOException releasing connection", ioexception);
        }
        managedConn = null;
    }

    protected void rewriteRequestURI(RequestWrapper requestwrapper, HttpRoute httproute)
        throws ProtocolException
    {
        URI uri = requestwrapper.getURI();
        if (httproute.getProxyHost() == null || httproute.isTunnelled()) goto _L2; else goto _L1
_L1:
        if (uri.isAbsolute()) goto _L4; else goto _L3
_L3:
        httproute = URIUtils.rewriteURI(uri, httproute.getTargetHost(), true);
_L5:
        requestwrapper.setURI(httproute);
        return;
_L4:
        try
        {
            httproute = URIUtils.rewriteURI(uri);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRoute httproute)
        {
            throw new ProtocolException((new StringBuilder()).append("Invalid URI: ").append(requestwrapper.getRequestLine().getUri()).toString(), httproute);
        }
          goto _L5
_L2:
label0:
        {
            if (!uri.isAbsolute())
            {
                break label0;
            }
            httproute = URIUtils.rewriteURI(uri, null);
        }
          goto _L5
        httproute = URIUtils.rewriteURI(uri);
          goto _L5
    }
}
