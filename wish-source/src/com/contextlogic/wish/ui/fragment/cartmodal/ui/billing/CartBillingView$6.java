// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingView

class this._cls0
    implements android.widget.SelectedListener
{

    final CartBillingView this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        CartBillingView.access$1100(CartBillingView.this, i);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = CartBillingView.this;
        super();
    }
}
