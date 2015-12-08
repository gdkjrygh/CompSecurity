// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Network;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpEngine

public final class RouteSelector
{

    private final Address address;
    private final OkHttpClient client;
    private List connectionSpecs;
    private List inetSocketAddresses;
    private InetSocketAddress lastInetSocketAddress;
    private Proxy lastProxy;
    private ConnectionSpec lastSpec;
    private final Network network;
    private int nextInetSocketAddressIndex;
    private int nextProxyIndex;
    private int nextSpecIndex;
    private final ConnectionPool pool;
    private final List postponedRoutes = new ArrayList();
    private List proxies;
    private final Request request;
    private final RouteDatabase routeDatabase;
    private final URI uri;

    private RouteSelector(Address address1, URI uri1, OkHttpClient okhttpclient, Request request1)
    {
        proxies = Collections.emptyList();
        inetSocketAddresses = Collections.emptyList();
        connectionSpecs = Collections.emptyList();
        address = address1;
        uri = uri1;
        client = okhttpclient;
        pool = okhttpclient.getConnectionPool();
        routeDatabase = Internal.instance.routeDatabase(okhttpclient);
        network = Internal.instance.network(okhttpclient);
        request = request1;
        resetNextProxy(uri1, address1.getProxy());
    }

    public static RouteSelector get(Request request1, OkHttpClient okhttpclient)
        throws IOException
    {
        String s = request1.url().getHost();
        if (s == null || s.length() == 0)
        {
            throw new UnknownHostException(request1.url().toString());
        }
        javax.net.ssl.SSLSocketFactory sslsocketfactory = null;
        javax.net.ssl.HostnameVerifier hostnameverifier = null;
        com.squareup.okhttp.CertificatePinner certificatepinner = null;
        if (request1.isHttps())
        {
            sslsocketfactory = okhttpclient.getSslSocketFactory();
            hostnameverifier = okhttpclient.getHostnameVerifier();
            certificatepinner = okhttpclient.getCertificatePinner();
        }
        return new RouteSelector(new Address(s, Util.getEffectivePort(request1.url()), okhttpclient.getSocketFactory(), sslsocketfactory, hostnameverifier, certificatepinner, okhttpclient.getAuthenticator(), okhttpclient.getProxy(), okhttpclient.getProtocols(), okhttpclient.getConnectionSpecs(), okhttpclient.getProxySelector()), request1.uri(), okhttpclient, request1);
    }

    static String getHostString(InetSocketAddress inetsocketaddress)
    {
        InetAddress inetaddress = inetsocketaddress.getAddress();
        if (inetaddress == null)
        {
            return inetsocketaddress.getHostName();
        } else
        {
            return inetaddress.getHostAddress();
        }
    }

    private boolean hasNextConnectionSpec()
    {
        return nextSpecIndex < connectionSpecs.size();
    }

    private boolean hasNextInetSocketAddress()
    {
        return nextInetSocketAddressIndex < inetSocketAddresses.size();
    }

    private boolean hasNextPostponed()
    {
        return !postponedRoutes.isEmpty();
    }

    private boolean hasNextProxy()
    {
        return nextProxyIndex < proxies.size();
    }

    private ConnectionSpec nextConnectionSpec()
        throws IOException
    {
        if (!hasNextConnectionSpec())
        {
            throw new SocketException((new StringBuilder()).append("No route to ").append(address.getUriHost()).append("; exhausted connection specs: ").append(connectionSpecs).toString());
        } else
        {
            List list = connectionSpecs;
            int i = nextSpecIndex;
            nextSpecIndex = i + 1;
            return (ConnectionSpec)list.get(i);
        }
    }

    private InetSocketAddress nextInetSocketAddress()
        throws IOException
    {
        if (!hasNextInetSocketAddress())
        {
            throw new SocketException((new StringBuilder()).append("No route to ").append(address.getUriHost()).append("; exhausted inet socket addresses: ").append(inetSocketAddresses).toString());
        } else
        {
            Object obj = inetSocketAddresses;
            int i = nextInetSocketAddressIndex;
            nextInetSocketAddressIndex = i + 1;
            obj = (InetSocketAddress)((List) (obj)).get(i);
            resetConnectionSpecs();
            return ((InetSocketAddress) (obj));
        }
    }

    private Route nextPostponed()
    {
        return (Route)postponedRoutes.remove(0);
    }

    private Proxy nextProxy()
        throws IOException
    {
        if (!hasNextProxy())
        {
            throw new SocketException((new StringBuilder()).append("No route to ").append(address.getUriHost()).append("; exhausted proxy configurations: ").append(proxies).toString());
        } else
        {
            Object obj = proxies;
            int i = nextProxyIndex;
            nextProxyIndex = i + 1;
            obj = (Proxy)((List) (obj)).get(i);
            resetNextInetSocketAddress(((Proxy) (obj)));
            return ((Proxy) (obj));
        }
    }

