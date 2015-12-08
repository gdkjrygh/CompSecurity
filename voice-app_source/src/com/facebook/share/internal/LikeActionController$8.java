// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.AppEventsLogger;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class val.analyticsParameters
    implements com.facebook.ack
{

    final LikeActionController this$0;
    private final Bundle val$analyticsParameters;
    private final blishUnlikeRequestWrapper val$unlikeRequest;

    public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
    {
        LikeActionController.access$23(LikeActionController.this, false);
        if (val$unlikeRequest.getError() != null)
        {
            LikeActionController.access$24(LikeActionController.this, true);
            return;
        } else
        {
            LikeActionController.access$25(LikeActionController.this, null);
            LikeActionController.access$26(LikeActionController.this, false);
            LikeActionController.access$17(LikeActionController.this).logSdkEvent("fb_like_control_did_unlike", null, val$analyticsParameters);
            LikeActionController.access$27(LikeActionController.this, val$analyticsParameters);
            return;
        }
    }

    blishUnlikeRequestWrapper()
    {
        this$0 = final_likeactioncontroller;
        val$unlikeRequest = blishunlikerequestwrapper;
        val$analyticsParameters = Bundle.this;
        super();
    }
}
