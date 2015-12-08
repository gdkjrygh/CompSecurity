// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.a.a.a.a.rk;
import com.google.a.a.a.a.rl;
import com.google.a.a.a.a.rm;
import com.google.a.a.a.a.rn;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.async.w;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.player.AdError;
import com.google.android.apps.youtube.core.player.al;
import com.google.android.apps.youtube.core.player.c;
import com.google.android.apps.youtube.datalib.e.f;
import com.google.android.apps.youtube.datalib.innertube.model.InfoCardCollection;
import com.google.android.apps.youtube.datalib.innertube.model.m;
import com.google.android.apps.youtube.datalib.legacy.model.InfoCard;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.aw;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            AdStatsClient, j, bn, b

public final class bm
    implements b, AdStatsClient
{

    private final j a;
    private final VastAd b;
    private final VmapAdBreak c;
    private final com.google.android.apps.youtube.core.player.b d;
    private boolean e;
    private boolean f;
    private boolean g;
    private List h;
    private int i;
    private int j;
    private PriorityQueue k;
    private al l;

    bm(j j1, VmapAdBreak vmapadbreak, VastAd vastad, String s)
    {
        l = null;
        a = j1;
        b = vastad;
        c = vmapadbreak;
        h = new ArrayList();
        j = -1;
        k = g(j);
        d = com.google.android.apps.youtube.core.player.c.a();
        d.a(vmapadbreak.getOriginalVideoId(), s);
        d.a(vmapadbreak);
        d.a(vastad);
        d.a(l);
    }

    bm(j j1, VmapAdBreak vmapadbreak, VastAd vastad, String s, int i1, boolean flag, boolean flag1, 
            boolean flag2, List list, int k1)
    {
        this(j1, vmapadbreak, vastad, s);
        i = i1;
        e = flag;
        f = flag1;
        g = flag2;
        h = new ArrayList(com.google.android.apps.youtube.common.e.c.a(list));
        j = k1;
        k = g(k1);
    }

    static VastAd a(bm bm1)
    {
        return bm1.b;
    }

    private void a(Uri uri)
    {
        a(uri, AdError.a);
    }

    private void a(Uri uri, AdError aderror)
    {
        if (uri == null) goto _L2; else goto _L1
_L1:
        aderror = d.a(uri, aderror);
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

    private void a(String s)
    {
        if (!h.contains(s))
        {
            h.add(s);
            VastAd vastad = b;
            while (vastad != null) 
            {
                a(vastad.createCustomAdSenseConversionUri(s));
                vastad = vastad.getParentWrapper();
            }
        }
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

    private m f(int i1)
    {
        if (b == null || b.adInfoCards == null || i1 >= b.adInfoCards.getInfoCards().size())
        {
            return null;
        } else
        {
            return (m)b.adInfoCards.getInfoCards().get(i1);
        }
    }

    private PriorityQueue g(int i1)
    {
        PriorityQueue priorityqueue = new PriorityQueue(b.getProgressPings().size() + 1, new bn(this));
label0:
        for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
        {
            Iterator iterator = vastad.getProgressPings().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing progressping = (com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)iterator.next();
                if (progressping.getTimeOffsetMilliseconds(b.getDuration()) > i1)
                {
                    priorityqueue.add(progressping);
                }
            } while (true);
        }

        return priorityqueue;
    }

    public final void a()
    {
        a(c.getBreakStartPingUris());
    }

    public final void a(int i1)
    {
        List list;
        VastAd vastad1;
        int j1;
        int k1;
        boolean flag;
        for (; k.size() > 0 && i1 >= ((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)k.peek()).getTimeOffsetMilliseconds(b.getDuration()); a(((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)k.poll()).getPingUri())) { }
        j = i1;
        j1 = b.getDuration() * 1000;
        if (j1 > 0)
        {
            j1 = (i1 * 4) / j1;
        } else
        {
            j1 = 0;
        }
        if (j1 < i)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        k1 = j1;
_L9:
        if (k1 < i)
        {
            break; /* Loop/switch isn't completed */
        }
        vastad1 = b;
        flag = false;
_L6:
        if (vastad1 == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        k1;
        JVM INSTR tableswitch 1 3: default 148
    //                   1 176
    //                   2 184
    //                   3 192;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_192;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        list = Collections.emptyList();
_L7:
        flag |= a(list);
        vastad1 = vastad1.getParentWrapper();
        if (true) goto _L6; else goto _L5
_L5:
        list = vastad1.getFirstQuartilePingUris();
          goto _L7
_L3:
        list = vastad1.getMidpointPingUris();
          goto _L7
        list = vastad1.getThirdQuartilePingUris();
          goto _L7
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        k1--;
        if (true) goto _L9; else goto _L8
_L8:
        i = j1 + 1;
        if (!e && i1 >= 30000)
        {
            for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
            {
                a(vastad.getEngagedViewPingUris());
            }

            e = true;
        }
        return;
    }

    public final void a(int i1, int j1)
    {
        d.a(i1, j1);
        for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
        {
            a(vastad.getSkipPingUris());
        }

    }

    public final void a(AdError aderror)
    {
        a(c.getErrorPingUris(), aderror);
    }

    public final void a(al al)
    {
        l = al;
        d.a(al);
    }

    public final void a(InfoCard infocard, int i1)
    {
        if (b != null && b.getInfoCards() != null && b.getInfoCards().contains(infocard))
        {
            infocard = infocard.getEvents().iterator();
            while (infocard.hasNext()) 
            {
                com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardTrackingEvent infocardtrackingevent = (com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardTrackingEvent)infocard.next();
                if (infocardtrackingevent.getType() == i1)
                {
                    a(infocardtrackingevent.getBaseUrl());
                }
            }
        }
    }

    public final void a(InfoCard infocard, com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardAction infocardaction)
    {
        if (b != null && b.getInfoCards() != null && b.getInfoCards().contains(infocard))
        {
            infocard = infocardaction.getActionTrackingUris().iterator();
            while (infocard.hasNext()) 
            {
                a((Uri)infocard.next());
            }
        }
    }

    public final void a(aw aw1)
    {
        if (b.getSurvey() != null)
        {
            a(aw1.a(b.getSurvey()));
        }
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
        a(c.getBreakEndPingUris());
    }

    public final void b(int i1)
    {
        m m1 = f(i1);
        if (m1 != null)
        {
            String as[] = m1.a().d;
            int j1 = as.length;
            i1 = 0;
            while (i1 < j1) 
            {
                String s = as[i1];
                try
                {
                    a(p.b(s));
                }
                catch (MalformedURLException malformedurlexception)
                {
                    L.c((new StringBuilder("Invalid info card teaser impression ping uri was ignored: ")).append(s).toString());
                }
                i1++;
            }
        }
    }

    public final void b(AdError aderror)
    {
        if (i != 5)
        {
            for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
            {
                a(vastad.getClosePingUris(), aderror);
                a(vastad.getErrorPingUris(), aderror);
            }

            i = 5;
        }
    }

    public final void c()
    {
        if (b.isForecastingAd() && !f)
        {
            a(b.getImpressionUris());
            f = true;
        }
    }

    public final void c(int i1)
    {
        m m1 = f(i1);
        if (m1 != null)
        {
            String as[] = m1.b().g;
            int j1 = as.length;
            i1 = 0;
            while (i1 < j1) 
            {
                String s = as[i1];
                try
                {
                    a(p.b(s));
                }
                catch (MalformedURLException malformedurlexception)
                {
                    L.c("Invalid info card teaser impression ping uri - ignored");
                }
                i1++;
            }
        }
    }

    public final void d()
    {
        if (!g)
        {
            for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
            {
                a(vastad.getSkipShownPingUris());
            }

            g = true;
        }
    }

    public final void d(int i1)
    {
        m m1 = f(i1);
        if (m1 != null && m1.d() != null)
        {
            String as[] = m1.d().b;
            int j1 = as.length;
            i1 = 0;
            while (i1 < j1) 
            {
                String s = as[i1];
                try
                {
                    a(p.b(s));
                }
                catch (MalformedURLException malformedurlexception)
                {
                    L.c("Invalid info card uri - ignored");
                }
                i1++;
            }
        }
    }

    public final void e()
    {
        for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
        {
            a(vastad.getClickTrackingPingUris());
        }

    }

    public final void e(int i1)
    {
        m m1 = f(i1);
        if (m1 != null && m1.c() != null)
        {
            String as[] = m1.c().d;
            int j1 = as.length;
            i1 = 0;
            while (i1 < j1) 
            {
                String s = as[i1];
                try
                {
                    a(p.b(s));
                }
                catch (MalformedURLException malformedurlexception)
                {
                    L.c("Invalid info card action ping uri - ignored");
                }
                i1++;
            }
        }
    }

    public final void f()
    {
        if (!f)
        {
            for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
            {
                a(vastad.getImpressionUris());
            }

            f = true;
        }
        if (i == 0)
        {
            for (VastAd vastad1 = b; vastad1 != null; vastad1 = vastad1.getParentWrapper())
            {
                a(vastad1.getStartPingUris());
            }

            i = 1;
        } else
        {
            VastAd vastad2 = b;
            while (vastad2 != null) 
            {
                a(vastad2.getResumePingUris());
                vastad2 = vastad2.getParentWrapper();
            }
        }
    }

    public final void g()
    {
        for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
        {
            a(vastad.getClosePingUris());
        }

    }

    public final void h()
    {
        for (VastAd vastad = b; vastad != null; vastad = vastad.getParentWrapper())
        {
            a(vastad.getPausePingUris());
        }

    }

    public final void handleAdCompanionClickEvent(com.google.android.apps.youtube.core.client.b b1)
    {
        a("clickcompanionad");
    }

    public final void i()
    {
        VastAd vastad = b;
        if (!e)
        {
            for (; vastad != null; vastad = vastad.getParentWrapper())
            {
                a(vastad.getEngagedViewPingUris());
            }

            e = true;
        }
        for (; k.size() > 0; a(((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)k.poll()).getPingUri())) { }
        for (VastAd vastad1 = b; vastad1 != null; vastad1 = vastad1.getParentWrapper())
        {
            a(vastad1.getCompletePingUris());
        }

        i = 5;
    }

    public final AdStatsClient.AdStatsClientState j()
    {
        return new AdStatsClient.AdStatsClientState(i, e, f, g, h, j, AdStatsClient.AdStatsClientState.Kind.INSTREAM);
    }

    public final void k()
    {
        a("clickchannel");
    }
}
