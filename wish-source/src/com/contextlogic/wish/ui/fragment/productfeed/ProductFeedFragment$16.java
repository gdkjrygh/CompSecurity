// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.os.Handler;
import android.view.animation.Animation;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.index
    implements android.view.animation.ener
{

    final ProductFeedFragment this$0;
    final int val$index;

    public void onAnimationEnd(Animation animation)
    {
        (new Handler()).post(new Runnable() {

            final ProductFeedFragment._cls16 this$1;

            public void run()
            {
                ProductFeedFragment.access$1200(this$0, index);
            }

            
            {
                this$1 = ProductFeedFragment._cls16.this;
                super();
            }
        });
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = final_productfeedfragment;
        val$index = I.this;
        super();
    }
}
