// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishSignupFreeGiftCart;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class ClaimFreeSignupGiftService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishSignupFreeGiftCart wishsignupfreegiftcart);
    }


    private WishApiRequest apiRequest;

    public ClaimFreeSignupGiftService()
    {
    }

    public void cancelAllRequests()
    {
        if (apiRequest != null)
        {
            apiRequest.cancel();
            apiRequest = null;
        }
    }

    public boolean isPending()
    {
        return apiRequest != null;
    }

    public void requestService(String s, String s1, final boolean removeFromCart, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().claimSignupGift(s, s1, removeFromCart, new WishApiCallback() {

            final ClaimFreeSignupGiftService this$0;
            final FailureCallback val$failureCallback;
            final boolean val$removeFromCart;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                Object obj = null;
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequest = null;
                if (failureCallback != null)
                {
                    wishapirequest = obj;
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    }
                    failureCallback.onServiceFailed(wishapirequest);
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    wishapirequest = wishapiresponse.getMessage();
                    failureCallback.onServiceFailed(wishapirequest);
                }
_L4:
                return;
_L2:
                if (successCallback == null) goto _L4; else goto _L3
_L3:
                if (removeFromCart)
                {
                    successCallback.onServiceSucceeded(null);
                    return;
                }
                break MISSING_BLOCK_LABEL_83;
                wishapirequest;
                if (failureCallback == null) goto _L4; else goto _L5
_L5:
                failureCallback.onServiceFailed(null);
                return;
                wishapirequest = new WishSignupFreeGiftCart(wishapiresponse.getData());
                successCallback.onServiceSucceeded(wishapirequest);
                return;
            }

            
            {
                this$0 = ClaimFreeSignupGiftService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                removeFromCart = flag;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(ClaimFreeSignupGiftService claimfreesignupgiftservice, WishApiRequest wishapirequest)
    {
        claimfreesignupgiftservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
