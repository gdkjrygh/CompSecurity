// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class InitiatePayPalPaymentService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(String s);
    }


    private WishApiRequest apiRequest;

    public InitiatePayPalPaymentService()
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
        apiRequest = WishApi.getInstance().initiatePayPalPayment(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, new WishApiCallback() {

            final InitiatePayPalPaymentService this$0;
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
                if (wishapiresponse.isErrorResponse())
                {
                    if (failureCallback != null)
                    {
                        if (wishapiresponse != null)
                        {
                            wishapirequest = wishapiresponse.getMessage();
                        }
                        failureCallback.onServiceFailed(wishapirequest);
                    }
                } else
                {
                    try
                    {
                        wishapirequest = wishapiresponse.getData().getString("redirect_url");
                        if (successCallback != null)
                        {
                            successCallback.onServiceSucceeded(wishapirequest);
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed(null);
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed(null);
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = InitiatePayPalPaymentService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(InitiatePayPalPaymentService initiatepaypalpaymentservice, WishApiRequest wishapirequest)
    {
        initiatepaypalpaymentservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
