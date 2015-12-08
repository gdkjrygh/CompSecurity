// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Intent;
import android.support.v7.media.x;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.w;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            r, YouTubeTvScreen, am, bk, 
//            al, YouTubeTvScreensMonitor

public final class ak extends r
{

    private final YouTubeTvScreen b;
    private final am c;
    private final PlayerFetcher d;
    private d e;

    public ak(bk bk1, YouTubeTvScreen youtubetvscreen, am am1, PlayerFetcher playerfetcher, YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        super(youtubetvscreen, bk1, youtubetvscreensmonitor);
        b = (YouTubeTvScreen)com.google.android.apps.youtube.common.fromguava.c.a(youtubetvscreen);
        c = am1;
        d = playerfetcher;
    }

    static void a(ak ak1, PlayerResponse playerresponse)
    {
        ak1.a(playerresponse);
    }

    private void a(PlayerResponse playerresponse)
    {
        Object obj = "";
        int i;
        if (playerresponse != null && playerresponse.getPlayabilityStatus().c())
        {
            playerresponse = playerresponse.getVideoId();
            i = c.K();
            obj = c.L();
        } else
        {
            Object obj1 = null;
            i = 0;
            playerresponse = ((PlayerResponse) (obj));
            obj = obj1;
        }
        a.a(b, playerresponse, i, null, 0, ((com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack) (obj)));
    }

    public final void a()
    {
        super.a();
        if (e != null)
        {
            e.a();
            e = null;
        }
    }

    public final boolean a(Intent intent, x x)
    {
        return super.a(intent, x);
    }

    public final void b()
    {
        if (e != null)
        {
            e.a();
            e = null;
        }
        if (c != null)
        {
            String s = c.J().d();
            if (!TextUtils.isEmpty(s))
            {
                e = com.google.android.apps.youtube.common.a.d.a(new al(this));
                d.a(s, PlayerFetcher.a, "", "", -1, -1, e);
                return;
            }
        }
        a(null);
    }
}
