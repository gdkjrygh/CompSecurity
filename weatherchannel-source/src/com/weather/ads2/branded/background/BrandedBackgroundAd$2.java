// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.branded.background;

import com.weather.ads2.targeting.AdRefreshEvent;
import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.ads2.branded.background:
//            BrandedBackgroundAd, BrandedBackground

class this._cls0
    implements Receiver
{

    final BrandedBackgroundAd this$0;

    public void onCompletion(BrandedBackground brandedbackground, AdRefreshEvent adrefreshevent)
    {
        BrandedBackgroundAd.access$400(BrandedBackgroundAd.this, brandedbackground, adrefreshevent);
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((BrandedBackground)obj, (AdRefreshEvent)obj1);
    }

    public void onError(Throwable throwable, AdRefreshEvent adrefreshevent)
    {
        BrandedBackgroundAd.access$300(BrandedBackgroundAd.this, adrefreshevent);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (AdRefreshEvent)obj);
    }

    ()
    {
        this$0 = BrandedBackgroundAd.this;
        super();
    }
}
