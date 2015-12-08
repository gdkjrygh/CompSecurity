// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState

class val.configuredComponents extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;
    final List val$configuredComponents;

    public void onSingleClick(View view)
    {
        ItemDetailsPresenter.access$4100(ItemDetailsPresenter.this, ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getSelectedBuyingOption().getInflexibleKitId(), val$configuredComponents);
    }

    (List list)
    {
        this$0 = final_itemdetailspresenter;
        val$configuredComponents = list;
        super(Presenter.this);
    }
}
