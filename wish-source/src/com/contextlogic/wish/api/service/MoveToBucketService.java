// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class MoveToBucketService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private WishApiRequest apiRequest;

    public MoveToBucketService()
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

    public void requestService(String s, String s1, String s2, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().moveToBucket(s, s1, s2, new WishApiCallback() {

            final MoveToBucketService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
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
                    LoggedInUser.getInstance().refreshProfile();
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                        return;
                    }
                }
            }

            
            {
                this$0 = MoveToBucketService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(MoveToBucketService movetobucketservice, WishApiRequest wishapirequest)
    {
        movetobucketservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
