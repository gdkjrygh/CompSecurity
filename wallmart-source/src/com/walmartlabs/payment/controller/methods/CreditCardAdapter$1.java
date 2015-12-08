// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;


// Referenced classes of package com.walmartlabs.payment.controller.methods:
//            CreditCardAdapter

class val.prevIndex
    implements Runnable
{

    final CreditCardAdapter this$0;
    final int val$prevIndex;

    public void run()
    {
        notifyItemChanged(val$prevIndex);
        notifyItemChanged(CreditCardAdapter.access$000(CreditCardAdapter.this));
    }

    ()
    {
        this$0 = final_creditcardadapter;
        val$prevIndex = I.this;
        super();
    }
}
