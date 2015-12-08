// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.a.l;
import com.facebook.ads.a.y;
import java.util.Map;

// Referenced classes of package com.facebook.ads:
//            InterstitialAd, InterstitialAdListener, AdError

class a
    implements com.facebook.ads.a.ner
{

    final InterstitialAd a;

    public void a(AdError aderror)
    {
        InterstitialAd.access$102(a, false);
        if (InterstitialAd.access$700(a) != null)
        {
            InterstitialAd.access$700(a).onError(a, aderror);
        }
    }

    public void a(l l1)
    {
        InterstitialAd.access$002(a, l1);
        if (l1.d() == null || !(l1.d() instanceof y)) goto _L2; else goto _L1
_L1:
        InterstitialAd.access$102(a, true);
        l1 = (y)l1.d();
        Map map = l1.h();
        if (map.containsKey("is_tablet"))
        {
            InterstitialAd.access$202(a, Boolean.parseBoolean((String)map.get("is_tablet")));
        }
        if (map.containsKey("ad_height"))
        {
            InterstitialAd.access$302(a, Integer.parseInt((String)map.get("ad_height")));
        }
        if (map.containsKey("ad_width"))
        {
            InterstitialAd.access$402(a, Integer.parseInt((String)map.get("ad_width")));
        }
        if (map.containsKey("native_close"))
        {
            InterstitialAd.access$502(a, Boolean.valueOf((String)map.get("native_close")).booleanValue());
        }
        if (!l1.g()) goto _L4; else goto _L3
_L3:
        InterstitialAd.access$600(a, l1);
_L6:
        return;
_L4:
        if (InterstitialAd.access$700(a) != null)
        {
            InterstitialAd.access$700(a).onAdLoaded(a);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l1.d() != null)
        {
            break; /* Loop/switch isn't completed */
        }
        InterstitialAd.access$102(a, false);
        if (InterstitialAd.access$700(a) != null)
        {
            InterstitialAdListener interstitialadlistener = InterstitialAd.access$700(a);
            InterstitialAd interstitialad = a;
            if (l1.e() != null)
            {
                l1 = l1.e();
            } else
            {
                l1 = AdError.INTERNAL_ERROR;
            }
            interstitialadlistener.onError(interstitialad, l1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        InterstitialAd.access$102(a, false);
        if (InterstitialAd.access$700(a) != null)
        {
            InterstitialAd.access$700(a).onError(a, AdError.INTERNAL_ERROR);
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    tener(InterstitialAd interstitialad)
    {
        a = interstitialad;
        super();
    }
}
