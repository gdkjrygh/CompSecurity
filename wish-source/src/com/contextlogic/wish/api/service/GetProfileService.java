// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetProfileService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishUser wishuser);
    }


    private WishApiRequest apiRequest;

    public GetProfileService()
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

    public void requestService(String s, boolean flag, SuccessCallback successcallback, ApiService.FailureCallback failurecallback)
    {
        requestService(s, false, flag, successcallback, failurecallback);
    }

    public void requestService(String s, final boolean forceLoggedInUser, boolean flag, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getProfile(s, flag, 4, new WishApiCallback() {

            final GetProfileService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final boolean val$forceLoggedInUser;
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
                    try
                    {
                        wishapirequest = new WishUser(wishapiresponse.getData(), forceLoggedInUser);
                        TransientCache.getInstance().cacheUser(wishapirequest);
                        if (LoggedInUser.getInstance().isLoggedIn() && wishapirequest.getUserId() != null && LoggedInUser.getInstance().getCurrentUser().getUserId().equals(wishapirequest.getUserId()))
                        {
                            LoggedInUser.getInstance().setCurrentUser(wishapirequest);
                        }
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
                            failureCallback.onServiceFailed();
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = GetProfileService.this;
                failureCallback = failurecallback;
                forceLoggedInUser = flag;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetProfileService getprofileservice, WishApiRequest wishapirequest)
    {
        getprofileservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
