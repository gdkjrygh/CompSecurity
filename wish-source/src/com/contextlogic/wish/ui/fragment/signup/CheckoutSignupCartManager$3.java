// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.api.data.WishSignupFreeGifts;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager

class this._cls0
    implements com.contextlogic.wish.api.service.ccessCallback
{

    final CheckoutSignupCartManager this$0;

    public void onServiceSucceeded(WishSignupFreeGifts wishsignupfreegifts)
    {
        CheckoutSignupCartManager.access$400(CheckoutSignupCartManager.this, wishsignupfreegifts);
    }

    llback()
    {
        this$0 = CheckoutSignupCartManager.this;
        super();
    }
}
