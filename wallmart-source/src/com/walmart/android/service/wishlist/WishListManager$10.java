// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListManager, WishListService

class uestCallback extends uestCallback
{

    final WishListManager this$0;
    final String val$filter;
    final String val$listId;
    final String val$order;
    final String val$sort;

    protected Request createRequest(String s)
    {
        return WishListManager.access$400(WishListManager.this).getItems(val$listId, s, val$filter, val$sort, val$order);
    }

    uestCallback(String s3)
    {
        this$0 = final_wishlistmanager;
        val$listId = s;
        val$filter = s1;
        val$sort = String.this;
        val$order = s3;
        super(final_wishlistmanager, final_callbacksamethread);
    }
}
