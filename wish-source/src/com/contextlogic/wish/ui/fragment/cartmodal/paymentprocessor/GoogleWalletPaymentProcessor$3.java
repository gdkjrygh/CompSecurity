// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor:
//            GoogleWalletPaymentProcessor

class tener
    implements com.contextlogic.wish.api.service.ssCallback
{

    final GoogleWalletPaymentProcessor this$0;
    final GoogleApiClient val$client;
    final tener val$failureListener;
    final tener val$successListener;

    public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
    {
        cartManager.updateData(wishcart, wishshippinginfo, cartManager.getUserBillingInfo());
        GoogleWalletPaymentProcessor.access$100(GoogleWalletPaymentProcessor.this, val$client, val$successListener, val$failureListener);
    }

    tener()
    {
        this$0 = final_googlewalletpaymentprocessor;
        val$client = googleapiclient;
        val$successListener = tener;
        val$failureListener = tener.this;
        super();
    }
}
