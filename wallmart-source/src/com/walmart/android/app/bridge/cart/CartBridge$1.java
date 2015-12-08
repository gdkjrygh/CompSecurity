// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.cart;

import com.walmart.android.wmservice.CartManager;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.bridge.cart:
//            CartBridge

class val.cartCount
    implements Runnable
{

    final CartBridge this$0;
    final int val$cartCount;

    public void run()
    {
        Services.get().getCartManager().setNewItemCount(val$cartCount);
    }

    ()
    {
        this$0 = final_cartbridge;
        val$cartCount = I.this;
        super();
    }
}
