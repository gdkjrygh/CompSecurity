// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            m, c

class n
    implements AdListener
{

    final AdView a;
    final com.jiubang.commerce.ad.i.m b;

    n(com.jiubang.commerce.ad.i.m m1, AdView adview)
    {
        b = m1;
        a = adview;
        super();
    }

    public void onAdClicked(Ad ad)
    {
        if (j.a)
        {
            j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(b.e.a()).append("]loadSingleFaceBookAdInfo(onAdClicked---AdView, adId:").append(b.c).append(", ad:").append(ad).append(")").toString());
        }
        b.k.b(a);
    }

    public void onAdLoaded(Ad ad)
    {
        com.jiubang.commerce.b.b.a(b.b, b.c, b.d, 1, b.e);
        ad = new ArrayList();
        ad.add(a);
        b.h.a(b.c, ad);
        if (!j.a) goto _L2; else goto _L1
_L1:
        int i;
        ad = (new StringBuilder()).append("[vmId:").append(b.e.a()).append("]loadSingleFaceBookAdInfo(onAdLoaded---AdView, adId:").append(b.c).append(", adViewSize:").append(ad.size()).append(", adView:").append(a).append(",");
        if (b.h.a() == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        i = b.h.a().size();
_L3:
        j.b("Ad_SDK", ad.append(i).append(")").toString());
_L2:
        com.jiubang.commerce.ad.i.c.a(b.l, b.b, b.f, b.g, b.e, b.h, b.d, b.i, b.j, b.a, b.k);
        return;
        i = -2;
          goto _L3
        ad;
        ad.printStackTrace();
        com.jiubang.commerce.ad.i.c.a(b.l, b.b, b.f, b.g, b.e, b.h, b.d, b.i, b.j, b.a, b.k);
        return;
        ad;
        com.jiubang.commerce.ad.i.c.a(b.l, b.b, b.f, b.g, b.e, b.h, b.d, b.i, b.j, b.a, b.k);
        throw ad;
    }

    public void onError(Ad ad, AdError aderror)
    {
        com.jiubang.commerce.b.b.a(b.b, b.c, b.d, -1, b.e);
        if (j.a)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("[vmId:").append(b.e.a()).append("]loadSingleFaceBookAdInfo(onError---AdView, adId:").append(b.c).append(", ad:").append(ad).append(", aderror:");
            if (aderror != null)
            {
                ad = aderror.getErrorMessage();
            } else
            {
                ad = "null";
            }
            j.c("Ad_SDK", stringbuilder.append(ad).append(")").toString());
        }
        com.jiubang.commerce.ad.i.c.a(b.l, b.b, b.f, b.g, b.e, b.h, b.d, b.i, b.j, b.a, b.k);
    }
}
