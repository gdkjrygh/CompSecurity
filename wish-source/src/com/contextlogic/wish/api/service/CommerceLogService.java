// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class CommerceLogService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private WishApiRequest apiRequest;

    public CommerceLogService()
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

    public void requestService(boolean flag, int i, int j, HashMap hashmap, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        Object obj;
        Object obj1;
        cancelAllRequests();
        obj1 = null;
        obj = obj1;
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (hashmap.size() <= 0) goto _L2; else goto _L3
_L3:
        obj = new JSONObject();
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); ((JSONObject) (obj)).put((String)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

          goto _L4
_L2:
        apiRequest = WishApi.getInstance().logCommerceAction(flag, i, j, ((String) (obj)), new WishApiCallback() {

            final CommerceLogService this$0;
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
                this$0 = CommerceLogService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
        return;
_L4:
        try
        {
            obj = ((JSONObject) (obj)).toString();
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            obj = obj1;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }


/*
    static WishApiRequest access$002(CommerceLogService commercelogservice, WishApiRequest wishapirequest)
    {
        commercelogservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
