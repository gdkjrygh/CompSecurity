// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.routing;

import ch.boye.httpclientandroidlib.HttpHost;
import ch.boye.httpclientandroidlib.util.LangUtils;
import java.net.InetAddress;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.routing:
//            RouteInfo

public final class HttpRoute
    implements RouteInfo, Cloneable
{

    private static final HttpHost EMPTY_HTTP_HOST_ARRAY[] = new HttpHost[0];
    private final RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private final HttpHost proxyChain[];
    private final boolean secure;
    private final HttpHost targetHost;
    private final RouteInfo.TunnelType tunnelled;

    public HttpRoute(HttpHost httphost)
    {
        this(((InetAddress) (null)), httphost, EMPTY_HTTP_HOST_ARRAY, false, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httphost, InetAddress inetaddress, HttpHost httphost1, boolean flag)
    {
        HttpHost ahttphost[] = toChain(httphost1);
        RouteInfo.TunnelType tunneltype;
        RouteInfo.LayerType layertype;
        if (flag)
        {
            tunneltype = RouteInfo.TunnelType.TUNNELLED;
        } else
        {
            tunneltype = RouteInfo.TunnelType.PLAIN;
        }
        if (flag)
        {
            layertype = RouteInfo.LayerType.LAYERED;
        } else
        {
            layertype = RouteInfo.LayerType.PLAIN;
        }
        this(inetaddress, httphost, ahttphost, flag, tunneltype, layertype);
        if (httphost1 == null)
        {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else
        {
            return;
        }
    }

    public HttpRoute(HttpHost httphost, InetAddress inetaddress, HttpHost httphost1, boolean flag, RouteInfo.TunnelType tunneltype, RouteInfo.LayerType layertype)
    {
        this(inetaddress, httphost, toChain(httphost1), flag, tunneltype, layertype);
    }

    public HttpRoute(HttpHost httphost, InetAddress inetaddress, boolean flag)
    {
        this(inetaddress, httphost, EMPTY_HTTP_HOST_ARRAY, flag, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httphost, InetAddress inetaddress, HttpHost ahttphost[], boolean flag, RouteInfo.TunnelType tunneltype, RouteInfo.LayerType layertype)
    {
        this(inetaddress, httphost, toChain(ahttphost), flag, tunneltype, layertype);
    }

    private HttpRoute(InetAddress inetaddress, HttpHost httphost, HttpHost ahttphost[], boolean flag, RouteInfo.TunnelType tunneltype, RouteInfo.LayerType layertype)
    {
        if (httphost == null)
        {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (ahttphost == null)
        {
            throw new IllegalArgumentException("Proxies may not be null.");
        }
        if (tunneltype == RouteInfo.TunnelType.TUNNELLED && ahttphost.length == 0)
        {
            throw new IllegalArgumentException("Proxy required if tunnelled.");
        }
        RouteInfo.TunnelType tunneltype1 = tunneltype;
        if (tunneltype == null)
        {
            tunneltype1 = RouteInfo.TunnelType.PLAIN;
        }
        tunneltype = layertype;
        if (layertype == null)
        {
            tunneltype = RouteInfo.LayerType.PLAIN;
        }
        targetHost = httphost;
        localAddress = inetaddress;
        proxyChain = ahttphost;
        secure = flag;
        tunnelled = tunneltype1;
        layered = tunneltype;
    }

    private static HttpHost[] toChain(HttpHost httphost)
    {
        if (httphost == null)
        {
            return EMPTY_HTTP_HOST_ARRAY;
        } else
        {
            return (new HttpHost[] {
                httphost
            });
        }
    }

    private static HttpHost[] toChain(HttpHost ahttphost[])
    {
        if (ahttphost == null || ahttphost.length < 1)
        {
            return EMPTY_HTTP_HOST_ARRAY;
        }
        int j = ahttphost.length;
        for (int i = 0; i < j; i++)
        {
            if (ahttphost[i] == null)
            {
                throw new IllegalArgumentException("Proxy chain may not contain null elements.");
            }
        }

        HttpHost ahttphost1[] = new HttpHost[ahttphost.length];
        System.arraycopy(ahttphost, 0, ahttphost1, 0, ahttphost.length);
        return ahttphost1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof HttpRoute)
            {
                if (secure != ((HttpRoute) (obj = (HttpRoute)obj)).secure || tunnelled != ((HttpRoute) (obj)).tunnelled || layered != ((HttpRoute) (obj)).layered || !LangUtils.equals(targetHost, ((HttpRoute) (obj)).targetHost) || !LangUtils.equals(localAddress, ((HttpRoute) (obj)).localAddress) || !LangUtils.equals(proxyChain, ((HttpRoute) (obj)).proxyChain))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int getHopCount()
    {
        return proxyChain.length + 1;
    }

    public final HttpHost getHopTarget(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Hop index must not be negative: ").append(i).toString());
        }
        int j = getHopCount();
        if (i >= j)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Hop index ").append(i).append(" exceeds route length ").append(j).toString());
        }
        if (i < j - 1)
        {
            return proxyChain[i];
        } else
        {
            return targetHost;
        }
    }

    public final RouteInfo.LayerType getLayerType()
    {
        return layered;
    }

    public final InetAddress getLocalAddress()
    {
        return localAddress;
    }

    public final HttpHost getProxyHost()
    {
        if (proxyChain.length == 0)
        {
            return null;
        } else
        {
            return proxyChain[0];
        }
    }

    public final HttpHost getTargetHost()
    {
        return targetHost;
    }

    public final RouteInfo.TunnelType getTunnelType()
    {
        return tunnelled;
    }

    public final int hashCode()
    {
        int j = LangUtils.hashCode(LangUtils.hashCode(17, targetHost), localAddress);
        for (int i = 0; i < proxyChain.length; i++)
        {
            j = LangUtils.hashCode(j, proxyChain[i]);
        }

        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(j, secure), tunnelled), layered);
    }

    public final boolean isLayered()
    {
        return layered == RouteInfo.LayerType.LAYERED;
    }

    public final boolean isSecure()
    {
        return secure;
    }

    public final boolean isTunnelled()
    {
        return tunnelled == RouteInfo.TunnelType.TUNNELLED;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(getHopCount() * 30 + 50);
        if (localAddress != null)
        {
            stringbuilder.append(localAddress);
            stringbuilder.append("->");
        }
        stringbuilder.append('{');
        if (tunnelled == RouteInfo.TunnelType.TUNNELLED)
        {
            stringbuilder.append('t');
        }
        if (layered == RouteInfo.LayerType.LAYERED)
        {
            stringbuilder.append('l');
        }
        if (secure)
        {
            stringbuilder.append('s');
        }
        stringbuilder.append("}->");
        HttpHost ahttphost[] = proxyChain;
        int j = ahttphost.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(ahttphost[i]);
            stringbuilder.append("->");
        }

        stringbuilder.append(targetHost);
        return stringbuilder.toString();
    }

}
