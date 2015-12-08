// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.GraphRequestBatch;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class ngagementRequestWrapper
    implements com.facebook.k
{

    final RequestWrapper.getUnlikeToken this$1;
    private final ngagementRequestWrapper val$engagementRequest;
    private final RequestWrapper val$likeRequestWrapper;

    public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
    {
        if (val$likeRequestWrapper.getError() != null || val$engagementRequest.getError() != null)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$0(), "Unable to refresh like state for id: '%s'", new Object[] {
                LikeActionController.access$28(_fld0)
            });
            return;
        } else
        {
            LikeActionController.access$18(_fld0, val$likeRequestWrapper.isObjectLiked(), val$engagementRequest.likeCountStringWithLike, val$engagementRequest.likeCountStringWithoutLike, val$engagementRequest.socialSentenceStringWithLike, val$engagementRequest.socialSentenceStringWithoutLike, val$likeRequestWrapper.getUnlikeToken());
            return;
        }
    }

    ngagementRequestWrapper()
    {
        this$1 = final_ngagementrequestwrapper;
        val$likeRequestWrapper = requestwrapper;
        val$engagementRequest = ngagementRequestWrapper.this;
        super();
    }

    // Unreferenced inner class com/facebook/share/internal/LikeActionController$9

/* anonymous class */
    class LikeActionController._cls9
        implements LikeActionController.RequestCompletionCallback
    {

        private static int $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType[];
        final LikeActionController this$0;

        static int[] $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType()
        {
            int ai[] = $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType;
            if (ai != null)
            {
                return ai;
            }
            ai = new int[com.facebook.share.widget.LikeView.ObjectType.values().length];
            try
            {
                ai[com.facebook.share.widget.LikeView.ObjectType.OPEN_GRAPH.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                ai[com.facebook.share.widget.LikeView.ObjectType.PAGE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                ai[com.facebook.share.widget.LikeView.ObjectType.UNKNOWN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
            $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType = ai;
            return ai;
        }

        public void onComplete()
        {
            $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType()[LikeActionController.access$22(LikeActionController.this).ordinal()];
            JVM INSTR tableswitch 3 3: default 32
        //                       3 124;
               goto _L1 _L2
_L1:
            final Object likeRequestWrapper = new LikeActionController.GetOGObjectLikesRequestWrapper(LikeActionController.this, LikeActionController.access$21(LikeActionController.this), LikeActionController.access$22(LikeActionController.this));
_L4:
            LikeActionController.GetEngagementRequestWrapper getengagementrequestwrapper = new LikeActionController.GetEngagementRequestWrapper(LikeActionController.this, LikeActionController.access$21(LikeActionController.this), LikeActionController.access$22(LikeActionController.this));
            GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
            ((LikeActionController.LikeRequestWrapper) (likeRequestWrapper)).addToBatch(graphrequestbatch);
            getengagementrequestwrapper.addToBatch(graphrequestbatch);
            graphrequestbatch.addCallback(getengagementrequestwrapper. new LikeActionController._cls9._cls1());
            graphrequestbatch.executeAsync();
            return;
_L2:
            likeRequestWrapper = new LikeActionController.GetPageLikesRequestWrapper(LikeActionController.this, LikeActionController.access$21(LikeActionController.this));
            if (true) goto _L4; else goto _L3
_L3:
        }


            
            {
                this$0 = LikeActionController.this;
                super();
            }
    }

}
