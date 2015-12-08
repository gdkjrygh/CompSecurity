// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.fetcher.d;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.bf;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            AdsClient, r, h, k, 
//            cj, VastFetcher

public final class q
    implements AdsClient
{

    public static final long a;
    private final b b;
    private final k c;
    private cj d;
    private VastFetcher e;
    private final com.google.android.apps.youtube.core.client.h f;
    private final d g;

    private q(r r1)
    {
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(com.google.android.apps.youtube.core.client.r.a(r1));
        f = (com.google.android.apps.youtube.core.client.h)com.google.android.apps.youtube.common.fromguava.c.a(com.google.android.apps.youtube.core.client.r.b(r1));
        g = (d)com.google.android.apps.youtube.common.fromguava.c.a(com.google.android.apps.youtube.core.client.r.c(r1));
        c = new k(com.google.android.apps.youtube.core.client.r.d(r1), r.e(r1), r.f(r1), com.google.android.apps.youtube.core.client.r.a(r1));
        cj cj1;
        if (r.g(r1) != null)
        {
            cj1 = new cj(b, r.f(r1), r.g(r1));
        } else
        {
            cj1 = new cj(b, r.f(r1), c, com.google.android.apps.youtube.core.client.r.h(r1));
        }
        d = cj1;
        if (r.i(r1) != null)
        {
            r1 = new VastFetcher(b, r.j(r1), f, g, r.i(r1));
        } else
        {
            r1 = new VastFetcher(b, r.j(r1), f, g, c, r.f(r1));
        }
        e = r1;
    }

    q(r r1, byte byte0)
    {
        this(r1);
    }

    public final long a()
    {
        return f.g();
    }

    public final VastAd a(VmapAdBreak vmapadbreak, String s, long l, Map map)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.fromguava.c.a(vmapadbreak);
        return e.a(vmapadbreak, l, map);
    }

    public final VastAd a(VmapAdBreak vmapadbreak, String s, Map map)
    {
        return a(vmapadbreak, s, a, map);
    }

    public final List a(PlayerResponse playerresponse, String s)
    {
        long l = 0L;
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.fromguava.c.a(playerresponse);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        long l1 = f.g();
        playerresponse = playerresponse.getVideoId();
        if (l1 != 0L)
        {
            l = (b.a() - l1) / 1000L;
        }
        return a(((String) (playerresponse)), com.google.android.apps.youtube.core.converter.http.b.a(l, s, f.l().g(), f.i().i(), f.l().d(), f.l().f()), a);
    }

    public final List a(String s, Map map, long l)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(map);
        try
        {
            s = d.a(s, map, l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            L.a("Error retrieving VMAP response", s);
            throw s;
        }
        if (s == null)
        {
            return null;
        }
        s = s.a();
        return s;
    }

    public final void a(int i)
    {
        f.a().a(i);
    }

    public final void a(VastAd vastad)
    {
        if (!vastad.isForecastingAd())
        {
            f.a(b.a());
        }
    }

    public final List b(PlayerResponse playerresponse, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.fromguava.c.a(playerresponse);
        if (playerresponse.getVmapXml() != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((playerresponse = d.a(playerresponse, a)) == null) goto _L1; else goto _L3
_L3:
        try
        {
            playerresponse = playerresponse.a();
        }
        // Misplaced declaration of an exception variable
        catch (PlayerResponse playerresponse)
        {
            L.a("Error retrieving VMAP from PlayerResponse", playerresponse);
            throw playerresponse;
        }
        return playerresponse;
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(15L);
    }
}
