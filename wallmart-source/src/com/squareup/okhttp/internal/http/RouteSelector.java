// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
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
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;

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
        routeDatabase = Internal.instance.routeDatabase(okhttpclient);
        network = Internal.instance.network(okhttpclient);
        request = request1;
        resetNextProxy(uri1, address1.getProxy());
    }

    public static RouteSelector get(Address address1, Request request1, OkHttpClient okhttpclient)
        throws IOException
    {
        return new RouteSelector(address1, request1.uri(), okhttpclient, request1);
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
        if (connectionSpecs.isEmpty())
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("No route to ");
            String s;
            if (uri.getScheme() != null)
            {
                s = (new StringBuilder()).append(uri.getScheme()).append("://").toString();
            } else
            {
                s = "//";
            }
            throw new UnknownServiceException(stringbuilder.append(s).append(address.getUriHost()).append("; no connection specs").toString());
        }
        if (!hasNextConnectionSpec())
        {
            StringBuilder stringbuilder1 = (new StringBuilder()).append("No route to ");
            String s1;
            if (uri.getScheme() != null)
            {
                s1 = (new StringBuilder()).append(uri.getScheme()).append("://").toString();
            } else
            {
                s1 = "//";
            }
            throw new SocketException(stringbuilder1.append(s1).append(address.getUriHost()).append("; exhausted connection specs: ").append(connectionSpecs).toString());
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
        throws IOException
    {
        inetSocketAddresses = new ArrayList();
        int i;
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
        if (i < 1 || i > 65535)
        {
            throw new SocketException((new StringBuilder()).append("No route to ").append(proxy).append(":").append(i).append("; port is out of range").toString());
        }
        proxy = network.resolveInetAddresses(proxy);
        int k = proxy.length;
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

    public void connectFailed(Route route, IOException ioexception)
    {
        if (route.getProxy().type() != java.net.Proxy.Type.DIRECT && address.getProxySelector() != null)
        {
            address.getProxySelector().connectFailed(uri, route.getProxy().address(), ioexception);
        }
        routeDatabase.failed(route);
        if (!(ioexception instanceof SSLHandshakeException) && !(ioexception instanceof SSLProtocolException))
        {
            for (; nextSpecIndex < connectionSpecs.size(); routeDatabase.failed(route))
            {
                route = connectionSpecs;
                int i = nextSpecIndex;
                nextSpecIndex = i + 1;
                route = (ConnectionSpec)route.get(i);
                boolean flag = shouldSendTlsFallbackIndicator(route);
                route = new Route(address, lastProxy, lastInetSocketAddress, route, flag);
            }

        }
    }

    public boolean hasNext()
    {
        return hasNextConnectionSpec() || hasNextInetSocketAddress() || hasNextProxy() || hasNextPostponed();
    }

    public Route next()
        throws IOException
    {
        if (hasNextConnectionSpec()) goto _L2; else goto _L1
_L1:
        if (hasNextInetSocketAddress()) goto _L4; else goto _L3
_L3:
        if (hasNextProxy()) goto _L6; else goto _L5
_L5:
        Route route;
        if (!hasNextPostponed())
        {
            throw new NoSuchElementException();
        }
        route = nextPostponed();
_L8:
        return route;
_L6:
        lastProxy = nextProxy();
_L4:
        lastInetSocketAddress = nextInetSocketAddress();
_L2:
        lastSpec = nextConnectionSpec();
        boolean flag = shouldSendTlsFallbackIndicator(lastSpec);
        Route route1 = new Route(address, lastProxy, lastInetSocketAddress, lastSpec, flag);
        route = route1;
        if (routeDatabase.shouldPostpone(route1))
        {
            postponedRoutes.add(route1);
            return next();
        }
        if (true) goto _L8; else goto _L7
_L7:
    }
}
