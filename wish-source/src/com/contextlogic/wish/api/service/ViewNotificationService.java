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

public class ViewNotificationService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private WishApiRequest apiRequest;

    public ViewNotificationService()
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

    public void requestService(int i, int j, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().viewNotification(i, j, new WishApiCallback() {

            final ViewNotificationService this$0;
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
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded();
                    return;
                }
            }

            
            {
                this$0 = ViewNotificationService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(ViewNotificationService viewnotificationservice, WishApiRequest wishapirequest)
    {
        viewnotificationservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
