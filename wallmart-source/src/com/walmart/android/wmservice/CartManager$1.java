// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import com.walmart.android.service.cart.ItemCount;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.wmservice:
//            CartManager

class <init> extends CallbackSameThread
{

    final CartManager this$0;

    public void onCancelled(Request request)
    {
        CartManager.access$002(CartManager.this, false);
    }

    public void onResultSameThread(Request request, Result result)
    {
        if (result.successful() && result.hasData())
        {
            setNewItemCount(((ItemCount)result.getData()).itemCount);
        }
        CartManager.access$002(CartManager.this, false);
    }

    (Context context)
    {
        this$0 = CartManager.this;
        super(context);
    }
}
