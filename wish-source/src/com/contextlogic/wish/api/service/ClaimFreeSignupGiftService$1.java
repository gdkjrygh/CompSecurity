// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishSignupFreeGiftCart;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ClaimFreeSignupGiftService

class val.removeFromCart
    implements WishApiCallback
{

    final ClaimFreeSignupGiftService this$0;
    final ilureCallback val$failureCallback;
    final boolean val$removeFromCart;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        Object obj = null;
        handleFailureResponse(wishapirequest, wishapiresponse);
        ClaimFreeSignupGiftService.access$002(ClaimFreeSignupGiftService.this, null);
        if (val$failureCallback != null)
        {
            wishapirequest = obj;
            if (wishapiresponse != null)
            {
                wishapirequest = wishapiresponse.getMessage();
            }
            val$failureCallback.onServiceFailed(wishapirequest);
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        ClaimFreeSignupGiftService.access$002(ClaimFreeSignupGiftService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            wishapirequest = wishapiresponse.getMessage();
            val$failureCallback.onServiceFailed(wishapirequest);
        }
_L4:
        return;
_L2:
        if (val$successCallback == null) goto _L4; else goto _L3
_L3:
        if (val$removeFromCart)
        {
            val$successCallback.onServiceSucceeded(null);
            return;
        }
        break MISSING_BLOCK_LABEL_83;
        wishapirequest;
        if (val$failureCallback == null) goto _L4; else goto _L5
_L5:
        val$failureCallback.onServiceFailed(null);
        return;
        wishapirequest = new WishSignupFreeGiftCart(wishapiresponse.getData());
        val$successCallback.onServiceSucceeded(wishapirequest);
        return;
    }

    ccessCallback()
    {
        this$0 = final_claimfreesignupgiftservice;
        val$failureCallback = ilurecallback;
        val$successCallback = ccesscallback;
        val$removeFromCart = Z.this;
        super();
    }
}
