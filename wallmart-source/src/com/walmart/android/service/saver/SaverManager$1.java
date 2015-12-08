// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import com.walmart.android.service.AsyncCallback;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverService, FeedbackRequest

class val.callback
    implements sultCallback
{

    final SaverManager this$0;
    final AsyncCallback val$callback;
    final FeedbackRequest val$feedbackRequest;

    public void onResult(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SaverManager.access$400(SaverManager.this).postFeedback(val$feedbackRequest, val$callback);
            return;
        } else
        {
            val$callback.onFailure(Integer.valueOf(0x15f91), null);
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Boolean)obj);
    }

    ()
    {
        this$0 = final_savermanager;
        val$feedbackRequest = feedbackrequest;
        val$callback = AsyncCallback.this;
        super();
    }
}
