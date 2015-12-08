// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.common.b.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.fetcher.e;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.player.state.OfflineSequencerState;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.offline.n;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            c, o, k, r

public final class j extends com.google.android.apps.youtube.core.player.sequencer.c
{

    final Context a;
    private final e l;
    private final n m;
    private final OfflineStoreInterface n;
    private final Executor o;
    private final byte p[];
    private final Executor q;
    private final String r;
    private final String s;
    private volatile Playlist t;
    private volatile List u;
    private volatile int v[];
    private volatile int w;
    private int x;
    private k y;

    public j(Context context, r r1, a a1, ad ad, Analytics analytics, aw aw, Executor executor, 
            e e1, n n1, OfflineStoreInterface offlinestoreinterface, PlaybackStartDescriptor playbackstartdescriptor)
    {
        this(context, r1, a1, ad, analytics, aw, executor, ((Executor) (new b())), e1, n1, offlinestoreinterface, playbackstartdescriptor);
        a(PlaybackSequencer.SequencerStage.NEW);
    }

    public j(Context context, r r1, a a1, ad ad, Analytics analytics, aw aw, Executor executor, 
            e e1, n n1, OfflineStoreInterface offlinestoreinterface, OfflineSequencerState offlinesequencerstate)
    {
        super(r1, a1, ad, analytics, aw);
        com.google.android.apps.youtube.common.fromguava.c.a(offlinesequencerstate);
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        l = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        m = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1);
        n = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        o = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        p = (byte[])com.google.android.apps.youtube.common.fromguava.c.a(offlinesequencerstate.clickTrackingParams);
        q = new b();
        r = offlinesequencerstate.videoId;
        s = offlinesequencerstate.playlistId;
        h = offlinesequencerstate.currentPlaybackPair;
        i = offlinesequencerstate.currentWatchNextResponse;
        w = offlinesequencerstate.index;
        x = offlinesequencerstate.pendingIndex;
        j = offlinesequencerstate.loop;
        a(PlaybackSequencer.SequencerStage.NEW);
        if (h != null)
        {
            a(PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED);
            if (i != null)
            {
                a(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED);
            }
        }
        i();
    }

    private j(Context context, r r1, a a1, ad ad, Analytics analytics, aw aw, Executor executor, 
            Executor executor1, e e1, n n1, OfflineStoreInterface offlinestoreinterface, PlaybackStartDescriptor playbackstartdescriptor)
    {
        super(r1, a1, ad, analytics, aw);
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        l = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        m = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1);
        n = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        o = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        p = (byte[])com.google.android.apps.youtube.common.fromguava.c.a(playbackstartdescriptor.getClickTrackingParams());
        q = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor1);
        if (!TextUtils.isEmpty(playbackstartdescriptor.getPlaylistId()))
        {
            r = null;
            s = playbackstartdescriptor.getPlaylistId();
        } else
        {
            r = (String)com.google.android.apps.youtube.common.fromguava.c.a(playbackstartdescriptor.getVideoId());
            s = null;
        }
        x = Math.max(playbackstartdescriptor.getPlaylistIndex(), 0);
        w = x - 1;
        i();
    }

    static int a(j j1, int i1)
    {
        j1.w = i1;
        return i1;
    }

    static Playlist a(j j1, Playlist playlist)
    {
        j1.t = playlist;
        return playlist;
    }

    static List a(j j1, List list)
    {
        j1.u = list;
        return list;
    }

    static int[] a(j j1)
    {
        return j1.v;
    }

    static int[] a(j j1, int ai[])
    {
        j1.v = ai;
        return ai;
    }

    static List b(j j1)
    {
        return j1.u;
    }

    private void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        int j1;
        a(PlaybackSequencer.SequencerStage.VIDEO_LOADING);
        if (u == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        j1 = u.size() - 1;
_L1:
        x = Math.max(0, Math.min(j1, i1));
        y = new o(this, i1);
        o.execute(y);
        this;
        JVM INSTR monitorexit ;
        return;
        j1 = 0x7fffffff;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    static void c(j j1)
    {
        j1.v();
    }

    static Executor d(j j1)
    {
        return j1.q;
    }

    static OfflineStoreInterface e(j j1)
    {
        return j1.n;
    }

    static n f(j j1)
    {
        return j1.m;
    }

    static boolean g(j j1)
    {
        return j1.x();
    }

    static String h(j j1)
    {
        return j1.s;
    }

    static byte[] i(j j1)
    {
        return j1.p;
    }

    static e j(j j1)
    {
        return j1.l;
    }

    static Playlist k(j j1)
    {
        return j1.t;
    }

    private void u()
    {
        if (j && w())
        {
            b(0);
            return;
        } else
        {
            b(w + 1);
            return;
        }
    }

    private void v()
    {
        if (v != null)
        {
            int i1 = w;
            if (k)
            {
                i1 = v[w];
            }
            int k1 = v.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                v[j1] = j1;
            }

            v[0] = i1;
            v[i1] = 0;
            Util.a(v, 1, k1);
        }
    }

    private boolean w()
    {
        return u != null && w >= u.size() - 1;
    }

    private boolean x()
    {
        return s != null;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (y != null)
        {
            com.google.android.apps.youtube.core.player.sequencer.k.a(y);
            y = null;
        }
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (i == null) goto _L2; else goto _L1
_L1:
        g = PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        g = PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        a(PlaybackSequencer.SequencerStage.NEW);
          goto _L3
    }

    final void a(int i1)
    {
        y = new k(this, x);
        o.execute(y);
    }

    protected final void a(PlaybackSequencer.SequencerStage sequencerstage)
    {
        super.a(sequencerstage);
        h();
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            v();
            w = 0;
        } else
        {
            w = v[w];
        }
        k = flag;
        h();
    }

    public final void b(boolean flag)
    {
        j = flag;
        h();
    }

    public final int f()
    {
        return w;
    }

    public final void l()
    {
        a();
        super.l();
        if (g.isOrPast(PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED))
        {
            b.a(h);
            return;
        } else
        {
            b(x);
            return;
        }
    }

    public final void m()
    {
        a();
        super.m();
        u();
    }

    public final void n()
    {
        a();
        super.n();
        if (j && w == 0 && u != null)
        {
            b(u.size() - 1);
            return;
        } else
        {
            b(w - 1);
            return;
        }
    }

    public final void o()
    {
        a();
        super.o();
        u();
    }

    public final void p()
    {
        a();
        super.p();
        b(x);
    }

    public final boolean p_()
    {
        return false;
    }

    public final boolean q_()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (u == null)
            {
                break label0;
            }
            flag = flag1;
            if (u.isEmpty())
            {
                break label0;
            }
            if (!j)
            {
                flag = flag1;
                if (w())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final PlaybackSequencer.SequencerState r()
    {
        return new OfflineSequencerState(r, s, p, h, i, w, x, j);
    }

    public final boolean r_()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (u == null)
            {
                break label0;
            }
            flag = flag1;
            if (u.isEmpty())
            {
                break label0;
            }
            if (!j)
            {
                flag = flag1;
                if (w <= 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final String s()
    {
        if (x())
        {
            return s;
        } else
        {
            return "";
        }
    }

    public final boolean s_()
    {
        return q_();
    }

    final Pair t()
    {
        if (x())
        {
            return n.i(s);
        }
        Object obj = n.j(r);
        if (obj != null)
        {
            obj = Collections.singletonList(obj);
        } else
        {
            obj = Collections.emptyList();
        }
        return new Pair(null, obj);
    }
}
