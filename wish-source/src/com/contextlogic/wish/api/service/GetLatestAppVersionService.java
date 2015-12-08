// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetLatestAppVersionService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(String s, boolean flag);
    }


    private WishApiRequest apiRequest;

    public GetLatestAppVersionService()
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

    public void requestService(boolean flag, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getAppLatestVersion(flag, new WishApiCallback() {

            final GetLatestAppVersionService this$0;
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
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                }
_L4:
                return;
_L2:
                wishapirequest = wishapiresponse.getData().getString("version");
                wishapiresponse = WishApplication.getAppInstance().getVersionNumber();
                boolean flag1;
                boolean flag2 = false;
                flag1 = flag2;
                if (wishapiresponse == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag1 = flag2;
                if (StringUtil.compareVersionStrings(wishapirequest, wishapiresponse) > 0)
                {
                    flag1 = true;
                }
                if (successCallback == null) goto _L4; else goto _L3
_L3:
                successCallback.onServiceSucceeded(wishapirequest, flag1);
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            
            {
                this$0 = GetLatestAppVersionService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetLatestAppVersionService getlatestappversionservice, WishApiRequest wishapirequest)
    {
        getlatestappversionservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
