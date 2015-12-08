// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping;

import android.content.DialogInterface;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartDataEntryCallback;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping:
//            CartShippingView

class this._cls0
    implements android.content.lickListener
{

    final CartShippingView this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        CartShippingView.access$1400(CartShippingView.this);
        callback.onCancel();
    }

    ()
    {
        this$0 = CartShippingView.this;
        super();
    }
}
