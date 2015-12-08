// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping:
//            CartShippingView

class this._cls0
    implements android.widget.tionListener
{

    final CartShippingView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            CartShippingView.access$400(CartShippingView.this);
            handleDone();
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = CartShippingView.this;
        super();
    }
}
