// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartFrameView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class val.uiView
    implements android.view.animation.ener
{

    final CheckoutCartManager this$0;
    final CartUiView val$uiView;

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        CheckoutCartManager.access$1100(CheckoutCartManager.this).cleanup();
        CheckoutCartManager.access$1200(CheckoutCartManager.this).setContentView(val$uiView);
        CheckoutCartManager.access$1102(CheckoutCartManager.this, val$uiView);
        CheckoutCartManager.access$1300(CheckoutCartManager.this);
        animation = new AlphaAnimation(0.0F, 1.0F);
        animation.setFillBefore(true);
        animation.setDuration(250L);
        val$uiView.startAnimation(animation);
    }

    ()
    {
        this$0 = final_checkoutcartmanager;
        val$uiView = CartUiView.this;
        super();
    }
}
