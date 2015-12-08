// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ProductViewSource;
import com.walmart.android.analytics.events.Source;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class val.item extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;
    final com.walmart.android.data..RecommendedItem val$item;

    public void onSingleClick(View view)
    {
        MessageBus.getBus().post(new ProductViewSource(Source.RECOMMENDED_ITEM));
        view = val$item.itemId;
        ItemDetailsPresenter itemdetailspresenter = new ItemDetailsPresenter(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), view);
        itemdetailspresenter.setIsRecommendedItem(true);
        ItemDetailsPresenter.access$3500(ItemDetailsPresenter.this, itemdetailspresenter);
        GoogleAnalytics.trackEvent("Recommendations", "Item Page Tap", view);
        view = (new com.walmartlabs.anivia.r("recProdView")).putString("itemId", ItemDetailsPresenter.access$100(ItemDetailsPresenter.this)).putString("recItemId", view);
        MessageBus.getBus().post(view);
    }

    ommendedItem(com.walmart.android.data..RecommendedItem recommendeditem)
    {
        this$0 = final_itemdetailspresenter;
        val$item = recommendeditem;
        super(Presenter.this);
    }
}
