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
import com.contextlogic.wish.api.data.WishShippingInfo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class UpdateShippingInfoService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart);
    }


    private WishApiRequest apiRequest;

    public UpdateShippingInfoService()
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

    public void requestService(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().updateShippingInfo(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, new WishApiCallback() {

            final UpdateShippingInfoService this$0;
            final FailureCallback val$failureCallback;
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
                wishapirequest = null;
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    }
                    failureCallback.onServiceFailed(wishapirequest);
                }
_L4:
                return;
_L2:
                WishCart wishcart;
                wishcart = null;
                wishapirequest = wishcart;
                if (!wishapiresponse.getData().has("shipping_info"))
                {
                    break MISSING_BLOCK_LABEL_92;
                }
                wishapirequest = wishcart;
                if (!wishapiresponse.getData().isNull("shipping_info"))
                {
                    wishapirequest = new WishShippingInfo(wishapiresponse.getData().getJSONObject("shipping_info"));
                }
                boolean flag;
                wishcart = new WishCart(wishapiresponse.getData().getJSONObject("cart_info"));
                if (!wishapiresponse.getData().has("checkout_offer"))
                {
                    break MISSING_BLOCK_LABEL_157;
                }
                flag = wishapiresponse.getData().isNull("checkout_offer");
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_157;
                }
                try
                {
                    wishcart.setCheckoutOffer(new WishCheckoutOffer(wishapiresponse.getData().getJSONObject("checkout_offer")));
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
                    wishcart.setCartEducationModalSpec(new WishCartEducationModalSpec(wishapiresponse.getData().getJSONObject("cart_education_modal")));
                }
                // Misplaced declaration of an exception variable
                catch (WishApiResponse wishapiresponse) { }
                if (successCallback == null) goto _L4; else goto _L3
_L3:
                successCallback.onServiceSucceeded(wishapirequest, wishcart);
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed(null);
                    return;
                }
                continue; /* Loop/switch isn't completed */
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed(null);
                    return;
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            
            {
                this$0 = UpdateShippingInfoService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(UpdateShippingInfoService updateshippinginfoservice, WishApiRequest wishapirequest)
    {
        updateshippinginfoservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
