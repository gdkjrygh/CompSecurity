// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListManager, WishListService, AddItemBase

class uestCallback extends uestCallback
{

    final WishListManager this$0;
    final AddItemBase val$item;
    final String val$listId;

    protected Request createRequest(String s)
    {
        return WishListManager.access$400(WishListManager.this).addItem(s, val$listId, val$item);
    }

    uestCallback(AddItemBase additembase)
    {
        this$0 = final_wishlistmanager;
        val$listId = String.this;
        val$item = additembase;
        super(final_wishlistmanager, final_callbacksamethread);
    }
}
