// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class val.analyticsParameters
    implements com.facebook.k
{

    final val.analyticsParameters this$1;
    private final Bundle val$analyticsParameters;
    private final ishLikeRequestWrapper val$likeRequest;

    public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
    {
        LikeActionController.access$23(_fld0, false);
        if (val$likeRequest.getError() != null)
        {
            LikeActionController.access$24(_fld0, false);
            return;
        } else
        {
            LikeActionController.access$25(_fld0, Utility.coerceValueIfNullOrEmpty(val$likeRequest.unlikeToken, null));
            LikeActionController.access$26(_fld0, true);
            LikeActionController.access$17(_fld0).logSdkEvent("fb_like_control_did_like", null, val$analyticsParameters);
            LikeActionController.access$27(_fld0, val$analyticsParameters);
            return;
        }
    }

    ishLikeRequestWrapper()
    {
        this$1 = final_ishlikerequestwrapper;
        val$likeRequest = ishlikerequestwrapper1;
        val$analyticsParameters = Bundle.this;
        super();
    }

    // Unreferenced inner class com/facebook/share/internal/LikeActionController$7

/* anonymous class */
    class LikeActionController._cls7
        implements LikeActionController.RequestCompletionCallback
    {

        final LikeActionController this$0;
        private final Bundle val$analyticsParameters;

        public void onComplete()
        {
            if (Utility.isNullOrEmpty(LikeActionController.access$21(LikeActionController.this)))
            {
                Bundle bundle = new Bundle();
                bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                LikeActionController.access$20(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                return;
            } else
            {
                GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
                final LikeActionController.PublishLikeRequestWrapper likeRequest = new LikeActionController.PublishLikeRequestWrapper(LikeActionController.this, LikeActionController.access$21(LikeActionController.this), LikeActionController.access$22(LikeActionController.this));
                likeRequest.addToBatch(graphrequestbatch);
                graphrequestbatch.addCallback(analyticsParameters. new LikeActionController._cls7._cls1());
                graphrequestbatch.executeAsync();
                return;
            }
        }


            
            {
                this$0 = final_likeactioncontroller;
                analyticsParameters = Bundle.this;
                super();
            }
    }

}
