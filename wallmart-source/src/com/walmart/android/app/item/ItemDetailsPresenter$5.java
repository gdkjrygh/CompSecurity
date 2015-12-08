// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.app.item.view.InStoreView;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class this._cls0
    implements com.walmart.android.app.shop.map.pVisibilityCallback
{

    final ItemDetailsPresenter this$0;

    public void onMapVisibilityChanged(boolean flag)
    {
        ItemDetailsPresenter.access$1300(ItemDetailsPresenter.this).showInStoreMap(flag);
    }

    r.MapVisibilityCallback()
    {
        this$0 = ItemDetailsPresenter.this;
        super();
    }
}
