// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartEducationModalSpec;
import com.contextlogic.wish.api.data.WishCheckoutOffer;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetCartService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo);
    }


    private WishApiRequest apiRequest;

    public GetCartService()
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

    public void requestService(final String productId, final String variationId, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getCart(productId, variationId, new WishApiCallback() {

            final GetCartService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final String val$productId;
            final SuccessCallback val$successCallback;
            final String val$variationId;

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
                WishCart wishcart;
                wishcart = new WishCart(wishapiresponse.getData().getJSONObject("cart_info"));
                if (productId == null && variationId == null)
                {
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForCartCount(wishcart.getTotalItemCount());
                }
                Object obj;
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                boolean flag;
                if (!wishapiresponse.getData().has("shipping_info"))
                {
                    break MISSING_BLOCK_LABEL_127;
                }
                flag = wishapiresponse.getData().isNull("shipping_info");
                wishapirequest = ((WishApiRequest) (obj));
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_127;
                }
                wishapirequest = new WishShippingInfo(wishapiresponse.getData().getJSONObject("shipping_info"));
_L5:
                Throwable throwable;
                throwable = null;
                obj = throwable;
                if (!wishapiresponse.getData().has("user_billing_details"))
                {
                    break MISSING_BLOCK_LABEL_181;
                }
                flag = wishapiresponse.getData().isNull("user_billing_details");
                obj = throwable;
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_181;
                }
                try
                {
                    obj = new WishUserBillingInfo(wishapiresponse.getData().getJSONObject("user_billing_details"));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = throwable;
                }
                if (!wishapiresponse.getData().has("checkout_offer"))
                {
                    break MISSING_BLOCK_LABEL_230;
                }
                flag = wishapiresponse.getData().isNull("checkout_offer");
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_230;
                }
                try
                {
                    wishcart.setCheckoutOffer(new WishCheckoutOffer(wishapiresponse.getData().getJSONObject("checkout_offer")));
                }
                // Misplaced declaration of an exception variable
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
                successCallback.onServiceSucceeded(wishcart, wishapirequest, ((WishUserBillingInfo) (obj)));
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                  goto _L4
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                  goto _L4
                wishapirequest;
                wishapirequest = ((WishApiRequest) (obj));
                  goto _L5
            }

            
            {
                this$0 = GetCartService.this;
                failureCallback = failurecallback;
                productId = s;
                variationId = s1;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetCartService getcartservice, WishApiRequest wishapirequest)
    {
        getcartservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
