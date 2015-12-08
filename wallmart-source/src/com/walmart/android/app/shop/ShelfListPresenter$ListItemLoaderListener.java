// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter

protected class this._cls0 extends this._cls0
{

    final ShelfListPresenter this$0;

    public void onLoadFailed(com.walmart.android.app.shop.itemloader. , int i)
    {
        super.iled(, i);
        WLog.d(ShelfListPresenter.access$000(), "onLoadFailed()");
        if (!isPopped() && com.walmart.android.app.shop.itemloader..())
        {
            ShelfListPresenter.access$100(ShelfListPresenter.this);
        }
    }

    protected ()
    {
        this$0 = ShelfListPresenter.this;
        super(ShelfListPresenter.this);
    }
}
