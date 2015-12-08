// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListManager, WishListService, CreateWishList

class uestCallback extends uestCallback
{

    final WishListManager this$0;
    final CreateWishList val$data;

    protected Request createRequest(String s)
    {
        return WishListManager.access$400(WishListManager.this).createList(s, val$data);
    }

    uestCallback(CreateWishList createwishlist)
    {
        this$0 = final_wishlistmanager;
        val$data = createwishlist;
        super(final_wishlistmanager, CallbackSameThread.this);
    }
}
