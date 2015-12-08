// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetRatingPendingTransactionsService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(String s, String s1);
    }


    private WishApiRequest apiRequest;

    public GetRatingPendingTransactionsService()
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

    public void requestService(final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getRatingPendingTransactions(new WishApiCallback() {

            final GetRatingPendingTransactionsService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequest = null;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequest = null;
                if (wishapiresponse.isErrorResponse())
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                    }
                } else
                {
                    try
                    {
                        wishapiresponse = wishapiresponse.getData();
                        wishapirequest = wishapiresponse.getString("transaction_id");
                        wishapiresponse = wishapiresponse.getString("action");
                        if (successCallback != null)
                        {
                            successCallback.onServiceSucceeded(wishapirequest, wishapiresponse);
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (WishApiRequest wishapirequest)
                    {
                        if (failureCallback != null)
                        {
                            failureCallback.onServiceFailed();
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = GetRatingPendingTransactionsService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetRatingPendingTransactionsService getratingpendingtransactionsservice, WishApiRequest wishapirequest)
    {
        getratingpendingtransactionsservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
