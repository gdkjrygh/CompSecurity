// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishBrandFilter;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishMerchant;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetMerchantFeedService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag, int i, WishFeedEndedButtonSpec wishfeedendedbuttonspec, String s, WishMerchant wishmerchant);
    }


    private WishApiRequest apiRequest;

    public GetMerchantFeedService()
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

    public void requestService(WishBrandFilter wishbrandfilter, int i, int j, ArrayList arraylist, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        WishApi wishapi = WishApi.getInstance();
        String s = wishbrandfilter.getQuery();
        String s1 = wishbrandfilter.getTag();
        if (i == 0)
        {
            wishbrandfilter = wishbrandfilter.getProducts();
        } else
        {
            wishbrandfilter = null;
        }
        apiRequest = wishapi.getMerchantFeed(i, j, s, s1, wishbrandfilter, arraylist, new WishApiCallback() {

            final GetMerchantFeedService this$0;
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
                ArrayList arraylist1;
                wishapirequest = wishapiresponse.getData().getJSONArray("results");
                arraylist1 = new ArrayList();
                int k = 0;
_L4:
                if (k >= wishapirequest.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                arraylist1.add(new WishProduct(wishapirequest.getJSONObject(k)));
                k++;
                if (true) goto _L4; else goto _L3
_L3:
                boolean flag;
                flag = wishapiresponse.getData().getBoolean("feed_ended");
                k = wishapiresponse.getData().getInt("next_offset");
                Object obj;
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("banner_title"))
                {
                    break MISSING_BLOCK_LABEL_154;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("banner_title"))
                {
                    wishapirequest = wishapiresponse.getData().getString("banner_title");
                }
                WishMerchant wishmerchant;
                wishmerchant = null;
                obj = wishmerchant;
                if (!wishapiresponse.getData().has("feed_ended_button_spec"))
                {
                    break MISSING_BLOCK_LABEL_191;
                }
                obj = wishapiresponse.getData().getJSONObject("feed_ended_button_spec");
                Object obj1;
                try
                {
                    obj = new WishFeedEndedButtonSpec(((JSONObject) (obj)));
                }
                catch (Throwable throwable)
                {
                    throwable = wishmerchant;
                }
                obj1 = null;
                wishmerchant = obj1;
                if (!wishapiresponse.getData().has("merchant_info"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                wishapiresponse = wishapiresponse.getData().getJSONObject("merchant_info");
                try
                {
                    wishmerchant = new WishMerchant(wishapiresponse);
                }
                // Misplaced declaration of an exception variable
                catch (WishApiResponse wishapiresponse)
                {
                    wishmerchant = obj1;
                }
                if (successCallback == null) goto _L6; else goto _L5
_L5:
                successCallback.onServiceSucceeded(arraylist1, flag, k, ((WishFeedEndedButtonSpec) (obj)), wishapirequest, wishmerchant);
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                continue; /* Loop/switch isn't completed */
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                if (true) goto _L6; else goto _L7
_L7:
            }

            
            {
                this$0 = GetMerchantFeedService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetMerchantFeedService getmerchantfeedservice, WishApiRequest wishapirequest)
    {
        getmerchantfeedservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
