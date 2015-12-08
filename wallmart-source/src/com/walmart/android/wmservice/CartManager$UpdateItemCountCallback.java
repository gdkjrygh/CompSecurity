// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.service.cart.ItemCount;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.wmservice:
//            CartManager, Util

private class this._cls0 extends CallbackSameThread
{

    final CartManager this$0;

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        if (result.successful() && result.hasData())
        {
            setNewItemCount(((ItemCount)result.getData()).itemCount);
        }
        Util.clearWebCookie("PCID");
        Util.clearWebCookie("hasPCID");
    }

    public ()
    {
        this$0 = CartManager.this;
        super(CartManager.access$100(CartManager.this));
    }
}
