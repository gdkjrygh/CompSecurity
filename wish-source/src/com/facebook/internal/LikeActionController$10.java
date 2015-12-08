// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.LoggingBehavior;
import com.facebook.RequestBatch;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Utility, Logger

class uestCompletionCallback
    implements com.facebook.oller._cls10
{

    final LikeActionController this$0;
    final uestCompletionCallback val$completionHandler;
    final OGObjectIdRequestWrapper val$objectIdRequest;
    final PageIdRequestWrapper val$pageIdRequest;

    public void onBatchCompleted(RequestBatch requestbatch)
    {
        LikeActionController.access$1402(LikeActionController.this, val$objectIdRequest.verifiedObjectId);
        if (Utility.isNullOrEmpty(LikeActionController.access$1400(LikeActionController.this)))
        {
            LikeActionController.access$1402(LikeActionController.this, val$pageIdRequest.verifiedObjectId);
            LikeActionController.access$2502(LikeActionController.this, val$pageIdRequest.objectIsPage);
        }
        if (Utility.isNullOrEmpty(LikeActionController.access$1400(LikeActionController.this)))
        {
            Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.access$1000(), "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
                LikeActionController.access$2400(LikeActionController.this)
            });
            LikeActionController likeactioncontroller = LikeActionController.this;
            if (val$pageIdRequest.error != null)
            {
                requestbatch = val$pageIdRequest.error;
            } else
            {
                requestbatch = val$objectIdRequest.error;
            }
            LikeActionController.access$2600(likeactioncontroller, "get_verified_id", requestbatch);
        }
        if (val$completionHandler != null)
        {
            val$completionHandler.onComplete();
        }
    }

    uestCompletionCallback()
    {
        this$0 = final_likeactioncontroller;
        val$objectIdRequest = ogobjectidrequestwrapper;
        val$pageIdRequest = pageidrequestwrapper;
        val$completionHandler = uestCompletionCallback.this;
        super();
    }
}
