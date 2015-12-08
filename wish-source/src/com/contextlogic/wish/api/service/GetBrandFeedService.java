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
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetBrandFeedService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag, int i, WishCredit wishcredit, String s, String s1, WishFeedEndedButtonSpec wishfeedendedbuttonspec, 
                String s2);
    }


    private WishApiRequest apiRequest;

    public GetBrandFeedService()
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

    public void requestService(WishBrandFilter wishbrandfilter, int i, int j, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        WishApi wishapi = WishApi.getInstance();
        String s1 = wishbrandfilter.getQuery();
        String s2 = wishbrandfilter.getPrice();
        String s3 = wishbrandfilter.getTag();
        String s;
        if (i == 0)
        {
            s = wishbrandfilter.getProducts();
        } else
        {
            s = null;
        }
        apiRequest = wishapi.getBrandFeed(i, j, s1, s2, s3, s, wishbrandfilter.isCommerce(), wishbrandfilter.getCredit(), new WishApiCallback() {

            final GetBrandFeedService this$0;
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
_L8:
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
                Object obj1;
                obj1 = null;
                obj = obj1;
                if (!wishapiresponse.getData().has("credit"))
                {
                    break; /* Loop/switch isn't completed */
                }
                obj = obj1;
                Object obj2;
                if (wishapiresponse.getData().isNull("credit"))
                {
                    break; /* Loop/switch isn't completed */
                }
                obj1 = new WishCredit(wishapiresponse.getData().getJSONObject("credit"));
                obj2 = arraylist.iterator();
_L6:
                obj = obj1;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                obj = ((Iterator) (obj2)).next();
                if (obj instanceof WishProduct)
                {
                    ((WishProduct)obj).setCreditId(((WishCredit) (obj1)).getCreditId());
                }
                if (true) goto _L6; else goto _L5
_L5:
                break; /* Loop/switch isn't completed */
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                if (true) goto _L8; else goto _L7
_L7:
                obj1 = null;
                if (wishapiresponse.getData().has("recommend_widget_tag"))
                {
                    obj1 = wishapiresponse.getData().getString("recommend_widget_tag");
                }
                obj2 = null;
                if (wishapiresponse.getData().has("recommend_widget_fb_message"))
                {
                    obj2 = wishapiresponse.getData().getString("recommend_widget_fb_message");
                }
                WishFeedEndedButtonSpec wishfeedendedbuttonspec;
                Object obj3;
                obj3 = null;
                wishfeedendedbuttonspec = obj3;
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
                    wishfeedendedbuttonspec = obj3;
                }
                if (successCallback == null) goto _L8; else goto _L9
_L9:
                successCallback.onServiceSucceeded(arraylist, flag, k, ((WishCredit) (obj)), ((String) (obj1)), ((String) (obj2)), wishfeedendedbuttonspec, wishapirequest);
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                if (true) goto _L8; else goto _L10
_L10:
            }

            
            {
                this$0 = GetBrandFeedService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetBrandFeedService getbrandfeedservice, WishApiRequest wishapirequest)
    {
        getbrandfeedservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
