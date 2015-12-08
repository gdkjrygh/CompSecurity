// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.converter.http.dj;
import com.google.android.apps.youtube.core.converter.http.el;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.core.player.event.g;
import com.google.android.apps.youtube.core.player.event.h;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.fetcher.d;
import com.google.android.apps.youtube.core.utils.al;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.innertube.model.w;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.Survey;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            h, k

public final class VastFetcher
{

    private static final long a;
    private static final Set b = com.google.android.apps.youtube.common.e.c.a(new String[] {
        "YT:ADSENSE", "ADSENSE", "ADSENSE/ADX"
    });
    private static final Set c = com.google.android.apps.youtube.common.e.c.a(new String[] {
        "YT:DOUBLECLICK", "GDFP", "DART", "DART_DFA", "DART_DFP"
    });
    private static final Set d = com.google.android.apps.youtube.common.e.c.a(new String[] {
        "YT:FREEWHEEL", "FREEWHEEL"
    });
    private final af e;
    private final b f;
    private final d g;
    private final com.google.android.apps.youtube.core.client.h h;
    private final a i;

    public VastFetcher(b b1, a a1, com.google.android.apps.youtube.core.client.h h1, d d1, af af1)
    {
        f = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        i = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        h = (com.google.android.apps.youtube.core.client.h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        g = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        e = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
    }

    public VastFetcher(b b1, a a1, com.google.android.apps.youtube.core.client.h h1, d d1, k k1, n n)
    {
        f = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        i = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        h = (com.google.android.apps.youtube.core.client.h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        g = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        e = k1.a(new com.google.android.apps.youtube.core.converter.http.a(h1.a()), new el(n, b1, new dj(n)));
    }

    private com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner a(VastAd vastad)
    {
        Uri uri;
        if (vastad.getParentWrapper() == null)
        {
            uri = null;
        } else
        {
            uri = vastad.getParentWrapper().getAdWrapperUri();
        }
        if (a(uri, vastad.getVastAdSystem()))
        {
            return com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.ADSENSE;
        }
        String s = vastad.getVastAdSystem();
        boolean flag;
        if (s != null && c.contains(s.toUpperCase(Locale.US)))
        {
            flag = true;
        } else
        if (uri != null && uri.getAuthority().endsWith(".doubleclick.net") && !a(uri, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.DOUBLECLICK;
        }
        vastad = vastad.getVastAdSystem();
        if (vastad != null && d.contains(vastad.toUpperCase(Locale.US)))
        {
            flag = true;
        } else
        if (uri != null && uri.getAuthority().endsWith(".fwmrm.net"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.FREEWHEEL;
        } else
        {
            return com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.UNKNOWN;
        }
    }

    private VastAd a(Uri uri, VastAd vastad, long l, int j)
    {
        i.a(new g(j, vastad.getParentWrapperCount() + 1));
        if (vastad.getPrefetchedAd() != null)
        {
            return vastad.getPrefetchedAd().buildUpon().a(vastad.buildUpon().b(null).d()).d();
        }
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        long l1 = f.a();
        if (l1 >= l)
        {
            return null;
        }
        e.a(uri, c1);
        try
        {
            uri = (List)c1.get();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new AdsClient.VastException(uri);
        }
        if (uri == null || uri.isEmpty())
        {
            return null;
        } else
        {
            return ((VastAd)uri.get(0)).buildUpon().c(l1).a(vastad).d();
        }
    }

    private VastAd a(VastAd vastad, long l, long l1, int j)
    {
        VastAd vastad1 = vastad;
_L8:
        if (!vastad1.isVastWrapper()) goto _L2; else goto _L1
_L1:
        vastad = a(vastad1.getAdWrapperUri(), vastad1, l1, j);
_L6:
        if (vastad != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        return vastad;
_L2:
        vastad = vastad1;
        if (vastad1.getVideoAdTrackingTemplateUri() == null) goto _L4; else goto _L3
_L3:
        Object obj = a(vastad1.getVideoAdTrackingTemplateUri(), vastad1, l1, j);
        vastad = ((VastAd) (obj));
        if (obj != null)
        {
            vastad = ((VastAd) (obj));
            if (((VastAd) (obj)).getParentWrapper() != null)
            {
                vastad = ((VastAd) (obj));
                if (((VastAd) (obj)).getParentWrapper().getVideoAdTrackingTemplateUri() != null)
                {
                    vastad = ((VastAd) (obj)).getParentWrapper();
                    obj = ((VastAd) (obj)).buildUpon();
                    if (!vastad.getVideoAdTrackingTemplateUri().toString().contains("dfaexp=1"))
                    {
                        ((ba) (obj)).t(vastad.getClickthroughUri());
                        ((ba) (obj)).a(vastad.getVideoStreamingData());
                        ((ba) (obj)).a(vastad.getPlaybackTracking());
                        ((ba) (obj)).a(vastad.getPlayerConfig());
                        ((ba) (obj)).a(vastad.getAdVideoId());
                        ((ba) (obj)).e(vastad.getAdOwnerName());
                        ((ba) (obj)).a(vastad.getDuration());
                        ((ba) (obj)).c(vastad.isPublicVideo());
                    }
                    vastad = ((ba) (obj)).d();
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        ba ba1 = vastad.buildUpon().a(a(vastad));
        if (vastad.getExpirationTimeMillis() == 0L)
        {
            long l2;
            if (vastad1 != null && vastad1.getExpirationTimeMillis() > 0L)
            {
                l2 = vastad1.getExpirationTimeMillis();
            } else
            {
                l2 = l;
            }
            ba1.b(l2);
        }
        vastad1 = ba1.d();
        if (true) goto _L8; else goto _L7
_L7:
    }

    private VastAd a(VastAd vastad, List list, VmapAdBreak vmapadbreak)
    {
        boolean flag3 = false;
        Object obj;
        if (vastad.getParentWrapper() != null)
        {
            VastAd vastad1 = vastad.getParentWrapper();
            obj = vastad;
            VastAd vastad2;
            for (; vastad1.getParentWrapper() != null; vastad1 = vastad2)
            {
                vastad2 = vastad1.getParentWrapper();
                obj = vastad1;
            }

        } else
        {
            obj = vastad;
        }
        com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner billingpartner = a(((VastAd) (obj)));
        obj = vastad.buildUpon().b(vmapadbreak.getOriginalVideoId()).c(vmapadbreak.getAdBreakId()).a(billingpartner);
        VastAd vastad3 = vastad.getParentWrapper();
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (vastad3 != null)
        {
            vmapadbreak = vastad3.getBillingPartner();
        } else
        {
            vmapadbreak = null;
        }
        if (vastad3 != null && com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.DOUBLECLICK == vmapadbreak && vastad3.shouldPingVssOnEngaged())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (vastad3 != null && com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.ADSENSE == vmapadbreak && vastad3.shouldPingVssOnEngaged() && vastad3.getVideoAdTrackingTemplateUri() != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (vastad.shouldPingVssOnEngaged() && (com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.DOUBLECLICK == vastad.getBillingPartner() || com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.ADSENSE == vastad.getBillingPartner() || com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.FREEWHEEL == vastad.getBillingPartner()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 || flag || flag1)
        {
            flag3 = true;
        }
        vmapadbreak = ((ba) (obj)).a(flag3);
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append(billingpartner.partnerId);
        ((StringBuilder) (obj)).append("_2");
        if (vastad.isSkippable())
        {
            ((StringBuilder) (obj)).append("_1");
        }
        vmapadbreak = vmapadbreak.h(((StringBuilder) (obj)).toString());
        vmapadbreak.a(new ArrayList(vastad.getImpressionUris()));
        for (vastad = list.iterator(); vastad.hasNext();)
        {
            list = ((VastAd)vastad.next()).getImpressionUris().iterator();
            while (list.hasNext()) 
            {
                vmapadbreak.a((Uri)list.next());
            }
        }

        return vmapadbreak.d();
    }

    private VastAd a(VastAd vastad, Map map)
    {
        PlayerFetcher playerfetcher;
        com.google.android.apps.youtube.common.fromguava.c.b();
        playerfetcher = g.a(vastad);
        if (!map.containsKey(vastad.getAdVideoId())) goto _L2; else goto _L1
_L1:
        map = (PlayerResponse)map.get(vastad.getAdVideoId());
_L6:
        if (map == null) goto _L4; else goto _L3
_L3:
        if (map.getPlayabilityStatus().c()) goto _L5; else goto _L4
_L4:
        throw new VideoInfoException(vastad, null);
_L2:
        try
        {
            map = playerfetcher.a(vastad.getAdVideoId(), PlayerFetcher.a, "", "", -1, -1, com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher.FetchType.PLAYER_SERVICE_ONLY).getPlayerResponse();
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            L.a("Error retrieving streams for ad video", map);
            throw new VideoInfoException(vastad, map);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            L.a("Error retrieving streams for ad video", map);
            throw new VideoInfoException(vastad, map);
        }
        if (true) goto _L6; else goto _L5
_L5:
        map = vastad.buildUpon().a(map.getVideoStreamingData()).a(map.getPlaybackTracking()).a(map.getPlayerConfig(com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig.ExoPlayerActivationType.SERVER_EXPERIMENT)).d(map.getTitle()).a(map.getLengthSeconds()).a(map.getExpandedAnnotation()).a(map.getInfoCardCollection()).d();
        return map;
    }

    private static String a(Uri uri)
    {
        Object obj;
        obj = al.a(uri);
        if (((al) (obj)).a.size() > 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        L.c((new StringBuilder("Unable to find video id in watch uri from VastAd ")).append(uri).toString());
        return null;
        try
        {
            obj = (String)((al) (obj)).a.get(0);
        }
        catch (ParseException parseexception)
        {
            L.c((new StringBuilder("Unable to parse watch uri from VastAd ")).append(uri).toString());
            return null;
        }
        return ((String) (obj));
    }

    private boolean a(Uri uri, String s)
    {
        while (s != null && b.contains(s.toUpperCase(Locale.US)) || uri != null && h.a().c(uri)) 
        {
            return true;
        }
        return false;
    }

    public final VastAd a(VmapAdBreak vmapadbreak, long l, Map map)
    {
        ArrayList arraylist;
        Iterator iterator;
        int j;
        long l1;
        long l2;
        long l3;
        com.google.android.apps.youtube.common.fromguava.c.a(vmapadbreak);
        com.google.android.apps.youtube.common.fromguava.c.b();
        arraylist = new ArrayList();
        l1 = f.a();
        l2 = a;
        l3 = f.a();
        j = 1;
        iterator = vmapadbreak.getAds().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        int i1;
        obj = (VastAd)iterator.next();
        i1 = j + 1;
        obj = a(((VastAd) (obj)), l3 + l, l1 + l2, j);
        if (obj == null)
        {
            j = i1;
            continue; /* Loop/switch isn't completed */
        }
        if (!((VastAd) (obj)).isForecastingAd()) goto _L4; else goto _L3
_L3:
        boolean flag;
        arraylist.add(obj);
        if (com.google.android.apps.youtube.datalib.legacy.model.VastAd.BillingPartner.DOUBLECLICK != ((VastAd) (obj)).getBillingPartner())
        {
            break MISSING_BLOCK_LABEL_298;
        }
        flag = ((VastAd) (obj)).shouldAllowAdsFallback();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_298;
        }
_L2:
        if (!arraylist.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = null;
_L6:
        return ((VastAd) (obj));
_L4:
        if (((VastAd) (obj)).getSurvey() == Survey.EMPTY)
        {
            j = i1;
            continue; /* Loop/switch isn't completed */
        }
        VastAd vastad = a(((VastAd) (obj)), ((List) (arraylist)), vmapadbreak);
        obj = vastad;
        if (!VastAd.isYouTubeHostedUri(vastad.firstStreamUri())) goto _L6; else goto _L5
_L5:
        i.a(new h());
        obj = a(vastad.firstStreamUri());
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new VideoInfoException(vastad, null);
        }
        break MISSING_BLOCK_LABEL_274;
        obj;
        L.a("Error resolving VAST Wrapper", ((Throwable) (obj)));
        j = i1;
        continue; /* Loop/switch isn't completed */
        obj = a(vastad.buildUpon().a(((String) (obj))).d(), map);
        return ((VastAd) (obj));
        j = i1;
        continue; /* Loop/switch isn't completed */
        VideoInfoException videoinfoexception;
        videoinfoexception;
        L.a("Error retrieving ad video info", videoinfoexception);
        j = i1;
        if (true) goto _L8; else goto _L7
_L7:
        return a((VastAd)arraylist.remove(arraylist.size() - 1), ((List) (arraylist)), vmapadbreak);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(5L);
    }

    private class VideoInfoException extends Exception
    {

        public final VastAd ad;

        public VideoInfoException(VastAd vastad, Exception exception)
        {
            super(exception);
            ad = vastad;
        }
    }

}
