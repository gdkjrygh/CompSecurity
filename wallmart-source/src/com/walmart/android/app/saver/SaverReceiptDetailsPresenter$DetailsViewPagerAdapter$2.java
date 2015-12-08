// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreService;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

class this._cls1
    implements this._cls1
{

    final iptItem this$1;

    public void onAddressClicked(int i)
    {
        if (!SaverReceiptDetailsPresenter.access$2600(_fld0))
        {
            SaverReceiptDetailsPresenter.access$2700(_fld0, true);
            com.walmartlabs.storelocator.  = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

                final SaverReceiptDetailsPresenter.DetailsViewPagerAdapter._cls2 this$2;

                private void handleServerResponse(WalmartStore awalmartstore[])
                {
                    if (isPopped())
                    {
                        return;
                    }
                    if (awalmartstore != null && awalmartstore.length > 0)
                    {
                        awalmartstore = new StoreDetailPresenter(SaverReceiptDetailsPresenter.access$1200(this$0), awalmartstore[0]);
                        awalmartstore.setShowLocalAd(false);
                        SaverReceiptDetailsPresenter.access$2800(this$0, awalmartstore);
                        return;
                    } else
                    {
                        clearSingleClickFlag();
                        return;
                    }
                }

                public void onFailure(int j)
                {
                    handleServerResponse(null);
                }

                public void onStoresReceived(WalmartStore awalmartstore[])
                {
                    handleServerResponse(awalmartstore);
                }

                public volatile void onStoresReceived(StoreData astoredata[])
                {
                    onStoresReceived((WalmartStore[])astoredata);
                }

            
            {
                this$2 = SaverReceiptDetailsPresenter.DetailsViewPagerAdapter._cls2.this;
                super();
            }
            };
            StoreService.getStoreService().getStore(i, );
        }
    }

    public void onItemClicked(SaverReceipt saverreceipt, com.walmart.android.service.saver.StoresReceived storesreceived)
    {
        if (!SaverReceiptDetailsPresenter.access$2400(_fld0))
        {
            SaverReceiptDetailsPresenter.access$2500(_fld0, true);
            SaverReceiptDetailsPresenter.access$400(_fld0).iptItem(saverreceipt, storesreceived);
        }
    }

    _cls1.this._cls2()
    {
        this$1 = this._cls1.this;
        super();
    }
}
