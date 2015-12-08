// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls0
    implements com.contextlogic.wish.api.service.ack
{

    final ProductFeedFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final ProductFeedFragment._cls28 this$1;

            public void run()
            {
                ProductFeedFragment.access$1900(this$0);
            }

            
            {
                this$1 = ProductFeedFragment._cls28.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = ProductFeedFragment.this;
        super();
    }
}
