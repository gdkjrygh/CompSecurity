// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import com.walmartlabs.payment.controller.methods.AddressAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            AddCreditCardFragment

class val.addressAdapter
    implements com.walmartlabs.ui.recycler.ClickListener
{

    final AddCreditCardFragment this$0;
    final AddressAdapter val$addressAdapter;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        val$addressAdapter.setSelectedAddress(i);
    }

    r()
    {
        this$0 = final_addcreditcardfragment;
        val$addressAdapter = AddressAdapter.this;
        super();
    }
}
