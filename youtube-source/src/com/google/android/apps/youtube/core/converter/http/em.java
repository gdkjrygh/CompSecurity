// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.converter.o;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            en, ey, fd, fe, 
//            ff, fg, fh, fi, 
//            fj, eo, ep, eq, 
//            fc, er, fb, fa, 
//            ez, ex, ew, ev, 
//            eu, et, es, bb, 
//            fl, dj

public final class em
{

    private static final o a = new en();
    private static final o b = new ey();
    private static final o c = new fd();
    private static final o d = new fe();
    private static final o e = new ff();
    private static final o f = new fg();
    private static final o g = new fh();
    private static final o h = new fi();
    private static final o i = new fj();
    private static final o j = new eo();
    private static final o k = new ep();
    private static final o l = new eq();

    static int a(String s, int i1)
    {
        return b(s, i1);
    }

    private static void a(String s, b b1, f f1)
    {
        b1 = new fc(b1);
        f1.a((new StringBuilder()).append(s).append("/AdSystem").toString(), a).a((new StringBuilder()).append(s).append("/Impression").toString(), b).a((new StringBuilder()).append(s).append("/Error").toString(), d).a((new StringBuilder()).append(s).append("/Creatives/Creative/Linear/TrackingEvents/Tracking").toString(), c).a((new StringBuilder()).append(s).append("/Creatives/Creative/Linear/VideoClicks/ClickThrough").toString(), e).a((new StringBuilder()).append(s).append("/Creatives/Creative/Linear/VideoClicks/ClickTracking").toString(), f).a((new StringBuilder()).append(s).append("/Creatives/Creative/Linear/VideoClicks/CustomClick").toString(), g).a((new StringBuilder()).append(s).append("/Extensions/Extension/AdFormatExclusionPolicy/TrackingUri").toString(), h).a((new StringBuilder()).append(s).append("/Extensions/Extension/AdFormatExclusionPolicy/TrackingUri").toString(), h).a((new StringBuilder()).append(s).append("/Extensions/Extension/AdFormatExclusionPolicy/AdAssetFrequencyCap").toString(), i).a((new StringBuilder()).append(s).append("/Extensions/Extension/AdFormatExclusionPolicy/AdAssetTimeToLive").toString(), b1).a((new StringBuilder()).append(s).append("/Extensions/Extension/ConversionUrl").toString(), j).a((new StringBuilder()).append(s).append("/Extensions/Extension/SkippableAdType").toString(), l).a((new StringBuilder()).append(s).append("/Extensions/Extension/CustomTracking/Tracking").toString(), k);
    }

    public static void a(String s, b b1, f f1, fl fl, dj dj)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a(b1);
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        b(s, b1, f1, fl, dj);
        for (int i1 = 0; i1 < 3; i1++)
        {
            s = (new StringBuilder()).append(s).append("/VAST/Ad/Wrapper/Extensions/Extension/AdXml").toString();
            b(s, b1, f1, new er(), dj);
        }

    }

    private static int b(String s, int i1)
    {
        if (TextUtils.isEmpty(s))
        {
            return i1;
        }
        int j1;
        try
        {
            j1 = Integer.parseInt(s.trim());
        }
        catch (NumberFormatException numberformatexception)
        {
            L.c((new StringBuilder("Bad integer parse of:'")).append(s).append("' using:").append(Integer.toString(i1)).toString());
            return i1;
        }
        return j1;
    }

    private static void b(String s, b b1, f f1, fl fl, dj dj)
    {
        String s1 = (new StringBuilder()).append(s).append("/VAST/Ad/InLine").toString();
        String s2 = (new StringBuilder()).append(s).append("/VAST/Ad/Wrapper").toString();
        f1.a((new StringBuilder()).append(s).append("/VAST").toString(), new fb(fl)).a((new StringBuilder()).append(s).append("/VAST/Ad").toString(), new fa(dj)).a((new StringBuilder()).append(s1).append("/Creatives/Creative/Linear/Duration").toString(), new ez()).a((new StringBuilder()).append(s1).append("/Creatives/Creative/Linear/AdParameters").toString(), new ex()).a((new StringBuilder()).append(s1).append("/Creatives/Creative/Linear/MediaFiles/MediaFile").toString(), new ew(b1)).a((new StringBuilder()).append(s1).append("/Creatives/Creative/NonLinearAds/NonLinear/AdParameters").toString(), new ev()).a((new StringBuilder()).append(s1).append("/Extensions/Extension/ShowYouTubeAnnotations").toString(), new eu()).a((new StringBuilder()).append(s1).append("/Extensions/Extension").toString(), new et()).a((new StringBuilder()).append(s2).append("/VASTAdTagURI").toString(), new es());
        a(s1, b1, f1);
        a(s2, b1, f1);
        bb.a((new StringBuilder()).append(s1).append("/Extensions/Extension").toString(), f1);
    }

}
