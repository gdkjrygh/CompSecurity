// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ProductType;
import com.walmart.android.service.item.DescriptionModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, AboutItemPresenter

class val.dm extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;
    final DescriptionModel val$dm;

    public void onSingleClick(View view)
    {
        ItemDetailsPresenter.access$3600(ItemDetailsPresenter.this, new AboutItemPresenter(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), ItemDetailsPresenter.access$100(ItemDetailsPresenter.this), ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getProductName(), ItemDetailsPresenter.access$1800(ItemDetailsPresenter.this).toString(), val$dm));
        GoogleAnalytics.trackEvent("Item Details", "More Item Description", "");
    }

    (DescriptionModel descriptionmodel)
    {
        this$0 = final_itemdetailspresenter;
        val$dm = descriptionmodel;
        super(Presenter.this);
    }
}
