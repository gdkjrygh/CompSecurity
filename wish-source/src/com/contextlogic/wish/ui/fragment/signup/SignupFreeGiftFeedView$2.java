// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupFreeGiftFeedView

class this._cls0
    implements al.Callback
{

    final SignupFreeGiftFeedView this$0;

    public void onAbandon()
    {
        SignupFreeGiftFeedView.access$100(SignupFreeGiftFeedView.this).getActivity().clearOverlay();
        SignupFreeGiftFeedView.access$200(SignupFreeGiftFeedView.this, WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_ABANDONMENT_MODAL_PROCEED);
        SignupFreeGiftFeedView.access$300(SignupFreeGiftFeedView.this).onCancel();
    }

    public void onDismiss()
    {
        SignupFreeGiftFeedView.access$400(SignupFreeGiftFeedView.this, WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_ABANDONMENT_MODAL_RETURN);
        SignupFreeGiftFeedView.access$100(SignupFreeGiftFeedView.this).getActivity().clearOverlay();
    }

    gnupFreeGiftCallback()
    {
        this$0 = SignupFreeGiftFeedView.this;
        super();
    }
}
