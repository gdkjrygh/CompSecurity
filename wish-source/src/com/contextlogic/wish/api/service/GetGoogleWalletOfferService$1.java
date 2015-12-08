// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetGoogleWalletOfferService

class ccessCallback
    implements WishApiCallback
{

    final GetGoogleWalletOfferService this$0;
    final erviceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetGoogleWalletOfferService.access$002(GetGoogleWalletOfferService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.erviceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetGoogleWalletOfferService.access$002(GetGoogleWalletOfferService.this, null);
        if (wishapiresponse.isErrorResponse())
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.erviceFailed();
            }
        } else
        {
            try
            {
                wishapirequest = wishapiresponse.getData().getString("gwallet_offer_text");
                if (val$successCallback != null)
                {
                    val$successCallback.onServiceSucceeded(wishapirequest);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (WishApiRequest wishapirequest)
            {
                if (val$failureCallback != null)
                {
                    val$failureCallback.erviceFailed();
                    return;
                }
            }
        }
    }

    ccessCallback()
    {
        this$0 = final_getgooglewalletofferservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
