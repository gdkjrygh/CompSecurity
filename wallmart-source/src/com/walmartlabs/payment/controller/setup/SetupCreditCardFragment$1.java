// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupCreditCardFragment, SetupCreditCardAdapter

class this._cls0
    implements com.walmartlabs.ui.recycler.ickListener
{

    final SetupCreditCardFragment this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        SetupCreditCardFragment.access$000(SetupCreditCardFragment.this).setSelectedItem(i);
    }

    ()
    {
        this$0 = SetupCreditCardFragment.this;
        super();
    }
}
