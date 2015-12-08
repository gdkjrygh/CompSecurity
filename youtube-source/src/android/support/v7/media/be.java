// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.media.RemoteControlClient;

// Referenced classes of package android.support.v7.media:
//            bd, ae, bh, ak, 
//            bf

final class be extends bd
{

    private final Object d;
    private final Object e;
    private final Object f;
    private boolean g;

    public be(Context context, Object obj)
    {
        super(context, obj);
        d = context.getSystemService("media_router");
        e = ae.a(d, "", false);
        f = ae.b(d, e);
    }

    public final void a(bh bh1)
    {
        ak.c(f, bh1.a);
        ak.d(f, bh1.b);
        ak.e(f, bh1.c);
        ak.b(f, bh1.d);
        ak.a(f, bh1.e);
        if (!g)
        {
            g = true;
            ak.a(f, ae.a(new bf(this)));
            bh1 = ((bh) (f));
            Object obj = b;
            ((android.media.MediaRouter.UserRouteInfo)bh1).setRemoteControlClient((RemoteControlClient)obj);
        }
    }
}
