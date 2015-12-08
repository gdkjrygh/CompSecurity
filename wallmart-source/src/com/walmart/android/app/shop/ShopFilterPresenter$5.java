// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterPresenter

class this._cls0
    implements android.view.lterPresenter._cls5
{

    final ShopFilterPresenter this$0;

    public void onClick(View view)
    {
        if (ShopFilterPresenter.access$1300(ShopFilterPresenter.this) != null)
        {
            ShopFilterPresenter.access$1300(ShopFilterPresenter.this).onFilterApplied();
        }
    }

    FilterAppliedListener()
    {
        this$0 = ShopFilterPresenter.this;
        super();
    }
}
