// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.widget.Toast;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.ui.Presenter;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ItemAdapterCallback, BaseItemsAdapter

class val.item extends CallbackSameThread
{

    final ItemAdapterCallback this$0;
    final ListItemModel val$item;

    public void onResultSameThread(Request request, Result result)
    {
        if (ItemAdapterCallback.access$000(ItemAdapterCallback.this).isTop())
        {
            if (result.successful())
            {
                Toast.makeText(ItemAdapterCallback.access$100(ItemAdapterCallback.this), 0x7f090644, 0).show();
            } else
            {
                DialogFactory.showDialog(900, ItemAdapterCallback.access$100(ItemAdapterCallback.this));
            }
            ItemAdapterCallback.access$200(ItemAdapterCallback.this).markAddToCartCompletion(val$item.getId(), val$item.getListId());
        }
    }

    el(ListItemModel listitemmodel)
    {
        this$0 = final_itemadaptercallback;
        val$item = listitemmodel;
        super(Context.this);
    }
}
