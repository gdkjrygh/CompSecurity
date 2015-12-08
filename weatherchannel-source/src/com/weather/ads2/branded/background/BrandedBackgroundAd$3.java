// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.ads2.ui.HideableAd;

// Referenced classes of package com.weather.ads2.branded.background:
//            BrandedBackgroundAd, BrandedBackground, BackgroundView

class val.result
    implements Runnable
{

    final BrandedBackgroundAd this$0;
    final BrandedBackground val$result;
    final AdRefreshEvent val$userData;

    public void run()
    {
label0:
        {
            if (BrandedBackgroundAd.access$500(BrandedBackgroundAd.this) != null && Objects.equal(val$userData, BrandedBackgroundAd.access$100(BrandedBackgroundAd.this)))
            {
                if (!val$result.isEmpty())
                {
                    break label0;
                }
                BrandedBackgroundAd.access$600(BrandedBackgroundAd.this, BrandedBackgroundAd.access$100(BrandedBackgroundAd.this));
            }
            return;
        }
        BrandedBackgroundAd.access$200(BrandedBackgroundAd.this).hideAd();
        BrandedBackgroundAd.access$500(BrandedBackgroundAd.this).showBrandedBackground(val$result);
        BrandedBackgroundAd.access$102(BrandedBackgroundAd.this, null);
        BrandedBackgroundAd.access$702(BrandedBackgroundAd.this, ImmutableMap.of());
    }

    ()
    {
        this$0 = final_brandedbackgroundad;
        val$userData = adrefreshevent;
        val$result = BrandedBackground.this;
        super();
    }
}
