// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.checkout;

import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.checkout:
//            GoogleWalletCheckoutManager

class this._cls0
    implements com.contextlogic.wish.api.service.ureCallback
{

    final GoogleWalletCheckoutManager this$0;

    public void onServiceFailed(String s)
    {
        cartManager.hideLoadingSpinner();
        cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(413, null));
    }

    ()
    {
        this$0 = GoogleWalletCheckoutManager.this;
        super();
    }
}
