// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.Collection;
import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.WishFilter;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishPromoBannerSpec;
import com.contextlogic.wish.api.data.WishWishLookBannerSpec;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetFilteredFeedService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, ArrayList arraylist1, int i, boolean flag, DealDashInfo dealdashinfo, WishWishLookBannerSpec wishwishlookbannerspec, WishPromoBannerSpec wishpromobannerspec, 
                ArrayList arraylist2);
    }


    private WishApiRequest apiRequest;

    public GetFilteredFeedService()
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

    public void requestService(int i, int j, boolean flag, String s, ArrayList arraylist, boolean flag1, final SuccessCallback successCallback, 
            final ApiService.FailureCallback failureCallback)
    {
        ArrayList arraylist1 = new ArrayList();
        if (arraylist != null && arraylist.size() > 0)
        {
            for (arraylist = arraylist.iterator(); arraylist.hasNext(); arraylist1.add(((WishFilter)arraylist.next()).getFilterId())) { }
        }
        cancelAllRequests();
        apiRequest = WishApi.getInstance().getFilteredFeed(s, arraylist1, flag, i, j, flag1, new WishApiCallback() {

            final GetFilteredFeedService this$0;
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
_L14:
                return;
_L2:
                ArrayList arraylist2 = new ArrayList();
                if (!wishapiresponse.getData().has("products") || wishapiresponse.getData().isNull("products")) goto _L4; else goto _L3
_L3:
                wishapirequest = wishapiresponse.getData().getJSONArray("products");
                int k = 0;
_L5:
                if (k >= wishapirequest.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                arraylist2.add(new WishProduct(wishapirequest.getJSONObject(k)));
                k++;
                if (true) goto _L5; else goto _L4
_L4:
                ArrayList arraylist3 = new ArrayList();
                if (!wishapiresponse.getData().has("featured_product_collections") || wishapiresponse.getData().isNull("featured_product_collections")) goto _L7; else goto _L6
_L6:
                wishapirequest = wishapiresponse.getData().getJSONArray("featured_product_collections");
                k = 0;
_L8:
                if (k >= wishapirequest.length())
                {
                    break; /* Loop/switch isn't completed */
                }
                arraylist3.add(new Collection(wishapirequest.getJSONObject(k)));
                k++;
                if (true) goto _L8; else goto _L7
_L7:
                Object obj;
                obj = null;
                wishapirequest = ((WishApiRequest) (obj));
                if (!wishapiresponse.getData().has("categories")) goto _L10; else goto _L9
_L9:
                wishapirequest = ((WishApiRequest) (obj));
                if (wishapiresponse.getData().isNull("categories")) goto _L10; else goto _L11
_L11:
                Object obj1;
                obj = new ArrayList();
                obj1 = wishapiresponse.getData().getJSONArray("categories");
                k = 0;
_L12:
                wishapirequest = ((WishApiRequest) (obj));
                if (k >= ((JSONArray) (obj1)).length())
                {
                    break; /* Loop/switch isn't completed */
                }
                ((ArrayList) (obj)).add(new WishFilter(((JSONArray) (obj1)).getJSONObject(k)));
                k++;
                if (true) goto _L12; else goto _L10
_L10:
                obj1 = null;
                obj = obj1;
                if (!wishapiresponse.getData().has("deal_dash_info"))
                {
                    break MISSING_BLOCK_LABEL_341;
                }
                obj = obj1;
                if (!wishapiresponse.getData().isNull("deal_dash_info"))
                {
                    obj = new DealDashInfo(wishapiresponse.getData().getJSONObject("deal_dash_info"));
                }
                WishPromoBannerSpec wishpromobannerspec;
                wishpromobannerspec = null;
                obj1 = wishpromobannerspec;
                if (!wishapiresponse.getData().has("wishlook_banner_spec"))
                {
                    break MISSING_BLOCK_LABEL_394;
                }
                obj1 = wishpromobannerspec;
                if (!wishapiresponse.getData().isNull("wishlook_banner_spec"))
                {
                    obj1 = new WishWishLookBannerSpec(wishapiresponse.getData().getJSONObject("wishlook_banner_spec"));
                }
                Object obj2;
                obj2 = null;
                wishpromobannerspec = obj2;
                if (!wishapiresponse.getData().has("promo_banner_spec"))
                {
                    break MISSING_BLOCK_LABEL_447;
                }
                wishpromobannerspec = obj2;
                if (!wishapiresponse.getData().isNull("promo_banner_spec"))
                {
                    wishpromobannerspec = new WishPromoBannerSpec(wishapiresponse.getData().getJSONObject("promo_banner_spec"));
                }
                int l = wishapiresponse.getData().getInt("next_offset");
                boolean flag2 = wishapiresponse.getData().getBoolean("no_more_items");
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(arraylist2, wishapirequest, l, flag2, ((DealDashInfo) (obj)), ((WishWishLookBannerSpec) (obj1)), wishpromobannerspec, arraylist3);
                    return;
                }
                continue; /* Loop/switch isn't completed */
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
                if (true) goto _L14; else goto _L13
_L13:
            }

            
            {
                this$0 = GetFilteredFeedService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetFilteredFeedService getfilteredfeedservice, WishApiRequest wishapirequest)
    {
        getfilteredfeedservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
