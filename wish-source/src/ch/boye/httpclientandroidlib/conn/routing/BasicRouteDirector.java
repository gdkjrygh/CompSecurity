// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.routing;

import ch.boye.httpclientandroidlib.HttpHost;
import java.net.InetAddress;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.routing:
//            HttpRouteDirector, RouteInfo

public class BasicRouteDirector
    implements HttpRouteDirector
{

    public BasicRouteDirector()
    {
    }

    protected int directStep(RouteInfo routeinfo, RouteInfo routeinfo1)
    {
        while (routeinfo1.getHopCount() > 1 || !routeinfo.getTargetHost().equals(routeinfo1.getTargetHost()) || routeinfo.isSecure() != routeinfo1.isSecure() || routeinfo.getLocalAddress() != null && !routeinfo.getLocalAddress().equals(routeinfo1.getLocalAddress())) 
        {
            return -1;
        }
        return 0;
    }

    protected int firstStep(RouteInfo routeinfo)
    {
        byte byte0 = 1;
        if (routeinfo.getHopCount() > 1)
        {
            byte0 = 2;
        }
        return byte0;
    }

    public int nextStep(RouteInfo routeinfo, RouteInfo routeinfo1)
    {
        if (routeinfo == null)
        {
            throw new IllegalArgumentException("Planned route may not be null.");
        }
        if (routeinfo1 == null || routeinfo1.getHopCount() < 1)
        {
            return firstStep(routeinfo);
        }
        if (routeinfo.getHopCount() > 1)
        {
            return proxiedStep(routeinfo, routeinfo1);
        } else
        {
            return directStep(routeinfo, routeinfo1);
        }
    }

    protected int proxiedStep(RouteInfo routeinfo, RouteInfo routeinfo1)
    {
_L2:
        return -1;
        if (routeinfo1.getHopCount() <= 1 || !routeinfo.getTargetHost().equals(routeinfo1.getTargetHost())) goto _L2; else goto _L1
_L1:
        int j = routeinfo.getHopCount();
        int k = routeinfo1.getHopCount();
        if (j < k)
        {
            continue; /* Loop/switch isn't completed */
        }
        for (int i = 0; i < k - 1; i++)
        {
            if (!routeinfo.getHopTarget(i).equals(routeinfo1.getHopTarget(i)))
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        if (j > k)
        {
            return 4;
        }
        if ((!routeinfo1.isTunnelled() || routeinfo.isTunnelled()) && (!routeinfo1.isLayered() || routeinfo.isLayered()))
        {
            if (routeinfo.isTunnelled() && !routeinfo1.isTunnelled())
            {
                return 3;
            }
            if (routeinfo.isLayered() && !routeinfo1.isLayered())
            {
                return 5;
            }
            if (routeinfo.isSecure() == routeinfo1.isSecure())
            {
                return 0;
            }
        }
        if (true) goto _L2; else goto _L3
_L3:
    }
}
