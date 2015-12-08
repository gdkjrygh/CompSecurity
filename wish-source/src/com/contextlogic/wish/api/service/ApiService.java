// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.user.LoggedInUser;

public abstract class ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed();
    }


    public ApiService()
    {
    }

    public abstract void cancelAllRequests();

    protected void handleFailureResponse(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        if (wishapiresponse != null && wishapiresponse.getCode() == 2 && LoggedInUser.getInstance().isLoggedIn() && WishApi.getInstance().getConfig().hasSessionCookie())
        {
            ApiDataChangeNotificationManager.getInstance().notifyListenersForLogoutRequired();
        }
    }
}
