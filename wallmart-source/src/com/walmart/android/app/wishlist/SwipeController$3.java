// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.walmartlabs.ui.recycler.BasicRecyclerView;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SwipeController

class val.downView extends AnimatorListenerAdapter
{

    final SwipeController this$0;
    final View val$downView;
    final boolean val$remove;
    final View val$slideView;

    public void onAnimationEnd(Animator animator)
    {
        val$slideView.setTranslationX(0.0F);
        if (val$remove)
        {
            val$slideView.setVisibility(4);
            if (val$downView.getParent() != null)
            {
                int i = SwipeController.access$400(SwipeController.this).getChildAdapterPosition(val$downView) - SwipeController.access$400(SwipeController.this).getHeaderCount();
                if (i >= 0)
                {
                    SwipeController.access$500(SwipeController.this).dismiss(i);
                }
            }
        }
        SwipeController.access$702(SwipeController.this, false);
        SwipeController.access$102(SwipeController.this, false);
        SwipeController.access$400(SwipeController.this).setEnabled(true);
    }

    smissibleAdapter()
    {
        this$0 = final_swipecontroller;
        val$slideView = view;
        val$remove = flag;
        val$downView = View.this;
        super();
    }
}
