// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.MediaRouter;

// Referenced classes of package android.support.v7.media:
//            af

class ag extends android.media.MediaRouter.Callback
{

    protected final af a;

    public ag(af af1)
    {
        a = af1;
    }

    public void onRouteAdded(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
    {
        a.b(routeinfo);
    }

    public void onRouteChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
    {
        a.d(routeinfo);
    }

    public void onRouteGrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup, int i)
    {
        mediarouter = a;
    }

    public void onRouteRemoved(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
    {
        a.c(routeinfo);
    }

    public void onRouteSelected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
    {
        a.a(routeinfo);
    }

    public void onRouteUngrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup)
    {
        mediarouter = a;
    }

    public void onRouteUnselected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
    {
        mediarouter = a;
    }

    public void onRouteVolumeChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
    {
        a.e(routeinfo);
    }
}
