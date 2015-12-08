// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class AssociateFacebookAccountService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private WishApiRequest apiRequest;

    public AssociateFacebookAccountService()
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

    public void requestService(String s, String s1, long l, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().associateFacebookAccount(s, s1, l, new WishApiCallback() {

            final AssociateFacebookAccountService this$0;
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
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded();
                    return;
                }
            }

            
            {
                this$0 = AssociateFacebookAccountService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(AssociateFacebookAccountService associatefacebookaccountservice, WishApiRequest wishapirequest)
    {
        associatefacebookaccountservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
