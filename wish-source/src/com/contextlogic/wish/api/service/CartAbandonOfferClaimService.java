// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartEducationModalSpec;
import com.contextlogic.wish.api.data.WishCheckoutOffer;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class CartAbandonOfferClaimService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishCart wishcart);
    }


    private WishApiRequest apiRequest;

    public CartAbandonOfferClaimService()
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

    public void requestService(String s, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().claimCartAbandonOffer(s, new WishApiCallback() {

            final CartAbandonOfferClaimService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequest = null;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
_L4:
                return;
_L2:
                boolean flag;
                wishapirequest = new WishCart(wishapiresponse.getData().getJSONObject("cart_info"));
                if (!wishapiresponse.getData().has("checkout_offer"))
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                flag = wishapiresponse.getData().isNull("checkout_offer");
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                try
                {
                    wishapirequest.setCheckoutOffer(new WishCheckoutOffer(wishapiresponse.getData().getJSONObject("checkout_offer")));
                }
                catch (Throwable throwable) { }
                if (!wishapiresponse.getData().has("cart_education_modal"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag = wishapiresponse.getData().isNull("cart_education_modal");
                if (flag)
                {
                    continue; /* Loop/switch isn't completed */
                }
                try
                {
                    wishapirequest.setCartEducationModalSpec(new WishCartEducationModalSpec(wishapiresponse.getData().getJSONObject("cart_education_modal")));
                }
                // Misplaced declaration of an exception variable
                catch (WishApiResponse wishapiresponse) { }
                if (successCallback == null) goto _L4; else goto _L3
_L3:
                successCallback.onServiceSucceeded(wishapirequest);
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                continue; /* Loop/switch isn't completed */
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            
            {
                this$0 = CartAbandonOfferClaimService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(CartAbandonOfferClaimService cartabandonofferclaimservice, WishApiRequest wishapirequest)
    {
        cartabandonofferclaimservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
