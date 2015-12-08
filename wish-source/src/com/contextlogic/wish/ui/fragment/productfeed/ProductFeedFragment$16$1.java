// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.os.Handler;
import android.view.animation.Animation;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class this._cls1
    implements Runnable
{

    final l.index this$1;

    public void run()
    {
        ProductFeedFragment.access$1200(_fld0, index);
    }

    l.index()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/productfeed/ProductFeedFragment$16

/* anonymous class */
    class ProductFeedFragment._cls16
        implements android.view.animation.Animation.AnimationListener
    {

        final ProductFeedFragment this$0;
        final int val$index;

        public void onAnimationEnd(Animation animation)
        {
            (new Handler()).post(new ProductFeedFragment._cls16._cls1());
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = final_productfeedfragment;
                index = I.this;
                super();
            }
    }

}
