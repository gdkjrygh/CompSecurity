// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebTransitionHandler

class val.loadingView extends AnimatorListenerAdapter
{

    final val.loadingView this$1;
    final View val$loadingView;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        val$loadingView.setAlpha(1.0F);
        val$loadingView.setVisibility(8);
    }

    ()
    {
        this$1 = final_;
        val$loadingView = View.this;
        super();
    }
}
