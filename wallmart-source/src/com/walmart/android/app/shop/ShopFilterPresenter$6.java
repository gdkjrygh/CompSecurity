// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;


// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterPresenter

class this._cls0
    implements lterChangedListener
{

    final ShopFilterPresenter this$0;

    public void onFilterChanged()
    {
        reloadData();
    }

    lterChangedListener()
    {
        this$0 = ShopFilterPresenter.this;
        super();
    }
}
