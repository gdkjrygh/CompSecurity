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

    protected Request createRequest(String s)
    {
        return WishListManager.access$400(WishListManager.this).getWishLists(s);
    }

    questCallback(CallbackSameThread callbacksamethread)
    {
        this$0 = WishListManager.this;
        super(WishListManager.this, callbacksamethread);
    }
}
