// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import com.walmartlabs.storelocator.StoreData;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderDetailsPresenter, PlaceHolderStoreData

class val.storeNumber
    implements com.walmartlabs.storelocator.llback
{

    final OrderDetailsPresenter this$0;
    final int val$storeNumber;

    private void handleServerResponse(StoreData astoredata[])
    {
        if (isPopped())
        {
            return;
        }
        if (astoredata != null && astoredata.length > 0)
        {
            OrderDetailsPresenter.access$002(OrderDetailsPresenter.this, astoredata[0]);
        } else
        {
            OrderDetailsPresenter.access$002(OrderDetailsPresenter.this, new PlaceHolderStoreData(OrderDetailsPresenter.access$100(OrderDetailsPresenter.this), val$storeNumber));
        }
        OrderDetailsPresenter.access$200(OrderDetailsPresenter.this);
    }

    public void onFailure(int i)
    {
        handleServerResponse(null);
    }

    public void onStoresReceived(StoreData astoredata[])
    {
        handleServerResponse(astoredata);
    }

    ck()
    {
        this$0 = final_orderdetailspresenter;
        val$storeNumber = I.this;
        super();
    }
}
