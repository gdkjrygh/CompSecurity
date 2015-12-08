// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager, SignupFreeGiftCartFrameView

class val.uiView
    implements android.view.animation.nupCartManager._cls11
{

    final CheckoutSignupCartManager this$0;
    final CartUiView val$uiView;

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        CheckoutSignupCartManager.access$1100(CheckoutSignupCartManager.this).cleanup();
        CheckoutSignupCartManager.access$1200(CheckoutSignupCartManager.this).setContentView(val$uiView);
        CheckoutSignupCartManager.access$1102(CheckoutSignupCartManager.this, val$uiView);
        CheckoutSignupCartManager.access$1300(CheckoutSignupCartManager.this);
        animation = new AlphaAnimation(0.0F, 1.0F);
        animation.setFillBefore(true);
        animation.setDuration(250L);
        val$uiView.startAnimation(animation);
    }

    ()
    {
        this$0 = final_checkoutsignupcartmanager;
        val$uiView = CartUiView.this;
        super();
    }
}
