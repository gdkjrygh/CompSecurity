// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.cart;

import android.os.Handler;
import com.walmart.android.wmservice.CartManager;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;
import io.theholygrail.jsbridge.JSWebView;

public class CartBridge
{

    public static final String NAMESPACE = "cart";
    private static final String TAG = com/walmart/android/app/bridge/cart/CartBridge.getSimpleName();
    Handler mHandler;
    JSWebView mWebView;

    public CartBridge(JSWebView jswebview)
    {
        mWebView = jswebview;
        mHandler = new Handler();
    }

    public void updateItemCount(String s)
    {
        WLog.i(TAG, (new StringBuilder()).append("updateItemCount(): ").append(s).toString());
        final int cartCount = Integer.parseInt(s);
        mHandler.post(new Runnable() {

            final CartBridge this$0;
            final int val$cartCount;

            public void run()
            {
                Services.get().getCartManager().setNewItemCount(cartCount);
            }

            
            {
                this$0 = CartBridge.this;
                cartCount = i;
                super();
            }
        });
    }

}
