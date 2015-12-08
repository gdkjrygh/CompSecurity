// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmart.android.app.item.view.InStoreView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.shop:
//            SimpleItemDetailsPresenter

class this._cls0
    implements com.walmart.android.app.shop.map.ilityCallback
{

    final SimpleItemDetailsPresenter this$0;

    public void onMapVisibilityChanged(boolean flag)
    {
        ((InStoreView)ViewUtil.findViewById(SimpleItemDetailsPresenter.access$200(SimpleItemDetailsPresenter.this), 0x7f1001e9)).showInStoreMap(flag);
    }

    isibilityCallback()
    {
        this$0 = SimpleItemDetailsPresenter.this;
        super();
    }
}
