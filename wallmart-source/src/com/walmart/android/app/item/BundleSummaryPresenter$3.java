// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.app.wishlist.ListCreatorActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.item.BundleModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.wishlist.AddBundle;

// Referenced classes of package com.walmart.android.app.item:
//            BundleSummaryPresenter

class this._cls0
    implements android.view.maryPresenter._cls3
{

    final BundleSummaryPresenter this$0;

    public void onClick(View view)
    {
        if (BundleSummaryPresenter.access$100(BundleSummaryPresenter.this))
        {
            view = new AddBundle(BundleSummaryPresenter.access$600(BundleSummaryPresenter.this).getGroupingId(), 1, AddBundle.convertItems(BundleSummaryPresenter.access$700(BundleSummaryPresenter.this)));
            ListCreatorActivity.launch(BundleSummaryPresenter.access$800(BundleSummaryPresenter.this), view);
            view = new com.walmartlabs.anivia.("AddToListTap");
            view.putString("itemId", BundleSummaryPresenter.access$900(BundleSummaryPresenter.this).getItemId());
            MessageBus.getBus().post(view);
        }
    }

    ()
    {
        this$0 = BundleSummaryPresenter.this;
        super();
    }
}
