// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.util.StringUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class RecommendProductService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, ArrayList arraylist1, WishCredit wishcredit, WishProduct wishproduct);
    }


    private WishApiRequest apiRequest;

    public RecommendProductService()
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

    public void requestService(final String productId, List list, List list1, String s, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        String s1 = String.format("https://%s/c/%s?recommended_by=%s", new Object[] {
            WishApi.getInstance().getConfig().getApiBaseUrlString(), productId, LoggedInUser.getInstance().getCurrentUser().getUserId()
        });
        apiRequest = WishApi.getInstance().recommendProduct(productId, list, list1, s, s1, new WishApiCallback() {

            final RecommendProductService this$0;
            final ApiService.FailureCallback val$failureCallback;
            final String val$productId;
            final SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                handleFailureResponse(wishapirequest, wishapiresponse);
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RecommendProduct, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
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
_L10:
                return;
_L2:
                ArrayList arraylist;
                wishapirequest = wishapiresponse.getData().getJSONArray("fb_uids");
                arraylist = new ArrayList();
                int i = 0;
_L11:
                if (i >= wishapirequest.length()) goto _L4; else goto _L3
_L3:
                Object obj = StringUtil.ensureString(wishapirequest.get(i));
                if (obj == null) goto _L6; else goto _L5
_L5:
                arraylist.add(obj);
                  goto _L6
_L4:
                ArrayList arraylist1 = new ArrayList();
                if (!wishapiresponse.getData().has("google_plus_ids")) goto _L8; else goto _L7
_L7:
                wishapirequest = wishapiresponse.getData().getJSONArray("google_plus_ids");
                i = 0;
_L12:
                if (i >= wishapirequest.length()) goto _L8; else goto _L9
_L9:
                obj = StringUtil.ensureString(wishapirequest.get(i));
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_370;
                }
                Object obj1;
                int j;
                try
                {
                    arraylist1.add(obj);
                    break MISSING_BLOCK_LABEL_370;
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
                  goto _L10
_L8:
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("credit"))
                {
                    break MISSING_BLOCK_LABEL_202;
                }
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().isNull("credit"))
                {
                    wishapirequest = new WishCredit(wishapiresponse.getData().getJSONObject("credit"));
                }
                i = arraylist.size();
                j = arraylist1.size();
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.RecommendProduct, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Success, i + j);
                obj1 = null;
                obj = obj1;
                if (!wishapiresponse.getData().has("product"))
                {
                    break MISSING_BLOCK_LABEL_286;
                }
                obj = obj1;
                if (!wishapiresponse.getData().isNull("product"))
                {
                    obj = new WishProduct(wishapiresponse.getData().getJSONObject("product"));
                }
                ApiDataChangeNotificationManager.getInstance().notifyListenersForProductRecommendation(productId, arraylist, arraylist1, wishapirequest, ((WishProduct) (obj)));
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(arraylist, arraylist1, wishapirequest, ((WishProduct) (obj)));
                    return;
                }
                  goto _L10
_L6:
                i++;
                  goto _L11
                i++;
                  goto _L12
            }

            
            {
                this$0 = RecommendProductService.this;
                failureCallback = failurecallback;
                productId = s;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(RecommendProductService recommendproductservice, WishApiRequest wishapirequest)
    {
        recommendproductservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
