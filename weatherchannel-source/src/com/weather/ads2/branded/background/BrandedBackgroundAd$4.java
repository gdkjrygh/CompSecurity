// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;

import com.google.common.base.Objects;

// Referenced classes of package com.weather.ads2.branded.background:
//            BrandedBackgroundAd

class val.userData
    implements Runnable
{

    final BrandedBackgroundAd this$0;
    final Object val$userData;

    public void run()
    {
        if (BrandedBackgroundAd.access$500(BrandedBackgroundAd.this) != null && Objects.equal(val$userData, BrandedBackgroundAd.access$100(BrandedBackgroundAd.this)))
        {
            BrandedBackgroundAd.access$600(BrandedBackgroundAd.this, BrandedBackgroundAd.access$100(BrandedBackgroundAd.this));
        }
    }

    ()
    {
        this$0 = final_brandedbackgroundad;
        val$userData = Object.this;
        super();
    }
}
