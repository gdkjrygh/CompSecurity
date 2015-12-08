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

public class GetRelatedProductFeedService extends ApiService
{
    public static final class FeedMode extends Enum
    {

        private static final FeedMode $VALUES[];
        public static final FeedMode Similar;
        public static final FeedMode Tag;
        public static final FeedMode Trending;

        public static FeedMode valueOf(String s)
        {
            return (FeedMode)Enum.valueOf(com/contextlogic/wish/api/service/GetRelatedProductFeedService$FeedMode, s);
        }

        public static FeedMode[] values()
        {
            return (FeedMode[])$VALUES.clone();
        }

        static 
        {
            Tag = new FeedMode("Tag", 0);
            Trending = new FeedMode("Trending", 1);
            Similar = new FeedMode("Similar", 2);
            $VALUES = (new FeedMode[] {
                Tag, Trending, Similar
            });
        }

        private FeedMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag, int i);
    }


    private WishApiRequest apiRequest;

    public GetRelatedProductFeedService()
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

    public void requestService(FeedMode feedmode, String s, int i, int j, String s1, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$api$service$GetRelatedProductFeedService$FeedMode[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$api$service$GetRelatedProductFeedService$FeedMode = new int[FeedMode.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$service$GetRelatedProductFeedService$FeedMode[FeedMode.Tag.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$service$GetRelatedProductFeedService$FeedMode[FeedMode.Similar.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.contextlogic.wish.api.service.GetRelatedProductFeedService.FeedMode[feedmode.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 69
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        feedmode = "trending";
_L5:
        apiRequest = WishApi.getInstance().getRelatedProductFeed(feedmode, s, i, j, s1, new WishApiCallback() {

            final GetRelatedProductFeedService this$0;
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
                try
                {
                    boolean flag = wishapiresponse.getData().getBoolean("feed_ended");
                    int l = wishapiresponse.getData().getInt("next_offset");
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded(arraylist, flag, l);
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
                this$0 = GetRelatedProductFeedService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
        return;
_L2:
        feedmode = "tag";
        continue; /* Loop/switch isn't completed */
_L3:
        feedmode = "similar";
        if (true) goto _L5; else goto _L4
_L4:
    }


/*
    static WishApiRequest access$002(GetRelatedProductFeedService getrelatedproductfeedservice, WishApiRequest wishapirequest)
    {
        getrelatedproductfeedservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
