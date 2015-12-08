// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;

import com.weather.ads2.ui.HideableAd;

// Referenced classes of package com.weather.ads2.branded.background:
//            BrandedBackgroundAd

class this._cls0
    implements roundUpdateListener
{

    final BrandedBackgroundAd this$0;

    public void onBackgroundUpdated(boolean flag)
    {
        if (!flag && BrandedBackgroundAd.access$000(BrandedBackgroundAd.this) == llbackDisplayStatus.PENDING)
        {
            BrandedBackgroundAd.access$200(BrandedBackgroundAd.this).refreshAd(BrandedBackgroundAd.access$100(BrandedBackgroundAd.this));
            BrandedBackgroundAd.access$200(BrandedBackgroundAd.this).showAdOnLoad();
            BrandedBackgroundAd.access$002(BrandedBackgroundAd.this, llbackDisplayStatus.LOADED);
            BrandedBackgroundAd.access$102(BrandedBackgroundAd.this, null);
        }
    }

    llbackDisplayStatus()
    {
        this$0 = BrandedBackgroundAd.this;
        super();
    }
}
