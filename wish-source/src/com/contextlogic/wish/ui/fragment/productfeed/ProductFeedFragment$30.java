// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.view.View;
import android.view.animation.Animation;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.productfeed:
//            ProductFeedFragment

class val.bannerView
    implements android.view.animation.ener
{

    final ProductFeedFragment this$0;
    final View val$bannerView;

    public void onAnimationEnd(Animation animation)
    {
        val$bannerView.post(new Runnable() {

            final ProductFeedFragment._cls30 this$1;

            public void run()
            {
                ProductFeedFragment.access$000(this$0).removeHeaderView();
            }

            
            {
                this$1 = ProductFeedFragment._cls30.this;
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
        val$bannerView = View.this;
        super();
    }
}
