// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.widget.CompoundButton;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupCreditCardAdapter

class val.position
    implements android.widget.hangeListener
{

    final SetupCreditCardAdapter this$0;
    final int val$position;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            setSelectedItem(val$position);
        }
    }

    ()
    {
        this$0 = final_setupcreditcardadapter;
        val$position = I.this;
        super();
    }
}
