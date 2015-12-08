// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
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
//            PreVerifyPayPalPaymentService

class ccessCallback
    implements WishApiCallback
{

    final PreVerifyPayPalPaymentService this$0;
    final ilureCallback val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        Object obj = null;
        handleFailureResponse(wishapirequest, wishapiresponse);
        PreVerifyPayPalPaymentService.access$002(PreVerifyPayPalPaymentService.this, null);
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
        wishapirequest = null;
        PreVerifyPayPalPaymentService.access$002(PreVerifyPayPalPaymentService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            if (wishapiresponse != null)
            {
                wishapirequest = wishapiresponse.getMessage();
            }
            val$failureCallback.onServiceFailed(wishapirequest);
        }
_L4:
        return;
_L2:
        Object obj;
        Throwable throwable;
        WishCart wishcart;
        boolean flag;
        try
        {
            wishcart = new WishCart(wishapiresponse.getData().getJSONObject("cart_info"));
            ApiDataChangeNotificationManager.getInstance().notifyListenersForCartCount(wishcart.getTotalItemCount());
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            val$successCallback.onServiceSucceeded(null, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            val$successCallback.onServiceSucceeded(null, null, null);
            return;
        }
        obj = null;
        wishapirequest = ((WishApiRequest) (obj));
        if (!wishapiresponse.getData().has("shipping_info"))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        flag = wishapiresponse.getData().isNull("shipping_info");
        wishapirequest = ((WishApiRequest) (obj));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        wishapirequest = new WishShippingInfo(wishapiresponse.getData().getJSONObject("shipping_info"));
_L5:
        throwable = null;
        obj = throwable;
        if (!wishapiresponse.getData().has("user_billing_details"))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        flag = wishapiresponse.getData().isNull("user_billing_details");
        obj = throwable;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_179;
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
            break MISSING_BLOCK_LABEL_228;
        }
        flag = wishapiresponse.getData().isNull("checkout_offer");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_228;
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
        if (val$successCallback == null) goto _L4; else goto _L3
_L3:
        val$successCallback.onServiceSucceeded(wishcart, wishapirequest, ((WishUserBillingInfo) (obj)));
        return;
        wishapirequest;
        wishapirequest = ((WishApiRequest) (obj));
          goto _L5
    }

    ccessCallback()
    {
        this$0 = final_preverifypaypalpaymentservice;
        val$failureCallback = ilurecallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
