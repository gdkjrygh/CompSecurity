// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.media.MediaRouter;

// Referenced classes of package android.support.v7.media:
//            bo, bm, d, bn, 
//            ad, ae, bt

final class bp extends bo
{

    public bp(Context context, bt bt)
    {
        super(context, bt);
    }

    protected final void a(bm bm1, d d1)
    {
        super.a(bm1, d1);
        bm1 = ((android.media.MediaRouter.RouteInfo)bm1.a).getDescription();
        if (bm1 != null)
        {
            d1.a(bm1.toString());
        }
    }

    protected final void a(bn bn1)
    {
        super.a(bn1);
        Object obj = bn1.b;
        bn1 = bn1.a.b();
        ((android.media.MediaRouter.UserRouteInfo)obj).setDescription(bn1);
    }

    protected final boolean a(bm bm1)
    {
        return ((android.media.MediaRouter.RouteInfo)bm1.a).isConnecting();
    }

    protected final void g()
    {
        int j = 1;
        if (g)
        {
            ae.a(a, b);
        }
        g = true;
        Object obj = a;
        int k = e;
        Object obj1 = b;
        if (!f)
        {
            j = 0;
        }
        ((MediaRouter)obj).addCallback(k, (android.media.MediaRouter.Callback)obj1, j | 2);
    }

    protected final void h(Object obj)
    {
        ((MediaRouter)a).selectRoute(0x800003, (android.media.MediaRouter.RouteInfo)obj);
    }

    protected final Object i()
    {
        return ((MediaRouter)a).getDefaultRoute();
    }
}
