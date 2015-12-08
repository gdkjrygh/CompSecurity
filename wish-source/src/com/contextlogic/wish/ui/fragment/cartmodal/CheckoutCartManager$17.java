// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CheckoutCartManager

class this._cls0
    implements com.contextlogic.wish.ui.fragment.cartmodal.ui.allback
{

    final CheckoutCartManager this$0;

    public void onClaim(WishCart wishcart)
    {
        getActivity().clearOverlay();
        updateData(wishcart, CheckoutCartManager.access$1400(CheckoutCartManager.this), CheckoutCartManager.access$1500(CheckoutCartManager.this));
        if (CheckoutCartManager.access$1600(CheckoutCartManager.this) != null)
        {
            CheckoutCartManager.access$1600(CheckoutCartManager.this).checkout();
        }
    }

    public void onDismiss()
    {
        getActivity().clearOverlay();
        close();
    }

    public void onError()
    {
        CheckoutCartManager.access$100(CheckoutCartManager.this).clearOverlay();
        showErrorMessage(getActivity().getString(0x7f060202));
        close();
    }

    tionManager()
    {
        this$0 = CheckoutCartManager.this;
        super();
    }
}
