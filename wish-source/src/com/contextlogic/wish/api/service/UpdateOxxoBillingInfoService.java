// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class UpdateOxxoBillingInfoService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishUserBillingInfo wishuserbillinginfo);
    }


    private WishApiRequest apiRequest;

    public UpdateOxxoBillingInfoService()
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

    public void requestService(String s, String s1, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().updateOxxoBillingInfo(s, s1, new WishApiCallback() {

            final UpdateOxxoBillingInfoService this$0;
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
                if (successCallback == null) goto _L4; else goto _L3
_L3:
                successCallback.onServiceSucceeded(wishapirequest);
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
                this$0 = UpdateOxxoBillingInfoService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(UpdateOxxoBillingInfoService updateoxxobillinginfoservice, WishApiRequest wishapirequest)
    {
        updateoxxobillinginfoservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
