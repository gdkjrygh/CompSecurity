// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.DialogInterface;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.VariantsModel;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter, ItemState, VariantController

class this._cls0
    implements android.content.istener
{

    final ItemDetailsPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).hasVariants())
        {
            ItemDetailsPresenter.access$4400(ItemDetailsPresenter.this).replace(ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getBundleOption(), ItemDetailsPresenter.access$2100(ItemDetailsPresenter.this).getVariantsModel().getVariantTypes(), ItemDetailsPresenter.access$1400(ItemDetailsPresenter.this).getSelectedVariant());
        } else
        {
            ItemDetailsPresenter.access$4400(ItemDetailsPresenter.this).replace(ItemDetailsPresenter.access$2000(ItemDetailsPresenter.this).getBundleOption());
        }
        ItemDetailsPresenter.access$5400(ItemDetailsPresenter.this);
    }

    leGroupConfiguration()
    {
        this$0 = ItemDetailsPresenter.this;
        super();
    }
}
