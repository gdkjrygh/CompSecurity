// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetLoggedOutExperimentsService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(HashMap hashmap);
    }


    private WishApiRequest apiRequest;

    public GetLoggedOutExperimentsService()
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

    public void requestService(final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getFirstLaunchExperiments(new WishApiCallback() {

            final GetLoggedOutExperimentsService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
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
                boolean flag;
                wishapirequest = new HashMap();
                wishapiresponse = wishapiresponse.getData();
                if (!wishapiresponse.has("experiments"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                flag = wishapiresponse.isNull("experiments");
                if (flag)
                {
                    continue; /* Loop/switch isn't completed */
                }
                wishapiresponse = wishapiresponse.getJSONObject("experiments");
                String s;
                for (Iterator iterator = wishapiresponse.keys(); iterator.hasNext(); wishapirequest.put(s, wishapiresponse.getString(s)))
                {
                    s = (String)iterator.next();
                }

                continue; /* Loop/switch isn't completed */
                wishapiresponse;
                if (successCallback == null) goto _L4; else goto _L3
_L3:
                successCallback.onServiceSucceeded(wishapirequest);
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
                this$0 = GetLoggedOutExperimentsService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetLoggedOutExperimentsService getloggedoutexperimentsservice, WishApiRequest wishapirequest)
    {
        getloggedoutexperimentsservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
