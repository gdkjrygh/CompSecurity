// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ProductImagePresenter, ItemLogic

class this._cls0
    implements com.walmart.android.app.ui.ImageClickedListener
{

    final ItemDetailsPresenter this$0;

    public void OnImageClickListener(String s)
    {
        s = (new com.walmartlabs.anivia.er("enlargePic")).putString("itemId", ItemDetailsPresenter.access$100(ItemDetailsPresenter.this));
        MessageBus.getBus().post(s);
        s = new ProductImagePresenter(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), ItemDetailsPresenter.access$300(ItemDetailsPresenter.this).getProductImageUrls());
        ItemDetailsPresenter.access$400(ItemDetailsPresenter.this, s);
    }

    ageClickedListener()
    {
        this$0 = ItemDetailsPresenter.this;
        super();
    }
}
