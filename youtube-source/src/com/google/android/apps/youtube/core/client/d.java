// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.legacy.model.TrackingPingAuthenticationSettings;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import com.google.android.apps.youtube.datalib.legacy.model.ba;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            j, bk, bm, AdStatsClient

public final class d
{

    private final b a;
    private final b b;
    private final com.google.android.apps.youtube.common.e.b c;
    private final a d;

    public d(b b1, b b2, com.google.android.apps.youtube.common.e.b b3, a a1)
    {
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b2);
        c = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b3);
        d = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    private j a(VmapAdBreak vmapadbreak)
    {
        if (vmapadbreak != null && vmapadbreak.getTrackingDecoration() != null)
        {
            vmapadbreak = vmapadbreak.getTrackingDecoration().getUrlMatchPattern();
        } else
        {
            vmapadbreak = null;
        }
        return new j(a, b, vmapadbreak, c);
    }

    public final com.google.android.apps.youtube.common.e.b a()
    {
        return c;
    }

    public final AdStatsClient a(VastAd vastad, String s)
    {
        vastad = new bk(a(null), vastad, s);
        d.a(vastad);
        return vastad;
    }

    public final AdStatsClient a(VmapAdBreak vmapadbreak, VastAd vastad, String s)
    {
        vmapadbreak = new bm(a(vmapadbreak), vmapadbreak, vastad, s);
        d.a(vmapadbreak);
        return vmapadbreak;
    }

    public final AdStatsClient a(VmapAdBreak vmapadbreak, VastAd vastad, String s, AdStatsClient.AdStatsClientState adstatsclientstate)
    {
        if (adstatsclientstate == null)
        {
            return null;
        }
        if (adstatsclientstate.kind == AdStatsClient.AdStatsClientState.Kind.INSTREAM)
        {
            vmapadbreak = new bm(a(vmapadbreak), vmapadbreak, vastad, s, adstatsclientstate.nextQuartile, adstatsclientstate.engagedViewPinged, adstatsclientstate.impressionPinged, adstatsclientstate.skipAdShownPinged, adstatsclientstate.pingedCustomConversionTypes, adstatsclientstate.lastProgressEventMillis);
            d.a(vmapadbreak);
            return vmapadbreak;
        }
        if (adstatsclientstate.kind == AdStatsClient.AdStatsClientState.Kind.TRUEVIEW_INDISPLAY)
        {
            vmapadbreak = new bk(a(null), vastad, s, adstatsclientstate.nextQuartile, adstatsclientstate.impressionPinged, adstatsclientstate.lastProgressEventMillis);
            d.a(vmapadbreak);
            return vmapadbreak;
        } else
        {
            return null;
        }
    }

    public final AdStatsClient a(VmapAdBreak vmapadbreak, String s)
    {
        return a(vmapadbreak, VastAd.EMPTY_AD.buildUpon().b(0x7fffffffffffffffL).d(), s);
    }
}
