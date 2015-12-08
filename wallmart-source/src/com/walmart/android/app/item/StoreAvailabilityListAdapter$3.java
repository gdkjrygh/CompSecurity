// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListAdapter

class this._cls0 extends CallbackSameThread
{

    final StoreAvailabilityListAdapter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        StoreAvailabilityListAdapter.access$302(StoreAvailabilityListAdapter.this, false);
        if (!result.successful() || !result.hasData()) goto _L2; else goto _L1
_L1:
        request = ((BuyingOptionModel)result.getData()).getStoreItemModels();
        StoreAvailabilityListAdapter.access$700(StoreAvailabilityListAdapter.this, request);
        if (request.isEmpty() && StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this) != null)
        {
            StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this).onEmptyStoreAvailabilityResponse();
        }
_L4:
        notifyDataSetChanged();
        StoreAvailabilityListAdapter.access$500(StoreAvailabilityListAdapter.this);
        return;
_L2:
        if (StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this) != null)
        {
            StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this).onErrorLoadingStores(AsyncCallbackWrapper.translateError(result).intValue());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    oreAvailabilityListener()
    {
        this$0 = StoreAvailabilityListAdapter.this;
        super();
    }
}
