// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;


// Referenced classes of package com.contextlogic.wish.ui.fragment.ratings:
//            RatingsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.Callback
{

    final RatingsFragment this$0;

    public void onServiceFailed()
    {
        RatingsFragment.access$502(RatingsFragment.this, true);
        postDelayed(new Runnable() {

            final RatingsFragment._cls6 this$1;

            public void run()
            {
                RatingsFragment.access$600(this$0);
                RatingsFragment.access$700(this$0);
            }

            
            {
                this$1 = RatingsFragment._cls6.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = RatingsFragment.this;
        super();
    }
}
