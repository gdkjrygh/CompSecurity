// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetBraintreeClientTokenService

class ccessCallback
    implements WishApiCallback
{

    final GetBraintreeClientTokenService this$0;
    final iceFailed val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        GetBraintreeClientTokenService.access$002(GetBraintreeClientTokenService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.iceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        GetBraintreeClientTokenService.access$002(GetBraintreeClientTokenService.this, null);
        if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
        if (val$failureCallback != null)
        {
            val$failureCallback.iceFailed();
        }
_L4:
        return;
_L2:
        try
        {
            if (val$successCallback != null)
            {
                val$successCallback.onServiceSucceeded(wishapiresponse.getData().getString("client_token"));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.iceFailed();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (WishApiRequest wishapirequest)
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.iceFailed();
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ccessCallback()
    {
        this$0 = final_getbraintreeclienttokenservice;
        val$failureCallback = ccesscallback;
        val$successCallback = ccessCallback.this;
        super();
    }
}
