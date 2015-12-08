// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.a.a.a.a.fj;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.u;
import com.google.android.apps.youtube.core.converter.http.b;
import com.google.android.apps.youtube.core.converter.http.dj;
import com.google.android.apps.youtube.core.converter.http.gs;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.datalib.legacy.model.InfoCard;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.ar;
import com.google.android.apps.youtube.datalib.legacy.model.au;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import com.google.android.apps.youtube.datalib.legacy.model.bg;
import com.google.android.apps.youtube.datalib.legacy.model.bj;
import com.google.android.apps.youtube.datalib.legacy.model.f;
import com.google.android.apps.youtube.datalib.legacy.model.i;
import com.google.android.apps.youtube.datalib.legacy.model.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            p, k, h, o

public final class DebugOnlyVmapAdRequester
    implements af
{

    private final Context a;
    private final Executor b;
    private final p c;
    private final h d;
    private final u e;
    private final Map f;

    public DebugOnlyVmapAdRequester(Context context, Executor executor, HttpClient httpclient, n n, com.google.android.apps.youtube.common.e.b b1, SharedPreferences sharedpreferences, h h1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        c = new p(sharedpreferences);
        d = h1;
        e = (new k(executor, httpclient, n, b1)).a(new b(h1, Collections.emptyList()), new gs(n, b1, new dj(n)));
        httpclient = (new ba()).g("AdSense").a(Uri.parse("http://google.com/fakeimpression")).o(Uri.parse("http://googleads.g.doubleclick.net/pagead/conversion/?label=clicktracking")).v(Uri.parse("http://google.com/conversion")).g(Arrays.asList(new Uri[] {
            Uri.parse("http://google.com/fake_ping?x=[I_X]&y=[I_Y]")
        })).b(0x7fffffffffffffffL).d();
        context = new HashMap();
        context.put(ForceAdType.SKIPPABLE_INSTREAM, httpclient.buildUpon().a(b1.b()).a(a("http://www.youtube.com/watch?v=s4ur2BDVyYE")).d());
        context.put(ForceAdType.SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION, httpclient.buildUpon().a(b1.b()).a(a("http://www.youtube.com/watch?v=IHLWtUP1sTs#modules")).d());
        executor = (new ar()).a((new au(com.google.android.apps.youtube.datalib.legacy.model.SurveyQuestion.Type.MULTI_SELECT, "Which of the following have you seen advertising for recently? Select all that apply.")).a("Coca Cola").a("Pepsi").a("Rivella").a("Sprite").a(Uri.parse("//www.youtube.com/survey")).b(20).a()).a();
        context.put(ForceAdType.BRAND_SURVEY, httpclient.buildUpon().a(executor).d());
        context.put(ForceAdType.BRAND_SURVEY_NON_SKIPPABLE, httpclient.buildUpon().g(null).a(executor).d());
        executor = ForceAdType.APP_PROMOTION_COMPANION_CARD;
        httpclient = httpclient.buildUpon().a(b1.b());
        n = (new l("Colossatron", "$0.99")).a(4.1F).a(Uri.parse("http://googleads.g.doubleclick.net/pagead/images/gmob/4_5-stars.png")).a(34000).b(Uri.parse("https://lh3.ggpht.com/J1ltAGYVyu0G7xwqlE--3pRZ3wSpjltqfbLd5wK2aQ5TtnG6k87q8dvUOJaNABMkRX0=w64-rw")).a();
        b1 = (new i(4, Uri.parse("https://play.google.com/store/apps/details?id=com.halfbrick.colossatron"), "INSTALL")).a(Uri.parse("http://www.google.com/search?q=action")).a();
        context.put(executor, httpclient.u(Arrays.asList(new InfoCard[] {
            (new f(2)).a(n).a(b1).a(new com.google.android.apps.youtube.datalib.legacy.model.InfoCard.InfoCardTrackingEvent(1, Uri.parse("http://www.google.com/search?q=impression"))).a()
        })).a(a("http://www.youtube.com/watch?v=s4ur2BDVyYE")).d());
        f = context;
    }

    static Context a(DebugOnlyVmapAdRequester debugonlyvmapadrequester)
    {
        return debugonlyvmapadrequester.a;
    }

    private static fj a(String s)
    {
        fj fj1 = new fj();
        fj1.c = s;
        return fj1;
    }

    static void a(DebugOnlyVmapAdRequester debugonlyvmapadrequester, com.google.android.apps.youtube.core.converter.http.c c1, com.google.android.apps.youtube.common.a.b b1)
    {
        Object obj = debugonlyvmapadrequester.c.b();
        if (obj != null)
        {
            obj = (VastAd)debugonlyvmapadrequester.f.get(obj);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            debugonlyvmapadrequester = c1.a;
            debugonlyvmapadrequester = (new bj()).a(com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak.OffsetType.PRE_ROLL).a(true).b(debugonlyvmapadrequester).a(((VastAd) (obj))).a();
            b1.a(c1, (new bg()).a(debugonlyvmapadrequester).a());
            return;
        } else
        {
            debugonlyvmapadrequester.d.a(0L);
            debugonlyvmapadrequester.e.a(c1, b1);
            return;
        }
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        obj = (com.google.android.apps.youtube.core.converter.http.c)obj;
        b.execute(new o(this, ((com.google.android.apps.youtube.core.converter.http.c) (obj)), b1));
    }

    private class ForceAdType extends Enum
    {

        private static final ForceAdType $VALUES[];
        public static final ForceAdType APP_PROMOTION_COMPANION_CARD;
        public static final ForceAdType BRAND_SURVEY;
        public static final ForceAdType BRAND_SURVEY_NON_SKIPPABLE;
        public static final ForceAdType SKIPPABLE_INSTREAM;
        public static final ForceAdType SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION;
        public final String title;

        public static ForceAdType valueOf(String s)
        {
            return (ForceAdType)Enum.valueOf(com/google/android/apps/youtube/core/client/DebugOnlyVmapAdRequester$ForceAdType, s);
        }

        public static ForceAdType[] values()
        {
            return (ForceAdType[])$VALUES.clone();
        }

        public final String toString()
        {
            return title;
        }

        static 
        {
            SKIPPABLE_INSTREAM = new ForceAdType("SKIPPABLE_INSTREAM", 0, "Skippable instream");
            SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION = new ForceAdType("SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION", 1, "CTA annotation in ad");
            BRAND_SURVEY = new ForceAdType("BRAND_SURVEY", 2, "Brand ad survey");
            BRAND_SURVEY_NON_SKIPPABLE = new ForceAdType("BRAND_SURVEY_NON_SKIPPABLE", 3, "Unskippable ad survey");
            APP_PROMOTION_COMPANION_CARD = new ForceAdType("APP_PROMOTION_COMPANION_CARD", 4, "App promotion");
            $VALUES = (new ForceAdType[] {
                SKIPPABLE_INSTREAM, SKIPPABLE_INSTREAM_WITH_CTA_ANNOTATION, BRAND_SURVEY, BRAND_SURVEY_NON_SKIPPABLE, APP_PROMOTION_COMPANION_CARD
            });
        }

        private ForceAdType(String s, int j, String s1)
        {
            super(s, j);
            title = s1;
        }
    }

}
