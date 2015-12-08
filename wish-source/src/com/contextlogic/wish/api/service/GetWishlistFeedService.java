// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GetWishlistFeedService extends ApiService
{
    public static final class REQUEST_SOURCE extends Enum
    {

        private static final REQUEST_SOURCE $VALUES[];
        public static final REQUEST_SOURCE FEED;
        public static final REQUEST_SOURCE MENU;

        public static REQUEST_SOURCE valueOf(String s)
        {
            return (REQUEST_SOURCE)Enum.valueOf(com/contextlogic/wish/api/service/GetWishlistFeedService$REQUEST_SOURCE, s);
        }

        public static REQUEST_SOURCE[] values()
        {
            return (REQUEST_SOURCE[])$VALUES.clone();
        }

        static 
        {
            FEED = new REQUEST_SOURCE("FEED", 0);
            MENU = new REQUEST_SOURCE("MENU", 1);
            $VALUES = (new REQUEST_SOURCE[] {
                FEED, MENU
            });
        }

        private REQUEST_SOURCE(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag, int i);
    }


    private WishApiRequest apiRequest;

    public GetWishlistFeedService()
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

    public void requestService(int i, int j, String s, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        apiRequest = WishApi.getInstance().getWishlistFeed(i, j, s, new WishApiCallback() {

            final GetWishlistFeedService this$0;
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
                if (!wishapiresponse.isErrorResponse() || failureCallback == null) goto _L2; else goto _L1
_L1:
                failureCallback.onServiceFailed();
_L5:
                return;
_L2:
                ArrayList arraylist;
                wishapirequest = wishapiresponse.getData().getJSONArray("items");
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
                boolean flag = wishapiresponse.getData().getBoolean("feed_ended");
                int l = wishapiresponse.getData().getInt("next_offset");
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(arraylist, flag, l);
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
            }

            
            {
                this$0 = GetWishlistFeedService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GetWishlistFeedService getwishlistfeedservice, WishApiRequest wishapirequest)
    {
        getwishlistfeedservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
