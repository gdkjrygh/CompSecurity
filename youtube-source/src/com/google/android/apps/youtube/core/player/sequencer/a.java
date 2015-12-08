// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            c, b, r

public abstract class a extends com.google.android.apps.youtube.core.player.sequencer.c
{

    protected final PlayerFetcher a;
    private d l;

    public a(r r, com.google.android.apps.youtube.common.c.a a1, ad ad, Analytics analytics, aw aw, PlayerFetcher playerfetcher)
    {
        super(r, a1, ad, analytics, aw);
        a = (PlayerFetcher)com.google.android.apps.youtube.common.fromguava.c.a(playerfetcher);
    }

    public void a()
    {
        if (l != null)
        {
            l.a();
            l = null;
        }
    }

    final void a(int i)
    {
        if (b() && !g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
        {
            p();
            return;
        } else
        {
            com.google.android.apps.youtube.common.fromguava.c.a(h);
            l = com.google.android.apps.youtube.common.a.d.a(new b(this, (byte)0));
            a.a(c(), e(), o_(), s(), d(), i, l);
            return;
        }
    }

    protected abstract boolean b();

    protected abstract String c();

    protected abstract int d();

    protected abstract byte[] e();

    protected abstract String o_();
}
