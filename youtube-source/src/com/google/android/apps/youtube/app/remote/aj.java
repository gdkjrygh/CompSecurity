// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.media.d;
import android.support.v7.media.j;
import com.google.android.apps.youtube.app.ac;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            q, aw, bi, YouTubeTvScreensMonitor, 
//            bk, ak, am, YouTubeTvScreen

public final class aj extends q
    implements aw, bi
{

    private final YouTubeTvScreensMonitor a;
    private final bk b;
    private final PlayerFetcher c;
    private am d;

    public aj(Context context, PlayerFetcher playerfetcher, YouTubeTvScreensMonitor youtubetvscreensmonitor, bk bk1, ac ac1, boolean flag)
    {
        if (flag || "true".equalsIgnoreCase(ac1.a("enable_mdx_logs", "")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super(context, youtubetvscreensmonitor, flag);
        a = (YouTubeTvScreensMonitor)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreensmonitor);
        b = (bk)com.google.android.apps.youtube.common.fromguava.c.a(bk1);
        c = (PlayerFetcher)com.google.android.apps.youtube.common.fromguava.c.a(playerfetcher);
        bk1.a(this);
    }

    protected final android.support.v7.media.c a(YouTubeTvScreen youtubetvscreen)
    {
        d d1 = d(youtubetvscreen);
        Bundle bundle = new Bundle();
        bundle.putParcelable("screen", youtubetvscreen);
        d1.a(bundle);
        if (b.a(youtubetvscreen))
        {
            d1.c(b.s());
        }
        return d1.a();
    }

    public final j a(String s)
    {
        s = b(s);
        if (s == null)
        {
            return null;
        } else
        {
            return new ak(b, s, d, c, a);
        }
    }

    public final void a(int i)
    {
        super.g();
    }

    public final void a(am am1)
    {
        d = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1, "provider cannot be null");
    }

    public final void b(am am1)
    {
        if (d == am1)
        {
            d = null;
        }
    }

    protected final String f()
    {
        return "MDX_MEDIA_ROUTE_CONTROL_CATEGORY";
    }
}
