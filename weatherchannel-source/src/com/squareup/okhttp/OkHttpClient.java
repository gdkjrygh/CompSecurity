// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Network;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.AuthenticatorAdapter;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.Transport;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.squareup.okhttp:
//            Protocol, ConnectionSpec, Dispatcher, Cache, 
//            CertificatePinner, ConnectionPool, Call, Authenticator, 
//            Request, Connection, Response

public class OkHttpClient
    implements Cloneable
{

    private static final List DEFAULT_CONNECTION_SPECS;
    private static final List DEFAULT_PROTOCOLS;
    private static SSLSocketFactory defaultSslSocketFactory;
    private Authenticator authenticator;
    private Cache cache;
    private CertificatePinner certificatePinner;
    private int connectTimeout;
    private ConnectionPool connectionPool;
    private List connectionSpecs;
    private CookieHandler cookieHandler;
    private Dispatcher dispatcher;
    private boolean followRedirects;
    private boolean followSslRedirects;
    private HostnameVerifier hostnameVerifier;
    private final List interceptors;
    private InternalCache internalCache;
    private Network network;
    private final List networkInterceptors;
    private List protocols;
    private Proxy proxy;
    private ProxySelector proxySelector;
    private int readTimeout;
    private boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private SocketFactory socketFactory;
    private SSLSocketFactory sslSocketFactory;
    private int writeTimeout;

    public OkHttpClient()
    {
        interceptors = new ArrayList();
        networkInterceptors = new ArrayList();
        followSslRedirects = true;
        followRedirects = true;
        retryOnConnectionFailure = true;
        routeDatabase = new RouteDatabase();
        dispatcher = new Dispatcher();
    }

    private OkHttpClient(OkHttpClient okhttpclient)
    {
        interceptors = new ArrayList();
        networkInterceptors = new ArrayList();
        followSslRedirects = true;
        followRedirects = true;
        retryOnConnectionFailure = true;
        routeDatabase = okhttpclient.routeDatabase;
        dispatcher = okhttpclient.dispatcher;
        proxy = okhttpclient.proxy;
        protocols = okhttpclient.protocols;
        connectionSpecs = okhttpclient.connectionSpecs;
        interceptors.addAll(okhttpclient.interceptors);
        networkInterceptors.addAll(okhttpclient.networkInterceptors);
        proxySelector = okhttpclient.proxySelector;
        cookieHandler = okhttpclient.cookieHandler;
        cache = okhttpclient.cache;
        InternalCache internalcache;
        if (cache != null)
        {
            internalcache = cache.internalCache;
        } else
        {
            internalcache = okhttpclient.internalCache;
        }
        internalCache = internalcache;
        socketFactory = okhttpclient.socketFactory;
        sslSocketFactory = okhttpclient.sslSocketFactory;
        hostnameVerifier = okhttpclient.hostnameVerifier;
        certificatePinner = okhttpclient.certificatePinner;
        authenticator = okhttpclient.authenticator;
        connectionPool = okhttpclient.connectionPool;
        network = okhttpclient.network;
        followSslRedirects = okhttpclient.followSslRedirects;
        followRedirects = okhttpclient.followRedirects;
        retryOnConnectionFailure = okhttpclient.retryOnConnectionFailure;
        connectTimeout = okhttpclient.connectTimeout;
        readTimeout = okhttpclient.readTimeout;
        writeTimeout = okhttpclient.writeTimeout;
    }

    private SSLSocketFactory getDefaultSSLSocketFactory()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = defaultSslSocketFactory;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = SSLContext.getInstance("TLS");
        ((SSLContext) (obj)).init(null, null, null);
        defaultSslSocketFactory = ((SSLContext) (obj)).getSocketFactory();
        obj = defaultSslSocketFactory;
        this;
        JVM INSTR monitorexit ;
        return ((SSLSocketFactory) (obj));
        Object obj1;
        obj1;
        throw new AssertionError();
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public OkHttpClient cancel(Object obj)
    {
        getDispatcher().cancel(obj);
        return this;
    }

    public final OkHttpClient clone()
    {
        OkHttpClient okhttpclient;
        try
        {
            okhttpclient = (OkHttpClient)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return okhttpclient;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    final OkHttpClient copyWithDefaults()
    {
        OkHttpClient okhttpclient = new OkHttpClient(this);
        if (okhttpclient.proxySelector == null)
        {
            okhttpclient.proxySelector = ProxySelector.getDefault();
        }
        if (okhttpclient.cookieHandler == null)
        {
            okhttpclient.cookieHandler = CookieHandler.getDefault();
        }
        if (okhttpclient.socketFactory == null)
        {
            okhttpclient.socketFactory = SocketFactory.getDefault();
        }
        if (okhttpclient.sslSocketFactory == null)
        {
            okhttpclient.sslSocketFactory = getDefaultSSLSocketFactory();
        }
        if (okhttpclient.hostnameVerifier == null)
        {
            okhttpclient.hostnameVerifier = OkHostnameVerifier.INSTANCE;
        }
        if (okhttpclient.certificatePinner == null)
        {
            okhttpclient.certificatePinner = CertificatePinner.DEFAULT;
        }
        if (okhttpclient.authenticator == null)
        {
            okhttpclient.authenticator = AuthenticatorAdapter.INSTANCE;
        }
        if (okhttpclient.connectionPool == null)
        {
            okhttpclient.connectionPool = ConnectionPool.getDefault();
        }
        if (okhttpclient.protocols == null)
        {
            okhttpclient.protocols = DEFAULT_PROTOCOLS;
        }
        if (okhttpclient.connectionSpecs == null)
        {
            okhttpclient.connectionSpecs = DEFAULT_CONNECTION_SPECS;
        }
        if (okhttpclient.network == null)
        {
            okhttpclient.network = Network.DEFAULT;
        }
        return okhttpclient;
    }

    public final Authenticator getAuthenticator()
    {
        return authenticator;
    }

    public final Cache getCache()
    {
        return cache;
    }

    public final CertificatePinner getCertificatePinner()
    {
        return certificatePinner;
    }

    public final int getConnectTimeout()
    {
        return connectTimeout;
    }

    public final ConnectionPool getConnectionPool()
    {
        return connectionPool;
    }

    public final List getConnectionSpecs()
    {
        return connectionSpecs;
    }

    public final CookieHandler getCookieHandler()
    {
        return cookieHandler;
    }

    public final Dispatcher getDispatcher()
    {
        return dispatcher;
    }

    public final boolean getFollowRedirects()
    {
        return followRedirects;
    }

    public final boolean getFollowSslRedirects()
    {
        return followSslRedirects;
    }

    public final HostnameVerifier getHostnameVerifier()
    {
        return hostnameVerifier;
    }

    public final List getProtocols()
    {
        return protocols;
    }

    public final Proxy getProxy()
    {
        return proxy;
    }

    public final ProxySelector getProxySelector()
    {
        return proxySelector;
    }

    public final int getReadTimeout()
    {
        return readTimeout;
    }

    public final boolean getRetryOnConnectionFailure()
    {
        return retryOnConnectionFailure;
    }

    public final SocketFactory getSocketFactory()
    {
        return socketFactory;
    }

    public final SSLSocketFactory getSslSocketFactory()
    {
        return sslSocketFactory;
    }

    public final int getWriteTimeout()
    {
        return writeTimeout;
    }

    public List interceptors()
    {
        return interceptors;
    }

    final InternalCache internalCache()
    {
        return internalCache;
    }

    public List networkInterceptors()
    {
        return networkInterceptors;
    }

    public Call newCall(Request request)
    {
        return new Call(this, request);
    }

    final RouteDatabase routeDatabase()
    {
        return routeDatabase;
    }

    public final OkHttpClient setAuthenticator(Authenticator authenticator1)
    {
        authenticator = authenticator1;
        return this;
    }

    public final OkHttpClient setCache(Cache cache1)
    {
        cache = cache1;
        internalCache = null;
        return this;
    }

    public final OkHttpClient setCertificatePinner(CertificatePinner certificatepinner)
    {
        certificatePinner = certificatepinner;
        return this;
    }

    public final void setConnectTimeout(long l, TimeUnit timeunit)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        l = timeunit.toMillis(l);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        } else
        {
            connectTimeout = (int)l;
            return;
        }
    }

    public final OkHttpClient setConnectionPool(ConnectionPool connectionpool)
    {
        connectionPool = connectionpool;
        return this;
    }

    public final OkHttpClient setConnectionSpecs(List list)
    {
        connectionSpecs = Util.immutableList(list);
        return this;
    }

    public final OkHttpClient setCookieHandler(CookieHandler cookiehandler)
    {
        cookieHandler = cookiehandler;
        return this;
    }

    public final OkHttpClient setDispatcher(Dispatcher dispatcher1)
    {
        if (dispatcher1 == null)
        {
            throw new IllegalArgumentException("dispatcher == null");
        } else
        {
            dispatcher = dispatcher1;
            return this;
        }
    }

    public final void setFollowRedirects(boolean flag)
    {
        followRedirects = flag;
    }

    public final OkHttpClient setFollowSslRedirects(boolean flag)
    {
        followSslRedirects = flag;
        return this;
    }

    public final OkHttpClient setHostnameVerifier(HostnameVerifier hostnameverifier)
    {
        hostnameVerifier = hostnameverifier;
        return this;
    }

    final void setInternalCache(InternalCache internalcache)
    {
        internalCache = internalcache;
        cache = null;
    }

    public final OkHttpClient setProtocols(List list)
    {
        list = Util.immutableList(list);
        if (!list.contains(Protocol.HTTP_1_1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("protocols doesn't contain http/1.1: ").append(list).toString());
        }
        if (list.contains(Protocol.HTTP_1_0))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("protocols must not contain http/1.0: ").append(list).toString());
        }
        if (list.contains(null))
        {
            throw new IllegalArgumentException("protocols must not contain null");
        } else
        {
            protocols = Util.immutableList(list);
            return this;
        }
    }

    public final OkHttpClient setProxy(Proxy proxy1)
    {
        proxy = proxy1;
        return this;
    }

    public final OkHttpClient setProxySelector(ProxySelector proxyselector)
    {
        proxySelector = proxyselector;
        return this;
    }

    public final void setReadTimeout(long l, TimeUnit timeunit)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        l = timeunit.toMillis(l);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        } else
        {
            readTimeout = (int)l;
            return;
        }
    }

    public final void setRetryOnConnectionFailure(boolean flag)
    {
        retryOnConnectionFailure = flag;
    }

    public final OkHttpClient setSocketFactory(SocketFactory socketfactory)
    {
        socketFactory = socketfactory;
        return this;
    }

    public final OkHttpClient setSslSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        sslSocketFactory = sslsocketfactory;
        return this;
    }

    public final void setWriteTimeout(long l, TimeUnit timeunit)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("unit == null");
        }
        l = timeunit.toMillis(l);
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Timeout too large.");
        } else
        {
            writeTimeout = (int)l;
            return;
        }
    }

    static 
    {
        DEFAULT_PROTOCOLS = Util.immutableList(new Protocol[] {
            Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1
        });
        DEFAULT_CONNECTION_SPECS = Util.immutableList(new ConnectionSpec[] {
            ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS, ConnectionSpec.CLEARTEXT
        });
        Internal.instance = new Internal() {

            public void addLine(Headers.Builder builder, String s)
            {
                builder.addLine(s);
            }

            public Connection callEngineGetConnection(Call call)
            {
                return call.engine.getConnection();
            }

            public void callEngineReleaseConnection(Call call)
                throws IOException
            {
                call.engine.releaseConnection();
            }

            public Response callGetResponse(Call call, boolean flag)
                throws IOException
            {
                return call.getResponse(call.originalRequest, flag);
            }

            public boolean clearOwner(Connection connection)
            {
                return connection.clearOwner();
            }

            public void closeIfOwnedBy(Connection connection, Object obj)
                throws IOException
            {
                connection.closeIfOwnedBy(obj);
            }

            public void connectAndSetOwner(OkHttpClient okhttpclient, Connection connection, HttpEngine httpengine, Request request)
                throws IOException
            {
                connection.connectAndSetOwner(okhttpclient, httpengine, request);
            }

            public boolean connectionClearOwner(Connection connection)
            {
                return connection.clearOwner();
            }

            public void connectionCloseIfOwnedBy(Connection connection, Object obj)
                throws IOException
            {
                connection.closeIfOwnedBy(obj);
            }

            public void connectionSetOwner(Connection connection, Object obj)
            {
                connection.setOwner(obj);
            }

            public InternalCache internalCache(OkHttpClient okhttpclient)
            {
                return okhttpclient.internalCache();
            }

            public boolean isReadable(Connection connection)
            {
                return connection.isReadable();
            }

            public Network network(OkHttpClient okhttpclient)
            {
                return okhttpclient.network;
            }

            public Call newCall(OkHttpClient okhttpclient, Request request)
            {
                return new Call(okhttpclient, request);
            }

            public Transport newTransport(Connection connection, HttpEngine httpengine)
                throws IOException
            {
                return connection.newTransport(httpengine);
            }

            public void recycle(ConnectionPool connectionpool, Connection connection)
            {
                connectionpool.recycle(connection);
            }

            public int recycleCount(Connection connection)
            {
                return connection.recycleCount();
            }

            public RouteDatabase routeDatabase(OkHttpClient okhttpclient)
            {
                return okhttpclient.routeDatabase();
            }

            public void setCache(OkHttpClient okhttpclient, InternalCache internalcache)
            {
                okhttpclient.setInternalCache(internalcache);
            }

            public void setNetwork(OkHttpClient okhttpclient, Network network1)
            {
                okhttpclient.network = network1;
            }

            public void setOwner(Connection connection, HttpEngine httpengine)
            {
                connection.setOwner(httpengine);
            }

            public void setProtocol(Connection connection, Protocol protocol)
            {
                connection.setProtocol(protocol);
            }

        };
    }



/*
    static Network access$002(OkHttpClient okhttpclient, Network network1)
    {
        okhttpclient.network = network1;
        return network1;
    }

*/
}
