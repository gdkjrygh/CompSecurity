// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState, AdditionalSellersActivity

class val.buyingOptionModels
    implements android.view.ilsPresenter._cls15
{

    final ItemDetailsPresenter this$0;
    final List val$buyingOptionModels;

    public void onClick(View view)
    {
        view = ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getSelectedBuyingOption();
        AdditionalSellersActivity.launch(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), 1, val$buyingOptionModels, view);
    }

    y()
    {
        this$0 = final_itemdetailspresenter;
        val$buyingOptionModels = List.this;
        super();
    }
}
