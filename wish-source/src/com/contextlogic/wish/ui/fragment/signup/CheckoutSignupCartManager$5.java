// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.api.data.WishSignupFreeGiftCart;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager

class this._cls0
    implements com.contextlogic.wish.api.service.uccessCallback
{

    final CheckoutSignupCartManager this$0;

    public void onServiceSucceeded(WishSignupFreeGiftCart wishsignupfreegiftcart)
    {
        hideLoadingSpinner();
        CheckoutSignupCartManager.access$002(CheckoutSignupCartManager.this, wishsignupfreegiftcart);
        CheckoutSignupCartManager.access$600(CheckoutSignupCartManager.this, wishsignupfreegiftcart.getCart(), null, null);
        CheckoutSignupCartManager.access$702(CheckoutSignupCartManager.this, false);
    }

    allback()
    {
        this$0 = CheckoutSignupCartManager.this;
        super();
    }
}
