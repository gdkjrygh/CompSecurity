// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.CustomizeBundleTapEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, BundleSummaryPresenter

class this._cls0 extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;

    public void onSingleClick(View view)
    {
        view = new BundleSummaryPresenter(ItemDetailsPresenter.access$200(ItemDetailsPresenter.this), ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this), ItemDetailsPresenter.access$3800(ItemDetailsPresenter.this));
        view.setIsRecommendedItem(ItemDetailsPresenter.access$3900(ItemDetailsPresenter.this));
        ItemDetailsPresenter.access$4000(ItemDetailsPresenter.this, view);
        MessageBus.getBus().post(new CustomizeBundleTapEvent(ItemDetailsPresenter.access$100(ItemDetailsPresenter.this)));
    }

    apEvent(Presenter presenter)
    {
        this$0 = ItemDetailsPresenter.this;
        super(presenter);
    }
}
