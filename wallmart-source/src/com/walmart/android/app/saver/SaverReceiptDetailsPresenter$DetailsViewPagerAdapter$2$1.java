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

class this._cls2
    implements com.walmartlabs.storelocator.
{

    final onStoresReceived this$2;

    private void handleServerResponse(WalmartStore awalmartstore[])
    {
        if (isPopped())
        {
            return;
        }
        if (awalmartstore != null && awalmartstore.length > 0)
        {
            awalmartstore = new StoreDetailPresenter(SaverReceiptDetailsPresenter.access$1200(_fld0), awalmartstore[0]);
            awalmartstore.setShowLocalAd(false);
            SaverReceiptDetailsPresenter.access$2800(_fld0, awalmartstore);
            return;
        } else
        {
            clearSingleClickFlag();
            return;
        }
    }

    public void onFailure(int i)
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

    is._cls1()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/saver/SaverReceiptDetailsPresenter$DetailsViewPagerAdapter$2

/* anonymous class */
    class SaverReceiptDetailsPresenter.DetailsViewPagerAdapter._cls2
        implements SaverReceiptDetailsPage.ActionCallbacks
    {

        final SaverReceiptDetailsPresenter.DetailsViewPagerAdapter this$1;

        public void onAddressClicked(int i)
        {
            if (!SaverReceiptDetailsPresenter.access$2600(this$0))
            {
                SaverReceiptDetailsPresenter.access$2700(this$0, true);
                SaverReceiptDetailsPresenter.DetailsViewPagerAdapter._cls2._cls1 _lcls1 = new SaverReceiptDetailsPresenter.DetailsViewPagerAdapter._cls2._cls1();
                StoreService.getStoreService().getStore(i, _lcls1);
            }
        }

        public void onItemClicked(SaverReceipt saverreceipt, com.walmart.android.service.saver.SaverReceipt.Item item)
        {
            if (!SaverReceiptDetailsPresenter.access$2400(this$0))
            {
                SaverReceiptDetailsPresenter.access$2500(this$0, true);
                SaverReceiptDetailsPresenter.access$400(this$0).launchReceiptItem(saverreceipt, item);
            }
        }

            
            {
                this$1 = SaverReceiptDetailsPresenter.DetailsViewPagerAdapter.this;
                super();
            }
    }

}
