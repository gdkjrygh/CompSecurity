// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserFollowingManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class FollowService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private ConcurrentHashMap apiRequestMap;

    public FollowService()
    {
        apiRequestMap = new ConcurrentHashMap();
    }

    public void cancelAllRequests()
    {
        for (Iterator iterator = apiRequestMap.entrySet().iterator(); iterator.hasNext(); ((WishApiRequest)((java.util.Map.Entry)iterator.next()).getValue()).cancel()) { }
        apiRequestMap.clear();
    }

    public boolean isPending(String s)
    {
        return apiRequestMap.containsKey(s);
    }

    public void requestService(final String userId, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        successCallback = WishApi.getInstance().followUser(userId, new WishApiCallback() {

            final FollowService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;
            final String val$userId;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequestMap.remove(userId);
                if (wishapiresponse != null && wishapiresponse.getCode() != 10 && wishapiresponse.getCode() != 11)
                {
                    if (LoggedInUser.getInstance().isLoggedIn())
                    {
                        LoggedInUser.getInstance().getFollowingManager().setFollowing(userId);
                    }
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForUserFollow(userId);
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                    }
                } else
                {
                    Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Follow, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                        return;
                    }
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequestMap.remove(userId);
                if (wishapiresponse.isErrorResponse() && wishapiresponse.getCode() != 10 && wishapiresponse.getCode() != 11)
                {
                    Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Follow, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                    }
                } else
                {
                    Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Follow, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
                    if (LoggedInUser.getInstance().isLoggedIn())
                    {
                        LoggedInUser.getInstance().getFollowingManager().setFollowing(userId);
                    }
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForUserFollow(userId);
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                        return;
                    }
                }
            }

            
            {
                this$0 = FollowService.this;
                userId = s;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
        apiRequestMap.put(userId, successCallback);
    }

}
