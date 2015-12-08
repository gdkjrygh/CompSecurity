// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemsAdapter, GiverListItemModelState, BaseListItemModelState, BaseItemViewHolder, 
//            AddToCartController, ItemAdapterCallback

public class GiverItemsAdapter extends BaseItemsAdapter
{
    static class GiverItemViewHolder extends BaseItemViewHolder
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

        public GiverItemViewHolder(View view, AddToCartController addtocartcontroller)
        {
            super(view, addtocartcontroller);
        }
    }


    public GiverItemsAdapter(Context context)
    {
        super(context);
    }

    protected volatile BaseListItemModelState createItemModeState(ListItemModel listitemmodel)
    {
        return createItemModeState(listitemmodel);
    }

    protected GiverListItemModelState createItemModeState(ListItemModel listitemmodel)
    {
        return new GiverListItemModelState(listitemmodel);
    }

    public GiverItemViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new GiverItemViewHolder(ViewUtil.inflate(mContext, 0x7f0401e9, viewgroup), mAddToCartController);
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }
}
