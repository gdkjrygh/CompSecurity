// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.m2ts;

import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.android.apps.youtube.medialib.player.YouTubePlayerEvents;
import com.google.android.apps.youtube.medialib.player.x;
import com.google.android.apps.youtube.medialib.player.y;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.a.s;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.b.a;
import com.google.android.exoplayer.d;
import com.google.android.exoplayer.f;
import com.google.android.exoplayer.g;
import com.google.android.exoplayer.m;
import com.google.android.exoplayer.upstream.i;

// Referenced classes of package com.google.android.apps.youtube.medialib.m2ts:
//            e

public final class b
    implements x, g
{

    PlayerConfig a;
    private final YouTubePlayerEvents b = new YouTubePlayerEvents();
    private FormatStream c;
    private com.google.android.exoplayer.b.a.a d;
    private d e;
    private ak f;
    private boolean g;
    private final e h;
    private float i;

    public b(e e1)
    {
        h = e1;
        i = 1.0F;
    }

    private void a(com.google.android.exoplayer.b.a.a a1, int i1)
    {
        if (e != null)
        {
            e.c();
        }
        e = com.google.android.exoplayer.f.a(1, 2000);
        e.a(this);
        e.a(i1);
        e e1 = h;
        Object obj = a;
        obj = new m(new com.google.android.exoplayer.upstream.f(40960), null, null, ((PlayerConfig) (obj)).lowWatermarkMs(), ((PlayerConfig) (obj)).highWatermarkMs(), ((PlayerConfig) (obj)).lowPoolLoad(), ((PlayerConfig) (obj)).highPoolLoad());
        f = new com.google.android.apps.youtube.medialib.m2ts.e(new com.google.android.exoplayer.a.b(new a((i)e1.b(), new s(), new com.google.android.exoplayer.b.a.a[] {
            a1
        }), ((m) (obj)), 0x500000, false));
        e.a(new ak[] {
            f
        });
        a(i);
        b.a(1);
        b();
    }

    private void m()
    {
        if (e != null)
        {
            e.c();
            e = null;
            f = null;
        }
    }

    public final FormatStream a()
    {
        return c;
    }

    public final void a(float f1)
    {
        i = f1;
        if (e != null)
        {
            e.a(f, 1, Float.valueOf(f1));
        }
    }

    public final void a(int i1)
    {
        if (e != null)
        {
            b.b(i1);
            e.a(i1);
            b.c(i1);
        }
    }

    public final void a(int i1, int j1)
    {
    }

    public final void a(int i1, VideoStreamingData videostreamingdata, int j1, String s1, PlayerConfig playerconfig)
    {
        if (videostreamingdata == null || !videostreamingdata.hasAudioOnlyStream() || videostreamingdata.isLive())
        {
            L.b("No streaming data available for background playback.");
            c = null;
            d = null;
            b.a(new com.google.android.apps.youtube.medialib.player.YouTubePlayerEvents.CantPlayStreamException());
            return;
        }
        a = playerconfig;
        videostreamingdata = videostreamingdata.getAudioOnlyStream();
        s1 = videostreamingdata.getRepresentation(s1);
        if (e == null || d == null || !d.k.equals(((com.google.android.exoplayer.b.a.a) (s1)).k))
        {
            c = videostreamingdata;
            d = s1;
            b.a(0);
            a(d, j1);
        } else
        {
            a(j1);
        }
        b();
    }

    public final void a(Handler handler)
    {
        b.a(handler);
    }

    public final void a(y y)
    {
    }

    public final void a(ExoPlaybackException exoplaybackexception)
    {
        b.a(exoplaybackexception);
    }

    public final void a(boolean flag)
    {
        m();
    }

    public final void a(boolean flag, int i1)
    {
        i1;
        JVM INSTR tableswitch 3 5: default 28
    //                   3 29
    //                   4 43
    //                   5 65;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        g = true;
        b.a(5);
        return;
_L3:
        if (g)
        {
            g = false;
            b.a(6);
            return;
        }
          goto _L1
_L4:
        b.a(7);
        return;
    }

    public final void b()
    {
        if (d != null)
        {
            if (e == null)
            {
                a(d, 0);
            } else
            {
                if (e.a() == 5)
                {
                    e.a(0);
                }
                e.a(true);
            }
            b.a(2);
        }
    }

    public final void b(Handler handler)
    {
        b.b(handler);
    }

    public final void c()
    {
        if (e != null)
        {
            e.a(false);
            b.a(3);
        }
    }

    public final void d()
    {
        e();
    }

    public final void e()
    {
        if (e != null)
        {
            m();
            b.a(4);
        }
    }

    public final int f()
    {
        if (e != null)
        {
            return e.e();
        } else
        {
            return 0;
        }
    }

    public final int g()
    {
        if (e != null)
        {
            return e.d();
        } else
        {
            return 0;
        }
    }

    public final int h()
    {
        if (e != null)
        {
            return e.f();
        } else
        {
            return 0;
        }
    }

    public final boolean i()
    {
        return e != null && e.a() == 3;
    }

    public final boolean j()
    {
        return e != null && e.a() == 4 && e.b();
    }

    public final void k()
    {
    }

    public final void l()
    {
    }
}
