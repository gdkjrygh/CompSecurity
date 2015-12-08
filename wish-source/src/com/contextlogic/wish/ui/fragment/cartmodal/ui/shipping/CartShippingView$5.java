// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.shipping:
//            CartShippingView

class this._cls0
    implements android.widget.electedListener
{

    final CartShippingView this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        CartShippingView.access$500(CartShippingView.this, i);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = CartShippingView.this;
        super();
    }
}
