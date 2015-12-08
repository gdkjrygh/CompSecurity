// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.squareup.otto.Bus;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StorePickerListener;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterPresenter

class this._cls0
    implements StorePickerListener
{

    final ShopFilterPresenter this$0;

    public void onCancelled()
    {
        ShopFilterPresenter.access$1500(ShopFilterPresenter.this);
    }

    public void onStoreClicked(WalmartStore walmartstore)
    {
        MessageBus.getBus().post((new com.walmartlabs.anivia.der("makeMyStore")).putString("storeId", walmartstore.getId()));
        SharedPreferencesUtil.saveLocalAdStore(ShopFilterPresenter.access$600(ShopFilterPresenter.this), walmartstore);
        ShopFilterPresenter.access$1400(ShopFilterPresenter.this);
    }

    public volatile void onStoreClicked(StoreData storedata)
    {
        onStoreClicked((WalmartStore)storedata);
    }

    ()
    {
        this$0 = ShopFilterPresenter.this;
        super();
    }
}
