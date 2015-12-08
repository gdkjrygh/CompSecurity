// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartEducationModalSpec;
import com.contextlogic.wish.api.data.WishCheckoutOffer;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            CartAbandonOfferClaimService

class ccessCallback
    implements WishApiCallback
{

    final CartAbandonOfferClaimService this$0;
    final rviceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        CartAbandonOfferClaimService.access$002(CartAbandonOfferClaimService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.rviceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        CartAbandonOfferClaimService.access$002(CartAbandonOfferClaimService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.rviceFailed();
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
        if (val$successCallback == null) goto _L4; else goto _L3
_L3:
        val$successCallback.onServiceSucceeded(wishapirequest);
        return;
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.rviceFailed();
            return;
        }
        continue; /* Loop/switch isn't completed */
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.rviceFailed();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    ccessCallback()
    {
        this$0 = final_cartabandonofferclaimservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
