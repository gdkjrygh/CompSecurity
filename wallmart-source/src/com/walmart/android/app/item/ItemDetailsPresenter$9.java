// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import com.walmart.android.app.item.view.OnlineView;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.VariantsModel;
import com.walmart.android.util.AvailabilityUtils;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState

class val.variantId extends CallbackSameThread
{

    final ItemDetailsPresenter this$0;
    final String val$variantId;

    public void onResultSameThread(Request request, Result result)
    {
        Object obj1 = null;
        ItemDetailsPresenter.access$3102(ItemDetailsPresenter.this, null);
        ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).setIsFetchingBuyingOption(false);
        Object obj = null;
        request = obj;
        if (result.successful())
        {
            request = obj;
            if (result.hasData())
            {
                request = (BuyingOptionModel)result.getData();
                ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getVariantsModel().updateVariantBuyingOption(val$variantId, request);
                ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).setSelectedBuyingOption(request);
                result = obj1;
                if (request != null)
                {
                    result = request.getStoreItemModel(AvailabilityUtils.getPreferredStore(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this)));
                }
                request = obj;
                if (result != null)
                {
                    request = new StoreAvailabilityData(result);
                    ItemDetailsPresenter.access$1600(ItemDetailsPresenter.this).put(val$variantId, request);
                }
            }
        }
        ItemDetailsPresenter.access$3000(ItemDetailsPresenter.this);
        ItemDetailsPresenter.access$3200(ItemDetailsPresenter.this).setAddToCartEnabled(true);
        ItemDetailsPresenter.access$2700(ItemDetailsPresenter.this, request, Integer.valueOf(ItemDetailsPresenter.access$2600(request)));
    }

    _cls9(String s)
    {
        this$0 = final_itemdetailspresenter;
        val$variantId = s;
        super(Context.this);
    }
}
