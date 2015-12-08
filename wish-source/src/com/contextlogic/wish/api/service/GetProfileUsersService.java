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
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetProfileUsersService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag);
    }


    private WishApiRequest apiRequest;

    public GetProfileUsersService()
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

    public void requestService(String s, int i, int j, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getUserSet(s, i, j, new WishApiCallback() {

            final GetProfileUsersService this$0;
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
                JSONArray jsonarray;
                ArrayList arraylist;
                jsonarray = wishapiresponse.getData().getJSONArray("items");
                arraylist = new ArrayList();
                int k = 0;
_L4:
                WishUser wishuser;
                if (k >= jsonarray.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                wishapirequest = new WishUser(jsonarray.getJSONObject(k));
                wishuser = TransientCache.getInstance().getCachedUser(wishapirequest.getUserId());
                if (wishuser != null)
                {
                    wishapirequest = wishuser;
                }
                arraylist.add(wishapirequest);
                k++;
                if (true) goto _L4; else goto _L3
_L3:
                try
                {
                    boolean flag = wishapiresponse.getData().getBoolean("no_more");
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded(arraylist, flag);
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
                this$0 = GetProfileUsersService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetProfileUsersService getprofileusersservice, WishApiRequest wishapirequest)
    {
        getprofileusersservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
