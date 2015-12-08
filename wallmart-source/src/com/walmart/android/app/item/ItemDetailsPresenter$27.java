// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class val.itemId extends CallbackSameThread
{

    final ItemDetailsPresenter this$0;
    final String val$itemId;

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        ItemDetailsPresenter.access$5200(ItemDetailsPresenter.this, request, result, val$itemId);
    }

    ()
    {
        this$0 = final_itemdetailspresenter;
        val$itemId = String.this;
        super();
    }
}
