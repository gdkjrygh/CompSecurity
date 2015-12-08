// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;


// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter

class this._cls0
    implements iledToLoadStoresListener
{

    final StoreViewPresenter this$0;

    public void onFailed(int i)
    {
        if (0x15f92 == i)
        {
            showDialog(600);
            return;
        } else
        {
            showDialog(9);
            return;
        }
    }

    iledToLoadStoresListener()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
