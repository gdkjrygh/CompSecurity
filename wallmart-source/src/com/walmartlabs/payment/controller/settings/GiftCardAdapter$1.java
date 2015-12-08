// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.widget.CompoundButton;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            GiftCardAdapter

class val.position
    implements android.widget.heckedChangeListener
{

    final GiftCardAdapter this$0;
    final int val$position;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (GiftCardAdapter.access$000(GiftCardAdapter.this) != null)
        {
            GiftCardAdapter.access$000(GiftCardAdapter.this).onSwitched(val$position, flag);
        }
    }

    SwitchedListener()
    {
        this$0 = final_giftcardadapter;
        val$position = I.this;
        super();
    }
}
