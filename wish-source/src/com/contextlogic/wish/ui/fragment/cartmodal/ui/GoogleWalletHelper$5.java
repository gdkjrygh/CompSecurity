// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui:
//            GoogleWalletHelper

class angeListener
    implements com.contextlogic.wish.api.service.vice.SuccessCallback
{

    final GoogleWalletHelper this$0;
    final angeListener val$changeListener;

    public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
    {
        GoogleWalletHelper.access$100(GoogleWalletHelper.this).hideLoadingSpinner();
        val$changeListener.onChangeComplete();
    }

    angeListener()
    {
        this$0 = final_googlewallethelper;
        val$changeListener = angeListener.this;
        super();
    }
}
