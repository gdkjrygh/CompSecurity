// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfAdapter, ShelfItemView

public class ShelfListAdapter extends ShelfAdapter
{

    public ShelfListAdapter(Context context)
    {
        super(context);
    }

    public void cleanup()
    {
        super.cleanup();
        Picasso.with(getContext()).cancelTag(ShelfItemView.TAG);
    }

    public void onBindItemViewHolder(ShelfAdapter.ShelfItemViewHolder shelfitemviewholder, com.walmart.android.data.StoreQueryResult.Item item, int i)
    {
        ((ShelfItemView)shelfitemviewholder.itemView).setItem(item, shouldShowSoldOut(), isShippingPassEligible());
    }

    public volatile void onBindItemViewHolder(BasicViewHolder basicviewholder, Object obj, int i)
    {
        onBindItemViewHolder((ShelfAdapter.ShelfItemViewHolder)basicviewholder, (com.walmart.android.data.StoreQueryResult.Item)obj, i);
    }

    public ShelfAdapter.ShelfItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return new ShelfAdapter.ShelfItemViewHolder(ViewUtil.inflate(getContext(), 0x7f04018f, viewgroup));
    }

    public volatile BasicViewHolder onCreateItemViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateItemViewHolder(viewgroup, i);
    }
}
