// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.ui.StoreAddressView;
import com.walmartlabs.storelocator.StoreData;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter, PlaceHolderStoreData

class this._cls0
    implements com.walmartlabs.storelocator.llback
{

    final ReviewOrderPresenter this$0;

    private void handleServerResponse(StoreData astoredata[])
    {
        if (isPopped())
        {
            return;
        }
        if (astoredata != null && astoredata.length > 0)
        {
            ReviewOrderPresenter.access$1402(ReviewOrderPresenter.this, astoredata[0]);
        } else
        {
            ReviewOrderPresenter.access$1402(ReviewOrderPresenter.this, new PlaceHolderStoreData(ReviewOrderPresenter.access$700(ReviewOrderPresenter.this), ReviewOrderPresenter.access$400(ReviewOrderPresenter.this)));
        }
        ReviewOrderPresenter.access$4300(ReviewOrderPresenter.this).setStore(ReviewOrderPresenter.access$1400(ReviewOrderPresenter.this));
        ReviewOrderPresenter.access$4400(ReviewOrderPresenter.this);
        ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), d_find_store_button).setVisibility(8);
        ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), this._fld0).setVisibility(0);
        ReviewOrderPresenter.access$2400(ReviewOrderPresenter.this, 1);
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
        this$0 = ReviewOrderPresenter.this;
        super();
    }
}
