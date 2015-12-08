// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.widget.CompoundButton;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingView

class this._cls0
    implements android.widget.eckedChangeListener
{

    final CartBillingView this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag && CartBillingView.access$1600(CartBillingView.this).getShippingInfo() != null)
        {
            prefillBillingAddress();
        } else
        if (!flag)
        {
            clearBillingAddress();
            return;
        }
    }

    ()
    {
        this$0 = CartBillingView.this;
        super();
    }
}
