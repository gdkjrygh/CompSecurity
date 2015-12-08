// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.walmart.android.service.item.BundleModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class this._cls0 extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;

    public void onSingleClick(View view)
    {
        ItemDetailsPresenter.access$4100(ItemDetailsPresenter.this, ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getBundleModel().getGroupingId(), ItemDetailsPresenter.access$3700(ItemDetailsPresenter.this));
    }

    (Presenter presenter)
    {
        this$0 = ItemDetailsPresenter.this;
        super(presenter);
    }
}
