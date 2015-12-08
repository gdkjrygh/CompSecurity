// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import android.os.Bundle;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartEducationModalSpec;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishCheckoutOffer;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUpsellOffer;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.facebook.FacebookManager;
import com.facebook.AppEventsLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class UpdateCartService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo, WishUpsellOffer wishupselloffer);
    }


    private WishApiRequest apiRequest;

    public UpdateCartService()
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

    public void requestService(final String productId, final String variationId, int i, final boolean addToCart, String s, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().updateCart(productId, variationId, i, addToCart, s, new WishApiCallback() {

            final UpdateCartService this$0;
            final boolean val$addToCart;
            final FailureCallback val$failureCallback;
            final String val$productId;
            final SuccessCallback val$successCallback;
            final String val$variationId;

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
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    } else
                    {
                        wishapirequest = null;
                    }
                    failureCallback.onServiceFailed(wishapirequest);
                }
_L6:
                return;
_L2:
                WishCart wishcart;
                boolean flag;
                wishcart = new WishCart(wishapiresponse.getData().getJSONObject("cart_info"));
                flag = addToCart;
                Object obj;
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_202;
                }
                obj = null;
                Object obj1 = wishcart.getItems().iterator();
_L4:
                wishapirequest = ((WishApiRequest) (obj));
                if (!((Iterator) (obj1)).hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                wishapirequest = (WishCartItem)((Iterator) (obj1)).next();
                if (!wishapirequest.getProductId().equals(productId) || !wishapirequest.getVariationId().equals(variationId)) goto _L4; else goto _L3
_L3:
                if (wishapirequest == null)
                {
                    break MISSING_BLOCK_LABEL_202;
                }
                Object obj2;
                try
                {
                    obj = new Bundle();
                    ((Bundle) (obj)).putString("fb_currency", wishapirequest.getProductSubtotal().getLocalizedCurrencyCode());
                    ((Bundle) (obj)).putString("fb_content_type", "product");
                    ((Bundle) (obj)).putString("fb_content_id", productId);
                    FacebookManager.getInstance().getAppEventLogger().logEvent("fb_mobile_add_to_cart", wishapirequest.getProductSubtotal().getValue(), ((Bundle) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (WishApiRequest wishapirequest) { }
                ApiDataChangeNotificationManager.getInstance().notifyListenersForCartCount(wishcart.getTotalItemCount());
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("shipping_info"))
                {
                    break MISSING_BLOCK_LABEL_264;
                }
                flag = wishapiresponse.getData().isNull("shipping_info");
                wishapirequest = ((WishApiRequest) (obj));
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_264;
                }
                wishapirequest = new WishShippingInfo(wishapiresponse.getData().getJSONObject("shipping_info"));
_L8:
                obj1 = null;
                obj = obj1;
                if (!wishapiresponse.getData().has("user_billing_details"))
                {
                    break MISSING_BLOCK_LABEL_318;
                }
                flag = wishapiresponse.getData().isNull("user_billing_details");
                obj = obj1;
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_318;
                }
                try
                {
                    obj = new WishUserBillingInfo(wishapiresponse.getData().getJSONObject("user_billing_details"));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = obj1;
                }
                if (!wishapiresponse.getData().has("checkout_offer"))
                {
                    break MISSING_BLOCK_LABEL_367;
                }
                flag = wishapiresponse.getData().isNull("checkout_offer");
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_367;
                }
                try
                {
                    wishcart.setCheckoutOffer(new WishCheckoutOffer(wishapiresponse.getData().getJSONObject("checkout_offer")));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
                if (!wishapiresponse.getData().has("cart_education_modal"))
                {
                    break MISSING_BLOCK_LABEL_416;
                }
                flag = wishapiresponse.getData().isNull("cart_education_modal");
                if (flag)
                {
                    break MISSING_BLOCK_LABEL_416;
                }
                wishcart.setCartEducationModalSpec(new WishCartEducationModalSpec(wishapiresponse.getData().getJSONObject("cart_education_modal")));
_L7:
                obj2 = null;
                obj1 = obj2;
                if (!wishapiresponse.getData().has("upsell_products"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag = wishapiresponse.getData().isNull("upsell_products");
                obj1 = obj2;
                if (flag)
                {
                    continue; /* Loop/switch isn't completed */
                }
                try
                {
                    obj1 = new WishUpsellOffer(wishapiresponse.getData().getJSONObject("upsell_products"));
                }
                // Misplaced declaration of an exception variable
                catch (WishApiResponse wishapiresponse)
                {
                    obj1 = obj2;
                }
                if (successCallback == null) goto _L6; else goto _L5
_L5:
                successCallback.onServiceSucceeded(wishcart, wishapirequest, ((WishUserBillingInfo) (obj)), ((WishUpsellOffer) (obj1)));
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed(null);
                    return;
                }
                  goto _L6
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed(null);
                    return;
                }
                  goto _L6
                obj1;
                  goto _L7
                wishapirequest;
                wishapirequest = ((WishApiRequest) (obj));
                  goto _L8
            }

            
            {
                this$0 = UpdateCartService.this;
                failureCallback = failurecallback;
                addToCart = flag;
                productId = s;
                variationId = s1;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(UpdateCartService updatecartservice, WishApiRequest wishapirequest)
    {
        updatecartservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
