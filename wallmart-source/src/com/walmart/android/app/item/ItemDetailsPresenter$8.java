// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.app.item.view.InStoreView;
import com.walmart.android.app.ui.ImagePagerController;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.shop.ImageUrlAdapter;
import com.walmart.android.wmservice.ItemImageDownloaderFactory;
import com.walmartlabs.utils.WLog;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState, ItemLogic

class this._cls0
    implements ntSelectionChangedListener
{

    final ItemDetailsPresenter this$0;

    public void onVariantSelectionChanged(com.walmart.android.service.item.em em)
    {
        ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).setSelectedVariantItem(em);
        if (em != null)
        {
            List list = ItemDetailsPresenter.access$300(ItemDetailsPresenter.this).getProductImageUrls();
            if (!Arrays.equals(mAdapter.getImageUrls(), list.toArray(new String[list.size()])))
            {
                mImagePagerController.cleanUp();
                mAdapter.cleanUp();
                mImageDownloader = ItemImageDownloaderFactory.createImageDownloader(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this));
                mAdapter = new ImageUrlAdapter(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), mImageDownloader);
                ItemDetailsPresenter.access$2400(ItemDetailsPresenter.this);
            }
            if (!em.hasBuyingOption())
            {
                ItemDetailsPresenter.access$2500(ItemDetailsPresenter.this, em);
                ItemDetailsPresenter.access$1300(ItemDetailsPresenter.this).setLoading(true);
            } else
            {
                ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).setSelectedBuyingOption(em.getBuyingOptionModel());
                StoreAvailabilityData storeavailabilitydata = (StoreAvailabilityData)ItemDetailsPresenter.access$1600(ItemDetailsPresenter.this).get(em.getItemId());
                if (storeavailabilitydata != null)
                {
                    WLog.d(ItemDetailsPresenter.access$1700(), (new StringBuilder()).append("onVariantChanged(): Found cached availability data for ").append(storeavailabilitydata.wwwItemId).append(": ").append(storeavailabilitydata.price).append(" / ").append(storeavailabilitydata.stockStatus).toString());
                } else
                {
                    WLog.d(ItemDetailsPresenter.access$1700(), (new StringBuilder()).append("onVariantChanged(): No availability data available for ").append(em.getItemId()).append(", but we have fetched data -> Not carried").toString());
                }
                ItemDetailsPresenter.access$2700(ItemDetailsPresenter.this, storeavailabilitydata, Integer.valueOf(ItemDetailsPresenter.access$2600(storeavailabilitydata)));
            }
        } else
        {
            ItemDetailsPresenter.access$2700(ItemDetailsPresenter.this, null, Integer.valueOf(-1001));
            ItemDetailsPresenter.access$2800(ItemDetailsPresenter.this);
            ItemDetailsPresenter.access$2900(ItemDetailsPresenter.this);
        }
        ItemDetailsPresenter.access$3000(ItemDetailsPresenter.this);
    }

    ntItem()
    {
        this$0 = ItemDetailsPresenter.this;
        super();
    }
}
