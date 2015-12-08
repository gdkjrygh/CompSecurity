// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.media.MediaRouter;

// Referenced classes of package android.support.v7.media:
//            ag, ap

final class aq extends ag
{

    public aq(ap ap1)
    {
        super(ap1);
    }

    public final void onRoutePresentationDisplayChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
    {
        ((ap)a).f(routeinfo);
    }
}
