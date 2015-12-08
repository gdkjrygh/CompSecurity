// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class FeedCampaignLogService extends ApiService
{
    public static final class FeedCampaignLogServiceActionType extends Enum
    {

        private static final FeedCampaignLogServiceActionType $VALUES[];
        public static final FeedCampaignLogServiceActionType Action;
        public static final FeedCampaignLogServiceActionType Dismiss;
        public static final FeedCampaignLogServiceActionType Impression;

        public static FeedCampaignLogServiceActionType valueOf(String s)
        {
            return (FeedCampaignLogServiceActionType)Enum.valueOf(com/contextlogic/wish/api/service/FeedCampaignLogService$FeedCampaignLogServiceActionType, s);
        }

        public static FeedCampaignLogServiceActionType[] values()
        {
            return (FeedCampaignLogServiceActionType[])$VALUES.clone();
        }

        static 
        {
            Impression = new FeedCampaignLogServiceActionType("Impression", 0);
            Action = new FeedCampaignLogServiceActionType("Action", 1);
            Dismiss = new FeedCampaignLogServiceActionType("Dismiss", 2);
            $VALUES = (new FeedCampaignLogServiceActionType[] {
                Impression, Action, Dismiss
            });
        }

        private FeedCampaignLogServiceActionType(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded();
    }


    private WishApiRequest apiRequest;

    public FeedCampaignLogService()
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

    public void requestService(FeedCampaignLogServiceActionType feedcampaignlogserviceactiontype, String s, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback)
    {
        cancelAllRequests();
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$api$service$FeedCampaignLogService$FeedCampaignLogServiceActionType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$api$service$FeedCampaignLogService$FeedCampaignLogServiceActionType = new int[FeedCampaignLogServiceActionType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$service$FeedCampaignLogService$FeedCampaignLogServiceActionType[FeedCampaignLogServiceActionType.Action.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$api$service$FeedCampaignLogService$FeedCampaignLogServiceActionType[FeedCampaignLogServiceActionType.Dismiss.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.contextlogic.wish.api.service.FeedCampaignLogService.FeedCampaignLogServiceActionType[feedcampaignlogserviceactiontype.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 64
    //                   2 70;
           goto _L1 _L2 _L3
_L1:
        int i = 1;
_L5:
        apiRequest = WishApi.getInstance().logFeedCampaign(i, s, new WishApiCallback() {

            final FeedCampaignLogService this$0;
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
                if (wishapiresponse.isErrorResponse())
                {
                    if (failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                    }
                } else
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded();
                    return;
                }
            }

            
            {
                this$0 = FeedCampaignLogService.this;
                failureCallback = failurecallback;
                successCallback = successcallback;
                super();
            }
        });
        return;
_L2:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 3;
        if (true) goto _L5; else goto _L4
_L4:
    }


/*
    static WishApiRequest access$002(FeedCampaignLogService feedcampaignlogservice, WishApiRequest wishapirequest)
    {
        feedcampaignlogservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/
}
