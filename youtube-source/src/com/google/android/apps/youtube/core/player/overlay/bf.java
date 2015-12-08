// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.ce;
import com.google.android.apps.youtube.core.player.ao;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.core.player.event.ae;
import com.google.android.apps.youtube.core.player.event.af;
import com.google.android.apps.youtube.core.player.event.x;
import com.google.android.apps.youtube.core.utils.an;
import com.google.android.apps.youtube.core.utils.ap;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.youtube.datalib.legacy.model.Subtitles;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;
import com.google.android.youtube.p;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bi, be, q, SubtitlesPreferences, 
//            bg, bh

public final class bf
    implements b, bi, ap
{

    private final be a;
    private final ce b;
    private final q c;
    private final Analytics d;
    private final Context e;
    private final an f = new an();
    private final Handler g;
    private final ao h;
    private final SubtitlesPreferences i;
    private final a j;
    private Subtitles k;
    private List l;
    private int m;
    private d n;
    private SubtitleTrack o;
    private boolean p;
    private boolean q;
    private int r;

    public bf(be be1, ce ce1, q q1, Analytics analytics, SharedPreferences sharedpreferences, Context context, a a1)
    {
        a = (be)com.google.android.apps.youtube.common.fromguava.c.a(be1);
        b = (ce)com.google.android.apps.youtube.common.fromguava.c.a(ce1);
        c = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        j = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = analytics;
        e = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        g = new Handler(context.getMainLooper());
        i = new SubtitlesPreferences(context, sharedpreferences);
        i.a(this);
        be1.setSubtitlesStyle(i.b());
        be1.setFontScale(i.a());
        h = new ao(g, sharedpreferences, new bg(this, (byte)0), ce1, context.getString(p.gk));
        q1.a(new bh(this, (byte)0));
    }

    static q a(bf bf1)
    {
        return bf1.c;
    }

    static Context b(bf bf1)
    {
        return bf1.e;
    }

    private void b(int i1)
    {
label0:
        {
            if (k != null && p && q)
            {
                a.a(k.getSubtitleWindowSnapshotsAt(i1));
                int j1 = Collections.binarySearch(l, Integer.valueOf(i1));
                if (j1 >= 0)
                {
                    j1++;
                } else
                {
                    j1 = ~j1;
                }
                m = j1;
                if (m >= l.size())
                {
                    break label0;
                }
                f.a(this, i1, ((Integer)l.get(m)).intValue());
            }
            return;
        }
        d();
    }

    static Analytics c(bf bf1)
    {
        return bf1.d;
    }

    private void c()
    {
        f.a(this);
    }

    static ao d(bf bf1)
    {
        return bf1.h;
    }

    private void d()
    {
        f.a(this);
        a.d();
        a.e();
    }

    private void e()
    {
        d();
        if (k != null)
        {
            c.b(false);
            k = null;
        }
        o = null;
    }

    public final int a(int i1)
    {
        if (k != null)
        {
            a.a(k.getSubtitleWindowSnapshotsAt(i1));
        }
        if (k != null)
        {
            m = m + 1;
            if (m < l.size())
            {
                return ((Integer)l.get(m)).intValue();
            }
        }
        return -1;
    }

    public final void a()
    {
        i.a(null);
        c.a(null);
    }

    public final void a(float f1)
    {
        a.setFontScale(f1);
    }

    public final void a(SubtitleTrack subtitletrack)
    {
        o = subtitletrack;
        j.c(new x(subtitletrack.vssId));
        if (n != null)
        {
            n.a();
        }
        if (subtitletrack.isDisableOption())
        {
            e();
            return;
        } else
        {
            n = com.google.android.apps.youtube.common.a.d.a(this);
            b.a(subtitletrack, com.google.android.apps.youtube.common.a.e.a(g, n));
            return;
        }
    }

    public final void a(SubtitlesStyle subtitlesstyle)
    {
        a.setSubtitlesStyle(subtitlesstyle);
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("error retrieving subtitle", exception);
        e();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Subtitles)obj1;
        k = ((Subtitles) (obj));
        l = ((Subtitles) (obj)).getEventTimes();
        c.b(true);
        b(r);
    }

    public final SubtitleTrack b()
    {
        return o;
    }

    public final void handleVideoStageEvent(ac ac1)
    {
        q = ac1.c().isPlayingVideo();
        if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.NEW)
        {
            h.b();
            e();
            if (n != null)
            {
                n.a();
                n = null;
            }
        } else
        {
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.PLAYBACK_LOADED)
            {
                h.a(ac1.d().getPlayerResponse());
                a.setSubtitlesStyle(i.b());
                a.setFontScale(i.a());
                return;
            }
            if (ac1.c() == com.google.android.apps.youtube.core.player.Director.VideoStage.MEDIA_PLAYING_VIDEO)
            {
                a a1 = j;
                if (o != null)
                {
                    ac1 = o.vssId;
                } else
                {
                    ac1 = "-";
                }
                a1.c(new x(ac1));
                return;
            }
        }
    }

    public final void handleVideoTimeEvent(ae ae1)
    {
        r = ae1.a();
        b(r);
    }

    public final void handleYouTubePlayerStateEvent(af af1)
    {
        boolean flag;
        if (af1.a() != 7 && af1.a() != 8 && af1.a() != 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        switch (af1.a())
        {
        case 6: // '\006'
        default:
            return;

        case 4: // '\004'
            d();
            return;

        case 3: // '\003'
            c();
            return;

        case 5: // '\005'
            c();
            return;

        case 7: // '\007'
            d();
            return;

        case 8: // '\b'
            d();
            break;
        }
    }
}
