// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishRating;
import com.contextlogic.wish.api.data.WishRatingSummary;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetProductRatingsService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(WishRatingSummary wishratingsummary, ArrayList arraylist, int i, int j, boolean flag);
    }


    private WishApiRequest apiRequest;

    public GetProductRatingsService()
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
        successCallback = new WishApiCallback() {

            final GetProductRatingsService this$0;
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
_L5:
                return;
_L2:
                Object obj;
                obj = wishapiresponse.getData().getJSONArray("results");
                wishapirequest = new ArrayList();
                int k = 0;
_L4:
                int i1 = ((JSONArray) (obj)).length();
                if (k >= i1)
                {
                    break; /* Loop/switch isn't completed */
                }
                wishapirequest.add(new WishRating(((JSONArray) (obj)).getJSONObject(k)));
_L8:
                k++;
                if (true) goto _L4; else goto _L3
_L3:
                obj = new WishRatingSummary(wishapiresponse.getData().getJSONObject("product_info"));
                int l = wishapiresponse.getData().getInt("num_results");
                int j1 = wishapiresponse.getData().getInt("next_offset");
                boolean flag = wishapiresponse.getData().getBoolean("no_more_ratings");
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(((WishRatingSummary) (obj)), wishapirequest, l, j1, flag);
                    return;
                }
                  goto _L5
                wishapirequest;
_L7:
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                  goto _L5
                wishapirequest;
_L6:
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                  goto _L5
                wishapirequest;
                  goto _L6
                wishapirequest;
                  goto _L7
                ApiMalformedDataException apimalformeddataexception;
                apimalformeddataexception;
                  goto _L8
            }

            
            {
                this$0 = GetProductRatingsService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        };
        apiRequest = WishApi.getInstance().getProductRatings(s, i, j, successCallback);
    }


/*
    static WishApiRequest access$002(GetProductRatingsService getproductratingsservice, WishApiRequest wishapirequest)
    {
        getproductratingsservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
