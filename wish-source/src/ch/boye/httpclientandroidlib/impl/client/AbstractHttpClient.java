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
import ch.boye.httpclientandroidlib.HttpResponseInterceptor;
import ch.boye.httpclientandroidlib.androidextra.HttpClientAndroidLog;
import ch.boye.httpclientandroidlib.auth.AuthSchemeRegistry;
import ch.boye.httpclientandroidlib.client.AuthenticationHandler;
import ch.boye.httpclientandroidlib.client.AuthenticationStrategy;
import ch.boye.httpclientandroidlib.client.BackoffManager;
import ch.boye.httpclientandroidlib.client.ClientProtocolException;
import ch.boye.httpclientandroidlib.client.ConnectionBackoffStrategy;
import ch.boye.httpclientandroidlib.client.CookieStore;
import ch.boye.httpclientandroidlib.client.CredentialsProvider;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.client.HttpRequestRetryHandler;
import ch.boye.httpclientandroidlib.client.RedirectHandler;
import ch.boye.httpclientandroidlib.client.RedirectStrategy;
import ch.boye.httpclientandroidlib.client.RequestDirector;
import ch.boye.httpclientandroidlib.client.ResponseHandler;
import ch.boye.httpclientandroidlib.client.UserTokenHandler;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import ch.boye.httpclientandroidlib.client.utils.URIUtils;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManagerFactory;
import ch.boye.httpclientandroidlib.conn.ConnectionKeepAliveStrategy;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoutePlanner;
import ch.boye.httpclientandroidlib.cookie.CookieSpecRegistry;
import ch.boye.httpclientandroidlib.impl.DefaultConnectionReuseStrategy;
import ch.boye.httpclientandroidlib.impl.auth.BasicSchemeFactory;
import ch.boye.httpclientandroidlib.impl.auth.DigestSchemeFactory;
import ch.boye.httpclientandroidlib.impl.auth.NTLMSchemeFactory;
import ch.boye.httpclientandroidlib.impl.conn.BasicClientConnectionManager;
import ch.boye.httpclientandroidlib.impl.conn.DefaultHttpRoutePlanner;
import ch.boye.httpclientandroidlib.impl.conn.SchemeRegistryFactory;
import ch.boye.httpclientandroidlib.impl.cookie.BestMatchSpecFactory;
import ch.boye.httpclientandroidlib.impl.cookie.BrowserCompatSpecFactory;
import ch.boye.httpclientandroidlib.impl.cookie.IgnoreSpecFactory;
import ch.boye.httpclientandroidlib.impl.cookie.NetscapeDraftSpecFactory;
import ch.boye.httpclientandroidlib.impl.cookie.RFC2109SpecFactory;
import ch.boye.httpclientandroidlib.impl.cookie.RFC2965SpecFactory;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.protocol.BasicHttpContext;
import ch.boye.httpclientandroidlib.protocol.BasicHttpProcessor;
import ch.boye.httpclientandroidlib.protocol.DefaultedHttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.protocol.HttpProcessor;
import ch.boye.httpclientandroidlib.protocol.HttpRequestExecutor;
import ch.boye.httpclientandroidlib.protocol.ImmutableHttpProcessor;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            DefaultRequestDirector, DefaultConnectionKeepAliveStrategy, BasicCookieStore, BasicCredentialsProvider, 
//            DefaultHttpRequestRetryHandler, DefaultProxyAuthenticationHandler, ProxyAuthenticationStrategy, DefaultRedirectHandler, 
//            DefaultTargetAuthenticationHandler, TargetAuthenticationStrategy, DefaultUserTokenHandler, ClientParamsStack, 
//            DefaultRedirectStrategy, AuthenticationStrategyAdaptor, DefaultRedirectStrategyAdaptor

