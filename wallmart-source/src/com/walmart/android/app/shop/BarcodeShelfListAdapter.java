// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.view.View;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListAdapter

public class BarcodeShelfListAdapter extends ShelfListAdapter
{

    public BarcodeShelfListAdapter(Activity activity)
    {
        super(activity);
    }

    public void onBindItemViewHolder(ShelfAdapter.ShelfItemViewHolder shelfitemviewholder, com.walmart.android.data.StoreQueryResult.Item item, int i)
    {
        super.onBindItemViewHolder(shelfitemviewholder, item, i);
        shelfitemviewholder = shelfitemviewholder.itemView.findViewById(0x7f1000a4);
        if (shelfitemviewholder != null)
        {
            shelfitemviewholder.setVisibility(4);
        }
    }

    public volatile void onBindItemViewHolder(BasicViewHolder basicviewholder, Object obj, int i)
    {
        onBindItemViewHolder((ShelfAdapter.ShelfItemViewHolder)basicviewholder, (com.walmart.android.data.StoreQueryResult.Item)obj, i);
    }
}