    private void resetConnectionSpecs()
    {
        connectionSpecs = new ArrayList();
        List list = address.getConnectionSpecs();
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            ConnectionSpec connectionspec = (ConnectionSpec)list.get(i);
            if (request.isHttps() == connectionspec.isTls())
            {
                connectionSpecs.add(connectionspec);
            }
        }

        nextSpecIndex = 0;
    }

    private void resetNextInetSocketAddress(Proxy proxy)
        throws UnknownHostException
    {
        inetSocketAddresses = new ArrayList();
        int i;
        int k;
        if (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.SOCKS)
        {
            proxy = address.getUriHost();
            i = Util.getEffectivePort(uri);
        } else
        {
            proxy = proxy.address();
            if (!(proxy instanceof InetSocketAddress))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Proxy.address() is not an InetSocketAddress: ").append(proxy.getClass()).toString());
            }
            InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy;
            proxy = getHostString(inetsocketaddress);
            i = inetsocketaddress.getPort();
        }
        proxy = network.resolveInetAddresses(proxy);
        k = proxy.length;
        for (int j = 0; j < k; j++)
        {
            InetAddress inetaddress = proxy[j];
            inetSocketAddresses.add(new InetSocketAddress(inetaddress, i));
        }

        nextInetSocketAddressIndex = 0;
    }

    private void resetNextProxy(URI uri1, Proxy proxy)
    {
        if (proxy != null)
        {
            proxies = Collections.singletonList(proxy);
        } else
        {
            proxies = new ArrayList();
            uri1 = client.getProxySelector().select(uri1);
            if (uri1 != null)
            {
                proxies.addAll(uri1);
            }
            proxies.removeAll(Collections.singleton(Proxy.NO_PROXY));
            proxies.add(Proxy.NO_PROXY);
        }
        nextProxyIndex = 0;
    }

    private boolean shouldSendTlsFallbackIndicator(ConnectionSpec connectionspec)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (connectionspec != connectionSpecs.get(0))
        {
            flag = flag1;
            if (connectionspec.isTls())
            {
                flag = true;
            }
        }
        return flag;
    }

    public void connectFailed(Connection connection, IOException ioexception)
    {
        if (Internal.instance.recycleCount(connection) <= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        connection = connection.getRoute();
        if (connection.getProxy().type() != java.net.Proxy.Type.DIRECT && address.getProxySelector() != null)
        {
            address.getProxySelector().connectFailed(uri, connection.getProxy().address(), ioexception);
        }
        routeDatabase.failed(connection);
        if (!(ioexception instanceof SSLHandshakeException) && !(ioexception instanceof SSLProtocolException))
        {
            while (nextSpecIndex < connectionSpecs.size()) 
            {
                connection = connectionSpecs;
                int i = nextSpecIndex;
                nextSpecIndex = i + 1;
                connection = (ConnectionSpec)connection.get(i);
                boolean flag = shouldSendTlsFallbackIndicator(connection);
                connection = new Route(address, lastProxy, lastInetSocketAddress, connection, flag);
                routeDatabase.failed(connection);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean hasNext()
    {
        return hasNextConnectionSpec() || hasNextInetSocketAddress() || hasNextProxy() || hasNextPostponed();
    }

    public Connection next(HttpEngine httpengine)
        throws IOException
    {
        Connection connection = nextUnconnected();
        Internal.instance.connectAndSetOwner(client, connection, httpengine, request);
        return connection;
    }

    Connection nextUnconnected()
        throws IOException
    {
        do
        {
            Connection connection = pool.get(address);
            if (connection == null)
            {
                break;
            }
            if (request.method().equals("GET") || Internal.instance.isReadable(connection))
            {
                return connection;
            }
            connection.getSocket().close();
        } while (true);
        if (!hasNextConnectionSpec())
        {
            if (!hasNextInetSocketAddress())
            {
                if (!hasNextProxy())
                {
                    if (!hasNextPostponed())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        return new Connection(pool, nextPostponed());
                    }
                }
                lastProxy = nextProxy();
            }
            lastInetSocketAddress = nextInetSocketAddress();
        }
        lastSpec = nextConnectionSpec();
        boolean flag = shouldSendTlsFallbackIndicator(lastSpec);
        Route route = new Route(address, lastProxy, lastInetSocketAddress, lastSpec, flag);
        if (routeDatabase.shouldPostpone(route))
        {
            postponedRoutes.add(route);
            return nextUnconnected();
        } else
        {
            return new Connection(pool, route);
        }
    }
}
