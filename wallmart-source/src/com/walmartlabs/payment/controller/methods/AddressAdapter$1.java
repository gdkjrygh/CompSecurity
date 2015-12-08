// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;

import android.view.View;

// Referenced classes of package com.walmartlabs.payment.controller.methods:
//            AddressAdapter

class val.position
    implements android.view.ner
{

    final AddressAdapter this$0;
    final int val$position;

    public void onClick(View view)
    {
        if (val$position != AddressAdapter.access$000(AddressAdapter.this))
        {
            setSelectedAddress(val$position);
        }
    }

    A()
    {
        this$0 = final_addressadapter;
        val$position = I.this;
        super();
    }
}
