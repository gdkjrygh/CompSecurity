// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            aa, av, v, x, 
//            af, bg, al, aj, 
//            ao, aq, bj, bq, 
//            d, bb, ay, ba, 
//            ah, ChannelStoreItemRendererFactory, u, ai

public final class ag
{

    public static af a(Context context, bc bc, bj bj1, v v1)
    {
        aa aa1 = new aa(context, a(context, bj1));
        bc = new av(context, bc, bj1);
        bc = (new com.google.android.apps.youtube.app.adapter.v()).a(aa1).a(bc).a(new x(v1));
        return new af(context, l.c, bc);
    }

    public static af a(Context context, bc bc, bj bj1, h h, v v1)
    {
        bg bg1 = com.google.android.apps.youtube.app.adapter.bg.a(context);
        bc = com.google.android.apps.youtube.app.adapter.al.a(context, bj1, h, bc);
        bc = (new com.google.android.apps.youtube.app.adapter.v()).a(bg1).a(bc);
        if (v1 != null)
        {
            bc.a(new x(v1));
        }
        bc = new aj(context, bc);
        return new af(context, l.bx, bc);
    }

    public static af a(Context context, bj bj1, v v1)
    {
        bj1 = c(context, bj1, v1);
        return new af(context, l.Q, bj1);
    }

    public static af a(Context context, bj bj1, v v1, boolean flag)
    {
        ao ao1 = new ao(context, false);
        bj1 = com.google.android.apps.youtube.app.adapter.aq.a(context, bj1, ThumbnailRendererFactory.ThumbnailSize.LARGE);
        v1 = new x(v1);
        bj1 = (new com.google.android.apps.youtube.app.adapter.v()).a(ao1).a(bj1).a(v1);
        return new af(context, l.P, bj1);
    }

    public static af a(Context context, bj bj1, bc bc, v v1)
    {
        com.google.android.apps.youtube.app.adapter.v v2 = a(context, bj1);
        bj1 = (new com.google.android.apps.youtube.app.adapter.v()).a(new aa(context, v2)).a(new x(v1)).a(new av(context, bc, bj1));
        return new af(context, l.c, bj1);
    }

    public static ai a(Context context, bj bj1, v v1, int i)
    {
        com.google.android.apps.youtube.app.adapter.bj bj2 = new com.google.android.apps.youtube.app.adapter.bj(context, 2);
        context = com.google.android.apps.youtube.app.adapter.bq.a(context, bj1, ThumbnailRendererFactory.ThumbnailSize.SMALL);
        bj1 = new x(v1);
        return (new com.google.android.apps.youtube.app.adapter.v()).a(bj2).a(new d()).a(context).a(bj1);
    }

    public static ba a(Context context, bj bj1, v v1, v v2)
    {
        bg bg1 = bg.b(context);
        bj1 = com.google.android.apps.youtube.app.adapter.bq.a(context, bj1, ThumbnailRendererFactory.ThumbnailSize.LARGE);
        bj1 = new bb((new com.google.android.apps.youtube.app.adapter.v()).a(bg1).a(bj1).a(new d()).a(new x(v1)), new ay(context, v2));
        return new ba(context, l.bu, bj1);
    }

    public static u a(Context context, Analytics analytics, bc bc, com.google.android.apps.youtube.core.identity.l l1, YouTubeApplication youtubeapplication, a a1, am am, aw aw, 
            bj bj1, gj gj, Activity activity)
    {
        bj1 = new ah(context, j.ah, bj1);
        analytics = new ChannelStoreItemRendererFactory(context, analytics, bc, l1, youtubeapplication, a1, am, aw, gj, activity);
        bc = (new com.google.android.apps.youtube.app.adapter.v()).a(bj1).a(analytics);
        return new u(context, l.s, bc, analytics);
    }

    private static com.google.android.apps.youtube.app.adapter.v a(Context context, bj bj1)
    {
        bg bg1 = com.google.android.apps.youtube.app.adapter.bg.a(context);
        context = com.google.android.apps.youtube.app.adapter.bq.a(context, bj1, ThumbnailRendererFactory.ThumbnailSize.LARGE);
        bj1 = new d();
        return (new com.google.android.apps.youtube.app.adapter.v()).a(bg1).a(context).a(bj1);
    }

    public static af b(Context context, bj bj1, v v1)
    {
        bj1 = a(context, bj1);
        bj1.a(new x(v1));
        return new af(context, l.bx, bj1);
    }

    public static ai c(Context context, bj bj1, v v1)
    {
        bg bg1 = bg.b(context);
        context = com.google.android.apps.youtube.app.adapter.bq.a(context, bj1, ThumbnailRendererFactory.ThumbnailSize.SMALL);
        bj1 = new x(v1);
        return (new com.google.android.apps.youtube.app.adapter.v()).a(bg1).a(new d()).a(context).a(bj1);
    }

    public static af d(Context context, bj bj1, v v1)
    {
        bg bg1 = com.google.android.apps.youtube.app.adapter.bg.a(context);
        bj1 = com.google.android.apps.youtube.app.adapter.bq.a(context, bj1, ThumbnailRendererFactory.ThumbnailSize.LARGE);
        bj1 = (new com.google.android.apps.youtube.app.adapter.v()).a(bg1).a(bj1).a(new d()).a(new x(v1));
        return new af(context, l.bx, bj1);
    }
}
