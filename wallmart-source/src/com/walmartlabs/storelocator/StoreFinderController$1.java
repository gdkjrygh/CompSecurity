// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            StorePickerListener, StoreFinderController, StoreData

class this._cls0
    implements StorePickerListener
{

    final StoreFinderController this$0;

    public void onCancelled()
    {
        if (StoreFinderController.access$200(StoreFinderController.this) != null)
        {
            StoreFinderController.access$200(StoreFinderController.this).onCancelled();
        }
    }

    public void onStoreClicked(StoreData storedata)
    {
        if (!StoreFinderController.access$000(StoreFinderController.this))
        {
            if (StoreFinderController.access$100(StoreFinderController.this) != null)
            {
                StoreFinderController.access$100(StoreFinderController.this).onShowStoreDetails(storedata);
            }
        } else
        if (StoreFinderController.access$200(StoreFinderController.this) != null)
        {
            StoreFinderController.access$200(StoreFinderController.this).onStoreClicked(storedata);
            return;
        }
    }

    ShowStoreDetailsListener()
    {
        this$0 = StoreFinderController.this;
        super();
    }
}
