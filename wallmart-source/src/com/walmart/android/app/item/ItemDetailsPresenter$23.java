// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState

class this._cls0 extends OnSingleClickListener
{

    final ItemDetailsPresenter this$0;

    public void onSingleClick(View view)
    {
        if (ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).hasVariants() && !ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).hasSelectedVariant())
        {
            ItemDetailsPresenter.access$5100(ItemDetailsPresenter.this, 3);
            return;
        } else
        {
            ItemDetailsPresenter.access$4300(ItemDetailsPresenter.this);
            return;
        }
    }

    (Presenter presenter)
    {
        this$0 = ItemDetailsPresenter.this;
        super(presenter);
    }
}
