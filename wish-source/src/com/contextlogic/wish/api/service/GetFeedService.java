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
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetFeedService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, String s, boolean flag, WishFeedPromotionItem wishfeedpromotionitem, int i, int j, WishFeedEndedButtonSpec wishfeedendedbuttonspec, 
                String s1);
    }


    private WishApiRequest apiRequest;

    public GetFeedService()
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

    public void requestService(int i, int j, boolean flag, boolean flag1, ArrayList arraylist, String s, String s1, 
            final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getFeed(i, j, flag, flag1, arraylist, s, s1, new WishApiCallback() {

            final GetFeedService this$0;
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
_L9:
                return;
_L2:
                ArrayList arraylist1;
                wishapirequest = wishapiresponse.getData().getJSONArray("items");
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
                boolean flag2 = wishapiresponse.getData().getBoolean("feed_ended");
                Object obj;
                wishapirequest = null;
                obj = wishapirequest;
                if (!wishapiresponse.getData().has("tag"))
                {
                    break MISSING_BLOCK_LABEL_143;
                }
                obj = wishapirequest;
                if (!wishapiresponse.getData().isNull("tag"))
                {
                    obj = wishapiresponse.getData().getString("tag");
                }
                Object obj1;
                wishapirequest = null;
                obj1 = wishapirequest;
                if (!wishapiresponse.getData().has("banner_title"))
                {
                    break MISSING_BLOCK_LABEL_186;
                }
                obj1 = wishapirequest;
                if (!wishapiresponse.getData().isNull("banner_title"))
                {
                    obj1 = wishapiresponse.getData().getString("banner_title");
                }
                wishapirequest = null;
                Object obj2;
                if (!wishapiresponse.getData().has("promotion_banner"))
                {
                    break MISSING_BLOCK_LABEL_234;
                }
                obj2 = new WishFeedPromotionItem(wishapiresponse.getData().getJSONObject("promotion_banner"));
                wishapirequest = ((WishApiRequest) (obj2));
                if (((WishFeedPromotionItem) (obj2)).getDisplayMode() == com.contextlogic.wish.api.data.WishFeedPromotionItem.FeedPromotionItemDisplayMode.Unknown)
                {
                    wishapirequest = null;
                }
                int i1;
                i1 = 0;
                k = 0;
                if (!wishapiresponse.getData().has("promotion_tiles")) goto _L6; else goto _L5
_L5:
                obj2 = wishapiresponse.getData().getJSONArray("promotion_tiles");
                int l = 0;
_L10:
                i1 = k;
                if (l >= ((JSONArray) (obj2)).length()) goto _L6; else goto _L7
_L7:
                WishFeedPromotionItem wishfeedpromotionitem = new WishFeedPromotionItem(((JSONArray) (obj2)).getJSONObject(l));
                i1 = k;
                if (wishfeedpromotionitem.getDisplayMode() != com.contextlogic.wish.api.data.WishFeedPromotionItem.FeedPromotionItemDisplayMode.Tile)
                {
                    break MISSING_BLOCK_LABEL_453;
                }
                arraylist1.add(wishfeedpromotionitem);
                i1 = k + 1;
                break MISSING_BLOCK_LABEL_453;
_L6:
                k = wishapiresponse.getData().getInt("next_offset");
                wishfeedpromotionitem = null;
                obj2 = wishfeedpromotionitem;
                if (!wishapiresponse.getData().has("feed_ended_button_spec"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                wishapiresponse = wishapiresponse.getData().getJSONObject("feed_ended_button_spec");
                try
                {
                    obj2 = new WishFeedEndedButtonSpec(wishapiresponse);
                }
                // Misplaced declaration of an exception variable
                catch (WishApiResponse wishapiresponse)
                {
                    obj2 = wishfeedpromotionitem;
                }
                if (successCallback == null) goto _L9; else goto _L8
_L8:
                successCallback.onServiceSucceeded(arraylist1, ((String) (obj)), flag2, wishapirequest, i1, k, ((WishFeedEndedButtonSpec) (obj2)), ((String) (obj1)));
                return;
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                  goto _L9
                wishapirequest;
                if (failureCallback != null)
                {
                    failureCallback.onServiceFailed();
                    return;
                }
                  goto _L9
                l++;
                k = i1;
                  goto _L10
            }

            
            {
                this$0 = GetFeedService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetFeedService getfeedservice, WishApiRequest wishapirequest)
    {
        getfeedservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
