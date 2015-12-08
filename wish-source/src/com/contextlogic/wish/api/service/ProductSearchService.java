// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class ProductSearchService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, int i, int j, WishFeedEndedButtonSpec wishfeedendedbuttonspec, String s);
    }


    private WishApiRequest apiRequest;

    public ProductSearchService()
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

    public void requestService(String s, int i, int j, boolean flag, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().productSearch(s, i, j, flag, new WishApiCallback() {

            final ProductSearchService this$0;
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
                ArrayList arraylist;
                wishapirequest = wishapiresponse.getData().getJSONArray("results");
                arraylist = new ArrayList();
                int k = 0;
_L4:
                if (k >= wishapirequest.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                arraylist.add(new WishProduct(wishapirequest.getJSONObject(k)));
                k++;
                if (true) goto _L4; else goto _L3
_L3:
                int l;
                k = wishapiresponse.getData().getInt("num_found");
                l = wishapiresponse.getData().getInt("next_offset");
                WishFeedEndedButtonSpec wishfeedendedbuttonspec;
                wishfeedendedbuttonspec = null;
                wishapirequest = wishfeedendedbuttonspec;
                if (!wishapiresponse.getData().has("banner_title"))
                {
                    break MISSING_BLOCK_LABEL_154;
                }
                wishapirequest = wishfeedendedbuttonspec;
                if (!wishapiresponse.getData().isNull("banner_title"))
                {
                    wishapirequest = wishapiresponse.getData().getString("banner_title");
                }
                Object obj;
                obj = null;
                wishfeedendedbuttonspec = obj;
                if (!wishapiresponse.getData().has("feed_ended_button_spec"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                wishapiresponse = wishapiresponse.getData().getJSONObject("feed_ended_button_spec");
                try
                {
                    wishfeedendedbuttonspec = new WishFeedEndedButtonSpec(wishapiresponse);
                }
                // Misplaced declaration of an exception variable
                catch (WishApiResponse wishapiresponse)
                {
                    wishfeedendedbuttonspec = obj;
                }
                if (successCallback == null) goto _L6; else goto _L5
_L5:
                successCallback.onServiceSucceeded(arraylist, k, l, wishfeedendedbuttonspec, wishapirequest);
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
                this$0 = ProductSearchService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(ProductSearchService productsearchservice, WishApiRequest wishapirequest)
    {
        productsearchservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
