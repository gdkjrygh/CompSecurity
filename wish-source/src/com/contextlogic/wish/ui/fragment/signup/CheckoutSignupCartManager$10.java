// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            CheckoutSignupCartManager

class this._cls0
    implements com.contextlogic.wish.ui.fragment.product.tabbeddetails.Callback
{

    final CheckoutSignupCartManager this$0;

    public void onAddToCart(String s, String s1, int i)
    {
        getActivity().clearOverlay();
        CheckoutSignupCartManager.access$1002(CheckoutSignupCartManager.this, null);
        addToCart(s, s1, null, 1);
    }

    public void onAddToCartCancel()
    {
        CheckoutSignupCartManager.access$702(CheckoutSignupCartManager.this, false);
        getActivity().clearOverlay();
        CheckoutSignupCartManager.access$1002(CheckoutSignupCartManager.this, null);
    }

    AddToCartModal.Callback()
    {
        this$0 = CheckoutSignupCartManager.this;
        super();
    }
}
