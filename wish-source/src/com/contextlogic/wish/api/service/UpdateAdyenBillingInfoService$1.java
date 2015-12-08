// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            UpdateAdyenBillingInfoService

class ccessCallback
    implements WishApiCallback
{

    final UpdateAdyenBillingInfoService this$0;
    final ilureCallback val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        Object obj = null;
        handleFailureResponse(wishapirequest, wishapiresponse);
        UpdateAdyenBillingInfoService.access$002(UpdateAdyenBillingInfoService.this, null);
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
        UpdateAdyenBillingInfoService.access$002(UpdateAdyenBillingInfoService.this, null);
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
        obj = null;
        wishapirequest = obj;
        if (!wishapiresponse.getData().has("user_billing_details"))
        {
            continue; /* Loop/switch isn't completed */
        }
        wishapirequest = obj;
        if (!wishapiresponse.getData().isNull("user_billing_details"))
        {
            wishapirequest = new WishUserBillingInfo(wishapiresponse.getData().getJSONObject("user_billing_details"));
        }
        if (val$successCallback == null) goto _L4; else goto _L3
_L3:
        val$successCallback.onServiceSucceeded(wishapirequest);
        return;
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed(null);
            return;
        }
        continue; /* Loop/switch isn't completed */
        wishapirequest;
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed(null);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    ccessCallback()
    {
        this$0 = final_updateadyenbillinginfoservice;
        val$failureCallback = ilurecallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
