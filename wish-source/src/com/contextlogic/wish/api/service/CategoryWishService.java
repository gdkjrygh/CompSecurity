// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.user.LoggedInUser;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class CategoryWishService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed();
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private ConcurrentHashMap apiRequestMap;

    public CategoryWishService()
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

    public void requestService(final String categoryId, boolean flag, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        successCallback = WishApi.getInstance().wishForCategory(categoryId, flag, new WishApiCallback() {

            final CategoryWishService this$0;
            final String val$categoryId;
            final FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                apiRequestMap.remove(categoryId);
                if (wishapiresponse != null && wishapiresponse.getCode() == 10)
                {
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                    }
                } else
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                apiRequestMap.remove(categoryId);
                if (wishapiresponse.isErrorResponse() && wishapiresponse.getCode() != 10)
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                    }
                } else
                {
                    LoggedInUser.getInstance().refreshProfile();
                    ApiDataChangeNotificationManager.getInstance().notifyListenersForCategoryWish(categoryId);
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded();
                        return;
                    }
                }
            }

            
            {
                this$0 = CategoryWishService.this;
                categoryId = s;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
        apiRequestMap.put(categoryId, successCallback);
    }

}
