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

public class CompleteFuturePayPalPaymentService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s, boolean flag);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(String s);
    }


    private WishApiRequest apiRequest;

    public CompleteFuturePayPalPaymentService()
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

    public void requestService(String s, String s1, String s2, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().initiatePayPalBraintreePayment(null, s, s1, s2, new WishApiCallback() {

            final CompleteFuturePayPalPaymentService this$0;
            final FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
label0:
                {
                    boolean flag;
label1:
                    {
                        Object obj = null;
                        boolean flag1 = false;
                        handleFailureResponse(wishapirequest, wishapiresponse);
                        apiRequest = null;
                        if (failureCallback == null)
                        {
                            break label0;
                        }
                        wishapirequest = obj;
                        if (wishapiresponse != null)
                        {
                            wishapirequest = wishapiresponse.getMessage();
                        }
                        flag = flag1;
                        if (wishapiresponse == null)
                        {
                            break label1;
                        }
                        if (wishapiresponse.getCode() != 22)
                        {
                            flag = flag1;
                            if (wishapiresponse.getCode() != 21)
                            {
                                break label1;
                            }
                        }
                        flag = true;
                    }
                    failureCallback.onServiceFailed(wishapirequest, flag);
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                boolean flag1;
                wishapirequest = null;
                flag1 = false;
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
label0:
                {
                    boolean flag;
label1:
                    {
                        if (failureCallback == null)
                        {
                            break label0;
                        }
                        if (wishapiresponse != null)
                        {
                            wishapirequest = wishapiresponse.getMessage();
                        }
                        flag = flag1;
                        if (wishapiresponse == null)
                        {
                            break label1;
                        }
                        if (wishapiresponse.getCode() != 22)
                        {
                            flag = flag1;
                            if (wishapiresponse.getCode() != 21)
                            {
                                break label1;
                            }
                        }
                        flag = true;
                    }
                    failureCallback.onServiceFailed(wishapirequest, flag);
                }
_L4:
                return;
_L2:
                try
                {
                    wishapirequest = wishapiresponse.getData().getString("transaction_id");
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
                        failureCallback.onServiceFailed(null, false);
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (WishApiRequest wishapirequest)
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed(null, false);
                        return;
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = CompleteFuturePayPalPaymentService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(CompleteFuturePayPalPaymentService completefuturepaypalpaymentservice, WishApiRequest wishapirequest)
    {
        completefuturepaypalpaymentservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
