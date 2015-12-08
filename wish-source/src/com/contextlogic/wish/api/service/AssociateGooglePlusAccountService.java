// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import android.os.AsyncTask;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.google.android.gms.auth.GoogleAuthUtil;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class AssociateGooglePlusAccountService extends ApiService
{
    private class AsyncAccessTokenOperation extends AsyncTask
    {

        private FailureCallback failureCallback;
        private String googlePlusId;
        private SuccessCallback successCallback;
        final AssociateGooglePlusAccountService this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            avoid = null;
            String s = GoogleAuthUtil.getToken(WishApplication.getAppInstance(), GooglePlusManager.getInstance().getAccountName(), GooglePlusManager.getInstance().getScopeString());
            avoid = s;
            Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.GooglePlusLoginPrestep, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
            avoid = s;
_L6:
            if (isCancelled())
            {
                return null;
            }
            if (avoid == null) goto _L2; else goto _L1
_L1:
            requestService(googlePlusId, avoid, GooglePlusManager.getInstance().getAccountName(), successCallback, failureCallback);
_L4:
            accessTokenOperation = null;
            return null;
_L2:
            if (failureCallback != null)
            {
                failureCallback.onServiceFailed(null);
            }
            if (true) goto _L4; else goto _L3
_L3:
            Throwable throwable;
            throwable;
            if (true) goto _L6; else goto _L5
_L5:
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
        }

        protected void onPreExecute()
        {
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        public AsyncAccessTokenOperation(String s, SuccessCallback successcallback, FailureCallback failurecallback)
        {
            this$0 = AssociateGooglePlusAccountService.this;
            super();
            googlePlusId = s;
            successCallback = successcallback;
            failureCallback = failurecallback;
        }
    }

    public static interface FailureCallback
    {

        public abstract void onServiceFailed(String s);
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private AsyncAccessTokenOperation accessTokenOperation;
    private WishApiRequest apiRequest;

    public AssociateGooglePlusAccountService()
    {
    }

    public void cancelAllRequests()
    {
        if (apiRequest != null)
        {
            apiRequest.cancel();
            apiRequest = null;
        }
        if (accessTokenOperation != null)
        {
            accessTokenOperation.cancel(true);
            accessTokenOperation = null;
        }
    }

    public boolean isPending()
    {
        return apiRequest != null || accessTokenOperation != null;
    }

    public void requestService(String s, String s1, SuccessCallback successcallback, FailureCallback failurecallback)
    {
        cancelAllRequests();
        accessTokenOperation = new AsyncAccessTokenOperation(s, successcallback, failurecallback);
        accessTokenOperation.execute(new Void[0]);
    }

    public void requestService(String s, String s1, String s2, final SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().associateGooglePlusAccount(s, s1, s2, new WishApiCallback() {

            final AssociateGooglePlusAccountService this$0;
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
                this$0 = AssociateGooglePlusAccountService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(AssociateGooglePlusAccountService associategoogleplusaccountservice, WishApiRequest wishapirequest)
    {
        associategoogleplusaccountservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/


/*
    static AsyncAccessTokenOperation access$102(AssociateGooglePlusAccountService associategoogleplusaccountservice, AsyncAccessTokenOperation asyncaccesstokenoperation)
    {
        associategoogleplusaccountservice.accessTokenOperation = asyncaccesstokenoperation;
        return asyncaccesstokenoperation;
    }

*/
}
