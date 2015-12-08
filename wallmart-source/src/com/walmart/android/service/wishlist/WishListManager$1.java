// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListManager, ListTransferCompleteEvent

class teEvent extends CallbackSameThread
{

    final WishListManager this$0;
    final ListTransferCompleteEvent val$transferCompleteEvent;

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData())
        {
            WLog.d(WishListManager.access$000(), (new StringBuilder()).append("Successfully transferred ").append(((WishList[])result.getData()).length).append(" list(s)").toString());
        } else
        {
            WLog.d(WishListManager.access$000(), "Failed to transfer lists");
        }
        MessageBus.getBus().post(val$transferCompleteEvent);
    }

    teEvent()
    {
        this$0 = final_wishlistmanager;
        val$transferCompleteEvent = ListTransferCompleteEvent.this;
        super();
    }
}
