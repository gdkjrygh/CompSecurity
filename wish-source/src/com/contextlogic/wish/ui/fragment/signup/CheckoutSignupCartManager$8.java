// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishSignupFreeGifts;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager

class val.freeGifts
    implements pFreeGiftCallback
{

    final CheckoutSignupCartManager this$0;
    final WishSignupFreeGifts val$freeGifts;

    public void onCancel()
    {
        close();
    }

    public void onGiftChosen(WishProduct wishproduct)
    {
        if (wishproduct == null)
        {
            return;
        } else
        {
            CheckoutSignupCartManager.access$900(CheckoutSignupCartManager.this, wishproduct, val$freeGifts);
            return;
        }
    }

    pFreeGiftCallback()
    {
        this$0 = final_checkoutsignupcartmanager;
        val$freeGifts = WishSignupFreeGifts.this;
        super();
    }
}