public abstract class AbstractHttpClient
    implements HttpClient
{

    private BackoffManager backoffManager;
    private ClientConnectionManager connManager;
    private ConnectionBackoffStrategy connectionBackoffStrategy;
    private CookieStore cookieStore;
    private CredentialsProvider credsProvider;
    private HttpParams defaultParams;
    private ConnectionKeepAliveStrategy keepAliveStrategy;
    public HttpClientAndroidLog log;
    private BasicHttpProcessor mutableProcessor;
    private ImmutableHttpProcessor protocolProcessor;
    private AuthenticationStrategy proxyAuthStrategy;
    private RedirectStrategy redirectStrategy;
    private HttpRequestExecutor requestExec;
    private HttpRequestRetryHandler retryHandler;
    private ConnectionReuseStrategy reuseStrategy;
    private HttpRoutePlanner routePlanner;
    private AuthSchemeRegistry supportedAuthSchemes;
    private CookieSpecRegistry supportedCookieSpecs;
    private AuthenticationStrategy targetAuthStrategy;
    private UserTokenHandler userTokenHandler;

    protected AbstractHttpClient(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        log = new HttpClientAndroidLog(getClass());
        defaultParams = httpparams;
        connManager = clientconnectionmanager;
    }

    private static HttpHost determineTarget(HttpUriRequest httpurirequest)
        throws ClientProtocolException
    {
        Object obj = null;
        URI uri = httpurirequest.getURI();
        httpurirequest = obj;
        if (uri.isAbsolute())
        {
            HttpHost httphost = URIUtils.extractHost(uri);
            httpurirequest = httphost;
            if (httphost == null)
            {
                throw new ClientProtocolException((new StringBuilder()).append("URI does not specify a valid host name: ").append(uri).toString());
            }
        }
        return httpurirequest;
    }

    private final HttpProcessor getProtocolProcessor()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        HttpRequestInterceptor ahttprequestinterceptor[];
        int j;
        if (protocolProcessor != null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj = getHttpProcessor();
        j = ((BasicHttpProcessor) (obj)).getRequestInterceptorCount();
        ahttprequestinterceptor = new HttpRequestInterceptor[j];
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ahttprequestinterceptor[i] = ((BasicHttpProcessor) (obj)).getRequestInterceptor(i);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        HttpResponseInterceptor ahttpresponseinterceptor[];
        j = ((BasicHttpProcessor) (obj)).getResponseInterceptorCount();
        ahttpresponseinterceptor = new HttpResponseInterceptor[j];
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ahttpresponseinterceptor[i] = ((BasicHttpProcessor) (obj)).getResponseInterceptor(i);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        protocolProcessor = new ImmutableHttpProcessor(ahttprequestinterceptor, ahttpresponseinterceptor);
        obj = protocolProcessor;
        this;
        JVM INSTR monitorexit ;
        return ((HttpProcessor) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public void addRequestInterceptor(HttpRequestInterceptor httprequestinterceptor)
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().addInterceptor(httprequestinterceptor);
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        httprequestinterceptor;
        throw httprequestinterceptor;
    }

    public void addRequestInterceptor(HttpRequestInterceptor httprequestinterceptor, int i)
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().addInterceptor(httprequestinterceptor, i);
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        httprequestinterceptor;
        throw httprequestinterceptor;
    }

    public void addResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor)
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().addInterceptor(httpresponseinterceptor);
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        httpresponseinterceptor;
        throw httpresponseinterceptor;
    }

    public void addResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor, int i)
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().addInterceptor(httpresponseinterceptor, i);
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        httpresponseinterceptor;
        throw httpresponseinterceptor;
    }

    public void clearRequestInterceptors()
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().clearRequestInterceptors();
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void clearResponseInterceptors()
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().clearResponseInterceptors();
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected AuthSchemeRegistry createAuthSchemeRegistry()
    {
        AuthSchemeRegistry authschemeregistry = new AuthSchemeRegistry();
        authschemeregistry.register("Basic", new BasicSchemeFactory());
        authschemeregistry.register("Digest", new DigestSchemeFactory());
        authschemeregistry.register("NTLM", new NTLMSchemeFactory());
        return authschemeregistry;
    }

    protected ClientConnectionManager createClientConnectionManager()
    {
        ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry schemeregistry = SchemeRegistryFactory.createDefault();
        HttpParams httpparams = getParams();
        ClientConnectionManagerFactory clientconnectionmanagerfactory = null;
        String s = (String)httpparams.getParameter("http.connection-manager.factory-class-name");
        if (s != null)
        {
            try
            {
                clientconnectionmanagerfactory = (ClientConnectionManagerFactory)Class.forName(s).newInstance();
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                throw new IllegalStateException((new StringBuilder()).append("Invalid class name: ").append(s).toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new IllegalAccessError(illegalaccessexception.getMessage());
            }
            catch (InstantiationException instantiationexception)
            {
                throw new InstantiationError(instantiationexception.getMessage());
            }
        }
        if (clientconnectionmanagerfactory != null)
        {
            return clientconnectionmanagerfactory.newInstance(httpparams, schemeregistry);
        } else
        {
            return new BasicClientConnectionManager(schemeregistry);
        }
    }

    protected RequestDirector createClientRequestDirector(HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, HttpRequestRetryHandler httprequestretryhandler, 
            RedirectHandler redirecthandler, AuthenticationHandler authenticationhandler, AuthenticationHandler authenticationhandler1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        return new DefaultRequestDirector(httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, redirecthandler, authenticationhandler, authenticationhandler1, usertokenhandler, httpparams);
    }

    protected RequestDirector createClientRequestDirector(HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, HttpRequestRetryHandler httprequestretryhandler, 
            RedirectStrategy redirectstrategy, AuthenticationHandler authenticationhandler, AuthenticationHandler authenticationhandler1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        return new DefaultRequestDirector(log, httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, redirectstrategy, authenticationhandler, authenticationhandler1, usertokenhandler, httpparams);
    }

    protected RequestDirector createClientRequestDirector(HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, HttpRequestRetryHandler httprequestretryhandler, 
            RedirectStrategy redirectstrategy, AuthenticationStrategy authenticationstrategy, AuthenticationStrategy authenticationstrategy1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        return new DefaultRequestDirector(log, httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, redirectstrategy, authenticationstrategy, authenticationstrategy1, usertokenhandler, httpparams);
    }

    protected ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy()
    {
        return new DefaultConnectionKeepAliveStrategy();
    }

    protected ConnectionReuseStrategy createConnectionReuseStrategy()
    {
        return new DefaultConnectionReuseStrategy();
    }

    protected CookieSpecRegistry createCookieSpecRegistry()
    {
        CookieSpecRegistry cookiespecregistry = new CookieSpecRegistry();
        cookiespecregistry.register("best-match", new BestMatchSpecFactory());
        cookiespecregistry.register("compatibility", new BrowserCompatSpecFactory());
        cookiespecregistry.register("netscape", new NetscapeDraftSpecFactory());
        cookiespecregistry.register("rfc2109", new RFC2109SpecFactory());
        cookiespecregistry.register("rfc2965", new RFC2965SpecFactory());
        cookiespecregistry.register("ignoreCookies", new IgnoreSpecFactory());
        return cookiespecregistry;
    }

    protected CookieStore createCookieStore()
    {
        return new BasicCookieStore();
    }

    protected CredentialsProvider createCredentialsProvider()
    {
        return new BasicCredentialsProvider();
    }

    protected HttpContext createHttpContext()
    {
        BasicHttpContext basichttpcontext = new BasicHttpContext();
        basichttpcontext.setAttribute("http.scheme-registry", getConnectionManager().getSchemeRegistry());
        basichttpcontext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basichttpcontext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basichttpcontext.setAttribute("http.cookie-store", getCookieStore());
        basichttpcontext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basichttpcontext;
    }

    protected abstract HttpParams createHttpParams();

    protected abstract BasicHttpProcessor createHttpProcessor();

    protected HttpRequestRetryHandler createHttpRequestRetryHandler()
    {
        return new DefaultHttpRequestRetryHandler();
    }

    protected HttpRoutePlanner createHttpRoutePlanner()
    {
        return new DefaultHttpRoutePlanner(getConnectionManager().getSchemeRegistry());
    }

    protected AuthenticationHandler createProxyAuthenticationHandler()
    {
        return new DefaultProxyAuthenticationHandler();
    }

    protected AuthenticationStrategy createProxyAuthenticationStrategy()
    {
        return new ProxyAuthenticationStrategy();
    }

    protected RedirectHandler createRedirectHandler()
    {
        return new DefaultRedirectHandler();
    }

    protected HttpRequestExecutor createRequestExecutor()
    {
        return new HttpRequestExecutor();
    }

    protected AuthenticationHandler createTargetAuthenticationHandler()
    {
        return new DefaultTargetAuthenticationHandler();
    }

    protected AuthenticationStrategy createTargetAuthenticationStrategy()
    {
        return new TargetAuthenticationStrategy();
    }

    protected UserTokenHandler createUserTokenHandler()
    {
        return new DefaultUserTokenHandler();
    }

    protected HttpParams determineParams(HttpRequest httprequest)
    {
        return new ClientParamsStack(null, getParams(), httprequest.getParams(), null);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
        throws IOException, ClientProtocolException
    {
        return execute(httphost, httprequest, (HttpContext)null);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("Request must not be null.");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj = createHttpContext();
        if (httpcontext != null) goto _L2; else goto _L1
_L1:
        httpcontext = ((HttpContext) (obj));
_L8:
        ConnectionBackoffStrategy connectionbackoffstrategy;
        BackoffManager backoffmanager;
        RequestDirector requestdirector;
        HttpRoutePlanner httprouteplanner;
        requestdirector = createClientRequestDirector(getRequestExecutor(), getConnectionManager(), getConnectionReuseStrategy(), getConnectionKeepAliveStrategy(), getRoutePlanner(), getProtocolProcessor(), getHttpRequestRetryHandler(), getRedirectStrategy(), getTargetAuthenticationStrategy(), getProxyAuthenticationStrategy(), getUserTokenHandler(), determineParams(httprequest));
        httprouteplanner = getRoutePlanner();
        connectionbackoffstrategy = getConnectionBackoffStrategy();
        backoffmanager = getBackoffManager();
        this;
        JVM INSTR monitorexit ;
        if (connectionbackoffstrategy == null || backoffmanager == null) goto _L4; else goto _L3
_L3:
        if (httphost != null)
        {
            obj = httphost;
        } else
        {
            try
            {
                obj = (HttpHost)determineParams(httprequest).getParameter("http.default-host");
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                throw new ClientProtocolException(httphost);
            }
        }
        obj = httprouteplanner.determineRoute(((HttpHost) (obj)), httprequest, httpcontext);
        httphost = requestdirector.execute(httphost, httprequest, httpcontext);
        if (!connectionbackoffstrategy.shouldBackoff(httphost)) goto _L6; else goto _L5
_L5:
        backoffmanager.backOff(((ch.boye.httpclientandroidlib.conn.routing.HttpRoute) (obj)));
        return httphost;
_L2:
        httpcontext = new DefaultedHttpContext(httpcontext, ((HttpContext) (obj)));
        continue; /* Loop/switch isn't completed */
        httphost;
        this;
        JVM INSTR monitorexit ;
        throw httphost;
        httphost;
        if (connectionbackoffstrategy.shouldBackoff(httphost))
        {
            backoffmanager.backOff(((ch.boye.httpclientandroidlib.conn.routing.HttpRoute) (obj)));
        }
        throw httphost;
        httphost;
        if (connectionbackoffstrategy.shouldBackoff(httphost))
        {
            backoffmanager.backOff(((ch.boye.httpclientandroidlib.conn.routing.HttpRoute) (obj)));
        }
        if (httphost instanceof HttpException)
        {
            throw (HttpException)httphost;
        }
        if (httphost instanceof IOException)
        {
            throw (IOException)httphost;
        } else
        {
            throw new UndeclaredThrowableException(httphost);
        }
_L6:
        backoffmanager.probe(((ch.boye.httpclientandroidlib.conn.routing.HttpRoute) (obj)));
        return httphost;
_L4:
        httphost = requestdirector.execute(httphost, httprequest, httpcontext);
        return httphost;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException, ClientProtocolException
    {
        return execute(httpurirequest, (HttpContext)null);
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        if (httpurirequest == null)
        {
            throw new IllegalArgumentException("Request must not be null.");
        } else
        {
            return execute(determineTarget(httpurirequest), ((HttpRequest) (httpurirequest)), httpcontext);
        }
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
        throws IOException, ClientProtocolException
    {
        return execute(httphost, httprequest, responsehandler, null);
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        if (responsehandler == null)
        {
            throw new IllegalArgumentException("Response handler must not be null.");
        }
        httphost = execute(httphost, httprequest, httpcontext);
        try
        {
            httprequest = ((HttpRequest) (responsehandler.handleResponse(httphost)));
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            httphost = httphost.getEntity();
            try
            {
                EntityUtils.consume(httphost);
            }
            // Misplaced declaration of an exception variable
            catch (HttpHost httphost)
            {
                log.warn("Error consuming content after an exception.", httphost);
            }
            if (httprequest instanceof RuntimeException)
            {
                throw (RuntimeException)httprequest;
            }
            if (httprequest instanceof IOException)
            {
                throw (IOException)httprequest;
            } else
            {
                throw new UndeclaredThrowableException(httprequest);
            }
        }
        EntityUtils.consume(httphost.getEntity());
        return httprequest;
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
        throws IOException, ClientProtocolException
    {
        return execute(httpurirequest, responsehandler, ((HttpContext) (null)));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        return execute(determineTarget(httpurirequest), ((HttpRequest) (httpurirequest)), responsehandler, httpcontext);
    }

    public final AuthSchemeRegistry getAuthSchemes()
    {
        this;
        JVM INSTR monitorenter ;
        AuthSchemeRegistry authschemeregistry;
        if (supportedAuthSchemes == null)
        {
            supportedAuthSchemes = createAuthSchemeRegistry();
        }
        authschemeregistry = supportedAuthSchemes;
        this;
        JVM INSTR monitorexit ;
        return authschemeregistry;
        Exception exception;
        exception;
        throw exception;
    }

    public final BackoffManager getBackoffManager()
    {
        this;
        JVM INSTR monitorenter ;
        BackoffManager backoffmanager = backoffManager;
        this;
        JVM INSTR monitorexit ;
        return backoffmanager;
        Exception exception;
        exception;
        throw exception;
    }

    public final ConnectionBackoffStrategy getConnectionBackoffStrategy()
    {
        this;
        JVM INSTR monitorenter ;
        ConnectionBackoffStrategy connectionbackoffstrategy = connectionBackoffStrategy;
        this;
        JVM INSTR monitorexit ;
        return connectionbackoffstrategy;
        Exception exception;
        exception;
        throw exception;
    }

    public final ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy()
    {
        this;
        JVM INSTR monitorenter ;
        ConnectionKeepAliveStrategy connectionkeepalivestrategy;
        if (keepAliveStrategy == null)
        {
            keepAliveStrategy = createConnectionKeepAliveStrategy();
        }
        connectionkeepalivestrategy = keepAliveStrategy;
        this;
        JVM INSTR monitorexit ;
        return connectionkeepalivestrategy;
        Exception exception;
        exception;
        throw exception;
    }

    public final ClientConnectionManager getConnectionManager()
    {
        this;
        JVM INSTR monitorenter ;
        ClientConnectionManager clientconnectionmanager;
        if (connManager == null)
        {
            connManager = createClientConnectionManager();
        }
        clientconnectionmanager = connManager;
        this;
        JVM INSTR monitorexit ;
        return clientconnectionmanager;
        Exception exception;
        exception;
        throw exception;
    }

    public final ConnectionReuseStrategy getConnectionReuseStrategy()
    {
        this;
        JVM INSTR monitorenter ;
        ConnectionReuseStrategy connectionreusestrategy;
        if (reuseStrategy == null)
        {
            reuseStrategy = createConnectionReuseStrategy();
        }
        connectionreusestrategy = reuseStrategy;
        this;
        JVM INSTR monitorexit ;
        return connectionreusestrategy;
        Exception exception;
        exception;
        throw exception;
    }

    public final CookieSpecRegistry getCookieSpecs()
    {
        this;
        JVM INSTR monitorenter ;
        CookieSpecRegistry cookiespecregistry;
        if (supportedCookieSpecs == null)
        {
            supportedCookieSpecs = createCookieSpecRegistry();
        }
        cookiespecregistry = supportedCookieSpecs;
        this;
        JVM INSTR monitorexit ;
        return cookiespecregistry;
        Exception exception;
        exception;
        throw exception;
    }

    public final CookieStore getCookieStore()
    {
        this;
        JVM INSTR monitorenter ;
        CookieStore cookiestore;
        if (cookieStore == null)
        {
            cookieStore = createCookieStore();
        }
        cookiestore = cookieStore;
        this;
        JVM INSTR monitorexit ;
        return cookiestore;
        Exception exception;
        exception;
        throw exception;
    }

    public final CredentialsProvider getCredentialsProvider()
    {
        this;
        JVM INSTR monitorenter ;
        CredentialsProvider credentialsprovider;
        if (credsProvider == null)
        {
            credsProvider = createCredentialsProvider();
        }
        credentialsprovider = credsProvider;
        this;
        JVM INSTR monitorexit ;
        return credentialsprovider;
        Exception exception;
        exception;
        throw exception;
    }

    protected final BasicHttpProcessor getHttpProcessor()
    {
        this;
        JVM INSTR monitorenter ;
        BasicHttpProcessor basichttpprocessor;
        if (mutableProcessor == null)
        {
            mutableProcessor = createHttpProcessor();
        }
        basichttpprocessor = mutableProcessor;
        this;
        JVM INSTR monitorexit ;
        return basichttpprocessor;
        Exception exception;
        exception;
        throw exception;
    }

    public final HttpRequestRetryHandler getHttpRequestRetryHandler()
    {
        this;
        JVM INSTR monitorenter ;
        HttpRequestRetryHandler httprequestretryhandler;
        if (retryHandler == null)
        {
            retryHandler = createHttpRequestRetryHandler();
        }
        httprequestretryhandler = retryHandler;
        this;
        JVM INSTR monitorexit ;
        return httprequestretryhandler;
        Exception exception;
        exception;
        throw exception;
    }

    public final HttpParams getParams()
    {
        this;
        JVM INSTR monitorenter ;
        HttpParams httpparams;
        if (defaultParams == null)
        {
            defaultParams = createHttpParams();
        }
        httpparams = defaultParams;
        this;
        JVM INSTR monitorexit ;
        return httpparams;
        Exception exception;
        exception;
        throw exception;
    }

    public final AuthenticationHandler getProxyAuthenticationHandler()
    {
        this;
        JVM INSTR monitorenter ;
        AuthenticationHandler authenticationhandler = createProxyAuthenticationHandler();
        this;
        JVM INSTR monitorexit ;
        return authenticationhandler;
        Exception exception;
        exception;
        throw exception;
    }

    public final AuthenticationStrategy getProxyAuthenticationStrategy()
    {
        this;
        JVM INSTR monitorenter ;
        AuthenticationStrategy authenticationstrategy;
        if (proxyAuthStrategy == null)
        {
            proxyAuthStrategy = createProxyAuthenticationStrategy();
        }
        authenticationstrategy = proxyAuthStrategy;
        this;
        JVM INSTR monitorexit ;
        return authenticationstrategy;
        Exception exception;
        exception;
        throw exception;
    }

    public final RedirectHandler getRedirectHandler()
    {
        this;
        JVM INSTR monitorenter ;
        RedirectHandler redirecthandler = createRedirectHandler();
        this;
        JVM INSTR monitorexit ;
        return redirecthandler;
        Exception exception;
        exception;
        throw exception;
    }

    public final RedirectStrategy getRedirectStrategy()
    {
        this;
        JVM INSTR monitorenter ;
        RedirectStrategy redirectstrategy;
        if (redirectStrategy == null)
        {
            redirectStrategy = new DefaultRedirectStrategy();
        }
        redirectstrategy = redirectStrategy;
        this;
        JVM INSTR monitorexit ;
        return redirectstrategy;
        Exception exception;
        exception;
        throw exception;
    }

    public final HttpRequestExecutor getRequestExecutor()
    {
        this;
        JVM INSTR monitorenter ;
        HttpRequestExecutor httprequestexecutor;
        if (requestExec == null)
        {
            requestExec = createRequestExecutor();
        }
        httprequestexecutor = requestExec;
        this;
        JVM INSTR monitorexit ;
        return httprequestexecutor;
        Exception exception;
        exception;
        throw exception;
    }

    public HttpRequestInterceptor getRequestInterceptor(int i)
    {
        this;
        JVM INSTR monitorenter ;
        HttpRequestInterceptor httprequestinterceptor = getHttpProcessor().getRequestInterceptor(i);
        this;
        JVM INSTR monitorexit ;
        return httprequestinterceptor;
        Exception exception;
        exception;
        throw exception;
    }

    public int getRequestInterceptorCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = getHttpProcessor().getRequestInterceptorCount();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public HttpResponseInterceptor getResponseInterceptor(int i)
    {
        this;
        JVM INSTR monitorenter ;
        HttpResponseInterceptor httpresponseinterceptor = getHttpProcessor().getResponseInterceptor(i);
        this;
        JVM INSTR monitorexit ;
        return httpresponseinterceptor;
        Exception exception;
        exception;
        throw exception;
    }

    public int getResponseInterceptorCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = getHttpProcessor().getResponseInterceptorCount();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final HttpRoutePlanner getRoutePlanner()
    {
        this;
        JVM INSTR monitorenter ;
        HttpRoutePlanner httprouteplanner;
        if (routePlanner == null)
        {
            routePlanner = createHttpRoutePlanner();
        }
        httprouteplanner = routePlanner;
        this;
        JVM INSTR monitorexit ;
        return httprouteplanner;
        Exception exception;
        exception;
        throw exception;
    }

    public final AuthenticationHandler getTargetAuthenticationHandler()
    {
        this;
        JVM INSTR monitorenter ;
        AuthenticationHandler authenticationhandler = createTargetAuthenticationHandler();
        this;
        JVM INSTR monitorexit ;
        return authenticationhandler;
        Exception exception;
        exception;
        throw exception;
    }

    public final AuthenticationStrategy getTargetAuthenticationStrategy()
    {
        this;
        JVM INSTR monitorenter ;
        AuthenticationStrategy authenticationstrategy;
        if (targetAuthStrategy == null)
        {
            targetAuthStrategy = createTargetAuthenticationStrategy();
        }
        authenticationstrategy = targetAuthStrategy;
        this;
        JVM INSTR monitorexit ;
        return authenticationstrategy;
        Exception exception;
        exception;
        throw exception;
    }

    public final UserTokenHandler getUserTokenHandler()
    {
        this;
        JVM INSTR monitorenter ;
        UserTokenHandler usertokenhandler;
        if (userTokenHandler == null)
        {
            userTokenHandler = createUserTokenHandler();
        }
        usertokenhandler = userTokenHandler;
        this;
        JVM INSTR monitorexit ;
        return usertokenhandler;
        Exception exception;
        exception;
        throw exception;
    }

    public void removeRequestInterceptorByClass(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().removeRequestInterceptorByClass(class1);
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    public void removeResponseInterceptorByClass(Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        getHttpProcessor().removeResponseInterceptorByClass(class1);
        protocolProcessor = null;
        this;
        JVM INSTR monitorexit ;
        return;
        class1;
        throw class1;
    }

    public void setAuthSchemes(AuthSchemeRegistry authschemeregistry)
    {
        this;
        JVM INSTR monitorenter ;
        supportedAuthSchemes = authschemeregistry;
        this;
        JVM INSTR monitorexit ;
        return;
        authschemeregistry;
        throw authschemeregistry;
    }

    public void setBackoffManager(BackoffManager backoffmanager)
    {
        this;
        JVM INSTR monitorenter ;
        backoffManager = backoffmanager;
        this;
        JVM INSTR monitorexit ;
        return;
        backoffmanager;
        throw backoffmanager;
    }

    public void setConnectionBackoffStrategy(ConnectionBackoffStrategy connectionbackoffstrategy)
    {
        this;
        JVM INSTR monitorenter ;
        connectionBackoffStrategy = connectionbackoffstrategy;
        this;
        JVM INSTR monitorexit ;
        return;
        connectionbackoffstrategy;
        throw connectionbackoffstrategy;
    }

    public void setCookieSpecs(CookieSpecRegistry cookiespecregistry)
    {
        this;
        JVM INSTR monitorenter ;
        supportedCookieSpecs = cookiespecregistry;
        this;
        JVM INSTR monitorexit ;
        return;
        cookiespecregistry;
        throw cookiespecregistry;
    }

    public void setCookieStore(CookieStore cookiestore)
    {
        this;
        JVM INSTR monitorenter ;
        cookieStore = cookiestore;
        this;
        JVM INSTR monitorexit ;
        return;
        cookiestore;
        throw cookiestore;
    }

    public void setCredentialsProvider(CredentialsProvider credentialsprovider)
    {
        this;
        JVM INSTR monitorenter ;
        credsProvider = credentialsprovider;
        this;
        JVM INSTR monitorexit ;
        return;
        credentialsprovider;
        throw credentialsprovider;
    }

    public void setHttpRequestRetryHandler(HttpRequestRetryHandler httprequestretryhandler)
    {
        this;
        JVM INSTR monitorenter ;
        retryHandler = httprequestretryhandler;
        this;
        JVM INSTR monitorexit ;
        return;
        httprequestretryhandler;
        throw httprequestretryhandler;
    }

    public void setKeepAliveStrategy(ConnectionKeepAliveStrategy connectionkeepalivestrategy)
    {
        this;
        JVM INSTR monitorenter ;
        keepAliveStrategy = connectionkeepalivestrategy;
        this;
        JVM INSTR monitorexit ;
        return;
        connectionkeepalivestrategy;
        throw connectionkeepalivestrategy;
    }

    public void setParams(HttpParams httpparams)
    {
        this;
        JVM INSTR monitorenter ;
        defaultParams = httpparams;
        this;
        JVM INSTR monitorexit ;
        return;
        httpparams;
        throw httpparams;
    }

    public void setProxyAuthenticationHandler(AuthenticationHandler authenticationhandler)
    {
        this;
        JVM INSTR monitorenter ;
        proxyAuthStrategy = new AuthenticationStrategyAdaptor(authenticationhandler);
        this;
        JVM INSTR monitorexit ;
        return;
        authenticationhandler;
        throw authenticationhandler;
    }

    public void setProxyAuthenticationStrategy(AuthenticationStrategy authenticationstrategy)
    {
        this;
        JVM INSTR monitorenter ;
        proxyAuthStrategy = authenticationstrategy;
        this;
        JVM INSTR monitorexit ;
        return;
        authenticationstrategy;
        throw authenticationstrategy;
    }

    public void setRedirectHandler(RedirectHandler redirecthandler)
    {
        this;
        JVM INSTR monitorenter ;
        redirectStrategy = new DefaultRedirectStrategyAdaptor(redirecthandler);
        this;
        JVM INSTR monitorexit ;
        return;
        redirecthandler;
        throw redirecthandler;
    }

    public void setRedirectStrategy(RedirectStrategy redirectstrategy)
    {
        this;
        JVM INSTR monitorenter ;
        redirectStrategy = redirectstrategy;
        this;
        JVM INSTR monitorexit ;
        return;
        redirectstrategy;
        throw redirectstrategy;
    }

    public void setReuseStrategy(ConnectionReuseStrategy connectionreusestrategy)
    {
        this;
        JVM INSTR monitorenter ;
        reuseStrategy = connectionreusestrategy;
        this;
        JVM INSTR monitorexit ;
        return;
        connectionreusestrategy;
        throw connectionreusestrategy;
    }

    public void setRoutePlanner(HttpRoutePlanner httprouteplanner)
    {
        this;
        JVM INSTR monitorenter ;
        routePlanner = httprouteplanner;
        this;
        JVM INSTR monitorexit ;
        return;
        httprouteplanner;
        throw httprouteplanner;
    }

    public void setTargetAuthenticationHandler(AuthenticationHandler authenticationhandler)
    {
        this;
        JVM INSTR monitorenter ;
        targetAuthStrategy = new AuthenticationStrategyAdaptor(authenticationhandler);
        this;
        JVM INSTR monitorexit ;
        return;
        authenticationhandler;
        throw authenticationhandler;
    }

    public void setTargetAuthenticationStrategy(AuthenticationStrategy authenticationstrategy)
    {
        this;
        JVM INSTR monitorenter ;
        targetAuthStrategy = authenticationstrategy;
        this;
        JVM INSTR monitorexit ;
        return;
        authenticationstrategy;
        throw authenticationstrategy;
    }

    public void setUserTokenHandler(UserTokenHandler usertokenhandler)
    {
        this;
        JVM INSTR monitorenter ;
        userTokenHandler = usertokenhandler;
        this;
        JVM INSTR monitorexit ;
        return;
        usertokenhandler;
        throw usertokenhandler;
    }
}
