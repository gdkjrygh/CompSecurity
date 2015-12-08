// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.converter.ParserException;
import com.google.android.apps.youtube.core.converter.http.dj;
import com.google.android.apps.youtube.core.converter.http.gs;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.TrackingPingAuthenticationSettings;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import com.google.android.apps.youtube.datalib.legacy.model.bf;
import com.google.android.apps.youtube.datalib.legacy.model.bg;
import com.google.android.apps.youtube.datalib.legacy.model.bj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            k

public final class cj
{

    private final af a;
    private b b;
    private com.google.android.apps.youtube.core.converter.b c;

    public cj(b b1, n n, af af1)
    {
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        com.google.android.apps.youtube.common.fromguava.c.a(n);
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = new com.google.android.apps.youtube.core.converter.b(n, b1, new dj(n));
    }

    public cj(b b1, n n, k k1, com.google.android.apps.youtube.core.converter.http.b b2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(k1);
        com.google.android.apps.youtube.common.fromguava.c.a(b2);
        com.google.android.apps.youtube.common.fromguava.c.a(n);
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        dj dj1 = new dj(n);
        a = k1.a((com.google.android.apps.youtube.core.converter.http.b)com.google.android.apps.youtube.common.fromguava.c.a(b2), new gs(n, b1, dj1));
        c = new com.google.android.apps.youtube.core.converter.b(n, b1, dj1);
    }

    private static bf a(String s, bf bf1, long l, long l1)
    {
        Object obj = new ArrayList();
        bj bj1;
        for (Iterator iterator = bf1.a().iterator(); iterator.hasNext(); ((List) (obj)).add(bj1.a()))
        {
            Object obj1 = (VmapAdBreak)iterator.next();
            bj1 = ((VmapAdBreak) (obj1)).buildUpon().a(null).b(s);
            obj1 = ((VmapAdBreak) (obj1)).getAds().iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                VastAd vastad = (VastAd)((Iterator) (obj1)).next();
                ba ba1 = vastad.buildUpon().c(l);
                if (!vastad.isVastWrapper() && vastad.getExpirationTimeMillis() == 0L)
                {
                    long l2;
                    if (vastad.getParentWrapper() != null && vastad.getParentWrapper().getExpirationTimeMillis() > 0L)
                    {
                        l2 = vastad.getParentWrapper().getExpirationTimeMillis();
                    } else
                    {
                        l2 = l + l1;
                    }
                    ba1.b(l2);
                }
                bj1.a(ba1.d());
            }
        }

        obj = Collections.unmodifiableList(((List) (obj)));
        bg bg1 = (new bg()).a(bf1.a());
        if (bf1.a().size() > 0)
        {
            s = ((VmapAdBreak)bf1.a().get(0)).getTrackingDecoration();
        } else
        {
            s = TrackingPingAuthenticationSettings.NO_TRACKING_AUTH_SETTINGS;
        }
        return bg1.a(s).a(((List) (obj))).a();
    }

    public final bf a(PlayerResponse playerresponse, long l)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.fromguava.c.a(playerresponse);
        if (playerresponse.getVmapXml() == null)
        {
            return null;
        }
        try
        {
            bf bf1 = c.a(playerresponse);
            playerresponse = a(playerresponse.getVideoId(), bf1, b.a(), l);
        }
        // Misplaced declaration of an exception variable
        catch (PlayerResponse playerresponse)
        {
            throw new AdsClient.VmapException(playerresponse);
        }
        // Misplaced declaration of an exception variable
        catch (PlayerResponse playerresponse)
        {
            throw new AdsClient.VmapException(playerresponse);
        }
        return playerresponse;
    }

    public final bf a(String s, Map map, long l)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        map = new com.google.android.apps.youtube.core.converter.http.c(com.google.android.apps.youtube.common.fromguava.c.a(s), (Map)com.google.android.apps.youtube.common.fromguava.c.a(map));
        long l1 = b.a();
        a.a(map, c1);
        try
        {
            map = (bf)c1.get();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AdsClient.VmapException(s);
        }
        if (map == null)
        {
            return null;
        }
        s = a(s, ((bf) (map)), l1, l);
        return s;
    }
}
