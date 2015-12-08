// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.player.event.a;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.ao;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            br, bt

public final class bs
{

    private final br a;
    private final bj b;
    private final com.google.android.apps.youtube.common.a.b c = com.google.android.apps.youtube.common.a.e.a(new Handler(), new bt(this));
    private final boolean d;
    private d e;
    private Uri f;
    private Bitmap g;
    private boolean h;
    private boolean i;

    public bs(br br1, bj bj1, boolean flag)
    {
        a = (br)com.google.android.apps.youtube.common.fromguava.c.a(br1);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        d = flag;
    }

    static Bitmap a(bs bs1)
    {
        return bs1.g;
    }

    static Bitmap a(bs bs1, Bitmap bitmap)
    {
        bs1.g = bitmap;
        return bitmap;
    }

    private void a()
    {
        if (i || h && d)
        {
            if (g == null && f != null && e == null)
            {
                e = com.google.android.apps.youtube.common.a.d.a(c);
                b.a(f, e);
            }
            a.d();
            return;
        } else
        {
            a.e();
            return;
        }
    }

    static br b(bs bs1)
    {
        return bs1.a;
    }

    public final void handleAudioOnlyEvent(a a1)
    {
        i = a1.a();
        a();
    }

    public final void handleVideoStageEvent(ac ac1)
    {
        if (ac1.c() != com.google.android.apps.youtube.core.player.Director.VideoStage.NEW) goto _L2; else goto _L1
_L1:
        f = null;
        g = null;
        if (e != null)
        {
            e.a();
            e = null;
        }
        a.f();
_L4:
        h = ac1.c().isIn(new com.google.android.apps.youtube.core.player.Director.VideoStage[] {
            com.google.android.apps.youtube.core.player.Director.VideoStage.PLAYBACK_LOADED, com.google.android.apps.youtube.core.player.Director.VideoStage.READY, com.google.android.apps.youtube.core.player.Director.VideoStage.ENDED
        });
        a();
        return;
_L2:
        if (ac1.c().isOrPast(com.google.android.apps.youtube.core.player.Director.VideoStage.PLAYBACK_LOADED))
        {
            View view = a.b();
            int j;
            int k;
            if (view != null)
            {
                j = view.getWidth();
            } else
            {
                j = 480;
            }
            if (view != null)
            {
                k = view.getHeight();
            } else
            {
                k = 320;
            }
            if (ac1.d() != null)
            {
                ap ap1 = ac1.d().getPlayerResponse().getThumbnailDetails();
                if (ap1.a())
                {
                    f = com.google.android.apps.youtube.datalib.innertube.a.b.a(ap1, j, k).a();
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
