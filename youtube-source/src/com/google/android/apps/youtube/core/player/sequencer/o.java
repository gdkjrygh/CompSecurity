// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.player.event.r;
import com.google.android.apps.youtube.core.player.fetcher.e;
import com.google.android.apps.youtube.core.player.fetcher.g;
import com.google.android.apps.youtube.datalib.a.k;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.offline.n;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            k, j, p, q

final class o extends com.google.android.apps.youtube.core.player.sequencer.k
{

    final j c;

    public o(j j1, int i)
    {
        c = j1;
        super(j1, i);
    }

    static void a(o o1, WatchNextResponse watchnextresponse)
    {
        if (!o1.a)
        {
            o1.c.i = watchnextresponse;
            o1.b();
            o1.c.a(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED);
        }
    }

    protected final void a(int i)
    {
        a();
        if (!b(i))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        String s = ((Video)j.b(c).get(i)).id;
        c.c.c(new r());
        if (j.f(c).a())
        {
            break MISSING_BLOCK_LABEL_204;
        }
        k k1 = k.a();
        e e1 = j.j(c);
        Object obj;
        int l;
        if (com.google.android.apps.youtube.core.player.sequencer.j.g(c))
        {
            obj = j.h(c);
        } else
        {
            obj = "";
        }
        if (com.google.android.apps.youtube.core.player.sequencer.j.g(c))
        {
            l = i;
        } else
        {
            l = -1;
        }
        e1.a(s, ((String) (obj)), l, "", j.i(c), k1);
        obj = WatchNextResponse.createWatchNextResponseForOfflinePlaylist((WatchNextResponse)k1.get(3L, TimeUnit.SECONDS), c.a, com.google.android.apps.youtube.core.player.sequencer.j.k(c), j.b(c), i);
        j.d(c).execute(new p(this, ((WatchNextResponse) (obj))));
        return;
        Object obj1;
        obj1;
_L2:
        WatchNextResponse watchnextresponse;
        if (com.google.android.apps.youtube.core.player.sequencer.j.g(c))
        {
            watchnextresponse = g.a(c.a, com.google.android.apps.youtube.core.player.sequencer.j.k(c), j.b(c), i);
        } else
        {
            watchnextresponse = g.a(c.a, (Video)j.b(c).get(0));
        }
        j.d(c).execute(new q(this, watchnextresponse));
        return;
        watchnextresponse;
        continue; /* Loop/switch isn't completed */
        watchnextresponse;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
