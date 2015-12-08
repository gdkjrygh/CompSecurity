// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;

import android.widget.CompoundButton;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;

// Referenced classes of package com.walmart.android.app.storelocator:
//            StoreDetailPresenter

class this._cls0
    implements android.widget.dChangeListener
{

    final StoreDetailPresenter this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        StoreDetailPresenter.access$502(StoreDetailPresenter.this, flag);
        if (flag)
        {
            MessageBus.getBus().post((new com.walmartlabs.anivia.er("makeMyStore")).putString("storeId", StoreDetailPresenter.access$200(StoreDetailPresenter.this).getId()).putString("tapLocation", "store details"));
            SharedPreferencesUtil.saveLocalAdStore(StoreDetailPresenter.access$100(StoreDetailPresenter.this), StoreDetailPresenter.access$200(StoreDetailPresenter.this));
            GoogleAnalytics.trackEvent("Store Details", "Make My Store", StoreDetailPresenter.access$200(StoreDetailPresenter.this).getId());
        } else
        {
            SharedPreferencesUtil.clearStoreInfo(StoreDetailPresenter.access$100(StoreDetailPresenter.this));
        }
        StoreDetailPresenter.access$600(StoreDetailPresenter.this);
        StoreDetailPresenter.access$300(StoreDetailPresenter.this, "setAsMyStore");
    }

    A()
    {
        this$0 = StoreDetailPresenter.this;
        super();
    }
}
