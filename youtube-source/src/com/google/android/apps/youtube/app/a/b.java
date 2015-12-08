// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.a;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.client.AdsClient;
import com.google.android.apps.youtube.core.client.cf;
import com.google.android.apps.youtube.core.client.h;
import com.google.android.apps.youtube.core.client.q;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.r;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import com.google.android.apps.youtube.datalib.legacy.model.bj;
import com.google.android.apps.youtube.datalib.legacy.model.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.a:
//            a

public final class b
    implements a, AdsClient
{

    private final q a;
    private final h b;
    private final l c;
    private final r d;
    private final com.google.android.apps.youtube.common.e.b e;
    private final long f;
    private final int g;
    private final long h;
    private final long i;
    private final long j;

    public b(q q1, l l1, r r1, h h1, com.google.android.apps.youtube.common.e.b b1, au au1)
    {
        a = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        b = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        c = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
        e = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        com.google.android.apps.youtube.common.fromguava.c.a(au1);
        f = (long)au1.K() * 1000L;
        g = au1.L();
        h = (long)au1.M() * 1000L;
        i = (long)au1.N() * 1000L;
        j = (long)au1.O() * 1000L;
    }

    private OfflineStoreInterface a()
    {
        com.google.android.apps.youtube.core.offline.store.q q1 = d.q();
        if (!c.b())
        {
            return q1.a();
        } else
        {
            return q1.a(c.c());
        }
    }

    public final VastAd a(VmapAdBreak vmapadbreak)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        VastAd vastad = a.a(vmapadbreak, "", h, Collections.emptyMap());
        if (vastad == null || vastad.isEmpty())
        {
            return vastad;
        }
        if (vastad.getAssetFrequencyCap() != -1)
        {
            return vastad;
        }
        int k = vastad.getAssetFrequencyCap();
        for (vmapadbreak = vastad.getParentWrapper(); k == -1 && vmapadbreak != null; vmapadbreak = vmapadbreak.getParentWrapper())
        {
            k = vmapadbreak.getAssetFrequencyCap();
        }

        int i1 = k;
        if (k == -1)
        {
            i1 = g;
        }
        return vastad.buildUpon().b(i1).d();
    }

    public final VastAd a(VmapAdBreak vmapadbreak, String s, Map map)
    {
        OfflineStoreInterface offlinestoreinterface;
        Object obj;
        com.google.android.apps.youtube.common.fromguava.c.b();
        offlinestoreinterface = a();
        obj = b.i();
        if (!vmapadbreak.isForOffline())
        {
            break MISSING_BLOCK_LABEL_546;
        }
        vmapadbreak = offlinestoreinterface.b(vmapadbreak.getOriginalVideoId(), vmapadbreak.getAdBreakId());
        if (vmapadbreak != null) goto _L2; else goto _L1
_L1:
        vmapadbreak = null;
_L4:
        return vmapadbreak;
_L2:
        vmapadbreak = vmapadbreak.buildUpon().e(true).f(true).d();
        s = a();
        map = new ArrayList();
        if (a.a() > 0L && f > 0L && a.a() + f > e.a())
        {
            map.add(com.google.android.apps.youtube.datalib.legacy.model.VastAd.OfflineAdFormatExclusionReason.REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP);
        }
        if (b.k() != null)
        {
            long l2 = b.k().b();
            if (l2 != -1L)
            {
                long l1;
                if (vmapadbreak.isSkippable())
                {
                    l1 = i;
                } else
                {
                    l1 = j;
                }
                if (l1 > 0L && l2 > l1)
                {
                    map.add(com.google.android.apps.youtube.datalib.legacy.model.VastAd.OfflineAdFormatExclusionReason.REASON_CLIENT_OFFLINE_INACTIVE_USER);
                }
            }
        }
        if (vmapadbreak.getAssetFrequencyCap() != -1)
        {
            int k;
            if (vmapadbreak.getAdVideoId() == null)
            {
                k = 0;
            } else
            {
                k = s.o(vmapadbreak.getAdVideoId());
            }
            if (Math.max(k, s.d(vmapadbreak.getOriginalVideoId(), vmapadbreak.getAdBreakId())) >= vmapadbreak.getAssetFrequencyCap())
            {
                map.add(com.google.android.apps.youtube.datalib.legacy.model.VastAd.OfflineAdFormatExclusionReason.REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP);
            }
        }
        if (vmapadbreak.hasExpired(e))
        {
            map.add(com.google.android.apps.youtube.datalib.legacy.model.VastAd.OfflineAdFormatExclusionReason.REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED);
        }
        if (vmapadbreak.getAdVideoId() != null && s.p(vmapadbreak.getAdVideoId()) != OfflineMediaStatus.COMPLETE)
        {
            map.add(com.google.android.apps.youtube.datalib.legacy.model.VastAd.OfflineAdFormatExclusionReason.REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY);
        }
        if (map.isEmpty())
        {
            s = vmapadbreak;
        } else
        {
            obj = new ArrayList();
            for (s = vmapadbreak; s != null; s = s.getParentWrapper())
            {
                ((List) (obj)).addAll(s.getExclusionReasonPingUris());
            }

            s = (new ba()).b(vmapadbreak.getOriginalVideoId()).c(vmapadbreak.getAdBreakId()).t(map).a(((List) (obj))).b(false).d();
        }
        vmapadbreak = s;
        if (s.getAdVideoId() == null) goto _L4; else goto _L3
_L3:
        vmapadbreak = offlinestoreinterface.b(s.getAdVideoId(), e.b() + (s.getExpirationTimeMillis() - e.a()));
        s = s.buildUpon().a(null);
        if (vmapadbreak != null)
        {
            if (vmapadbreak.c() != null)
            {
                s.a(e.b()).a(vmapadbreak.c().getFormatStreamProto());
            }
            if (vmapadbreak.d() != null)
            {
                s.a(vmapadbreak.d().getFormatStreamProto());
            }
        }
        s = s.d();
        vmapadbreak = s;
        if (s.getVideoStreamingData() != null) goto _L4; else goto _L5
_L5:
        return null;
        if (((com.google.android.apps.youtube.common.network.h) (obj)).a())
        {
            return a.a(vmapadbreak, s, map);
        } else
        {
            return null;
        }
    }

    public final List a(PlayerResponse playerresponse, String s)
    {
        OfflineStoreInterface offlinestoreinterface;
        com.google.android.apps.youtube.common.network.h h1;
        String s1;
        com.google.android.apps.youtube.common.fromguava.c.b();
        offlinestoreinterface = a();
        h1 = b.i();
        s1 = playerresponse.getVideoId();
        if (!playerresponse.isForOffline()) goto _L2; else goto _L1
_L1:
        s = offlinestoreinterface.l(s1);
        if (s != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        playerresponse = new ArrayList();
        for (s = s.iterator(); s.hasNext(); playerresponse.add(((VmapAdBreak)s.next()).buildUpon().d(true).a())) { }
        return playerresponse;
_L2:
        if (h1.a())
        {
            return a.a(playerresponse, s);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final List a(String s, boolean flag)
    {
        return a.a(s, com.google.android.apps.youtube.core.converter.http.b.a(false), h);
    }

    public final void a(int k)
    {
        a.a(k);
    }

    public final void a(VastAd vastad)
    {
        OfflineStoreInterface offlinestoreinterface = a();
        if (vastad.isOfflineShouldCountPlayback())
        {
            offlinestoreinterface.c(vastad.getOriginalVideoId(), vastad.getAdBreakId());
            if (vastad.getAdVideoId() != null)
            {
                offlinestoreinterface.n(vastad.getAdVideoId());
            }
        }
        a.a(vastad);
    }

    public final List b(PlayerResponse playerresponse, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return a.b(playerresponse, s);
    }
}
