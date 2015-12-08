// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.content.DialogInterface;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingView

class this._cls0
    implements android.content.lickListener
{

    final CartBillingView this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        CartBillingView.access$1900(CartBillingView.this);
        callback.onCancel();
    }

    ()
    {
        this$0 = CartBillingView.this;
        super();
    }
}
