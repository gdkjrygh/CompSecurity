// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import android.util.Pair;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.android.apps.youtube.datalib.innertube.model.media.c;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.a.b;
import com.google.android.exoplayer.a.s;
import com.google.android.exoplayer.ab;
import com.google.android.exoplayer.af;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.b.a;
import com.google.android.exoplayer.d;
import com.google.android.exoplayer.f;
import com.google.android.exoplayer.g;
import com.google.android.exoplayer.m;
import com.google.android.exoplayer.r;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            x, k, j, YouTubePlayerEvents, 
//            h, ak, y, MissingStreamException, 
//            ae, ad

public final class i
    implements x, g
{

    private final e a;
    private final com.google.android.exoplayer.upstream.c b;
    private final h c;
    private final YouTubePlayerEvents d = new YouTubePlayerEvents();
    private final k e = new k(this, (byte)0);
    private final af f = new j(this, (byte)0);
    private final ae g;
    private FormatStream h;
    private y i;
    private d j;
    private com.google.android.apps.youtube.medialib.player.ak k;
    private ak l;
    private ak m;
    private boolean n;
    private boolean o;
    private List p;
    private com.google.android.exoplayer.b.a.a q[];
    private com.google.android.exoplayer.b.a.a r[];
    private int s;
    private int t;
    private float u;
    private boolean v;
    private String w;
    private PlayerConfig x;

    public i(e e1, com.google.android.exoplayer.upstream.c c1, ae ae1, h h1)
    {
        a = e1;
        b = c1;
        g = ae1;
        c = h1;
        u = 1.0F;
    }

    static int a(i i1, int j1)
    {
        i1.s = j1;
        return j1;
    }

    static void a(i i1)
    {
        i1.p();
    }

    private void a(String s1)
    {
        L.b(s1);
        d.a(new YouTubePlayerEvents.CantPlayStreamException());
        q = null;
        r = null;
        h = null;
    }

    private void a(com.google.android.exoplayer.b.a.a aa[], com.google.android.exoplayer.b.a.a aa1[], int i1)
    {
        if (j != null)
        {
            n();
        }
        j = com.google.android.exoplayer.f.a(2, x.minBufferMs(), 5000);
        Object obj = j;
        m m1;
        ak aak[];
        int j1;
        int k1;
        boolean flag;
        if (i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((d) (obj)).a(1, flag);
        j.a(this);
        j.a(i1);
        obj = new Handler();
        m1 = new m(new com.google.android.exoplayer.upstream.f(m()), null, null, x.lowWatermarkMs(), x.highWatermarkMs(), x.lowPoolLoad(), x.highPoolLoad());
        if (aa != null && aa[0] != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            j1 = 2;
        } else
        {
            j1 = 1;
        }
        aak = new ak[j1];
        aa1 = new a((com.google.android.exoplayer.upstream.i)a.b(), new s(), new com.google.android.exoplayer.b.a.a[] {
            aa1[0]
        });
        k1 = c.d();
        j1 = k1;
        if (k1 == -1)
        {
            j1 = 100;
        }
        aak[0] = new r(new b(aa1, m1, j1 * m(), true), null);
        if (i1 != 0)
        {
            aa1 = (com.google.android.exoplayer.upstream.i)a.b();
            k = new com.google.android.apps.youtube.medialib.player.ak(b, x.maxInitialByteRate(), x.minDurationForQualityIncreaseMs(), x.maxDurationForQualityDecreaseMs(), x.minDurationToRetainAfterDiscardMs(), x.bandwidthFraction());
            aa = new a(aa1, k, aa);
            j1 = c.c();
            i1 = j1;
            if (j1 == -1)
            {
                i1 = 260;
            }
            aak[1] = new ab(new b(aa, m1, i1 * m(), true), null, 1, 5000L, ((Handler) (obj)), f, 1);
        }
        m = aak[0];
        if (aak.length > 1)
        {
            l = aak[1];
        } else
        {
            l = null;
        }
        j.a(aak);
        a(u);
        d.a(1);
    }

    private static com.google.android.exoplayer.b.a.a[] a(FormatStream formatstream, String s1)
    {
        return (new com.google.android.exoplayer.b.a.a[] {
            formatstream.getRepresentation(s1)
        });
    }

    private static com.google.android.exoplayer.b.a.a[] a(List list, String s1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            FormatStream formatstream = (FormatStream)list.next();
            if (c(formatstream.getItag()))
            {
                return (new com.google.android.exoplayer.b.a.a[] {
                    formatstream.getRepresentation(s1)
                });
            }
        }

        return null;
    }

    static int b(i i1)
    {
        return i1.s;
    }

    static int b(i i1, int j1)
    {
        i1.t = j1;
        return j1;
    }

    private static Pair b(List list, String s1)
    {
        LinkedList linkedlist = new LinkedList();
        LinkedList linkedlist1 = new LinkedList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            FormatStream formatstream = (FormatStream)list.next();
            int i1 = formatstream.getItag();
            if (b(i1))
            {
                linkedlist.add(formatstream.getRepresentation(s1));
            } else
            if (c(i1))
            {
                linkedlist1.add(formatstream.getRepresentation(s1));
            }
        } while (true);
        if (linkedlist.size() == 0 || linkedlist1.size() == 0)
        {
            return null;
        } else
        {
            list = new com.google.android.exoplayer.b.a.a[linkedlist.size()];
            s1 = new com.google.android.exoplayer.b.a.a[linkedlist1.size()];
            linkedlist.toArray(list);
            linkedlist1.toArray(s1);
            return new Pair(list, s1);
        }
    }

    public static boolean b(int i1)
    {
        return com.google.android.apps.youtube.datalib.innertube.model.media.c.a().contains(Integer.valueOf(i1));
    }

    static int c(i i1)
    {
        return i1.t;
    }

    private static boolean c(int i1)
    {
        return i1 == 140;
    }

    static y d(i i1)
    {
        return i1.i;
    }

    static com.google.android.apps.youtube.medialib.player.ak e(i i1)
    {
        return i1.k;
    }

    static d f(i i1)
    {
        return i1.j;
    }

    static void g(i i1)
    {
        i1.q();
    }

    static YouTubePlayerEvents h(i i1)
    {
        return i1.d;
    }

    private int m()
    {
        int j1 = c.b();
        int i1 = j1;
        if (j1 == -1)
        {
            i1 = 51200;
        }
        return i1;
    }

    private void n()
    {
        if (j != null)
        {
            o();
            j.c();
            j = null;
            l = null;
            h = null;
        }
    }

    private void o()
    {
        if (j != null && l != null && i != null && i.h() && o)
        {
            i.b(j, l);
            o = false;
        }
    }

    private void p()
    {
        if (j != null && l != null && i != null && i.h() && !o)
        {
            k.a(j, i.b(), i.c());
            i.a(j, l);
            j.a(1, true);
            o = true;
        }
    }

    private void q()
    {
        if (i != null)
        {
            i.setListener(null);
            o();
            i = null;
        }
    }

    public final FormatStream a()
    {
        return h;
    }

    public final void a(float f1)
    {
        u = f1;
        if (j != null)
        {
            j.a(m, 1, Float.valueOf(f1));
        }
    }

    public final void a(int i1)
    {
        if (j != null)
        {
            d.b(i1);
            v = true;
            j.a(i1);
            d.c(i1);
        }
    }

    public final void a(int i1, int j1)
    {
        if (!x.isAdaptiveBitrateEnabled())
        {
            ad ad1;
            try
            {
                ad1 = g.a(p, com.google.android.apps.youtube.datalib.innertube.model.media.e.b(), i1);
            }
            catch (MissingStreamException missingstreamexception)
            {
                return;
            }
            if (!h.equals(ad1.a()))
            {
                h = ad1.a();
                com.google.android.exoplayer.b.a.a aa[] = a(p, w);
                if (aa != null)
                {
                    d.a(ad1, j1);
                    r = aa;
                    q = a(h, w);
                    a(q, aa, f());
                    b();
                    return;
                }
            }
        }
    }

    public final void a(int i1, VideoStreamingData videostreamingdata, int j1, String s1, PlayerConfig playerconfig)
    {
        s = 0;
        t = 0;
        v = false;
        if (i != null)
        {
            i.e();
        }
        if (videostreamingdata == null)
        {
            a("No streaming data available for ExoPlayer playback.");
            return;
        }
        if (videostreamingdata.isLive())
        {
            L.b("Live video not supported by adaptive DASH player.");
            throw new UnsupportedOperationException();
        }
        p = videostreamingdata.getAdaptiveFormatStreams();
        if (p.size() == 0)
        {
            a("No adaptive streams available for ExoPlayer playback.");
            return;
        }
        FormatStream formatstream;
        if (videostreamingdata.isAudioOnly())
        {
            videostreamingdata = videostreamingdata.getAudioOnlyStream();
            videostreamingdata = new ad(videostreamingdata, videostreamingdata, i1, false);
        } else
        {
            try
            {
                videostreamingdata = g.a(p, com.google.android.apps.youtube.datalib.innertube.model.media.e.b(), i1);
            }
            // Misplaced declaration of an exception variable
            catch (VideoStreamingData videostreamingdata)
            {
                a("No video stream selected for ExoPlayer playback.");
                return;
            }
        }
        w = s1;
        x = playerconfig;
        formatstream = videostreamingdata.a();
        if (formatstream.equals(h))
        {
            a(j1);
            if (i != null)
            {
                i.d();
            }
        } else
        {
            h = formatstream;
            d.a(0);
            if (playerconfig.isAdaptiveBitrateEnabled())
            {
                s1 = b(p, s1);
            } else
            {
                playerconfig = a(p, s1);
                s1 = a(formatstream, s1);
                if (playerconfig == null && s1 == null)
                {
                    a("No compatible audio or video streams available for ExoPlayer playback");
                    return;
                }
                s1 = Pair.create(s1, playerconfig);
            }
            if (s1 == null)
            {
                a("No compatible adaptive streams available for ExoPlayer playback.");
                return;
            }
            d.a(videostreamingdata, 0);
            q = (com.google.android.exoplayer.b.a.a[])((Pair) (s1)).first;
            r = (com.google.android.exoplayer.b.a.a[])((Pair) (s1)).second;
            a(q, r, j1);
        }
        b();
    }

    public final void a(Handler handler)
    {
        d.a(handler);
    }

    public final void a(y y1)
    {
        q();
        i = y1;
        y1.setListener(e);
        p();
    }

    public final void a(ExoPlaybackException exoplaybackexception)
    {
        d.a(exoplaybackexception);
    }

    public final void a(boolean flag)
    {
        n();
    }

    public final void a(boolean flag, int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 3: // '\003'
            n = true;
            d.a(5);
            return;

        case 4: // '\004'
            if (n)
            {
                n = false;
                d.a(6);
            }
            if (flag)
            {
                d.a(2);
            }
            v = false;
            return;

        case 5: // '\005'
            d.a(7);
            v = false;
            return;
        }
    }

    public final void b()
    {
        if (j == null)
        {
            if (q != null && r != null)
            {
                a(q, r, 0);
            }
            return;
        }
        p();
        if (j.a() == 5 && !v)
        {
            j.a(0);
        }
        j.a(true);
    }

    public final void b(Handler handler)
    {
        d.b(handler);
    }

    public final void c()
    {
        if (j != null)
        {
            j.a(false);
            d.a(3);
        }
    }

    public final void d()
    {
        e();
    }

    public final void e()
    {
        if (j != null)
        {
            n();
            d.a(4);
        }
    }

    public final int f()
    {
        if (j != null)
        {
            return j.e();
        } else
        {
            return 0;
        }
    }

    public final int g()
    {
        if (j != null)
        {
            return j.d();
        } else
        {
            return 0;
        }
    }

    public final int h()
    {
        if (j != null)
        {
            return j.f();
        } else
        {
            return 0;
        }
    }

    public final boolean i()
    {
        return j != null && j.a() == 3;
    }

    public final boolean j()
    {
        return i() || j != null && j.a() == 4 && j.b();
    }

    public final void k()
    {
        if (i != null)
        {
            i.e();
        }
    }

    public final void l()
    {
        if (j != null)
        {
            j.a(1, false);
        }
        q();
    }
}
