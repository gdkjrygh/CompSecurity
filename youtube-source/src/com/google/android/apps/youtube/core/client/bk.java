// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.w;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.player.AdError;
import com.google.android.apps.youtube.core.player.al;
import com.google.android.apps.youtube.core.player.c;
import com.google.android.apps.youtube.datalib.e.f;
import com.google.android.apps.youtube.datalib.legacy.model.InfoCard;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.aw;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            AdStatsClient, j, bl, b

public final class bk
    implements b, AdStatsClient
{

    private final j a;
    private final VastAd b;
    private final com.google.android.apps.youtube.core.player.b c;
    private boolean d;
    private int e;
    private int f;
    private PriorityQueue g;
    private al h;

    bk(j j1, VastAd vastad, String s)
    {
        h = null;
        a = j1;
        b = vastad;
        f = -1;
        g = f(f);
        c = com.google.android.apps.youtube.core.player.c.a();
        c.a(null, s);
        c.a(vastad);
        c.a(h);
    }

    bk(j j1, VastAd vastad, String s, int l, boolean flag, int i1)
    {
        this(j1, vastad, s);
        e = l;
        d = flag;
        f = i1;
        g = f(i1);
    }

    static VastAd a(bk bk1)
    {
        return bk1.b;
    }

    private void a(Uri uri)
    {
        a(uri, AdError.a);
    }

    private void a(Uri uri, AdError aderror)
    {
        if (uri == null) goto _L2; else goto _L1
_L1:
        aderror = c.a(uri, aderror);
        uri = aderror;
_L4:
        L.e((new StringBuilder("Pinging ")).append(uri).toString());
        a.a(a.a(uri, "vastad").a(b.getShouldAllowQueuedOfflinePings()).a(b.getExpirationTimeMillis()), com.google.android.apps.youtube.datalib.a.b.a);
_L2:
        return;
        aderror;
        L.c((new StringBuilder("Failed to substitute URI macros ")).append(aderror).toString());
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(List list)
    {
        return a(list, AdError.a);
    }

    private boolean a(List list, AdError aderror)
    {
        if (list != null && list.size() > 0)
        {
            for (list = list.iterator(); list.hasNext(); a((Uri)list.next(), aderror)) { }
            return true;
        } else
        {
            return false;
        }
    }

    private PriorityQueue f(int l)
    {
        PriorityQueue priorityqueue = new PriorityQueue(b.getProgressPings().size() + 1, new bl(this));
        Iterator iterator = b.getProgressPings().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing progressping = (com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)iterator.next();
            if (progressping.getTimeOffsetMilliseconds(b.getDuration()) > l)
            {
                priorityqueue.add(progressping);
            }
        } while (true);
        return priorityqueue;
    }

    public final void a()
    {
    }

    public final void a(int l)
    {
        Object obj;
        for (; g.size() > 0 && l >= ((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)g.peek()).getTimeOffsetMilliseconds(b.getDuration()); a(((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)g.poll()).getPingUri())) { }
        f = l;
        int i1 = b.getDuration() * 1000;
        if (i1 > 0)
        {
            l = (l * 4) / i1;
        } else
        {
            l = 0;
        }
        if (l < e) goto _L2; else goto _L1
_L1:
        i1 = l;
_L11:
        if (i1 < e) goto _L4; else goto _L3
_L3:
        obj = b;
        i1;
        JVM INSTR tableswitch 1 3: default 132
    //                   1 156
    //                   2 164
    //                   3 172;
           goto _L5 _L6 _L7 _L8
_L5:
        obj = Collections.emptyList();
_L9:
        if (a(((List) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        i1--;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = ((VastAd) (obj)).getFirstQuartilePingUris();
        continue; /* Loop/switch isn't completed */
_L7:
        obj = ((VastAd) (obj)).getMidpointPingUris();
        continue; /* Loop/switch isn't completed */
_L8:
        obj = ((VastAd) (obj)).getThirdQuartilePingUris();
        if (true) goto _L9; else goto _L4
_L4:
        e = l + 1;
_L2:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a(int l, int i1)
    {
    }

    public final void a(AdError aderror)
    {
    }

    public final void a(al al)
    {
        h = al;
        c.a(al);
    }

    public final void a(InfoCard infocard, int l)
    {
    }

    public final void a(InfoCard infocard, com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardAction infocardaction)
    {
    }

    public final void a(aw aw)
    {
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (w)obj;
        L.d((new StringBuilder("Ping failed ")).append(obj).toString(), exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
    }

    public final void b()
    {
    }

    public final void b(int l)
    {
    }

    public final void b(AdError aderror)
    {
        if (e != 5)
        {
            a(b.getClosePingUris(), aderror);
            a(b.getErrorPingUris(), aderror);
            e = 5;
        }
    }

    public final void c()
    {
        if (b.isForecastingAd() && !d)
        {
            a(b.getImpressionUris());
            d = true;
        }
    }

    public final void c(int l)
    {
    }

    public final void d()
    {
    }

    public final void d(int l)
    {
    }

    public final void e()
    {
    }

    public final void e(int l)
    {
    }

    public final void f()
    {
        if (!d)
        {
            a(b.getImpressionUris());
            d = true;
        }
        if (e == 0)
        {
            a(b.getStartPingUris());
            e = 1;
            return;
        } else
        {
            a(b.getResumePingUris());
            return;
        }
    }

    public final void g()
    {
        a(b.getClosePingUris());
    }

    public final void h()
    {
        a(b.getPausePingUris());
    }

    public final void handleAdCompanionClickEvent(com.google.android.apps.youtube.core.client.b b1)
    {
    }

    public final void i()
    {
        for (; g.size() > 0; a(((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)g.poll()).getPingUri())) { }
        a(b.getCompletePingUris());
        e = 5;
    }

    public final AdStatsClient.AdStatsClientState j()
    {
        return new AdStatsClient.AdStatsClientState(e, false, d, false, Collections.emptyList(), f, AdStatsClient.AdStatsClientState.Kind.TRUEVIEW_INDISPLAY);
    }

    public final void k()
    {
    }
}
