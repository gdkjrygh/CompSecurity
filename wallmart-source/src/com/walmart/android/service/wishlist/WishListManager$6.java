// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListManager, WishListService

class questCallback extends questCallback
{

    final WishListManager this$0;
    final int val$hasQuantity;
    final String val$itemId;
    final String val$listId;
    final int val$wantsQuantity;

    protected Request createRequest(String s)
    {
        return WishListManager.access$400(WishListManager.this).updateItemQuantities(val$listId, val$itemId, s, val$wantsQuantity, val$hasQuantity);
    }

    questCallback(int j)
    {
        this$0 = final_wishlistmanager;
        val$listId = s;
        val$itemId = s1;
        val$wantsQuantity = I.this;
        val$hasQuantity = j;
        super(final_wishlistmanager, final_callbacksamethread);
    }
}
