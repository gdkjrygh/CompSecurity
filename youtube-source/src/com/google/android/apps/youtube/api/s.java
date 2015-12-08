// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.player.internal.b.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api:
//            t, v, u, w

public final class s
{

    private final Handler a = new Handler(Looper.getMainLooper());
    private final bc b;
    private final bj c;
    private final h d;
    private GDataRequest e;
    private int f;
    private int g;
    private List h;
    private d i;
    private d j;
    private d k;
    private final t l;

    public s(t t1, bc bc1, bj bj1, h h1)
    {
        f = -1;
        g = -1;
        l = (t)com.google.android.apps.youtube.common.fromguava.c.a(t1);
        b = bc1;
        c = bj1;
        d = h1;
    }

    static int a(s s1, int i1)
    {
        s1.f = i1;
        return i1;
    }

    static GDataRequest a(s s1, GDataRequest gdatarequest)
    {
        s1.e = gdatarequest;
        return gdatarequest;
    }

    static void a(s s1)
    {
        s1.h();
    }

    static void a(s s1, Video video)
    {
        s1.a(video);
    }

    private void a(Video video)
    {
        if (video == null || video.hqThumbnailUri == null)
        {
            h();
            return;
        } else
        {
            k = com.google.android.apps.youtube.common.a.d.a(new v(this, video.id));
            c.b(video.hqThumbnailUri, com.google.android.apps.youtube.common.a.e.a(a, k));
            return;
        }
    }

    static List b(s s1)
    {
        return s1.h;
    }

    static GDataRequest c(s s1)
    {
        return s1.e;
    }

    static int d(s s1)
    {
        return s1.g;
    }

    static void e(s s1)
    {
        s1.g();
    }

    static t f(s s1)
    {
        return s1.l;
    }

    private void f()
    {
        if (j != null)
        {
            j.a();
            j = null;
        }
        if (i != null)
        {
            i.a();
            i = null;
        }
        if (k != null)
        {
            k.a();
            k = null;
        }
        e = null;
        g = -1;
    }

    private void g()
    {
        int i1;
        if (e == null)
        {
            i1 = h.size();
        } else
        {
            i1 = 0x7fffffff;
        }
        g = Math.max(0, Math.min(g, i1));
        if (g < h.size() && g >= 0)
        {
            f = g;
            a((Video)h.get(g));
            return;
        }
        if (e != null)
        {
            i = com.google.android.apps.youtube.common.a.d.a(new u(this, (byte)0));
            b.c().a(e, com.google.android.apps.youtube.common.a.e.a(a, i));
            return;
        } else
        {
            h();
            return;
        }
    }

    private void h()
    {
        com.google.android.youtube.player.YouTubeThumbnailLoader.ErrorReason errorreason;
        if (d.a())
        {
            errorreason = com.google.android.youtube.player.YouTubeThumbnailLoader.ErrorReason.NETWORK_ERROR;
        } else
        {
            errorreason = com.google.android.youtube.player.YouTubeThumbnailLoader.ErrorReason.INTERNAL_ERROR;
        }
        f();
        l.a(errorreason.name(), e(), d());
    }

    public final void a()
    {
        if (!d())
        {
            String s1;
            if (h == null)
            {
                s1 = "due to no playlist being set.";
            } else
            {
                s1 = "as already at the end of the playlist.";
            }
            com.google.android.youtube.player.internal.b.a.a((new StringBuilder("Ignoring call to next() on YouTubeThumbnailView ")).append(s1).toString(), new Object[0]);
            return;
        } else
        {
            g = f + 1;
            g();
            return;
        }
    }

    public final void a(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "videoId cannot be empty");
        f();
        e = b.a().a(s1);
        h = null;
        f = -1;
        g = -1;
        j = com.google.android.apps.youtube.common.a.d.a(new w(this, (byte)0));
        b.b().a(e, com.google.android.apps.youtube.common.a.e.a(a, j));
    }

    public final void a(String s1, int i1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "playlistId cannot be null or empty");
        f();
        e = b.a().g(s1);
        f = i1 - 1;
        g = i1 - 1;
        h = new ArrayList();
        a();
    }

    public final void b()
    {
        if (!e())
        {
            String s1;
            if (h == null)
            {
                s1 = "due to no playlist being set.";
            } else
            {
                s1 = "as already at the start of the playlist.";
            }
            com.google.android.youtube.player.internal.b.a.a((new StringBuilder("Ignoring call to previous() on YouTubeThumbnailView ")).append(s1).toString(), new Object[0]);
            return;
        } else
        {
            g = f - 1;
            g();
            return;
        }
    }

    public final void c()
    {
        if (h == null)
        {
            com.google.android.youtube.player.internal.b.a.a("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
            return;
        } else
        {
            g = 0;
            g();
            return;
        }
    }

    public final boolean d()
    {
        while (h == null || f >= h.size() - 1 && e == null) 
        {
            return false;
        }
        return true;
    }

    public final boolean e()
    {
        while (h == null || f <= 0) 
        {
            return false;
        }
        return true;
    }
}
