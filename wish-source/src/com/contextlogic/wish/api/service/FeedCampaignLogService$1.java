// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;

// Referenced classes of package com.contextlogic.wish.api.service:
//            FeedCampaignLogService

class ccessCallback
    implements WishApiCallback
{

    final FeedCampaignLogService this$0;
    final k val$failureCallback;
    final ccessCallback val$successCallback;

    public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        handleFailureResponse(wishapirequest, wishapiresponse);
        FeedCampaignLogService.access$002(FeedCampaignLogService.this, null);
        if (val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
        }
    }

    public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
    {
        FeedCampaignLogService.access$002(FeedCampaignLogService.this, null);
        if (wishapiresponse.isErrorResponse())
        {
            if (val$failureCallback != null)
            {
                val$failureCallback.onServiceFailed();
            }
        } else
        if (val$successCallback != null)
        {
            val$successCallback.onServiceSucceeded();
            return;
        }
    }

    ccessCallback()
    {
        this$0 = final_feedcampaignlogservice;
        val$failureCallback = k;
        val$successCallback = ccessCallback.this;
        super();
    }
}
