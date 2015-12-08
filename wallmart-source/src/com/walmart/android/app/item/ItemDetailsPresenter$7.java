// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.walmart.android.app.shop.map.InStoreMapFullScreenPresenter;
import com.walmart.android.app.shop.map.InStoreMapSectionController;
import com.walmart.android.app.shop.map.ItemPagerAdapter;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState

class this._cls0 extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;

    public void onSingleClick(View view)
    {
        if (ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getStoreAvailabilityData() != null)
        {
            view = new ItemPagerAdapter();
            view.setItemData(ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this), ItemDetailsPresenter.access$300(ItemDetailsPresenter.this));
            ItemDetailsPresenter.access$2300(ItemDetailsPresenter.this, new InStoreMapFullScreenPresenter(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), getTitleText(), ItemDetailsPresenter.access$2200(ItemDetailsPresenter.this).getSourceDataMapper(), view, null));
        }
    }

    ntroller(Presenter presenter)
    {
        this$0 = ItemDetailsPresenter.this;
        super(presenter);
    }
}
