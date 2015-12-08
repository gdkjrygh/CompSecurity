// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.analytics.AnalyticsEvent;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter

class this._cls0
    implements android.view.ViewPresenter._cls4
{

    final StoreViewPresenter this$0;

    public void onClick(View view)
    {
        initLocation();
        MessageBus.getBus().post(new AnalyticsEvent("Store Finder", "Locate Store Method", "GPS"));
    }

    ()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
