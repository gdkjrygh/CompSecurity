// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.walmart.android.service.wishlist.models.ListItemModel;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemViewHolder, GiverItemsAdapter, GiverListItemModelState, AddToCartController, 
//            BaseListItemModelState, ItemAdapterCallback

static class  extends BaseItemViewHolder
{

    public volatile void populate(int i, BaseListItemModelState baselistitemmodelstate, ItemAdapterCallback itemadaptercallback)
    {
        populate(i, (GiverListItemModelState)baselistitemmodelstate, itemadaptercallback);
    }

    public void populate(int i, GiverListItemModelState giverlistitemmodelstate, ItemAdapterCallback itemadaptercallback)
    {
        super.populate(i, giverlistitemmodelstate, itemadaptercallback);
        mWantsClickable.setBackground(null);
        mWants.setText(Integer.toString(giverlistitemmodelstate.getItem().getWantsQuantity()));
        mWants.setTextColor(mWants.getResources().getColor(0x7f0f0123));
        mWants.setBackgroundDrawable(null);
    }

    public (View view, AddToCartController addtocartcontroller)
    {
        super(view, addtocartcontroller);
    }
}
