// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishPushPreference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetPushPreferencesService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist);
    }


    private WishApiRequest apiRequest;

    public GetPushPreferencesService()
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
        apiRequest = WishApi.getInstance().getPushPreferences(new WishApiCallback() {

            final GetPushPreferencesService this$0;
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
_L6:
                return;
_L2:
                wishapirequest = wishapiresponse.getData().getJSONArray("preferences");
                wishapiresponse = new ArrayList();
                int i = 0;
_L4:
                if (i >= wishapirequest.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                wishapiresponse.add(new WishPushPreference(wishapirequest.getJSONObject(i)));
                i++;
                if (true) goto _L4; else goto _L3
_L3:
                try
                {
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded(wishapiresponse);
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
                // Misplaced declaration of an exception variable
                catch (WishApiRequest wishapirequest)
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                        return;
                    }
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = GetPushPreferencesService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetPushPreferencesService getpushpreferencesservice, WishApiRequest wishapirequest)
    {
        getpushpreferencesservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
