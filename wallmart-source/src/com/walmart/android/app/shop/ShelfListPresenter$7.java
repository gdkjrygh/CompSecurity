// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmart.android.app.shop.giq.GiqProductItem;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter

class this._cls0
    implements com.walmart.android.app.shop.giq.CompletedAsyncCallback
{

    final ShelfListPresenter this$0;

    public void onFailure()
    {
        if (isPopped())
        {
            return;
        } else
        {
            ShelfListPresenter.access$600(ShelfListPresenter.this, null);
            return;
        }
    }

    public void onSuccess(GiqProductItem giqproductitem)
    {
        if (isPopped())
        {
            return;
        } else
        {
            ShelfListPresenter.access$600(ShelfListPresenter.this, giqproductitem);
            return;
        }
    }

    archCompletedAsyncCallback()
    {
        this$0 = ShelfListPresenter.this;
        super();
    }
}
