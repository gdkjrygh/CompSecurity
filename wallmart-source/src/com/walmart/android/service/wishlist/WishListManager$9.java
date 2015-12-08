// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListManager, WishListService, UpdateWishList

class questCallback extends questCallback
{

    final WishListManager this$0;
    final String val$listId;
    final UpdateWishList val$updateData;

    protected Request createRequest(String s)
    {
        return WishListManager.access$400(WishListManager.this).updateList(val$listId, s, val$updateData);
    }

    questCallback(UpdateWishList updatewishlist)
    {
        this$0 = final_wishlistmanager;
        val$listId = String.this;
        val$updateData = updatewishlist;
        super(final_wishlistmanager, final_callbacksamethread);
    }
}
