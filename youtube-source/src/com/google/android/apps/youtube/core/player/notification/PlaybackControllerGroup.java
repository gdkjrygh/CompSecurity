// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            j, d, ExternalPlaybackControllerV14, i, 
//            f, g, h, c

public final class PlaybackControllerGroup
{

    private final bc a;
    private final bj b;
    private final h c;
    private final l d;
    private final q e;
    private final j f;
    private final List g;
    private final PlaybackInfo h;
    private final Handler i;
    private String j;
    private d k;
    private d l;
    private boolean m;
    private i n;

    public PlaybackControllerGroup(Context context, bc bc1, bj bj1, l l1, q q1, h h1, String s, 
            Class class1, j j1, String s1, int i1, com.google.android.apps.youtube.core.player.notification.c c1)
    {
        this(context, bc1, bj1, l1, q1, h1, s, class1, j1, null, i1, c1, (byte)0);
    }

    public PlaybackControllerGroup(Context context, bc bc1, bj bj1, l l1, q q1, h h1, String s, 
            Class class1, j j1, String s1, int i1, com.google.android.apps.youtube.core.player.notification.c c1, byte byte0)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        a = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        b = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        d = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        e = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        c = h1;
        f = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        h = new PlaybackInfo();
        i = new Handler();
        g = new LinkedList();
        g.add(new com.google.android.apps.youtube.core.player.notification.d(context, s, class1, j1, s1, i1));
        n = new ExternalPlaybackControllerV14(context, j1, c1);
        g.add(n);
    }

    static Bitmap a(PlaybackControllerGroup playbackcontrollergroup, Bitmap bitmap)
    {
        int i1 = (int)((float)bitmap.getWidth() * 0.5625F);
        return Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - i1) / 2, bitmap.getWidth(), i1);
    }

    static String a(PlaybackControllerGroup playbackcontrollergroup)
    {
        return playbackcontrollergroup.j;
    }

    static void a(PlaybackControllerGroup playbackcontrollergroup, Video video)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(video);
        playbackcontrollergroup.h.b = video.title;
        playbackcontrollergroup.h.a = video.id;
        playbackcontrollergroup.h.g = video.duration * 1000;
        playbackcontrollergroup.c();
        playbackcontrollergroup.f.a();
        if (video.sdThumbnailUri != null)
        {
            video = video.sdThumbnailUri;
        } else
        {
            video = video.hqThumbnailUri;
        }
        if (video != null)
        {
            playbackcontrollergroup.b.a(video, playbackcontrollergroup.l);
        }
    }

    static void a(PlaybackControllerGroup playbackcontrollergroup, String s)
    {
        playbackcontrollergroup.c(s);
    }

    static void b(PlaybackControllerGroup playbackcontrollergroup, Bitmap bitmap)
    {
        playbackcontrollergroup.h.f = bitmap;
        playbackcontrollergroup.c();
    }

    private void c()
    {
        if (m)
        {
            boolean flag;
            if (h.b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                for (Iterator iterator = g.iterator(); iterator.hasNext(); ((i)iterator.next()).a(h)) { }
            }
        }
    }

    private void c(String s)
    {
        if (d.b())
        {
            OfflineStoreInterface offlinestoreinterface = e.a(d.c());
            x x1 = offlinestoreinterface.a(s);
            if (x1 != null && x1.v())
            {
                offlinestoreinterface.b(s, com.google.android.apps.youtube.common.a.e.a(i, new f(this, s)));
                return;
            }
        }
    }

    public final void a()
    {
        m = true;
        c();
    }

    public final void a(android.media.RemoteControlClient.OnGetPlaybackPositionListener ongetplaybackpositionlistener)
    {
        if (n != null && (n instanceof ExternalPlaybackControllerV14))
        {
            ((ExternalPlaybackControllerV14)n).a(ongetplaybackpositionlistener);
        }
    }

    public final void a(PlaybackInfo.PlaybackState playbackstate)
    {
        h.c = playbackstate;
        c();
    }

    public final void a(String s)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((i)iterator.next()).a(s)) { }
    }

    public final void a(boolean flag)
    {
label0:
        {
            if (n != null)
            {
                if (!flag)
                {
                    break label0;
                }
                if (!g.contains(n))
                {
                    g.add(n);
                }
            }
            return;
        }
        g.remove(n);
    }

    public final void a(boolean flag, boolean flag1)
    {
        h.d = flag;
        h.e = flag1;
        c();
    }

    public final void b()
    {
        m = false;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((i)iterator.next()).a()) { }
    }

    public final void b(String s)
    {
label0:
        {
            com.google.android.apps.youtube.common.fromguava.c.a(s);
            if (!s.equals(j))
            {
                j = s;
                PlaybackInfo playbackinfo = h;
                playbackinfo.a = null;
                playbackinfo.b = null;
                class PlaybackInfo.PlaybackState extends Enum
                {

                    private static final PlaybackInfo.PlaybackState $VALUES[];
                    public static final PlaybackInfo.PlaybackState BUFFERING;
                    public static final PlaybackInfo.PlaybackState ENDED;
                    public static final PlaybackInfo.PlaybackState ERROR;
                    public static final PlaybackInfo.PlaybackState PAUSED;
                    public static final PlaybackInfo.PlaybackState PLAYING;
                    public static final PlaybackInfo.PlaybackState STOPPED;

                    public static PlaybackInfo.PlaybackState valueOf(String s1)
                    {
                        return (PlaybackInfo.PlaybackState)Enum.valueOf(com/google/android/apps/youtube/core/player/notification/PlaybackControllerGroup$PlaybackInfo$PlaybackState, s1);
                    }

                    public static PlaybackInfo.PlaybackState[] values()
                    {
                        return (PlaybackInfo.PlaybackState[])$VALUES.clone();
                    }

                    static 
                    {
                        BUFFERING = new PlaybackInfo.PlaybackState("BUFFERING", 0);
                        PAUSED = new PlaybackInfo.PlaybackState("PAUSED", 1);
                        PLAYING = new PlaybackInfo.PlaybackState("PLAYING", 2);
                        STOPPED = new PlaybackInfo.PlaybackState("STOPPED", 3);
                        ENDED = new PlaybackInfo.PlaybackState("ENDED", 4);
                        ERROR = new PlaybackInfo.PlaybackState("ERROR", 5);
                        $VALUES = (new PlaybackInfo.PlaybackState[] {
                            BUFFERING, PAUSED, PLAYING, STOPPED, ENDED, ERROR
                        });
                    }

            private PlaybackInfo.PlaybackState(String s, int i1)
            {
                super(s, i1);
            }
                }

                playbackinfo.c = PlaybackInfo.PlaybackState.BUFFERING;
                playbackinfo.d = false;
                playbackinfo.e = false;
                playbackinfo.f = null;
                playbackinfo.g = 0L;
                playbackinfo.h = false;
                if (l != null)
                {
                    l.a();
                }
                if (k != null)
                {
                    k.a();
                }
                k = com.google.android.apps.youtube.common.a.d.a(new g(this));
                l = com.google.android.apps.youtube.common.a.d.a(new com.google.android.apps.youtube.core.player.notification.h(this));
                if (!c.a())
                {
                    break label0;
                }
                a.a(s, k);
            }
            return;
        }
        c(s);
    }

    public final void b(boolean flag)
    {
        h.h = flag;
        c();
    }

    private class PlaybackInfo
    {

        public String a;
        public String b;
        public PlaybackState c;
        public boolean d;
        public boolean e;
        public Bitmap f;
        public long g;
        public boolean h;

        public PlaybackInfo()
        {
        }
    }

}
