// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.util.Log;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.ui.StoreAddressView;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StorePickerListener;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter

class this._cls0
    implements StorePickerListener
{

    final ReviewOrderPresenter this$0;

    public void onCancelled()
    {
    }

    public void onStoreClicked(StoreData storedata)
    {
        com.walmartlabs.anivia.r r = (new com.walmartlabs.anivia.r("changeStore")).putString("oldStoreId", Integer.toString(ReviewOrderPresenter.access$400(ReviewOrderPresenter.this))).putString("changeStoreLocation", "refill");
        try
        {
            int i = Integer.parseInt(storedata.getId());
            ReviewOrderPresenter.access$4602(ReviewOrderPresenter.this, ReviewOrderPresenter.access$400(ReviewOrderPresenter.this));
            ReviewOrderPresenter.access$402(ReviewOrderPresenter.this, i);
            r.putString("newStoreId", storedata.getId());
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.w(ReviewOrderPresenter.access$2100(), "Could not get store number from id");
            r.putString("newStoreId", "none");
        }
        ReviewOrderPresenter.access$4700(ReviewOrderPresenter.this);
        ReviewOrderPresenter.access$4802(ReviewOrderPresenter.this, ReviewOrderPresenter.access$1400(ReviewOrderPresenter.this));
        ReviewOrderPresenter.access$1402(ReviewOrderPresenter.this, storedata);
        ReviewOrderPresenter.access$4300(ReviewOrderPresenter.this).setStore(ReviewOrderPresenter.access$1400(ReviewOrderPresenter.this));
        getPresenterStack().popPresenter();
        ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), d_find_store_button).setVisibility(8);
        ViewUtil.findViewById(ReviewOrderPresenter.access$600(ReviewOrderPresenter.this), this._fld0).setVisibility(0);
        ReviewOrderPresenter.access$4400(ReviewOrderPresenter.this);
        MessageBus.getBus().post(r);
    }

    ()
    {
        this$0 = ReviewOrderPresenter.this;
        super();
    }
}
