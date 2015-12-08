// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StorePickerListener;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            TransferRxUserInfoPresenter

class this._cls0
    implements StorePickerListener
{

    final TransferRxUserInfoPresenter this$0;

    public void onCancelled()
    {
    }

    public void onStoreClicked(StoreData storedata)
    {
        setStore(storedata);
        getPresenterStack().popPresenter();
    }

    ()
    {
        this$0 = TransferRxUserInfoPresenter.this;
        super();
    }
}
