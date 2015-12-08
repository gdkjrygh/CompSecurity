// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import com.walmartlabs.payment.model.GiftCard;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupGiftCardFragment, SetupGiftCardAdapter

class this._cls0
    implements com.walmartlabs.payment.controller.methods.CheckedChangedListener
{

    final SetupGiftCardFragment this$0;

    public void onGiftCardCheckedChanged(int i, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        SetupGiftCardFragment.access$002(SetupGiftCardFragment.this, SetupGiftCardFragment.access$000(SetupGiftCardFragment.this) + SetupGiftCardFragment.access$100(SetupGiftCardFragment.this).getItem(i).balance);
_L4:
        SetupGiftCardFragment.access$200(SetupGiftCardFragment.this);
        return;
_L2:
        SetupGiftCardFragment.access$002(SetupGiftCardFragment.this, SetupGiftCardFragment.access$000(SetupGiftCardFragment.this) - SetupGiftCardFragment.access$100(SetupGiftCardFragment.this).getItem(i).balance);
        if (SetupGiftCardFragment.access$000(SetupGiftCardFragment.this) < 0.0F)
        {
            SetupGiftCardFragment.access$002(SetupGiftCardFragment.this, 0.0F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    rdCheckedChangedListener()
    {
        this$0 = SetupGiftCardFragment.this;
        super();
    }
}
