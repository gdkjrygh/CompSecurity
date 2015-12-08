// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.text.TextUtils;
import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ProductType;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.item.ItemPrice;
import com.walmartlabs.utils.WLog;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, VariantController, ItemLogic, StoreAvailabilityListPresenter

class this._cls0
    implements android.view.ailsPresenter._cls6
{

    final ItemDetailsPresenter this$0;

    public void onClick(View view)
    {
        view = ItemDetailsPresenter.access$100(ItemDetailsPresenter.this);
        Object obj = ItemDetailsPresenter.access$1400(ItemDetailsPresenter.this).getSelectedVariant();
        boolean flag;
        if (obj != null)
        {
            view = null;
            if (ItemDetailsPresenter.access$1500(ItemDetailsPresenter.this) != null)
            {
                view = ItemDetailsPresenter.access$1500(ItemDetailsPresenter.this);
            } else
            if (ItemDetailsPresenter.access$1600(ItemDetailsPresenter.this) != null)
            {
                view = (StoreAvailabilityData)ItemDetailsPresenter.access$1600(ItemDetailsPresenter.this).get(((com.walmart.android.service.item.em) (obj)).getItemId());
            }
            if (view != null && (!TextUtils.isEmpty(((StoreAvailabilityData) (view)).upc) || !TextUtils.isEmpty(((StoreAvailabilityData) (view)).wwwItemId)))
            {
                String s;
                if (!TextUtils.isEmpty(((StoreAvailabilityData) (view)).upc))
                {
                    obj = (new StringBuilder()).append(((StoreAvailabilityData) (view)).upc).append("0").toString();
                } else
                {
                    obj = ((StoreAvailabilityData) (view)).upc;
                }
                view = ((StoreAvailabilityData) (view)).wwwItemId;
                WLog.d(ItemDetailsPresenter.access$1700(), (new StringBuilder()).append("Using variant values: UPC = ").append(((String) (obj))).append(", itemId = ").append(view).toString());
            } else
            {
                view = ((com.walmart.android.service.item.em) (obj)).getItemId();
                WLog.d(ItemDetailsPresenter.access$1700(), (new StringBuilder()).append("Using variant itemId = ").append(view).toString());
            }
        }
        obj = ItemDetailsPresenter.access$200(ItemDetailsPresenter.this);
        s = ItemDetailsPresenter.access$1800(ItemDetailsPresenter.this).toString();
        if (!ItemDetailsPresenter.access$300(ItemDetailsPresenter.this).getOnlinePrice().isSubmap())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = new StoreAvailabilityListPresenter(((android.app.Activity) (obj)), view, s, flag);
        ItemDetailsPresenter.access$1900(ItemDetailsPresenter.this, view);
        GoogleAnalytics.trackEvent("Item Details", "More Store Availability", "");
    }

    ntItem()
    {
        this$0 = ItemDetailsPresenter.this;
        super();
    }
}
